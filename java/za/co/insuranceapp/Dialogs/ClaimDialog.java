package ke.co.insuranceapp.Dialogs;

import android.content.Context;
import android.content.DialogInterface;
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

public class ClaimDialog extends CustomDialog {
    FrameLayout base;
    FrameLayout rootView;
    private ClaimDialogListener listener;


    public ClaimDialog(Context context) {
        super(context);
    }

    public ClaimDialog(Context context, int theme) {
        super(context, theme);
    }

    protected ClaimDialog(Context context, boolean cancelable, DialogInterface.OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_claim_layout);
        toolbar.setTitle("Add a Claim");

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
        final EditText effective = rootView.findViewById(R.id.effectiveclaimDateTv);
        final EditText expiry = rootView.findViewById(R.id.expiryclaimDateTv);
        final EditText customer = rootView.findViewById(R.id.customerclaimTv);
        final EditText policy = rootView.findViewById(R.id.policyclaimTv);
        final EditText risk = rootView.findViewById(R.id.riskclaimTv);
        final EditText details = rootView.findViewById(R.id.detailsclaimTv);
        final EditText sum = rootView.findViewById(R.id.sumInsuredclaimTv);
        final EditText premium = rootView.findViewById(R.id.premiumclaimTv);
        final EditText report = rootView.findViewById(R.id.reportDateclaimTv);
        final EditText claimdets = rootView.findViewById(R.id.claimDetailsTv);
        final EditText otherparty =rootView.findViewById(R.id.otherPartyclaimTv);
        final EditText contact =rootView.findViewById(R.id.contactsclaimTv);
        final EditText police= rootView.findViewById(R.id.policeStationclaimTv);
        final EditText ob = rootView.findViewById(R.id.obNumberclaimTv);
        final EditText towcar = rootView.findViewById(R.id.towingCarclaimTv);
        final EditText yard = rootView.findViewById(R.id.yardclaimTv);

        Button add = rootView.findViewById(R.id.addclaims);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String effect = effective.getText().toString();
                String expire = expiry.getText().toString();
                String customers = customer.getText().toString();
                String pol = policy.getText().toString();
                String risks = risk.getText().toString();
                String dets = details.getText().toString();
                String sums = sum.getText().toString();
                String prem = premium.getText().toString();
                String reps = report.getText().toString();
                String claim = claimdets.getText().toString();
                String other = otherparty.getText().toString();
                String contacts = contact.getText().toString();
                String polizei = police.getText().toString();
                String obs= ob.getText().toString();
                String tow =towcar.getText().toString();
                String yards =yard.getText().toString();

                if(listener!=null){
                    listener.addClaims(effect,expire,customers,pol,risks,dets,sums,prem,reps,claim,other,contacts,polizei,obs,tow,yards);
                }


                dismiss();
            }
        });
    }

    public void setClaimDialogListener(ClaimDialogListener listener) {
        this.listener = listener;
    }

    public interface ClaimDialogListener{
        void addClaims(String effect,String expire, String customers, String pol, String risks ,String dets, String sums, String prem, String reps ,String claim,
                String other, String contacts, String polizei ,String obs, String tow ,String yards );
}
}
