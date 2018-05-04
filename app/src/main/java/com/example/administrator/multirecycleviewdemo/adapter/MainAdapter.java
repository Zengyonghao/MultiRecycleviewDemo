package com.example.administrator.multirecycleviewdemo.adapter;

import android.support.annotation.Nullable;

import com.chaychan.adapter.MultipleItemRvAdapter;
import com.example.administrator.multirecycleviewdemo.bean.BannerBean;
import com.example.administrator.multirecycleviewdemo.bean.MainBean;
import com.example.administrator.multirecycleviewdemo.bean.MoreBean;
import com.example.administrator.multirecycleviewdemo.bean.TestBean;

import java.util.List;

/**
 * Created by yong hao zeng on 2018/5/4.
 */

public class MainAdapter extends MultipleItemRvAdapter<MainBean> {

    private BannerAdapter provider;
    private ListAdapter provider1;
    private MoreAdapter provider2;

    public MainAdapter(@Nullable List<MainBean> data) {
        super(data);
        finishInitialize();
    }


    @Override
    protected int getViewType(MainBean mainBean) {
        int type = 0;
        if (mainBean instanceof BannerBean) {

        }else if (mainBean instanceof TestBean){
            type = 1;

        }else if (mainBean instanceof MoreBean){
            type = 2;
        }
        return type;
    }

    @Override
    public void registerItemProvider() {
        provider = new BannerAdapter();
        mProviderDelegate.registerProvider(provider);
        provider1 = new ListAdapter();
        mProviderDelegate.registerProvider(provider1);
        provider2 = new MoreAdapter();
        mProviderDelegate.registerProvider(provider2);
    }


}
