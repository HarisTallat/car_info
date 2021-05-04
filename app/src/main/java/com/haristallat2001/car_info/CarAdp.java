package com.haristallat2001.car_info;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CarAdp extends RecyclerView.Adapter<CarAdp.ViewHolder> {
    ArrayList<cardata>car;
    selected myActivity;
    public CarAdp(Context context, ArrayList<cardata> list)
    {
        car=list;
        myActivity= (selected) context;


    }
    public interface selected
    {
public void clicked(int index);
    }
    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView company_name,owner_name;
        ImageView ivbrand;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            company_name= itemView.findViewById(R.id.company_name);
            owner_name= itemView.findViewById(R.id.owner_name);
            ivbrand=itemView.findViewById(R.id.ivbrand);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    myActivity.clicked(car.indexOf((cardata)itemView.getTag()));

                }
            });
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_design,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.company_name.setText(car.get(position).getCompany_N());
        holder.owner_name.setText(car.get(position).getOwner_N());
        holder.itemView.setTag(car.get(position));
        if(car.get(position).getCompany_N().equals("Honda"))
        {
           holder.ivbrand.setImageResource(R.drawable.polo);

        }
       else  if(car.get(position).getCompany_N().equals("BMW"))
        {
            holder.ivbrand.setImageResource(R.drawable.mercedes);

        }
       else  if(car.get(position).getCompany_N().equals("Corola"))
        {
            holder.ivbrand.setImageResource(R.drawable.nissan);

        }


    }

    @Override
    public int getItemCount() {
        return car.size();
    }
}
