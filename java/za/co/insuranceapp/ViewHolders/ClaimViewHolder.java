package ke.co.insuranceapp.ViewHolders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import ke.co.insuranceapp.R;

public class ClaimViewHolder extends RecyclerView.ViewHolder {

    public TextView customerTv;
    public TextView policyTv;
    public TextView detailsTv;
    public TextView riskTv;

    public TextView effectiveDateTv;
    public TextView expiryDateTv;

    public TextView sumInsuredTv;
    public TextView premiumTv;

    public TextView dateReportedTv;
    public TextView detailsClaimTv;
    public TextView otherPartyTv;
    public TextView contactsTv;

    public TextView policeStationTv;
    public TextView obNumberTv;
    public TextView towingCarTv;
    public TextView yardTv;

    public View more;
    public View clickable;



    public ClaimViewHolder(View itemView) {
        super(itemView);

        customerTv = itemView.findViewById(R.id.claimcustomerTv);
        policyTv = itemView.findViewById(R.id.claimpolicyTv);
        detailsTv = itemView.findViewById(R.id.claimdetailsTv);
        riskTv = itemView.findViewById(R.id.claimriskTv);
        effectiveDateTv = itemView.findViewById(R.id.claimsumInsuredTv);
        expiryDateTv = itemView.findViewById(R.id.claimeffectiveDateTv);
        sumInsuredTv = itemView.findViewById(R.id.claimexpiryDateTv);
        premiumTv = itemView.findViewById(R.id.claimpremiumTv);


        dateReportedTv = itemView.findViewById(R.id.claimdateReportedTv);
        detailsClaimTv = itemView.findViewById(R.id.detailsClaimTv);
        otherPartyTv = itemView.findViewById(R.id.claimotherPartyTv);
        contactsTv = itemView.findViewById(R.id.claimcontactsTv);
        policeStationTv = itemView.findViewById(R.id.claimpoliceStationTv);
        obNumberTv = itemView.findViewById(R.id.claimobNumberTv);
        towingCarTv = itemView.findViewById(R.id.claimtowingCarTv);
        yardTv = itemView.findViewById(R.id.claimyardTv);

        more = itemView.findViewById(R.id.more);
        clickable = itemView.findViewById(R.id.clickable);
    }
}
