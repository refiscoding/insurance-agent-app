package ke.co.insuranceapp.Fragments;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import ke.co.insuranceapp.Adapter.AppointmentAdapter;
import ke.co.insuranceapp.Dialogs.AppointmentDialog;
import ke.co.insuranceapp.Models.Appointment;
import ke.co.insuranceapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AppointmentFragment extends Fragment implements AppointmentDialog.AppointmentDialogListener{

    View root;
    RecyclerView recyclerView;
    AppointmentAdapter adapter;
    FloatingActionButton add;
    List<Appointment>appointments;

    public AppointmentFragment() {
        // Required empty public constructor
    }

    public static AppointmentFragment getInstance(){
        return new AppointmentFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        root = inflater.inflate(R.layout.fragment_appointment, container, false);
        setUpViews();
        return root;
    }

    private void setUpViews() {
        recyclerView = root.findViewById(R.id.app_recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new AppointmentAdapter(getContext(),appointments);
        recyclerView.setAdapter(adapter);



        add = root.findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               AppointmentDialog dialog =new AppointmentDialog(getContext(), R.style.FullScreen);
               dialog.setAppointmentDialogListener(new AppointmentDialog.AppointmentDialogListener() {
                   @Override
                   public void setAppointements(String name, String location, String date, String time,String stye) {
                       adapter.addAppointment(new Appointment(name,location,date,time));
                   }
               });
               dialog.showDialog();
            }
        });

    }

//    private ArrayList<Appointment> getAppointments() {
//        ArrayList<Appointment> appointments = new ArrayList<>();
//        appointments.add(new Appointment("Imran Mungai","Thika","12/12/2018","10:00am","Call"));
//        appointments.add(new Appointment("Imran Company","Thika","12/12/2018","8:00am","Visit"));
//        appointments.add(new Appointment("Peter Muchemi","Thika","12/12/2018","10:00am","Call"));
//        appointments.add(new Appointment("Ken Mungai","Thika","12/12/2018","11:00am","WhatsApp"));
//        return appointments;
//    }


    @Override
    public void setAppointements(String name, String location, String date, String time, String stye) {

    }
}
