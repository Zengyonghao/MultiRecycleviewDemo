package com.example.administrator.multirecycleviewdemo.adapter;

import com.chad.library.adapter.base.BaseViewHolder;
import com.chaychan.adapter.BaseItemProvider;
import com.chaychan.adapter.ItemProviderTag;
import com.example.administrator.multirecycleviewdemo.R;
import com.example.administrator.multirecycleviewdemo.bean.TestBean;

/**
 * Created by yong hao zeng on 2018/5/4.
 */
@ItemProviderTag(
        viewType = 1,
        layout = R.layout.item_list
)
public class ListAdapter extends BaseItemProvider<TestBean> {
    @Override
    public void convert(BaseViewHolder baseViewHolder, TestBean testBean, int i) {
            baseViewHolder.setText(R.id.tv,"条目"+i);
    }

    @Override
    public void onClick(BaseViewHolder baseViewHolder, TestBean testBean, int i) {

    }

    @Override
    public boolean onLongClick(BaseViewHolder baseViewHolder, TestBean testBean, int i) {
        return false;
    }
}
