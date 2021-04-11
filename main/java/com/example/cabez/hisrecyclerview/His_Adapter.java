package com.example.cabez.hisrecyclerview;
import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;


import com.example.cabez.R;
import com.example.cabez.hisrecyclerview.His_Object;
import com.example.cabez.hisrecyclerview.His_ViewHolder;

import java.util.List;
public class His_Adapter extends RecyclerView.Adapter<His_ViewHolder>{

    private List<His_Object> itemList;
    private Context context;

    public His_Adapter(List<His_Object> itemList, Context context) {
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public His_ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_his, null, false);
        RecyclerView.LayoutParams lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutView.setLayoutParams(lp);
        His_ViewHolder rcv = new His_ViewHolder(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(His_ViewHolder holder, final int position) {
        holder.rideId.setText(itemList.get(position).getRideId());
        if(itemList.get(position).getTime()!=null){
            holder.time.setText(itemList.get(position).getTime());
        }
    }
    @Override
    public int getItemCount() {
        return this.itemList.size();
    }

}

