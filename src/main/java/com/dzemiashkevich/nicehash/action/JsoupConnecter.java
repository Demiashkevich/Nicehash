package com.dzemiashkevich.nicehash.action;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.SocketTimeoutException;

public final class JsoupConnecter {

  private static double timeout = 1_000;

  private JsoupConnecter() {
  }

  public static Document getDocumentByUrl(final String url) {
    Connection connect = Jsoup.connect(url);
    Document document;
      for(;;) {
        document = getConnect(connect);
        if (document != null) {
          break;
        }
      }
    timeout = 1_000;
    return document;
  }

  private static Document getConnect(final Connection connect) {
    Document document = null;
    try {
      document = connect.timeout((int)timeout)
          .userAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/33.0.1750.152 Safari/537.36")
          .get();
    } catch (SocketTimeoutException e) {
      timeout = Math.exp(timeout / 1_000) * 1_000;
      System.out.println(timeout);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return document;
  }

}
