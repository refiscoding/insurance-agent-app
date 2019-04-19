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

import ke.co.insuranceapp.Adapter.AppointmentAdapter;
import ke.co.insuranceapp.Adapter.QuotationAdapter;
import ke.co.insuranceapp.Dialogs.AppointmentDialog;
import ke.co.insuranceapp.Dialogs.QuotationDialog;
import ke.co.insuranceapp.Models.Quote;
import ke.co.insuranceapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class QuotationsFragment extends Fragment {

    View root;
    RecyclerView recyclerView;
    FloatingActionButton add;

    public QuotationsFragment() {
        // Required empty public constructor
    }

    public static  QuotationsFragment getInstance(){
        return new QuotationsFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        root = inflater.inflate(R.layout.fragment_quotations, container, false);
        setUpViews();
        return root;
    }

    private void setUpViews() {
        recyclerView = root.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new QuotationAdapter(getContext(),getQuotation()));

        add = root.findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new QuotationDialog(getContext(), R.style.FullScreen).showDialog();
            }
        });
    }

    private ArrayList<Quote> getQuotation() {
        ArrayList<Quote> quotes = new ArrayList<>();

        quotes.add(new Quote("93165","12/12/2018","12/12/2018","Imran Mungai","Some Product","Draft","Car","KCA 321F","Ksh 2310","Some Underwriter","Ksh 32100"));
        quotes.add(new Quote("123144","12/12/2018","12/12/2018","Peter Muchemi","Some Product","Declined","House","Mansion in Kileleshwa ","Ksh 2310","Some Underwriter","Ksh 20100"));
        quotes.add(new Quote("78654","12/12/2018","12/12/2018","John L.","Some Product","Confirmed","Car","KCG 213G","Ksh 4530","Some Underwriter","Ksh 12000"));

        return quotes;
    }
}
