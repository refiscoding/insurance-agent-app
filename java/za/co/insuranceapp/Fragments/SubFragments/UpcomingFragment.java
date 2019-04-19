package ke.co.insuranceapp.Fragments.SubFragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import ke.co.insuranceapp.Adapter.AppointmentAdapter;
import ke.co.insuranceapp.Dialogs.AppointmentDialog;
import ke.co.insuranceapp.Models.Appointment;
import ke.co.insuranceapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class UpcomingFragment extends Fragment {

    View root;
    RecyclerView recyclerView;

    public UpcomingFragment() {
        // Required empty public constructor
    }

    public static UpcomingFragment getInstance(){
        return new UpcomingFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        root = inflater.inflate(R.layout.fragment_upcoming, container, false);
        setUpViews();
        return root;
    }

    private void setUpViews() {
        recyclerView = root.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new AppointmentAdapter(getContext(), getAppointments()));
    }

    private ArrayList<Appointment> getAppointments() {
        ArrayList<Appointment> appointments = new ArrayList<>();
        appointments.add(new Appointment("Imran Mungai","Thika","12/12/2018","10:00pm"));
        appointments.add(new Appointment("Peter Muchemi","Nairobi","12/12/2018","10:10pm"));
        appointments.add(new Appointment("Ken Manyeki","Thika","12/12/2018","11:00pm"));
        appointments.add(new Appointment("Musyoka John","Thika","12/12/2018","11:10pm"));
        return appointments;
    }

}
