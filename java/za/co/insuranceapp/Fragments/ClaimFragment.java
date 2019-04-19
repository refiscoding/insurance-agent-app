package ke.co.insuranceapp.Fragments;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import ke.co.insuranceapp.Adapter.AppointmentAdapter;
import ke.co.insuranceapp.Adapter.ClaimAdapter;
import ke.co.insuranceapp.Dialogs.AppointmentDialog;
import ke.co.insuranceapp.Dialogs.ClaimDialog;
import ke.co.insuranceapp.Models.Appointment;
import ke.co.insuranceapp.Models.Claim;
import ke.co.insuranceapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ClaimFragment extends Fragment implements ClaimDialog.ClaimDialogListener{

    View root;
    RecyclerView recyclerView;
    FloatingActionButton add;
    ClaimAdapter adapter;
    List<Claim>claims;

    public ClaimFragment() {
        // Required empty public constructor
    }

    public static ClaimFragment getInstance(){
        return new ClaimFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        root = inflater.inflate(R.layout.fragment_claim, container, false);
        setUpViews();
        return root;
    }

    private void setUpViews() {
        recyclerView = root.findViewById(R.id.claimrecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new ClaimAdapter(getContext(),claims);
        recyclerView.setAdapter(adapter);

        add = root.findViewById(R.id.addClaim);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              ClaimDialog dialog =  new ClaimDialog(getContext(), R.style.FullScreen);
              dialog.setClaimDialogListener(new ClaimDialog.ClaimDialogListener() {
                  @Override
                  public void addClaims(String effect, String expire, String customers, String pol, String risks, String dets, String sums, String prem, String reps, String claim, String other, String contacts, String polizei, String obs, String tow, String yards) {
                      adapter.addClaim(new Claim(effect,expire,customers,pol,risks,dets,sums,prem,reps,claim,other,contacts,polizei,obs,tow,yards));
                  }
              });
              dialog.showDialog();
            }
        });

    }

    private ArrayList<Claim> getClaims() {
        ArrayList<Claim> claims = new ArrayList<>();
        claims.add(new Claim("Imran Mungai","Some Policy","Some Details","12/12/2018","12/12/2018","Accident","Ksh 10,000","Ksh 1000","12/12/2018","Claim Details","Other Party","0701 123123","Kangemi","53421","KCA 321C","Ngong Road"));
        claims.add(new Claim("Peter Muchemi","Some Policy","Some Details","12/12/2018","12/12/2018","Fire","Ksh 21,000","Ksh 2100","12/12/2018","Claim Details","Other Party","0701 321321","Kasarani","43542","KBD 678C","Kasarani"));
        claims.add(new Claim("Maina K.","Some Policy","Some Details","12/12/2018","12/12/2018","Accident","Ksh 15,000","Ksh 1100","12/12/2018","Claim Details","Other Party","0701 453453","Meru Town","53421","KAK 345K","Meru Town"));

        return claims;
    }


    @Override
    public void addClaims(String effect, String expire, String customers, String pol, String risks, String dets, String sums, String prem, String reps, String claim, String other, String contacts, String polizei, String obs, String tow, String yards) {

    }
}
