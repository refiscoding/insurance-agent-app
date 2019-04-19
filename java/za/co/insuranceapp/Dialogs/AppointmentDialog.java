package ke.co.insuranceapp.Dialogs;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.Spinner;

import java.util.ArrayList;

import ke.co.insuranceapp.Custom.CustomDialog;
import ke.co.insuranceapp.R;


/**
 * Created by toni on 6/22/17.
 */

public class AppointmentDialog extends CustomDialog {
    FrameLayout base;
    FrameLayout rootView;
    private AppointmentDialogListener listener;


    public AppointmentDialog(Context context) {
        super(context);
    }

    public AppointmentDialog(Context context, int theme) {
        super(context, theme);
    }

    protected AppointmentDialog(Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_appointments_layout);
        toolbar.setTitle("Add an Appointment");

    }

    @Override
    public View setUpDialog(@LayoutRes int layoutResId,int childLayoutResId) {
        base = (FrameLayout) View.inflate(getContext(), layoutResId, null);
        rootView =  base.findViewById(R.id.parent);

        if (layoutResId != 0) {
            rootView =  (FrameLayout) View.inflate(getContext(), childLayoutResId, rootView);
            setUpViews();
        }

        return base;
    }

    private void setUpViews() {
        final EditText etname = rootView.findViewById(R.id.nameappTv);
        final EditText etlocation = rootView.findViewById(R.id.locationappTv);
        final EditText etdate = rootView.findViewById(R.id.dateappTv);
        final EditText ettime = rootView.findViewById(R.id.timeappTv);
        final Spinner stype = rootView.findViewById(R.id.spinnerappStatus);
        Button add = rootView.findViewById(R.id.addApp);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name =etname.getText().toString();
                String location =etlocation.getText().toString();
                String date =etdate.getText().toString();
                String time =ettime.getText().toString();
                String stye = String.valueOf(stype);
                if(listener!=null){
                    listener.setAppointements(name,location,date,time,stye);
                }

                dismiss();
            }
        });
    }

    public void setAppointmentDialogListener(AppointmentDialogListener listener) {
        this.listener = listener;
    }

    public interface AppointmentDialogListener{
        void setAppointements(String name,String location,String date,String time,String stye);
    }
}
