package com.dzemiashkevich.nicehash.service;

import com.dzemiashkevich.nicehash.action.CalculateParser;
import com.dzemiashkevich.nicehash.action.URLFormatter;
import com.dzemiashkevich.nicehash.entity.ParserCustomRequest;
import com.dzemiashkevich.nicehash.entity.ParserRequest;
import com.dzemiashkevich.nicehash.entity.ParserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

  @Autowired
  private CalculateParser parser;

  public ParserResponse calculate(ParserCustomRequest request) {
    final String url = URLFormatter.getCustomURL(request);
    return parser.parse(url);
  }

  public ParserResponse calculate(ParserRequest request) {
    final String url = URLFormatter.getURL(request);
    return parser.parse(url);
  }

}
