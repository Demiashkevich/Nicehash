package com.dzemiashkevich.nicehash.entity.income;

public class Income {

  private Currency entrance;
  private Currency expenses;
  private Currency profit;

  public Currency getEntrance() {
    return entrance;
  }

  public void setEntrance(Currency entrance) {
    this.entrance = entrance;
  }

  public Currency getExpenses() {
    return expenses;
  }

  public void setExpenses(Currency expenses) {
    this.expenses = expenses;
  }

  public Currency getProfit() {
    return profit;
  }

  public void setProfit(Currency profit) {
    this.profit = profit;
  }

}
