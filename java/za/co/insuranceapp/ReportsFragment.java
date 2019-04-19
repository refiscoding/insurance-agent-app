package ke.co.insuranceapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class ReportsFragment extends Fragment {

    View root;

    public ReportsFragment() {
        // Required empty public constructor
    }


    public static ReportsFragment getInstance(){
        return new ReportsFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        root = inflater.inflate(R.layout.fragment_reports, container, false);

        return root;
    }

}
