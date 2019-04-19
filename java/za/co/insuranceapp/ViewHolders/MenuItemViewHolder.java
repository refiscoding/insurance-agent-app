package ke.co.insuranceapp.ViewHolders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import ke.co.insuranceapp.R;


public class MenuItemViewHolder extends RecyclerView.ViewHolder {

    public ImageView imageView;
    public TextView nameTv;

    public MenuItemViewHolder(View itemView) {
        super(itemView);
        nameTv = itemView.findViewById(R.id.nameTv);
        imageView = itemView.findViewById(R.id.imageView);
    }
}
