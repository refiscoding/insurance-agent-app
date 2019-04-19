package ke.co.insuranceapp.ViewHolders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import ke.co.insuranceapp.R;

public class AppointmentViewHolder extends RecyclerView.ViewHolder {

    public TextView clientTv;
    public TextView locationTv;
    public TextView dateTv;
    public TextView timeTv;
    public TextView  typeTv;

    public AppointmentViewHolder(View itemView) {
        super(itemView);
        clientTv = itemView.findViewById(R.id.appclientTv);
        locationTv = itemView.findViewById(R.id.applocationTv);
        dateTv = itemView.findViewById(R.id.apptypeTv);
        timeTv = itemView.findViewById(R.id.appdateTv);
        typeTv = itemView.findViewById(R.id.apptimeTv);
    }
}
