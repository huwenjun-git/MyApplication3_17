package com.huwenjun.myapplication3_17;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.huwenjun.pojo.Fruit;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public List<Fruit> biaoTi=new ArrayList<Fruit>();
    public String[] nr={
            "月下门童喟叹，昨夜太平长安",
            "当天上星河转，我命已定盘",
            "待绝笔墨痕干，宿敌已来犯",
            "我借你的孤单，今生恐怕难还",
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        FruitAdapter adapt=new FruitAdapter(
                MainActivity.this,
                R.layout.mybtf,
                biaoTi
        );
        ListView spsp=findViewById(R.id.spsp);
        spsp.setAdapter(adapt);
        spsp.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("x",nr[position]);
                startActivity(intent);
            }
        });
    }
    private void init(){
        Fruit f1=new Fruit("红雨瓢泼泛起了回忆怎么潜",R.mipmap.ab1);
        f1.setNeiRong("愿意用一支黑色铅笔");
        Fruit f2=new Fruit("你美目如当年流转我心间",R.mipmap.ab2);
        f1.setNeiRong("画一出沉默台剧");
        Fruit f3=new Fruit("渡口边最后一面洒下了句点",R.mipmap.ab3);
        f1.setNeiRong("灯光再亮");
        Fruit f4=new Fruit("与你若只如初见何须感伤离别",R.mipmap.ab4);
        f1.setNeiRong("也抱住你");
        biaoTi.add(f1);
        biaoTi.add(f2);
        biaoTi.add(f3);
        biaoTi.add(f4);
    }
}
//public void onItemClick(AdapterView<?> parent, View view, int position, long id)
//
//parent:表示指向是哪一个适配器； 传过来的时候，它就己经是个己知数了。
//
//view: 喂优，  此处是指你的“条目”（新闻一，或新闻二）
//
//position:  能够看到第几条；
//
//id: 新闻总共有1000条，  每次给你看到的只是7条。
//
//
//视图（看得见的），ListView  --->  Item  --->   TextView
//因此你就要搞清楚，当前你在哪个视图（你的站立点）
