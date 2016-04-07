package com.example.archer.myvolley;
/**
 *
 * Volley 是android平台的网络通信库，更快，更简单更健壮
 *
 * volley 功能:
 * 1.json,图片（异步）
 * 2.网络的请求排序
 * 3.网络请求的优先处理
 * 4.缓存
 * 5.多级别的取消请求
 * 6.与Activity的生命周期联动
 */
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
