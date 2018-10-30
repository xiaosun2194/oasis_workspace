package com.company.dao.pojo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class User {
    private int id;
    private String name;
    private BigDecimal balance;
    private LocalDate birthday;

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public User(int id, String name, BigDecimal balance, LocalDate birthday) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", birthday=" + birthday +
                '}';
    }
}
