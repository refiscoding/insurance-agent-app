package ke.co.insuranceapp.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import ke.co.insuranceapp.Models.Policy;
import ke.co.insuranceapp.Models.Renewal;
import ke.co.insuranceapp.R;
import ke.co.insuranceapp.ViewHolders.PolicyViewHolder;
import ke.co.insuranceapp.ViewHolders.RenewalViewHolder;

public class PolicyAdapter extends RecyclerView.Adapter<PolicyViewHolder> {

    Context ctx;
    List<Policy> policies;

    public PolicyAdapter(Context ctx, List<Policy> policies) {
        this.ctx = ctx;
        this.policies = policies;
    }

    @NonNull
    @Override
    public PolicyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.policy_item, parent, false);
        return new PolicyViewHolder(itemView);
    }



    @Override
    public void onBindViewHolder(@NonNull final PolicyViewHolder holder, int position) {
        Policy policy = policies.get(position);

        holder.clientTv.setText(policy.getClient());
        holder.riskTv.setText(policy.getRisk());
        holder.insuredTv.setText(policy.getInsured());
        holder.insuranceCompanyTv.setText(policy.getInsuranceCompany());
        holder.effectiveDateTv.setText(policy.getEffectiveDate());
        holder.expiryDateTv.setText(policy.getExpiryDate());
        holder.premiumTv.setText(policy.getPremium());
        holder.commisionTv.setText(policy.getCommission());
        holder.adminFeeTv.setText(policy.getAdminFee());

        holder.clickable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(holder.more.getVisibility() == View.VISIBLE) {
                    holder.more.setVisibility(View.GONE);
                } else{
                    holder.more.setVisibility(View.VISIBLE);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return policies.size();
    }

    public void addItems(Policy policy){
        policies.add(0,policy);
        notifyDataSetChanged();
    }
}
