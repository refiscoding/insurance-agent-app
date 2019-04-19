package ke.co.insuranceapp.Dialogs;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;

import ke.co.insuranceapp.Common.Common;
import ke.co.insuranceapp.Custom.CustomDialog;
import ke.co.insuranceapp.R;
import ke.co.insuranceapp.Retrofit.InsuranceApi;


/**
 * Created by toni on 6/22/17.
 */

public class CustomerDialog extends CustomDialog {
    FrameLayout base;
    FrameLayout rootView;
    private CustomerDialogListener listener;
    InsuranceApi mService;


    public CustomerDialog(Context context) {
        super(context);
    }

    public CustomerDialog(Context context, int theme) {
        super(context, theme);
    }

    protected CustomerDialog(Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_customer_layout);
        toolbar.setTitle("Add a Customer");

    }

    @Override
    public View setUpDialog(@LayoutRes int layoutResId,int childLayoutResId) {
        base = (FrameLayout) View.inflate(getContext(), layoutResId, null);
        rootView =  base.findViewById(R.id.parent);

        if (layoutResId != 0) {
            rootView =  (FrameLayout) View.inflate(getContext(), childLayoutResId, rootView);
            setUpViews();
            mService = Common.getApi();
        }

        return base;
    }

    private void setUpViews() {
        final EditText name = rootView.findViewById(R.id.customernameTv);
        final EditText phone =rootView.findViewById(R.id.customerphoneTv);
        final EditText email =rootView.findViewById(R.id.customeremailTv);
        final EditText cover =rootView.findViewById(R.id.customercoversTv);
        Button add = rootView.findViewById(R.id.addCustomer);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String names=name.getText().toString();
                String mobile =phone.getText().toString();
                String emailAddress =email.getText().toString();
                String covers = cover.getText().toString();
                if(listener!=null){
                    listener.addCustomers(names,mobile,emailAddress,covers);
                }

                dismiss();
            }
        });
    }

    public void setCustomerDialogListener(CustomerDialogListener listener) {
        this.listener = listener;
    }

    public interface CustomerDialogListener{
        void addCustomers(String names,String mobile,String emailAdress,String covers);
}
}
