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
import ke.co.insuranceapp.Adapter.LeadsAdapter;
import ke.co.insuranceapp.Dialogs.AppointmentDialog;
import ke.co.insuranceapp.Dialogs.LeadDialog;
import ke.co.insuranceapp.Models.Appointment;
import ke.co.insuranceapp.Models.Lead;
import ke.co.insuranceapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LeadsFragment extends Fragment {

    View root;
    RecyclerView recyclerView;
    FloatingActionButton add;
    LeadsAdapter adapter;
    List<Lead>leads;

    public LeadsFragment() {
        // Required empty public constructor
    }

    public static LeadsFragment getInstance(){
        return new LeadsFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        root =  inflater.inflate(R.layout.fragment_leads, container, false);
        setUpViews();
        return root;
    }

    private void setUpViews() {
        recyclerView = root.findViewById(R.id.leadsrecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new LeadsAdapter(getContext(),leads);
        recyclerView.setAdapter(adapter);

        add = root.findViewById(R.id.addLead);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               LeadDialog dialog = new LeadDialog(getContext(), R.style.FullScreen);
               dialog.setLeadDialogListener(new LeadDialog.LeadDialogListener() {
                   @Override
                   public void addLead(String names, String cell, String emails) {
                       adapter.addLeads(new Lead(names,cell,emails));
                   }
               });
               dialog.showDialog();
            }
        });
    }

    private ArrayList<Lead> getLeads() {
        ArrayList<Lead> leads = new ArrayList<>();
        leads.add(new Lead("Imran Mungai","0701116801","munga19ihub@gmail.com"));
        leads.add(new Lead("Peter Muchemi","0708234567","muchemipeter@gmail.com"));
        leads.add(new Lead("John Wainaina","0768789543","john32@gmail.com"));
        leads.add(new Lead("Michael M.","0790675925","michael23@gmail.com"));
        return leads;
    }


}
