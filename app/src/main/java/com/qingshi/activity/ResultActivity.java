package com.qingshi.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

public class ResultActivity extends AppCompatActivity {

    ListView resultList;
    String searchContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        //初始化控件并且设置监听
        initWidget();
        //初始化数据
        initData();
    }

    public void initWidget(){
        resultList = (ListView)findViewById(R.id.result_list);
    }

    public void initData(){
        searchContent = getIntent().getStringExtra("searchContent");
        Toast.makeText(this, "searchContent="+searchContent, Toast.LENGTH_SHORT).show();
    }

}
