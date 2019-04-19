package ke.co.insuranceapp.ViewHolders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import ke.co.insuranceapp.R;


public class NewsItemViewHolder extends RecyclerView.ViewHolder {

    public ImageView imageView;
    public TextView titleTv;
    public TextView messageTv;
    public TextView timeTv;

    public NewsItemViewHolder(View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageView);

        titleTv = itemView.findViewById(R.id.titleTv);
        messageTv = itemView.findViewById(R.id.messageTv);
        timeTv = itemView.findViewById(R.id.timeTv);
    }
}
