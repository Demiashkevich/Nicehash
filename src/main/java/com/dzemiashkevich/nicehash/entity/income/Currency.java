package com.dzemiashkevich.nicehash.entity.income;

public class Currency {

  private String usd;
  private String btc;

  public Currency(String usd, String btc) {
    this.usd = usd;
    this.btc = btc;
  }

  public String getUsd() {
    return usd;
  }

  public void setUsd(String usd) {
    this.usd = usd;
  }

  public String getBtc() {
    return btc;
  }

  public void setBtc(String btc) {
    this.btc = btc;
  }

}
