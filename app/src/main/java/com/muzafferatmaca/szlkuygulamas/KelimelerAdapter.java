package com.muzafferatmaca.szlkuygulamas;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class KelimelerAdapter extends RecyclerView.Adapter<KelimelerAdapter.ViewHolder> {

    Context context;
    List<Kelimeler> kelimelerList;

    public KelimelerAdapter(Context context, List<Kelimeler> kelimelerList) {
        this.context = context;
        this.kelimelerList = kelimelerList;
    }


    @NonNull
    @Override
    public KelimelerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_tasarim,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull KelimelerAdapter.ViewHolder holder, int position) {

        final Kelimeler kelime = kelimelerList.get(position);

        holder.ingilizce.setText(kelime.getIngilizce());
        holder.turkce.setText(kelime.getTurkce());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context,DetailActivity.class);
                intent.putExtra("nesne",kelime);
                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return kelimelerList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView ingilizce,turkce;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ingilizce = itemView.findViewById(R.id.textViewIngilizce);
            turkce = itemView.findViewById(R.id.textViewTurkce);
            cardView = itemView.findViewById(R.id.cardView);


        }
    }
}
