package ke.co.insuranceapp.Adapter;

import android.content.Context;
import android.content.Intent;
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
import ke.co.insuranceapp.Models.MenuItem;
import ke.co.insuranceapp.Models.NewsItem;
import ke.co.insuranceapp.R;
import ke.co.insuranceapp.ReportsFragment;
import ke.co.insuranceapp.UtilsFragment;
import ke.co.insuranceapp.ViewHolders.MenuItemViewHolder;
import ke.co.insuranceapp.ViewHolders.NewsItemViewHolder;
import ke.co.insuranceapp.WebActivity;


public class NewsItemAdapter extends RecyclerView.Adapter<NewsItemViewHolder> {
    Context ctx;
    List<NewsItem> newsItems;

    public NewsItemAdapter(Context ctx, List<NewsItem> newsItems) {
        this.ctx = ctx;
        this.newsItems = newsItems;
    }

    @Override
    public NewsItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_item, parent, false);
        return new NewsItemViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(NewsItemViewHolder holder, int position) {
        final NewsItem item = newsItems.get(position);

        //        holder.imageView.setImageResource(item.getDrawable());

        holder.titleTv.setText(item.getTitle());
        holder.messageTv.setText(item.getMessage());
        holder.timeTv.setText(item.getTime());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ctx, WebActivity.class);
                i.putExtra("title",item.getTitle());
                i.putExtra("url","http://www.example.com");
                ctx.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return newsItems.size();
    }
}
