package com.example.levohuuthai_tuan8_room2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdressAdapter extends RecyclerView.Adapter<AdressAdapter.ViewHolder> {
    private List<Adress> mlist;

    public void setData(List<Adress> list){
        this.mlist = list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_diachi,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Adress adress = mlist.get(position);
        if(adress == null){
            return;
        }
        holder.tvAdress.setText(adress.getId()+"  "+ adress.getAdress());

    }

    @Override
    public int getItemCount() {
        if(mlist != null){
            return mlist.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvAdress;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvAdress = itemView.findViewById(R.id.tvAddress);
        }
    }
}
