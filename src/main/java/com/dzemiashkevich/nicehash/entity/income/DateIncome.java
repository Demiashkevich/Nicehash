package com.dzemiashkevich.nicehash.entity.income;

public class DateIncome {

  private Currency day;
  private Currency week;
  private Currency month;

  public DateIncome(Currency day, Currency week, Currency month) {
    this.day = day;
    this.week = week;
    this.month = month;
  }

  public Currency getDay() {
    return day;
  }

  public void setDay(Currency day) {
    this.day = day;
  }

  public Currency getWeek() {
    return week;
  }

  public void setWeek(Currency week) {
    this.week = week;
  }

  public Currency getMonth() {
    return month;
  }

  public void setMonth(Currency month) {
    this.month = month;
  }

}
