package com.example.myapplication;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class music_select_activity extends Activity {
    public static ArrayList<Integer> music_list=new ArrayList<Integer>();
    public static ArrayList<String> music_name=new ArrayList<String>();
    public ListView music_listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
       setContentView(R.layout.setting_select_music);
       music_listview=(ListView) findViewById(R.id.music_list);
        music_adapter musicAdapter=new music_adapter(music_select_activity.this,music_name,music_listview);
       music_listview.setAdapter(musicAdapter);
    }
    void init()
    {
        music_list.add(R.raw.alarm_beep);
        music_list.add(R.raw.alarm_classic);
        music_list.add(R.raw.alarm_rooster);
        music_list.add(R.raw.bugle);
        music_list.add(R.raw.creamy);
        music_list.add(R.raw.fresh_air);
        music_list.add(R.raw.guitar_heaven);
        music_list.add(R.raw.hawaii);
        music_list.add(R.raw.huawei_alarm);
        music_list.add(R.raw.ios);
        music_list.add(R.raw.ripple);
        music_list.add(R.raw.sakura_drop);
        music_list.add(R.raw.timer_beep);
        music_name.add("哔哔");
        music_name.add("经典");
        music_name.add("公鸡");
        music_name.add("喇叭");
        music_name.add("奶油");
        music_name.add("新鲜空气");
        music_name.add("吉他天堂");
        music_name.add("夏威夷1");
        music_name.add("夏威夷2");
        music_name.add("ios同款");
        music_name.add("涟漪");
        music_name.add("樱花落");
        music_name.add("计时器");

    }

}