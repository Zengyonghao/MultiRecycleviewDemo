package com.example.administrator.multirecycleviewdemo.adapter;

import com.chad.library.adapter.base.BaseViewHolder;
import com.chaychan.adapter.BaseItemProvider;
import com.chaychan.adapter.ItemProviderTag;
import com.example.administrator.multirecycleviewdemo.R;
import com.example.administrator.multirecycleviewdemo.bean.MoreBean;

/**
 * Created by yong hao zeng on 2018/5/4.
 */
@ItemProviderTag(
        viewType = 2,
        layout = R.layout.item_more
)
public class MoreAdapter extends BaseItemProvider<MoreBean> {
    @Override
    public void convert(BaseViewHolder baseViewHolder, MoreBean moreBean, int i) {

    }

    @Override
    public void onClick(BaseViewHolder baseViewHolder, MoreBean moreBean, int i) {

    }

    @Override
    public boolean onLongClick(BaseViewHolder baseViewHolder, MoreBean moreBean, int i) {
        return false;
    }
}
