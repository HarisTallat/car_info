package com.haristallat2001.car_info;

import android.app.Application;

import java.util.ArrayList;

public class localClass  extends Application {
    public static ArrayList<cardata> cars;

    @Override
    public void onCreate() {
        super.onCreate();
        cars=new ArrayList<>();
        cars.add(new cardata("Haris","Honda","03052267378","Civic"));
        cars.add(new cardata("Talha","BMW","0334224378","Reborn"));
        cars.add(new cardata("Junaid","Corola","0304222348","Grande"));
    }
}
