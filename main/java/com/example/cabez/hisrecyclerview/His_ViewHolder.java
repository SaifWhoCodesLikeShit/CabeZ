package com.example.cabez.hisrecyclerview;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.cabez.his_single;
import com.example.cabez.R;


public class His_ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

public TextView rideId;
public TextView time;
public His_ViewHolder(View itemView){
        super(itemView);
        itemView.setOnClickListener(this);

        rideId=(TextView)itemView.findViewById(R.id.rideId);
        time=(TextView)itemView.findViewById(R.id.time);
        }


@Override
public void onClick(View v){
        Intent intent=new Intent(v.getContext(),his_single.class);
        Bundle b=new Bundle();
        b.putString("rideId",rideId.getText().toString());
        intent.putExtras(b);
        v.getContext().startActivity(intent);
        }
        }
