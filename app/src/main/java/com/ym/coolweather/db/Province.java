package com.ym.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018-06-03.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName; //名字
    private int provinceCode;    //代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
