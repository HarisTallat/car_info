 package com.haristallat2001.car_info;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

 public class MainActivity extends AppCompatActivity implements CarAdp.selected{
TextView tvcontact,tvowner,tvcarname,nameo,namec,ccc;
Button btcar,btowner;
ImageView ivcar,image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvcontact=findViewById(R.id.tvcontact);
        tvowner=findViewById(R.id.tvowner);
        btcar=findViewById(R.id.btcar);
        btowner=findViewById(R.id.btowner);
        tvcarname=findViewById(R.id.tv_name);
        ivcar=findViewById(R.id.ivcar);
        nameo=findViewById(R.id.nameo);
        namec=findViewById(R.id.namec);
        ccc=findViewById(R.id.compname);
        image=findViewById(R.id.image);
       ;

        btcar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvowner.setVisibility(View.GONE);
                tvcontact.setVisibility(View.GONE);
                tvcarname.setVisibility(View.VISIBLE);
                ivcar.setVisibility(View.VISIBLE);
                nameo.setVisibility(View.GONE);
                namec.setVisibility(View.GONE);
                ccc.setVisibility(View.VISIBLE);
                image.setVisibility(View.GONE);


            }
        });
        btowner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nameo.setVisibility(View.VISIBLE);
                namec.setVisibility(View.VISIBLE);
                tvowner.setVisibility(View.VISIBLE);
                tvcontact.setVisibility(View.VISIBLE);
                tvcarname.setVisibility(View.GONE);
                ivcar.setVisibility(View.GONE);
                ccc.setVisibility(View.GONE);
                image.setVisibility(View.GONE);


            }
        });
        clicked(0);
    }

    @Override
    public void clicked(int index) {

tvowner.setText(localClass.cars.get(index).getOwner_N());
        tvcontact.setText(localClass.cars.get(index).getContact());
        tvcarname.setText(localClass.cars.get(index).getCompany_N());
        if( localClass.cars.get(index).getCompany_N().equals("Honda"))
        {
            ivcar.setImageResource(R.drawable.polo);
        }
        else if(localClass.cars.get(index).getCompany_N().equals("BMW"))
        {
            ivcar.setImageResource(R.drawable.mercedes);
        }
        else if(localClass.cars.get(index).getCompany_N().equals("Corola"))

        {
            ivcar.setImageResource(R.drawable.nissan);

        }
        if( localClass.cars.get(index).owner_N.equals("Haris"))
        {
            image.setImageResource(R.drawable.final_pic_haris);
        }
        else if( localClass.cars.get(index).owner_N.equals("Talha"))
        {
            image.setImageResource(R.drawable.talha);
        }
        else if( localClass.cars.get(index).owner_N.equals("Junaid"))

        {
            image.setImageResource(R.drawable.juni);

        }
    }
}