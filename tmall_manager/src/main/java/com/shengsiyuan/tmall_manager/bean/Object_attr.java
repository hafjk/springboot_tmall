package com.shengsiyuan.tmall_manager.bean;

import java.util.List;

public class Object_attr extends Tmall_attr {
    private List<Tmall_value> list_value;

    @Override
    public String toString() {
        return "Object_attr{" +
                "list_value=" + list_value +
                '}';
    }

    public List<Tmall_value> getList_value() {
        return list_value;
    }

    public void setList_value(List<Tmall_value> list_value) {
        this.list_value = list_value;
    }
}
