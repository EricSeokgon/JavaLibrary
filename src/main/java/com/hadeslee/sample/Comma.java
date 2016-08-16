package com.hadeslee.sample;

import java.text.DecimalFormat;

/**
 * Project: JavaLibrary
 * FileName: Comma
 * Date: 2016-08-16
 * Time: 오후 2:16
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Comma {
    private String comma;
    final private int money = 184551000;

    public String Comma() {
        DecimalFormat decimalFormat = new DecimalFormat("###,###,###");
        return comma = decimalFormat.format(money);
    }
    public int NonComma() {
        return money;
    }

}
