package za.co.insuranceapp.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

;
import java.util.List;

import ke.co.insuranceapp.Models.Claim;

import ke.co.insuranceapp.R;
import ke.co.insuranceapp.ViewHolders.ClaimViewHolder;


public class ClaimAdapter extends RecyclerView.Adapter<ClaimViewHolder> {

    Context ctx;
    List<Claim> claims;

    public ClaimAdapter(Context ctx, List<Claim> claims) {
        this.ctx = ctx;
        this.claims = claims;
    }

    @NonNull
    @Override
    public ClaimViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.claim_item, parent, false);
        return new ClaimViewHolder(itemView);
    }



    @Override
    public void onBindViewHolder(@NonNull final ClaimViewHolder holder, int position) {
        Claim claim = claims.get(position);

        holder.customerTv.setText(claim.getCustomer());
        holder.policyTv.setText(claim.getPolicy());
        holder.detailsTv.setText(claim.getDetails());
        holder.effectiveDateTv.setText(claim.getEffectiveDate());
        holder.expiryDateTv.setText(claim.getExpiryDate());
        holder.riskTv.setText(claim.getRisk());
        holder.sumInsuredTv.setText(claim.getSumInsured());
        holder.premiumTv.setText(claim.getPremium());

        holder.dateReportedTv.setText(claim.getDateReported());
        holder.detailsClaimTv.setText(claim.getDetailsClaim());
        holder.otherPartyTv.setText(claim.getOtherParty());
        holder.contactsTv.setText(claim.getContacts());
        holder.policeStationTv.setText(claim.getPoliceStation());
        holder.obNumberTv.setText(claim.getObNumber());
        holder.towingCarTv.setText(claim.getTowingCar());
        holder.yardTv.setText(claim.getYard());

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
        return 0;
    }

    public void addClaim(Claim claim){
        claims.add(0,claim);
        notifyItemChanged(0);
    }
}
