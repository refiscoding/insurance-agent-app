package ke.co.insuranceapp.ViewHolders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import ke.co.insuranceapp.R;

public class PolicyViewHolder extends RecyclerView.ViewHolder {

    public TextView clientTv;
    public TextView riskTv;
    public TextView insuredTv;
    public TextView insuranceCompanyTv;
    public TextView effectiveDateTv;
    public TextView expiryDateTv;
    public TextView premiumTv;
    public TextView commisionTv;
    public TextView adminFeeTv;

    public View more;
    public View clickable;


    public PolicyViewHolder(View itemView) {
        super(itemView);

        clientTv = itemView.findViewById(R.id.clientpolicyTv);
        riskTv = itemView.findViewById(R.id.riskpolicyTv);
        insuredTv = itemView.findViewById(R.id.insuredObjectpolicyTv);
        insuranceCompanyTv = itemView.findViewById(R.id.insurancepolicyCompanyTv);
        effectiveDateTv = itemView.findViewById(R.id.expirypolicyDateTv);
        expiryDateTv = itemView.findViewById(R.id.effectivepolicyDateTv);
        premiumTv = itemView.findViewById(R.id.premiumpolicyTv);
        commisionTv = itemView.findViewById(R.id.commisionpolicyTv);
        adminFeeTv = itemView.findViewById(R.id.adminFeepolicyTv);

        more = itemView.findViewById(R.id.more);
        clickable = itemView.findViewById(R.id.clickable);
    }
}
