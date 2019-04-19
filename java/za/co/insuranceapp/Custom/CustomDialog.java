package ke.co.insuranceapp.Custom;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PixelFormat;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatDialog;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

import ke.co.insuranceapp.Constants;
import ke.co.insuranceapp.R;


public abstract class CustomDialog extends AppCompatDialog {
    ProgressBar progressBar;
    public Toolbar toolbar;


    View dimView;

    public OnDismissListener onDismissListener;
    Boolean isFullScreen;


    public CustomDialog(Context context) {
        super(context);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
    }

    public CustomDialog(Context context, int theme) {

        super(context, theme);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
    }

    protected CustomDialog(Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowManager.LayoutParams lp = new WindowManager.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);
        lp.copyFrom(getWindow().getAttributes());
        getWindow().setAttributes(lp);
        getWindow().setFormat(PixelFormat.TRANSLUCENT);
        getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
    }

    public abstract View setUpDialog(@LayoutRes int layoutResId, int layoutResID);

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        View root = setUpDialog(R.layout.dialog_base,layoutResID);
        toolbar = root.findViewById(R.id.toolbar);
        toolbar.setTitleTextColor(Color.parseColor("#ffffff"));

        progressBar = root.findViewById(R.id.progressBar);
        dimView = root.findViewById(R.id.dim);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });


        hideProgressView();
        super.setContentView(root);
    }

    public void setOnDismissListener(OnDismissListener onDismissListener){
        this.onDismissListener = onDismissListener;
    }


    public interface OnDismissListener{
        void onDismissWithResult(boolean isPositive, Object result, Constants.DialogType requestCode);
    }

    public void showProgressView(){
        dimView.setAlpha(0.5f);
        dimView.setVisibility(View.VISIBLE);
        progressBar.setVisibility(View.VISIBLE);
    }

    public void hideProgressView(){
        dimView.setAlpha(0);
        dimView.setVisibility(View.GONE);
        progressBar.setVisibility(View.GONE);
    }

    public void showDialog(){
        if (!CustomDialog.this.isShowing()){
            CustomDialog.this.show();
        }
    }



}


