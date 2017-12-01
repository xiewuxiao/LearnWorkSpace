package com.ben.hello.po;

import java.io.Serializable;

/**
 * Created by hasee on 2017/10/21.
 */
public class LotteryResult implements Serializable{
    private int periods;
    private String open_Date;
    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private int num5;
    private int num6;
    private String animal1;
    private String animal2;
    private String animal3;
    private String animal4;
    private String animal5;
    private String animal6;
    private int code;
    private String code_animal;
    private String code_s_or_d;
    private String code_b_or_l;
    private String sum_s_or_d;
    private String sum_b_or_l;


    public int getPeriods() {
        return periods;
    }

    public void setPeriods(int periods) {
        this.periods = periods;
    }

    public String getOpen_Date() {
        return open_Date;
    }

    public void setOpen_Date(String open_Date) {
        this.open_Date = open_Date;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public int getNum4() {
        return num4;
    }

    public void setNum4(int num4) {
        this.num4 = num4;
    }

    public int getNum5() {
        return num5;
    }

    public void setNum5(int num5) {
        this.num5 = num5;
    }

    public int getNum6() {
        return num6;
    }

    public void setNum6(int num6) {
        this.num6 = num6;
    }

    public String getAnimal1() {
        return animal1;
    }

    public void setAnimal1(String animal1) {
        this.animal1 = animal1;
    }

    public String getAnimal2() {
        return animal2;
    }

    public void setAnimal2(String animal2) {
        this.animal2 = animal2;
    }

    public String getAnimal3() {
        return animal3;
    }

    public void setAnimal3(String animal3) {
        this.animal3 = animal3;
    }

    public String getAnimal4() {
        return animal4;
    }

    public void setAnimal4(String animal4) {
        this.animal4 = animal4;
    }

    public String getAnimal5() {
        return animal5;
    }

    public void setAnimal5(String animal5) {
        this.animal5 = animal5;
    }

    public String getAnimal6() {
        return animal6;
    }

    public void setAnimal6(String animal6) {
        this.animal6 = animal6;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getCode_animal() {
        return code_animal;
    }

    public void setCode_animal(String code_animal) {
        this.code_animal = code_animal;
    }

    public String getCode_s_or_d() {
        return code_s_or_d;
    }

    public void setCode_s_or_d(String code_s_or_d) {
        this.code_s_or_d = code_s_or_d;
    }

    public String getCode_b_or_l() {
        return code_b_or_l;
    }

    public void setCode_b_or_l(String code_b_or_l) {
        this.code_b_or_l = code_b_or_l;
    }

    public String getSum_s_or_d() {
        return sum_s_or_d;
    }

    public void setSum_s_or_d(String sum_s_or_d) {
        this.sum_s_or_d = sum_s_or_d;
    }

    public String getSum_b_or_l() {
        return sum_b_or_l;
    }

    public void setSum_b_or_l(String sum_b_or_l) {
        this.sum_b_or_l = sum_b_or_l;
    }

    @Override
    public String toString() {
        return "LotteryResultDTO{" +
                "periods=" + periods +
                ", open_Date='" + open_Date + '\'' +
                ", num1=" + num1 +
                ", num2=" + num2 +
                ", num3=" + num3 +
                ", num4=" + num4 +
                ", num5=" + num5 +
                ", num6=" + num6 +
                ", animal1='" + animal1 + '\'' +
                ", animal2='" + animal2 + '\'' +
                ", animal3='" + animal3 + '\'' +
                ", animal4='" + animal4 + '\'' +
                ", animal5='" + animal5 + '\'' +
                ", animal6='" + animal6 + '\'' +
                ", code=" + code +
                ", code_animal='" + code_animal + '\'' +
                ", code_s_or_d='" + code_s_or_d + '\'' +
                ", code_b_or_l='" + code_b_or_l + '\'' +
                ", sum_s_or_d='" + sum_s_or_d + '\'' +
                ", sum_b_or_l='" + sum_b_or_l + '\'' +
                '}';
    }
}
