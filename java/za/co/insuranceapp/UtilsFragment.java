package ke.co.insuranceapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class UtilsFragment {

    public static void setFragment(final AppCompatActivity a, final Fragment fragment, final String title){
        a.setTitle(title);
        FragmentTransaction fragmentTransaction = a.getSupportFragmentManager().beginTransaction();
        fragmentTransaction.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);
        fragmentTransaction.replace(R.id.placeholder, fragment).addToBackStack(null);
        fragmentTransaction.commitAllowingStateLoss();
    }



}
