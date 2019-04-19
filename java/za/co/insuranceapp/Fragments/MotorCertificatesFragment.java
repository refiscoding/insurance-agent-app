package ke.co.insuranceapp.Fragments;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import ke.co.insuranceapp.Adapter.MCPageAdapter;
import ke.co.insuranceapp.Dialogs.MotorCertificateDialog;
import ke.co.insuranceapp.Dialogs.RenewalDialog;
import ke.co.insuranceapp.Fragments.SubFragments.CanceledFragment;
import ke.co.insuranceapp.Fragments.SubFragments.InstockFragment;
import ke.co.insuranceapp.Fragments.SubFragments.SoldFragment;
import ke.co.insuranceapp.Fragments.SubFragments.TodayFragment;
import ke.co.insuranceapp.Fragments.SubFragments.TomorrowFragment;
import ke.co.insuranceapp.Fragments.SubFragments.UpcomingFragment;
import ke.co.insuranceapp.Fragments.SubFragments.YesterdayFragment;
import ke.co.insuranceapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MotorCertificatesFragment extends Fragment {

    View root;
    TabLayout tabLayout;
    ViewPager viewPager;
    FloatingActionButton add;

    ArrayList<Fragment> fragments = new ArrayList<>();


    public MotorCertificatesFragment() {
        // Required empty public constructor
    }

    public static MotorCertificatesFragment getInstance(){
        return new MotorCertificatesFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        root = inflater.inflate(R.layout.fragment_motor_certificates, container, false);
        setUpViews();
        return root;
    }

    private void setUpViews() {
        tabLayout = root.findViewById(R.id.tabLayout);
        viewPager = root.findViewById(R.id.viewpager);

        fragments.add(new InstockFragment());
        fragments.add(new SoldFragment());
        fragments.add(new CanceledFragment());

        viewPager.setAdapter(new MCPageAdapter(getChildFragmentManager(),fragments));
        tabLayout.setupWithViewPager(viewPager);

        add = root.findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MotorCertificateDialog(getContext(), R.style.FullScreen).showDialog();
            }
        });

    }


}
