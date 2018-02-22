package com.dzemiashkevich.nicehash.action;

import com.dzemiashkevich.nicehash.entity.ParserCustomRequest;
import com.dzemiashkevich.nicehash.entity.ParserRequest;

public final class URLFormatter {

  private static final String URL = "https://www.nicehash.com/profitability-calculator/";

  private URLFormatter() {
  }

  public static String getCustomURL(final ParserCustomRequest request) {
    return URL +
        "custom?e=" + request.getE() +
        "&currency=" + request.getCurrency() +
        "&power=" + request.getPower() +
        "&cost=" + request.getCost() +
        "&algo0=" + request.getAlgo0() +
        "&algo1=" + request.getAlgo1() +
        "&algo2=" + request.getAlgo2() +
        "&algo3=" + request.getAlgo3() +
        "&algo4=" + request.getAlgo4() +
        "&algo5=" + request.getAlgo5() +
        "&algo6=" + request.getAlgo6() +
        "&algo7=" + request.getAlgo7() +
        "&algo8=" + request.getAlgo8() +
        "&algo9=" + request.getAlgo9() +
        "&algo10=" + request.getAlgo10() +
        "&algo11=" + request.getAlgo11() +
        "&algo12=" + request.getAlgo12() +
        "&algo13=" + request.getAlgo13() +
        "&algo14=" + request.getAlgo14() +
        "&algo15=" + request.getAlgo15() +
        "&algo16=" + request.getAlgo16() +
        "&algo17=" + request.getAlgo17() +
        "&algo18=" + request.getAlgo18() +
        "&algo19=" + request.getAlgo19() +
        "&algo20=" + request.getAlgo20() +
        "&algo21=" + request.getAlgo21() +
        "&algo22=" + request.getAlgo22() +
        "&algo23=" + request.getAlgo23() +
        "&algo24=" + request.getAlgo24() +
        "&algo25=" + request.getAlgo25() +
        "&algo26=" + request.getAlgo26() +
        "&algo27=" + request.getAlgo27() +
        "&algo28=" + request.getAlgo28() +
        "&algo29=" + request.getAlgo29();
  }

  public static String getURL(final ParserRequest request) {
    return URL + request.getEquipment() + "?e=" + request.getE() + "&currency=" + request.getCurrency();
  }

}
