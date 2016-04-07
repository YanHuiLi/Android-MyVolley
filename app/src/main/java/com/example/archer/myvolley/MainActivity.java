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
 *
 * 获取volley
 */
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getJSONVolley();
    }


    //获取json字符串
    public void getJSONVolley(){
        RequestQueue requestQueue= Volley.newRequestQueue(this);

        String JSONDataUrl="http://v.juhe.cn/weather/index?format=2&cityname=%E5%BC%A5%E5%8B%92&key=407";
        JsonObjectRequest jsonObjectRequest=new JsonObjectRequest(Request.Method.GET, JSONDataUrl, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        System.out.println("response" + response);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println("对不起有问题");
            }
        }
        );
                requestQueue.add(jsonObjectRequest);

    }

}
