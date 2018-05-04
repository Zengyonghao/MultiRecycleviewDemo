package com.example.administrator.multirecycleviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.administrator.multirecycleviewdemo.adapter.BannerAdapter;
import com.example.administrator.multirecycleviewdemo.adapter.ListAdapter;
import com.example.administrator.multirecycleviewdemo.adapter.MainAdapter;
import com.example.administrator.multirecycleviewdemo.adapter.MoreAdapter;
import com.example.administrator.multirecycleviewdemo.bean.BannerBean;
import com.example.administrator.multirecycleviewdemo.bean.MainBean;
import com.example.administrator.multirecycleviewdemo.bean.MoreBean;
import com.example.administrator.multirecycleviewdemo.bean.TestBean;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv;
    private BannerBean bannerBean;
    private List<TestBean> testBeanList;
    private BannerAdapter bannerAdapter;
    private ListAdapter listAdapter;
    private MoreAdapter moreAdapter;
    private List<MainBean> datas;
    private MainAdapter mainAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.rv);
        initData();
        initRv();
    }

    private void initRv() {
        rv.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        mainAdapter = new MainAdapter(datas);
        rv.setAdapter(mainAdapter);

    }

    private void initData() {
        datas = new ArrayList<>();
        //创建假数据
        bannerBean = new BannerBean();
        datas.add(bannerBean);

        testBeanList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
          testBeanList.add(  new TestBean());

        }
        MoreBean moreBean = new MoreBean();
    datas.addAll(testBeanList);
    datas.add(moreBean);
    }

}
