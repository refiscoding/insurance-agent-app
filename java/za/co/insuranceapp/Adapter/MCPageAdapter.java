package ke.co.insuranceapp.Adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class MCPageAdapter extends FragmentPagerAdapter {

    ArrayList<Fragment> fragments;

    public MCPageAdapter(FragmentManager fm, ArrayList<Fragment> fragments) {
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
                title = "Instock";
                break;
            case 1:
                title = "Sold";
                break;
            case 2:
                title = "Cancelled";
                break;
        }

        return title;
    }

}
