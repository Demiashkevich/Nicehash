package com.dzemiashkevich.nicehash.action;

import com.dzemiashkevich.nicehash.entity.ParserResponse;
import com.dzemiashkevich.nicehash.entity.income.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class CalculateParser {

  private DayIncome dayIncome;
  private WeekIncome weekIncome;
  private MonthIncome monthIncome;

  @PostConstruct
  private void init() {
    dayIncome = new DayIncome();
    weekIncome = new WeekIncome();
    monthIncome = new MonthIncome();
  }

  public ParserResponse parse(final String url) {
    final Document document = JsoupConnecter.getDocumentByUrl(url);
    final Elements tableLight = document.getElementsByClass("light");

    final Elements rows = tableLight.select("tbody tr");
    final Element eEntranceRow = rows.get(1);
    final DateIncome entranceDateIncome = this.parseRow(eEntranceRow);

    final Element eExpensesRow = rows.get(2);
    final DateIncome expensesDateIncome = this.parseRow(eExpensesRow);

    final Element eProfit = rows.get(3);
    final DateIncome profitDateIncome = this.parseRow(eProfit);

    dayIncome.setEntrance(entranceDateIncome.getDay());
    dayIncome.setExpenses(expensesDateIncome.getDay());
    dayIncome.setProfit(profitDateIncome.getDay());

    weekIncome.setEntrance(entranceDateIncome.getWeek());
    weekIncome.setExpenses(expensesDateIncome.getWeek());
    weekIncome.setProfit(profitDateIncome.getWeek());

    monthIncome.setEntrance(entranceDateIncome.getMonth());
    monthIncome.setExpenses(expensesDateIncome.getMonth());
    monthIncome.setProfit(profitDateIncome.getMonth());

    return new ParserResponse(
        dayIncome, weekIncome, monthIncome
    );
  }



  private DateIncome parseRow(final Element eRow) {
    final Element eDay =  eRow.getElementsByTag("td").get(1);
    final Currency currencyDay = parseCell(eDay);
    final Element eWeek = eRow.getElementsByTag("td").get(2);
    final Currency currencyWeek = parseCell(eWeek);
    final Element eMonth = eRow.getElementsByTag("td").get(3);
    final Currency currencyMonth = parseCell(eMonth);

    return new DateIncome(currencyDay, currencyWeek, currencyMonth);
  }

  private Currency parseCell(final Element eCell) {
    final String[] currency = eCell.text().split("BTC|USD");
    if (currency.length == 2) {
      final String btc = currency[0];
      final String usd = currency[1];

      return new Currency(usd, btc);
    }
    return null;
  }

}
