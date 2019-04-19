package ke.co.insuranceapp.Dialogs;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ke.co.insuranceapp.Common.Common;
import ke.co.insuranceapp.Custom.CustomDialog;
import ke.co.insuranceapp.Models.Data;
import ke.co.insuranceapp.Models.Policy;
import ke.co.insuranceapp.R;
import ke.co.insuranceapp.Retrofit.InsuranceApi;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static android.content.ContentValues.TAG;


/**
 * Created by toni on 6/22/17.
 */

public class PolicyDialog extends CustomDialog {
    FrameLayout base;
    FrameLayout rootView;
    PolicyDialogListener listener;

    List<Policy>data = new ArrayList<>();

    private InsuranceApi mService;

    public PolicyDialog(Context context) {
        super(context);
    }

    public PolicyDialog(Context context, int theme) {
        super(context, theme);
    }

    protected PolicyDialog(Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_policy_layout);
        toolbar.setTitle("Add a Policy");

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
        final EditText clientTv = rootView.findViewById(R.id.clientpolTv);
        final EditText riskTv = rootView.findViewById(R.id.riskpolTv);
        final EditText insuredobjTv = rootView.findViewById(R.id.insuredpolObject);
        final EditText insuranceCompanyTv = rootView.findViewById(R.id.insuranceCompanypolTv);
        final EditText effectiveDateTv = rootView.findViewById(R.id.effectivepolDateTv);
        final EditText expiryDateTv = rootView.findViewById(R.id.expirypolDateTv);
        final EditText premiumTv = rootView.findViewById(R.id.premiumpolTv);
        final EditText commisionTv = rootView.findViewById(R.id.commissionpolTv);
        final EditText value = rootView.findViewById(R.id.valuepolTv);
        final EditText adminFeeTv = rootView.findViewById(R.id.adminFeepolTv);
        Button add = rootView.findViewById(R.id.addpol);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String client=   clientTv.getText().toString();
                final String  risk=   riskTv.getText().toString();
                final String insured =  insuredobjTv.getText().toString();
                final String insuranceCompany= insuranceCompanyTv.getText().toString();
                final String effectiveDate =  effectiveDateTv.getText().toString();
                final String expiryDate=   expiryDateTv.getText().toString();
                final String premium=   premiumTv.getText().toString();
                final String commision=   commisionTv.getText().toString();
                final String  adminFee=  adminFeeTv.getText().toString();
                String values =value.getText().toString();




               if(listener!= null)
               {


                   Policy policy = new Policy();
                   policy.setClient(client);
                   policy.setRisk(risk);
                   policy.setInsured(insured);
                   policy.setInsuranceCompany(insuranceCompany);
                   policy.setEffectiveDate(effectiveDate);
                   policy.setExpiryDate(expiryDate);
                   policy.setPremium(premium);
                   policy.setCommission(commision);
                   policy.setAdminFee(adminFee);

                   data.add(policy);

                   Map<String,Object> data1 = new HashMap<>();
                   data1.put("data",data);
//                   Data data2 = new Data(datapol,data) ;

                   mService.save_log(data1)
                           .enqueue(new Callback<Void>() {
                               @Override
                               public void onResponse(Call<Void> call, Response<Void> response) {
                                   Log.d(TAG,"onResponse success"+response.toString());
                               }

                               @Override
                               public void onFailure(Call<Void> call, Throwable t) {
                                    Log.d("TAG",t.toString());
                               }
                           });


                   listener.sendInfo(client,risk,insured,insuranceCompany,effectiveDate,expiryDate,premium,commision,adminFee);

               }
               dismiss();
            }
        });
    }

    public void setPolicyDialogListener(PolicyDialogListener listener) {
        this.listener = listener;
    }

    public interface  PolicyDialogListener{
        void sendInfo(String client, String risk, String insured, String insuranceCompany, String effectiveDate, String expiryDate, String premium,String commision,String adminFee
                      );

    }
}
