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

;

import java.util.ArrayList;
import java.util.List;

import ke.co.insuranceapp.Adapter.PolicyAdapter;

import ke.co.insuranceapp.Common.Common;
import ke.co.insuranceapp.Dialogs.PolicyDialog;
import ke.co.insuranceapp.Models.Customer;
import ke.co.insuranceapp.Models.Policy;
import ke.co.insuranceapp.R;
import ke.co.insuranceapp.Retrofit.InsuranceApi;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class PolicyFragment extends Fragment implements PolicyDialog.PolicyDialogListener{

    View root;
    RecyclerView recyclerView;
    FloatingActionButton add;
    PolicyAdapter adapter;

    List<Policy> policies = new ArrayList<>();

    InsuranceApi mService;

    public PolicyFragment() {
        // Required empty public constructor
    }

    public static PolicyFragment getInstance(){
        return new PolicyFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        root = inflater.inflate(R.layout.fragment_policy, container, false);
        setUpViews();
        return root;
    }

    private void setUpViews() {
        recyclerView = root.findViewById(R.id.policy_recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter= new PolicyAdapter(getContext(),policies);
        recyclerView.setAdapter(adapter);
        mService = Common.getApi();

        add = root.findViewById(R.id.addpolicy);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               PolicyDialog dialog= new PolicyDialog(getContext(), R.style.FullScreen);
               dialog.setPolicyDialogListener(new PolicyDialog.PolicyDialogListener() {
                   @Override
                   public void sendInfo(final String client, final String risk, final String insured, final String insuranceCompany, final String effectiveDate, final String expiryDate, final String premium, final String commision, final String adminFee) {
                       adapter.addItems(new Policy(client,risk,insured,insuranceCompany,effectiveDate,expiryDate,premium,commision,adminFee));

                       mService.getpolicies()
                             .enqueue(new Callback<List<Policy>>() {
                                 @Override
                                 public void onResponse(Call<List<Policy>> call, Response<List<Policy>> response) {

                                 }

                                 @Override
                                 public void onFailure(Call<List<Policy>> call, Throwable t) {

                                 }
                             });


                   }

               });
               dialog.showDialog();

            }
        });
    }

    private ArrayList<Policy> getPolicy() {
        ArrayList<Policy> policies = new ArrayList<>();

//        policies.add(new Policy("Imran Mungai","Fire","House","Some company","12/12/2018","12/12/2019","Ksh 8000","Ksh 3000","Ksh 1000"));
//        policies.add(new Policy("Peter Muchemi","Accident","Car","Some company","12/12/2018","12/12/2019","Ksh 9000","Ksh 4000","Ksh 1500"));
//        policies.add(new Policy("John Mungai","Health","Person","Some company","12/12/2018","12/12/2019","Ksh 3000","Ksh 4000","Ksh 1000"));

        return policies;
    }

    @Override
    public void sendInfo(String client, String risk, String insured, String insuranceCompany, String effectiveDate, String expiryDate, String premium, String commision, String adminFee) {

    }
}
