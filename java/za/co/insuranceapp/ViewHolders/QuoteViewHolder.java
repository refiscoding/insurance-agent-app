package ke.co.insuranceapp.ViewHolders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import ke.co.insuranceapp.R;

public class QuoteViewHolder extends RecyclerView.ViewHolder {
    public TextView qouteNumberTv;

    public TextView clientTv;
    public TextView productTv;
    public TextView insuredObjectTv;
    public TextView premiumTv;
    public TextView underwriterTv;
    public TextView sumInsuredTv;

    public TextView statusTv;
    public TextView effectiveDateTv;
    public TextView expiryDateTv;
    public TextView detailsTv;

    public View more;
    public View clickable;





    public QuoteViewHolder(View itemView) {
        super(itemView);
        qouteNumberTv = itemView.findViewById(R.id.quoteNoTv);
        clientTv = itemView.findViewById(R.id.clientTv);
        productTv = itemView.findViewById(R.id.productTv);
        statusTv = itemView.findViewById(R.id.statusTv);
        insuredObjectTv = itemView.findViewById(R.id.insuredObjectTv);
        detailsTv = itemView.findViewById(R.id.detailsTv);
        premiumTv = itemView.findViewById(R.id.premiumTv);
        underwriterTv = itemView.findViewById(R.id.underwriterTv);
        sumInsuredTv = itemView.findViewById(R.id.sumInsuredTv);
        effectiveDateTv = itemView.findViewById(R.id.effectiveDateTv);
        expiryDateTv = itemView.findViewById(R.id.expiryDateTv);

        more = itemView.findViewById(R.id.more);
        clickable = itemView.findViewById(R.id.clickable);
    }
}
