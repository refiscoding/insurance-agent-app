package ke.co.insuranceapp.Fragments.SubFragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import ke.co.insuranceapp.Adapter.MotorCertificateAdapter;
import ke.co.insuranceapp.Models.MotorCertificate;
import ke.co.insuranceapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SoldFragment extends Fragment {

    View root;
    RecyclerView recyclerView;

    public SoldFragment() {
        // Required empty public constructor
    }

    public static SoldFragment getInstance(){
        return new SoldFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_sold, container, false);
        setUpViews();
        return root;
    }

    private void setUpViews() {
        recyclerView = root.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new MotorCertificateAdapter(getContext(), getMotorCertificates()));
    }

    private ArrayList<MotorCertificate> getMotorCertificates() {
        ArrayList<MotorCertificate> motorCertificates = new ArrayList<>();
        motorCertificates.add(new MotorCertificate("93249745","Insurance Company","12/12/2018","12/12/2018","Imran Mungai","KCD 456T"));
        motorCertificates.add(new MotorCertificate("6686w228","Some Company","12/12/2018","12/12/2018","Peter Muchemi","KCJ 676T"));
        return motorCertificates;
    }

}
