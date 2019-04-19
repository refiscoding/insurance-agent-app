package ke.co.insuranceapp.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import ke.co.insuranceapp.Models.Customer;
import ke.co.insuranceapp.Models.Lead;
import ke.co.insuranceapp.R;
import ke.co.insuranceapp.ViewHolders.CustomerViewHolder;
import ke.co.insuranceapp.ViewHolders.LeadViewHolder;

public class CustomerAdapter extends RecyclerView.Adapter<CustomerViewHolder> {

    Context ctx;
    List<Customer> customers;

    public CustomerAdapter(Context ctx, List<Customer> customers) {
        this.ctx = ctx;
        this.customers = customers;
    }

    @NonNull
    @Override
    public CustomerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.customer_item, parent, false);
        return new CustomerViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull CustomerViewHolder holder, int position) {
        Customer customer = customers.get(position);

        holder.nameTv.setText(customer.getName());
        holder.phoneTv.setText(customer.getPhone());
        holder.emailTv.setText(customer.getEmail());
        holder.noOfCoversTv.setText(customer.getNoOfCovers());

    }

    @Override
    public int getItemCount() {
        return customers.size();
    }

    public void addCustomer(Customer customer){
        customers.add(0,customer);
        notifyDataSetChanged();

    }
}
