package ke.co.insuranceapp.Adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class RenewalsPagerAdapter extends FragmentPagerAdapter {
    ArrayList<Fragment> fragments;

    public RenewalsPagerAdapter(FragmentManager fm, ArrayList<Fragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        String title = "";
        switch (position){
            case 0:
                title = "Yesterday";
                break;
            case 1:
                title = "Today";
                break;
            case 2:
                title = "Tomorrow";
                break;
            case 3:
                title = "Upcoming";
                break;
        }
        return title;
    }
}
