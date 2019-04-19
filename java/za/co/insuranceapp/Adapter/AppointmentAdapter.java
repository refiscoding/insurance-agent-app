package za.co.insuranceapp.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import ke.co.insuranceapp.Models.Appointment;
import ke.co.insuranceapp.Models.Renewal;
import ke.co.insuranceapp.R;
import ke.co.insuranceapp.ViewHolders.AppointmentViewHolder;
import ke.co.insuranceapp.ViewHolders.RenewalViewHolder;

public class AppointmentAdapter extends RecyclerView.Adapter<AppointmentViewHolder> {

    Context ctx;
    List<Appointment> appointments;

    public AppointmentAdapter(Context ctx, List<Appointment> appointments) {
        this.ctx = ctx;
        this.appointments = appointments;
    }

    @NonNull
    @Override
    public AppointmentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.appointment_item, parent, false);
        return new AppointmentViewHolder(itemView);
    }



    @Override
    public void onBindViewHolder(@NonNull AppointmentViewHolder holder, int position) {
        Appointment appointment = appointments.get(position);
        holder.clientTv.setText(appointment.getClient());
        holder.locationTv.setText(appointment.getLocation());
        holder.dateTv.setText(appointment.getDate());
        holder.timeTv.setText(appointment.getTime());
        holder.typeTv.setText(appointment.getType());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public void addAppointment(Appointment appointment){
        appointments.add(0,appointment);
        notifyItemChanged(0);
    }

}
