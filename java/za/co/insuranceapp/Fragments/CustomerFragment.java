package ke.co.insuranceapp.Fragments;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import ke.co.insuranceapp.Adapter.CustomerAdapter;
import ke.co.insuranceapp.Adapter.LeadsAdapter;
import ke.co.insuranceapp.Dialogs.CustomerDialog;
import ke.co.insuranceapp.Dialogs.LeadDialog;
import ke.co.insuranceapp.Models.Customer;
import ke.co.insuranceapp.Models.Lead;
import ke.co.insuranceapp.R;


public class CustomerFragment extends Fragment implements CustomerDialog.CustomerDialogListener{

    View root;
    RecyclerView recyclerView;
    FloatingActionButton add;
    CustomerAdapter adapter;
    List<Customer>customers= new ArrayList<>();

    public CustomerFragment() {
        // Required empty public constructor
    }

    public static CustomerFragment getInstance(){
        return new CustomerFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        root =  inflater.inflate(R.layout.fragment_customer, container, false);
        setUpViews();
        return root;
    }

    private void setUpViews() {
        recyclerView = root.findViewById(R.id.customerrecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new CustomerAdapter(getContext(),customers);
        recyclerView.setAdapter(adapter);

        add = root.findViewById(R.id.addLead);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              CustomerDialog dialog =  new CustomerDialog(getContext(), R.style.FullScreen);
              dialog.setCustomerDialogListener(new CustomerDialog.CustomerDialogListener() {
                  @Override
                  public void addCustomers(String names, String mobile, String emailAdress, String covers) {
                      adapter.addCustomer(new Customer(names,mobile,emailAdress,covers));
                  }
              });
              dialog.showDialog();
            }
        });
    }




    private ArrayList<Customer> getCustomer() {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Imran Mungai","0701116801","munga19ihub@gmail.com","2"));
        customers.add(new Customer("Peter Muchemi","0708234567","muchemipeter@gmail.com","3"));
        customers.add(new Customer("John Wainaina","0768789543","john32@gmail.com","4"));
        customers.add(new Customer("Michael M.","0790675925","michael23@gmail.com","1"));
        return customers;
    }


    @Override
    public void addCustomers(String names, String mobile, String emailAdress, String covers) {

    }
}
