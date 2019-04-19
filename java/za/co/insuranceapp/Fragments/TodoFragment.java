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

import ke.co.insuranceapp.Adapter.ClaimAdapter;
import ke.co.insuranceapp.Adapter.TodoAdapter;
import ke.co.insuranceapp.Dialogs.AppointmentDialog;
import ke.co.insuranceapp.Dialogs.TodoDialog;
import ke.co.insuranceapp.Models.Todo;
import ke.co.insuranceapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TodoFragment extends Fragment {

    View root;
    RecyclerView recyclerView;
    FloatingActionButton add;

    public TodoFragment() {
        // Required empty public constructor
    }

    public static TodoFragment getInstance(){
        return new TodoFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        root = inflater.inflate(R.layout.fragment_todo, container, false);
        setUpViews();
        return root;
    }

    private void setUpViews() {
        recyclerView = root.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new TodoAdapter(getContext(), getTodo()));

        add = root.findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new TodoDialog(getContext(), R.style.FullScreen).showDialog();
            }
        });
    }

    private ArrayList<Todo> getTodo() {
        ArrayList<Todo> todos = new ArrayList<>();

        todos.add(new Todo("A visit to some Insurance Company","To discuss some important issues","12/12/2018"));
        todos.add(new Todo("A visit to some Insurance Company","To discuss some important issues","12/12/2018"));
        todos.add(new Todo("A visit to some Insurance Company","To discuss some important issues","12/12/2018"));

        return todos;
    }

}
