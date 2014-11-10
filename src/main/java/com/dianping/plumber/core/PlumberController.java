package com.dianping.plumber.core;

import org.springframework.beans.factory.BeanNameAware;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-11-1
 * Time: PM10:46
 * To change this template use File | Settings | File Templates.
 */
public abstract class PlumberController implements BeanNameAware {

    protected String name;

    /**
     * entrance of request. Controller should prepare common params for its pipes ,
     * then execute its business logic to fill the modelForView.
     * View of this Controller will be the first time response send to client,
     * you can also set pipe to be required ,then it will be sent with this view.
     * @param paramsFromRequest
     * @param paramsForPagelets
     * @param modelForView
     * @return
     */
    public abstract ResultType execute(Map<String, Object> paramsFromRequest, Map<String, Object> paramsForPagelets, Map<String, Object> modelForView);

    public String getName() {
        return name;
    }

    @Override
    public void setBeanName(String name) {
        this.name = name;
    }

}
