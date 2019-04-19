package ke.co.insuranceapp.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import ke.co.insuranceapp.Models.MotorCertificate;
import ke.co.insuranceapp.R;
import ke.co.insuranceapp.ViewHolders.MotorCertificateViewHolder;

public class MotorCertificateAdapter extends RecyclerView.Adapter<MotorCertificateViewHolder> {

    Context ctx;
    ArrayList<MotorCertificate> motorCertificates;

    public MotorCertificateAdapter(Context ctx, ArrayList<MotorCertificate> motorCertificates) {
        this.ctx = ctx;
        this.motorCertificates = motorCertificates;
    }

    @NonNull
    @Override
    public MotorCertificateViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.motorcertificate_item, parent, false);
        return new MotorCertificateViewHolder(itemView);
    }



    @Override
    public void onBindViewHolder(@NonNull MotorCertificateViewHolder holder, int position) {
        MotorCertificate motorCertificate = motorCertificates.get(position);
        holder.certNoTv.setText(motorCertificate.getCertNo());
        holder.insuranceCompanyTv.setText(motorCertificate.getInsuranceCompany());
        holder.effectiveDateTv.setText(motorCertificate.getEffectiveDate());
        holder.expiryDateTv.setText(motorCertificate.getExpiryDate());
        holder.clientTv.setText(motorCertificate.getClient());
        holder.vehicleRegNoTv.setText(motorCertificate.getVehicleRegNo());
    }

    @Override
    public int getItemCount() {
        return motorCertificates.size();
    }
}
