package com.dzemiashkevich.nicehash.entity;

import com.dzemiashkevich.nicehash.entity.income.DayIncome;
import com.dzemiashkevich.nicehash.entity.income.MonthIncome;
import com.dzemiashkevich.nicehash.entity.income.WeekIncome;

public class ParserResponse {

  private DayIncome dayIncome;
  private WeekIncome weekIncome;
  private MonthIncome monthIncome;

  public ParserResponse(DayIncome dayIncome, WeekIncome weekIncome, MonthIncome monthIncome) {
    this.dayIncome = dayIncome;
    this.weekIncome = weekIncome;
    this.monthIncome = monthIncome;
  }

  public DayIncome getDayIncome() {
    return dayIncome;
  }

  public void setDayIncome(DayIncome dayIncome) {
    this.dayIncome = dayIncome;
  }

  public WeekIncome getWeekIncome() {
    return weekIncome;
  }

  public void setWeekIncome(WeekIncome weekIncome) {
    this.weekIncome = weekIncome;
  }

  public MonthIncome getMonthIncome() {
    return monthIncome;
  }

  public void setMonthIncome(MonthIncome monthIncome) {
    this.monthIncome = monthIncome;
  }

}
