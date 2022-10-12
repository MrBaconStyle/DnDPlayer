package com.company;

public class Player {
    private String name;
    private int str;
    private int dex;
    private int cons;
    private int intel;
    private int wisd;
    private int cha;
    private int hp;
    private int constMod;

    public String getName() {
        return name;
    }

    public int getStr() {
        return str;
    }

    public int getDex() {
        return dex;
    }

    public int getCons() {
        return cons;
    }

    public int getIntel() {
        return intel;
    }

    public int getWisd() {
        return wisd;
    }

    public int getCha() {
        return cha;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    public void setCons(int cons) {
        this.cons = cons;
    }

    public void setIntel(int intel) {
        this.intel = intel;
    }

    public void setWisd(int wisd) {
        this.wisd = wisd;
    }

    public void setCha(int cha) {
        this.cha = cha;
    }
}
