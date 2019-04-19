package ke.co.insuranceapp.Fragments;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import ke.co.insuranceapp.Adapter.RenewalsPagerAdapter;
import ke.co.insuranceapp.Dialogs.RenewalDialog;
import ke.co.insuranceapp.Fragments.SubFragments.TodayFragment;
import ke.co.insuranceapp.Fragments.SubFragments.TomorrowFragment;
import ke.co.insuranceapp.Fragments.SubFragments.UpcomingFragment;
import ke.co.insuranceapp.Fragments.SubFragments.YesterdayFragment;
import ke.co.insuranceapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RenewalFragment extends Fragment {

    View root;
    TabLayout tabLayout;
    RecyclerView recyclerView;
    ViewPager viewPager;
    FloatingActionButton add;

    ArrayList<Fragment> fragments = new ArrayList<>();

    public RenewalFragment() {
        // Required empty public constructor
    }

    public static RenewalFragment getInstance(){
        return new RenewalFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        root = inflater.inflate(R.layout.fragment_renewal, container, false);
        setUpViews();
        return root;
    }


    private void setUpViews() {
        recyclerView = root.findViewById(R.id.recyclerView);
        tabLayout = root.findViewById(R.id.tabLayout);
        viewPager = root.findViewById(R.id.viewpager);

        fragments.add(new YesterdayFragment());
        fragments.add(new TodayFragment());
        fragments.add(new TomorrowFragment());
        fragments.add(new UpcomingFragment());

        viewPager.setAdapter(new RenewalsPagerAdapter(getChildFragmentManager(),fragments));
        tabLayout.setupWithViewPager(viewPager);

        add = root.findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new RenewalDialog(getContext(), R.style.FullScreen).showDialog();
            }
        });
    }

}
