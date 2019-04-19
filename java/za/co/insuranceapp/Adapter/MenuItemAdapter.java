package ke.co.insuranceapp.Adapter;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import ke.co.insuranceapp.Fragments.AppointmentFragment;
import ke.co.insuranceapp.Fragments.ClaimFragment;
import ke.co.insuranceapp.Fragments.CustomerFragment;
import ke.co.insuranceapp.Fragments.LeadsFragment;
import ke.co.insuranceapp.Fragments.MotorCertificatesFragment;
import ke.co.insuranceapp.Fragments.PolicyFragment;
import ke.co.insuranceapp.Fragments.QuotationsFragment;
import ke.co.insuranceapp.Fragments.RenewalFragment;
import ke.co.insuranceapp.Fragments.TodoFragment;
import ke.co.insuranceapp.HomeActivity;
import ke.co.insuranceapp.MainActivity;
import ke.co.insuranceapp.Models.Appointment;
import ke.co.insuranceapp.Models.MenuItem;
import ke.co.insuranceapp.R;
import ke.co.insuranceapp.ReportsFragment;
import ke.co.insuranceapp.UtilsFragment;
import ke.co.insuranceapp.ViewHolders.MenuItemViewHolder;


public class MenuItemAdapter extends RecyclerView.Adapter<MenuItemViewHolder> {
    Context ctx;
    List<MenuItem> menuItems;

    public MenuItemAdapter(Context ctx, List<MenuItem> menuItems) {
        this.ctx = ctx;
        this.menuItems = menuItems;
    }

    @Override
    public MenuItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.circle, parent, false);
        return new MenuItemViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MenuItemViewHolder holder, int position) {
        final MenuItem item = menuItems.get(position);
        holder.nameTv.setText(item.getName());
        holder.imageView.setImageResource(item.getDrawable());



        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (item.getId()){
                    case 1:
                        HomeActivity.navItemIndex = 1;
                        UtilsFragment.setFragment((AppCompatActivity) ctx, RenewalFragment.getInstance(),"Renewals");
                        break;
                    case 2:
                        HomeActivity.navItemIndex = 2;
                        UtilsFragment.setFragment((AppCompatActivity) ctx, AppointmentFragment.getInstance(),"Appointments");
                        break;

                    case 3:
                        HomeActivity.navItemIndex = 3;
                        UtilsFragment.setFragment((AppCompatActivity) ctx, TodoFragment.getInstance(),"To do list");
                        break;

                    case 4:
                        HomeActivity.navItemIndex = 4;
                        UtilsFragment.setFragment((AppCompatActivity) ctx, LeadsFragment.getInstance(),"Leads");
                        break;

                    case 5:
                        HomeActivity.navItemIndex = 5;
                        UtilsFragment.setFragment((AppCompatActivity) ctx, CustomerFragment.getInstance(),"Customer");
                        break;

                    case 6:
                        HomeActivity.navItemIndex = 6;
                        UtilsFragment.setFragment((AppCompatActivity) ctx, QuotationsFragment.getInstance(),"Quotations");
                        break;

                    case 7:
                        HomeActivity.navItemIndex = 7;
                        UtilsFragment.setFragment((AppCompatActivity) ctx, PolicyFragment.getInstance(),"Policies");
                        break;

                    case 8:
                        HomeActivity.navItemIndex = 8;
                        UtilsFragment.setFragment((AppCompatActivity) ctx, ClaimFragment.getInstance(),"Claim");
                        break;

                    case 9:
                        HomeActivity.navItemIndex = 9;
                        UtilsFragment.setFragment((AppCompatActivity) ctx, MotorCertificatesFragment.getInstance(),"Motor Certificates");
                        break;

                    case 10:
                        HomeActivity.navItemIndex = 10;
                        UtilsFragment.setFragment((AppCompatActivity) ctx, ReportsFragment.getInstance(),"Reports");
                        break;

                }
            }
        });



    }

    @Override
    public int getItemCount() {
        return menuItems.size();
    }
}
