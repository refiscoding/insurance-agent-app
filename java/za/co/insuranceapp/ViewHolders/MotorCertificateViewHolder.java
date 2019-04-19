package ke.co.insuranceapp.ViewHolders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import ke.co.insuranceapp.R;

public class MotorCertificateViewHolder extends RecyclerView.ViewHolder {

    public TextView certNoTv;
    public TextView clientTv;
    public TextView insuranceCompanyTv;
    public TextView effectiveDateTv;
    public TextView expiryDateTv;
    public TextView vehicleRegNoTv;



    public MotorCertificateViewHolder(View itemView) {
        super(itemView);

        certNoTv = itemView.findViewById(R.id.certNoTv);
        clientTv = itemView.findViewById(R.id.clientTv);
        insuranceCompanyTv = itemView.findViewById(R.id.insuranceCompanyTv);
        effectiveDateTv = itemView.findViewById(R.id.effectiveDateTv);
        expiryDateTv = itemView.findViewById(R.id.expiryDateTv);
        vehicleRegNoTv = itemView.findViewById(R.id.vehicleRegNoTv);

    }
}
