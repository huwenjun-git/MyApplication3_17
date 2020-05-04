package com.huwenjun.myapplication3_17;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.huwenjun.pojo.Fruit;

import java.util.List;

public class FruitAdapter extends ArrayAdapter<Fruit> {
    private int tpId;

    public FruitAdapter(@NonNull Context context, int resource, @NonNull List<Fruit> objects) {
        super(context, resource, objects);
        tpId=resource;
    }

    @NonNull
    @Override
    public View getView(int position,
                        @Nullable View convertView,
                        @NonNull ViewGroup parent) {
        View mobanView= LayoutInflater.from(getContext()).inflate(tpId,null);
        Fruit fruit=getItem(position);
        ImageView im=mobanView.findViewById(R.id.imageView2);
        TextView tv=mobanView.findViewById(R.id.textView2);
        im.setImageResource(fruit.getImageId());
        tv.setText(fruit.getName());
        return mobanView;



    }
}


//getView()的执行时机， ListView第一次执行， convertView=null;
//屏幕上面只能容纳7条，  内存中只有7条的内存渲染情况，
//你再滚动时，它不再增加，
//1出去了， 空，   8条会不会新建一个视图？ 第8条它会把第一条拿来用，会重新赋值 ，
//
//这样的好处，是提高效率。
