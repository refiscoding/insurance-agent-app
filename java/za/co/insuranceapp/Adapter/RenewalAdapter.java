package ke.co.insuranceapp.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import ke.co.insuranceapp.Models.Renewal;
import ke.co.insuranceapp.R;
import ke.co.insuranceapp.ViewHolders.RenewalViewHolder;

public class RenewalAdapter extends RecyclerView.Adapter<RenewalViewHolder> {

    Context ctx;
    ArrayList<Renewal> renewals;

    public RenewalAdapter(Context ctx, ArrayList<Renewal> renewals) {
        this.ctx = ctx;
        this.renewals = renewals;
    }

    @NonNull
    @Override
    public RenewalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.renewal_item, parent, false);
        return new RenewalViewHolder(itemView);
    }



    @Override
    public void onBindViewHolder(@NonNull RenewalViewHolder holder, int position) {
        Renewal renewal = renewals.get(position);

        holder.clientTv.setText(renewal.getClientName());
        holder.riskTv.setText(renewal.getRisk());
        holder.insuredTv.setText(renewal.getInsured());
        holder.effectiveDateTv.setText(renewal.getEffectiveDate());
        holder.expiryDateTv.setText(renewal.getExpiryDate());
        holder.premiumTv.setText(renewal.getPremium());
        holder.insuranceCompanyTv.setText(renewal.getInsuranceCompany());
        holder.phoneNumberTv.setText(renewal.getPhoneNumber());

    }

    @Override
    public int getItemCount() {
        return renewals.size();
    }
}
