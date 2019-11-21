package com.shengsiyuan.tmall_manager.bean;

public class Tmall_attr {
    private Integer id;
    private  String shxm_mch;
    private Integer shfqy;
    private Integer flbh2;

    @Override
    public String toString() {
        return "Tmall_attr{" +
                "id=" + id +
                ", shxm_mch='" + shxm_mch + '\'' +
                ", shfqy=" + shfqy +
                ", flbh2=" + flbh2 +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShxm_mch() {
        return shxm_mch;
    }

    public void setShxm_mch(String shxm_mch) {
        this.shxm_mch = shxm_mch;
    }

    public Integer getShfqy() {
        return shfqy;
    }

    public void setShfqy(Integer shfqy) {
        this.shfqy = shfqy;
    }

    public Integer getFlbh2() {
        return flbh2;
    }

    public void setFlbh2(Integer flbh2) {
        this.flbh2 = flbh2;
    }
}
