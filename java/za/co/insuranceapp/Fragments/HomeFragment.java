package ke.co.insuranceapp.Fragments;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;


import ke.co.insuranceapp.Adapter.HomePagerAdapter;
import ke.co.insuranceapp.Adapter.MenuItemAdapter;
import ke.co.insuranceapp.Adapter.NewsItemAdapter;
import ke.co.insuranceapp.Models.ADImage;

import ke.co.insuranceapp.Models.MenuItem;
import ke.co.insuranceapp.Models.NewsItem;
import ke.co.insuranceapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    View root;
    RecyclerView menuRecyclerView, newsRecyclerView;
    List<MenuItem> menuItemList = new ArrayList<>();
    List<ADImage> adImages = new ArrayList<>();

    HomePagerAdapter adapter;

    ScrollView scrollView;

    View up,down;

    boolean isUp = true;

    public HomeFragment() {
        // Required empty public constructor
    }

    public static HomeFragment getInstance(){
        return new HomeFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        root = inflater.inflate(R.layout.fragment_home, container, false);
        setUpViews();
        return root;
    }

    private void setUpViews() {
        setUpViewPager();
        setUpMenu();
        setUpNews();

        View targetView = root.findViewById(R.id.focus);
        targetView.getParent().requestChildFocus(targetView,targetView);

        scrollView = root.findViewById(R.id.scrollView);
        up = root.findViewById(R.id.up);
        down = root.findViewById(R.id.down);


        down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                focusOnView(newsRecyclerView);

            }
        });

//
//        up.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                focusOnViewTop(menuRecyclerView);
//                up.setVisibility(View.GONE);
//                down.setVisibility(View.VISIBLE);
//            }
//        });
    }


    private final void focusOnView(final View view){
        scrollView.post(new Runnable() {
            @Override
            public void run() {
                scrollView.scrollTo(0, view.getBottom());
            }
        });
    }



    private final void focusOnViewTop(final View view){
        scrollView.post(new Runnable() {
            @Override
            public void run() {
                scrollView.scrollTo(0, view.getTop());
            }
        });

    }






    @SuppressLint("ClickableViewAccessibility")
    private void setUpViewPager() {
        setAdImages(adImages);
        ViewPager viewPager = root.findViewById(R.id.viewPager);
        adapter = new HomePagerAdapter(getContext(), adImages);
        viewPager.setAdapter(adapter);
        setUpSwitcher(viewPager);


        viewPager.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });

    }

    public void setUpSwitcher(final ViewPager viewPager){
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                try {
                    ((Activity)getActivity()).runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            if ((viewPager.getCurrentItem()+1) == adImages.size()){
                                viewPager.setCurrentItem(0);
                            } else{
                                viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
                            }
                        }
                    });
                } catch (NullPointerException e){
                    e.printStackTrace();
                }
            }
        },100,3000);



    }

    private void setUpMenu() {
        setMenuItemList(menuItemList);
        menuRecyclerView= root.findViewById(R.id.menuRecyclerView);
        menuRecyclerView.setLayoutManager( new GridLayoutManager(getContext(),3));
        menuRecyclerView.setAdapter(new MenuItemAdapter(getContext(), menuItemList));
    }


    private void setUpNews() {
        newsRecyclerView= root.findViewById(R.id.newsRecyclerView);
        newsRecyclerView.setLayoutManager( new LinearLayoutManager(getContext()));
        newsRecyclerView.setAdapter(new NewsItemAdapter(getContext(), getNews()));
    }

    private List<NewsItem> getNews() {
        List<NewsItem> newsItems = new ArrayList<>();
        newsItems.add(new NewsItem("Lorem ipsum dolor sit amet","Lorem ipsum dolor sit amet, consectetur adipiscing elit.","10:00pm"));
        newsItems.add(new NewsItem("Lorem ipsum dolor sit amet","Lorem ipsum dolor sit amet, consectetur adipiscing elit.","10:00pm"));
        newsItems.add(new NewsItem("Lorem ipsum dolor sit amet","Lorem ipsum dolor sit amet, consectetur adipiscing elit.","10:00pm"));
        newsItems.add(new NewsItem("Lorem ipsum dolor sit amet","Lorem ipsum dolor sit amet, consectetur adipiscing elit.","10:00pm"));
        return  newsItems;
    }


    public void setMenuItemList(List<MenuItem> menuItemList) {
        menuItemList.clear();

        menuItemList.add(new MenuItem(1,"Renewals", R.drawable.ic_renewal));
        menuItemList.add(new MenuItem(2,"Appointments", R.drawable.ic_appointment));
        menuItemList.add(new MenuItem(3,"To do lists", R.drawable.ic_todo_list));
        menuItemList.add(new MenuItem(4,"Leads", R.drawable.ic_leads));
        menuItemList.add(new MenuItem(5,"Customers", R.drawable.ic_customers));
        menuItemList.add(new MenuItem(6,"Quotations", R.drawable.ic_quotations));
        menuItemList.add(new MenuItem(7,"Policies", R.drawable.ic_policy));
        menuItemList.add(new MenuItem(8,"Claim", R.drawable.ic_claims));
        menuItemList.add(new MenuItem(9,"Motor Certificates", R.drawable.ic_car));
        menuItemList.add(new MenuItem(10,"Reports", R.drawable.ic_reports));
    }


    public void setAdImages(List<ADImage> adImages) {
        adImages.clear();

        adImages.add(new ADImage(R.drawable.insurancelogo));
//        adImages.add(new ADImage(R.drawable.jubilee));
//        adImages.add(new ADImage(R.drawable.apa));

//        adImages.add(new ADImage(R.drawable.insurance));
//        adImages.add(new ADImage(R.drawable.jubilee));
        adImages.add(new ADImage(R.drawable.insurancelogo));


        adImages.add(new ADImage(R.drawable.insurancelogo));
//        adImages.add(new ADImage(R.drawable.jubilee));
//        adImages.add(new ADImage(R.drawable.apa));


        this.adImages = adImages;
    }



}
