package com.ghs.ghshome.bean;

import com.chad.library.adapter.base.entity.AbstractExpandableItem;
import com.chad.library.adapter.base.entity.MultiItemEntity;

/**
 * Author:wang_sir
 * Time:2019/7/30 16:33
 * Description:This is SeedRecordItem1
 */
public class CarFeeRecordItem1 extends AbstractExpandableItem<CarFeeRecordItem2> implements MultiItemEntity {
   private String  title ;

    public CarFeeRecordItem1(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title == null ? "" : title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public int getLevel() {
        return 3;
    }

    @Override
    public int getItemType() {
        return 3;
    }
}
