package com.example.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main_alarm_activity extends AppCompatActivity {
    List<Map<String,Object>> listItems;
    HashMap<String,Object> map;
    SimpleAdapter simpleAdapter;
    ButtonManager btnManager= new ButtonManager();
    //为列表增加内容
    private String[] time = new String[]{"11:00","10:00","11:58","11:34"};
    private String[] time_1=new String[]{"AM","PM","AM","PM"};

    private static final String TAG = "MainActivity";
    private ImageButton add_alarm_btn;
    private Button to_date_btn,to_timer_btn,to_setting_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_alarm);
        ListView a=(ListView)findViewById(R.id.list_test);
        listItems=new ArrayList<Map<String, Object>>();
        for(int i=0;i<time.length;i++)
        {
            map=new HashMap<String, Object>();
            map.put("time", time[i]);
            map.put("time_1", time_1[i]);
            //把列表项加进列表集合
            listItems.add(map);
        }
        simpleAdapter =new SimpleAdapter(this,listItems,R.layout.data_list_res,new String[]{"time","time_1"},new int[]{R.id.time, R.id.time_1});
        a.setAdapter(simpleAdapter);

        add_alarm_btn=(ImageButton) findViewById(R.id.add_alarm_btn);
        btnManager.switchToActivity_btn(add_alarm_btn,main_alarm_activity.this,create_alarm_date_activity.class);

        to_date_btn=(Button) findViewById(R.id.to_date_btn);
        btnManager.switchToActivity_btn(to_date_btn,main_alarm_activity.this,main_date_activity.class);

        to_timer_btn=(Button) findViewById(R.id.to_timer_btn);
        btnManager.switchToActivity_btn(to_timer_btn,main_alarm_activity.this, main_timer_activity.class);

        to_setting_btn=(Button) findViewById(R.id.to_setting_btn);
        btnManager.switchToActivity_btn(to_setting_btn,main_alarm_activity.this,main_setting_activity.class);



    }
//我们需要的实例的类：闹钟类，日程事件类，


}