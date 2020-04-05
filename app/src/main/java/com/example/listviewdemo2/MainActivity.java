package com.example.listviewdemo2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Map<String, Object>> fruits = new ArrayList();

        //构造数据
        Map<String, Object> map = new HashMap<>();
        map.put("pic", R.drawable.pineapple);
        map.put("name", "pineapple");
        fruits.add(map);

        Map<String, Object> map1 = new HashMap<>();
        map1.put("pic", R.drawable.grape);
        map1.put("name", "grape");
        fruits.add(map1);

        Map<String, Object> map2 = new HashMap<>();
        map2.put("pic", R.drawable.cherry);
        map2.put("name", "cherry");
        fruits.add(map2);

        Map<String, Object> map3 = new HashMap<>();
        map3.put("pic", R.drawable.strawberry);
        map3.put("name", "strawberry");
        fruits.add(map3);

        /**
         * 敲黑板，划重点
         * 创建适配器
         * 参数1:Context：上下文对象
         * 参数2:data要关联的数据源
         * 参数3:resources：子项布局
         * 参数4:from：数据源的关键字名称的数组
         * 参数5:to：显示数据源各子项值的控件id
         */
        SimpleAdapter simpleAdapter = new SimpleAdapter(MainActivity.this,
                fruits,
                R.layout.item_layout,
                new String[]{"pic", "name"},
                new int[]{R.id.image, R.id.name});
        //获取ListView
        ListView lv = findViewById(R.id.lv);
        //将数据和布局关联，就是将数据显示到列表中
        lv.setAdapter(simpleAdapter);
    }
}
