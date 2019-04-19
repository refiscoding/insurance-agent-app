package ke.co.insuranceapp.ViewHolders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import ke.co.insuranceapp.R;

public class RenewalViewHolder extends RecyclerView.ViewHolder {

    public TextView clientTv;
    public TextView riskTv;
    public TextView insuredTv;
    public TextView effectiveDateTv;
    public TextView expiryDateTv;
    public TextView premiumTv;
    public TextView insuranceCompanyTv;
    public TextView phoneNumberTv;

    public RenewalViewHolder(View itemView) {
        super(itemView);

        clientTv = itemView.findViewById(R.id.clientNameTv);
        riskTv = itemView.findViewById(R.id.riskTv);
        insuredTv = itemView.findViewById(R.id.insuredTv);
        effectiveDateTv = itemView.findViewById(R.id.effectiveDateTv);
        expiryDateTv = itemView.findViewById(R.id.expiryDateTv);
        premiumTv = itemView.findViewById(R.id.premiumTv);
        insuranceCompanyTv = itemView.findViewById(R.id.insuranceCompanyTv);
        phoneNumberTv = itemView.findViewById(R.id.phoneTv);
    }
}
