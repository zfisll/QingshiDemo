package com.qingshi.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SearchActivity extends AppCompatActivity implements View.OnClickListener {

    EditText inputText;
    Button searchBtn;
    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        //初始化控件并且设置监听
        initWidget();
    }

    public void initWidget(){
        mContext = this;
        inputText = (EditText)findViewById(R.id.input_text);
        searchBtn = (Button)findViewById(R.id.search_btn);
        searchBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.search_btn:
                String searchContent = inputText.getText().toString();
                if(searchContent==null || "".equals(searchContent)){
                    Toast.makeText(mContext, "请输入搜索内容", Toast.LENGTH_SHORT).show();
                    //输入框获取焦点
                    inputText.setFocusable(true);
                    inputText.setFocusableInTouchMode(true);
                    inputText.requestFocus();
                }else{
                    Intent intent = new Intent(this, ResultActivity.class);
                    intent.putExtra("searchContent", searchContent);
                    startActivity(intent);
                }
                break;
            default:
                break;
        }
    }
}
