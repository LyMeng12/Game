package org.example;

public class User {
    private String name;
    private double money;

    public User(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public void setDabMoney(double Money) {
        money -= Money;
    }
    public void setAddMoney(double Money) {
        money += Money;
    }
    public double getMoney() {
        return money;
    }
    public String getName() {
        return name;
    }
}
