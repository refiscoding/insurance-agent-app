package ke.co.insuranceapp.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import ke.co.insuranceapp.Models.Quote;
import ke.co.insuranceapp.Models.Renewal;
import ke.co.insuranceapp.R;
import ke.co.insuranceapp.ViewHolders.QuoteViewHolder;
import ke.co.insuranceapp.ViewHolders.RenewalViewHolder;

public class QuotationAdapter extends RecyclerView.Adapter<QuoteViewHolder> {

    Context ctx;
    List<Quote> quotes;

    public QuotationAdapter(Context ctx, List<Quote> quotes) {
        this.ctx = ctx;
        this.quotes = quotes;
    }

    @NonNull
    @Override
    public QuoteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.quotation_item, parent, false);
        return new QuoteViewHolder(itemView);
    }



    @Override
    public void onBindViewHolder(@NonNull final QuoteViewHolder holder, int position) {
        Quote quote = quotes.get(position);


        holder.qouteNumberTv.setText(quote.getQuoteNumber());
        holder.clientTv.setText(quote.getClient());
        holder.productTv.setText(quote.getProduct());
        holder.insuredObjectTv.setText(quote.getInsuredObject());
        holder.detailsTv.setText(quote.getDetails());
        holder.premiumTv.setText(quote.getPremium());
        holder.underwriterTv.setText(quote.getUnderwriter());
        holder.sumInsuredTv.setText(quote.getSumInsured());
        holder.effectiveDateTv.setText(quote.getEffectiveDate());
        holder.expiryDateTv.setText(quote.getExpiryDate());

        holder.clickable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(holder.more.getVisibility() == View.VISIBLE) {
                    holder.more.setVisibility(View.GONE);
                } else{
                    holder.more.setVisibility(View.VISIBLE);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return quotes.size();
    }
}
