package com.dzemiashkevich.nicehash.controller;

import com.dzemiashkevich.nicehash.entity.ParserCustomRequest;
import com.dzemiashkevich.nicehash.entity.ParserRequest;
import com.dzemiashkevich.nicehash.entity.ParserResponse;
import com.dzemiashkevich.nicehash.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

  @Autowired
  private CalculatorService calculatorService;

  @GetMapping("calculate/custom")
  public ResponseEntity<ParserResponse> calculate(final @RequestParam Double e,
                                                  final @RequestParam String currency,
                                                  final @RequestParam Double power,
                                                  final @RequestParam Double cost,
                                                  final @RequestParam Double algo0,
                                                  final @RequestParam Double algo1,
                                                  final @RequestParam Double algo2,
                                                  final @RequestParam Double algo3,
                                                  final @RequestParam Double algo4,
                                                  final @RequestParam Double algo5,
                                                  final @RequestParam Double algo6,
                                                  final @RequestParam Double algo7,
                                                  final @RequestParam Double algo8,
                                                  final @RequestParam Double algo9,
                                                  final @RequestParam Double algo10,
                                                  final @RequestParam Double algo11,
                                                  final @RequestParam Double algo12,
                                                  final @RequestParam Double algo13,
                                                  final @RequestParam Double algo14,
                                                  final @RequestParam Double algo15,
                                                  final @RequestParam Double algo16,
                                                  final @RequestParam Double algo17,
                                                  final @RequestParam Double algo18,
                                                  final @RequestParam Double algo19,
                                                  final @RequestParam Double algo20,
                                                  final @RequestParam Double algo21,
                                                  final @RequestParam Double algo22,
                                                  final @RequestParam Double algo23,
                                                  final @RequestParam Double algo24,
                                                  final @RequestParam Double algo25,
                                                  final @RequestParam Double algo26,
                                                  final @RequestParam Double algo27,
                                                  final @RequestParam Double algo28,
                                                  final @RequestParam Double algo29) {
    ParserCustomRequest request = new ParserCustomRequest();
    request.setE(e);
    request.setCurrency(currency);
    request.setCost(cost);
    request.setPower(power);
    request.setAlgo0(algo0);
    request.setAlgo1(algo1);
    request.setAlgo2(algo2);
    request.setAlgo3(algo3);
    request.setAlgo4(algo4);
    request.setAlgo5(algo5);
    request.setAlgo6(algo6);
    request.setAlgo7(algo7);
    request.setAlgo8(algo8);
    request.setAlgo9(algo9);
    request.setAlgo10(algo10);
    request.setAlgo11(algo11);
    request.setAlgo12(algo12);
    request.setAlgo13(algo13);
    request.setAlgo14(algo14);
    request.setAlgo15(algo15);
    request.setAlgo16(algo16);
    request.setAlgo17(algo17);
    request.setAlgo18(algo18);
    request.setAlgo19(algo19);
    request.setAlgo20(algo20);
    request.setAlgo21(algo21);
    request.setAlgo22(algo22);
    request.setAlgo23(algo23);
    request.setAlgo24(algo24);
    request.setAlgo25(algo25);
    request.setAlgo26(algo26);
    request.setAlgo27(algo27);
    request.setAlgo28(algo28);
    request.setAlgo29(algo29);

    ParserResponse response = calculatorService.calculate(request);

    return new ResponseEntity<ParserResponse>(response, HttpStatus.OK);
  }

  @GetMapping("calculate/{equipment}")
  public ResponseEntity<ParserResponse> calculate(final @PathVariable(name = "equipment") String equipment,
                                                  final @RequestParam Double e,
                                                  final @RequestParam String currency) {
    ParserRequest request = new ParserRequest();
    request.setEquipment(equipment);
    request.setE(e);
    request.setCurrency(currency);

    ParserResponse response = calculatorService.calculate(request);

    return new ResponseEntity<ParserResponse>(response, HttpStatus.OK);
  }

}
