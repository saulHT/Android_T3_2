package com.example.practica_t3.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.practica_t3.R;
import com.example.practica_t3.entidades.Anime;
import com.squareup.picasso.Picasso;

import java.util.List;

public class AnimeAdapter extends RecyclerView.Adapter<AnimeAdapter.AnimeViewHolder> {

    private List<Anime> data;

    public AnimeAdapter(List<Anime>data){
        this.data=data;
    }
    @NonNull
    @Override
    public AnimeViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_anime,parent,false);
        return new AnimeViewHolder(view);
    }

    @Override
    public void onBindViewHolder( AnimeViewHolder holder, int position) {

        ImageView image=holder.itemView.findViewById(R.id.imageView);
        TextView txT=holder.itemView.findViewById(R.id.textView);
        TextView txD=holder.itemView.findViewById(R.id.textViewD);

        Anime anime=data.get(position);
        txT.setText(anime.getNombre());
        txD.setText(anime.getDescribe());

        Picasso.get().load(anime.getUrl())
                .into(image);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class AnimeViewHolder extends RecyclerView.ViewHolder {
        public AnimeViewHolder(View itemView) {
            super(itemView);
        }
    }
}
