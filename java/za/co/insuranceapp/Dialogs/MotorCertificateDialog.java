package ke.co.insuranceapp.Dialogs;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import ke.co.insuranceapp.Custom.CustomDialog;
import ke.co.insuranceapp.R;


/**
 * Created by toni on 6/22/17.
 */

public class MotorCertificateDialog extends CustomDialog {
    FrameLayout base;
    FrameLayout rootView;
    private CertificateDialogListener listener;


    public MotorCertificateDialog(Context context) {
        super(context);
    }

    public MotorCertificateDialog(Context context, int theme) {
        super(context, theme);
    }

    protected MotorCertificateDialog(Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_motor_certificate_layout);
        toolbar.setTitle("Add a Motor Certificate");

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

    }

    public void setCertificateDialogListener(CertificateDialogListener listener) {
        this.listener = listener;
    }

    public interface CertificateDialogListener{
        void addCertificates();
}
}
