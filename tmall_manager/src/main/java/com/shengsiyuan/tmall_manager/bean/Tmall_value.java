package com.shengsiyuan.tmall_manager.bean;

public class Tmall_value {

    private  Integer id;
    private String shxzh;
    private Integer shfqy;
    private Integer shxm_id;
    private String shxzh_mch;

    @Override
    public String toString() {
        return "Tmall_value{" +
                "id=" + id +
                ", shxzh='" + shxzh + '\'' +
                ", shfqy=" + shfqy +
                ", shxm_id=" + shxm_id +
                ", shxzh_mch='" + shxzh_mch + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShxzh() {
        return shxzh;
    }

    public void setShxzh(String shxzh) {
        this.shxzh = shxzh;
    }

    public Integer getShfqy() {
        return shfqy;
    }

    public void setShfqy(Integer shfqy) {
        this.shfqy = shfqy;
    }

    public Integer getShxm_id() {
        return shxm_id;
    }

    public void setShxm_id(Integer shxm_id) {
        this.shxm_id = shxm_id;
    }

    public String getShxzh_mch() {
        return shxzh_mch;
    }

    public void setShxzh_mch(String shxzh_mch) {
        this.shxzh_mch = shxzh_mch;
    }
}
