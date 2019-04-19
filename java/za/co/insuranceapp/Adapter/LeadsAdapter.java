package ke.co.insuranceapp.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import ke.co.insuranceapp.Models.Lead;
import ke.co.insuranceapp.Models.Renewal;
import ke.co.insuranceapp.R;
import ke.co.insuranceapp.ViewHolders.LeadViewHolder;
import ke.co.insuranceapp.ViewHolders.RenewalViewHolder;

public class LeadsAdapter extends RecyclerView.Adapter<LeadViewHolder> {

    Context ctx;
    List<Lead> leads;

    public LeadsAdapter(Context ctx, List<Lead> leads) {
        this.ctx = ctx;
        this.leads = leads;
    }

    @NonNull
    @Override
    public LeadViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.leads_item, parent, false);
        return new LeadViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull LeadViewHolder holder, int position) {
        Lead lead = leads.get(position);
        holder.nameTv.setText(lead.getName());
        holder.phoneTv.setText(lead.getPhone());
        holder.emailTv.setText(lead.getEmail());
    }

    @Override
    public int getItemCount() {
        return leads.size();
    }

    public void addLeads(Lead lead){
        leads.add(0,lead);
        notifyDataSetChanged();
    }
}
