package ke.co.insuranceapp.Dialogs;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;

import ke.co.insuranceapp.Custom.CustomDialog;
import ke.co.insuranceapp.R;


/**
 * Created by toni on 6/22/17.
 */

public class LeadDialog extends CustomDialog {
    FrameLayout base;
    FrameLayout rootView;
    private LeadDialogListener listener;


    public LeadDialog(Context context) {
        super(context);
    }

    public LeadDialog(Context context, int theme) {
        super(context, theme);
    }

    protected LeadDialog(Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_lead_layout);
        toolbar.setTitle("Add a Lead");

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
        final EditText name= rootView.findViewById(R.id.leadnameTv);
        final EditText phone = rootView.findViewById(R.id.leadphoneTv);
        final EditText email= rootView.findViewById(R.id.leademailTv);
        Button add = rootView.findViewById(R.id.addLeads);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String names= name.getText().toString();
                String cell = phone.getText().toString();
                String emails = email.getText().toString();
                if(listener!= null){
                    listener.addLead(names,cell,emails);
                }
                dismiss();
            }
        });
    }

    public void setLeadDialogListener(LeadDialogListener listener) {
        this.listener = listener;
    }

    public interface LeadDialogListener{
        void addLead(String names,String cell,String emails);
}
}
