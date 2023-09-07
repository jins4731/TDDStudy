package com.rps.application;

public class RPSConvertor {

  public RPS getRPS(int num) {
    RPS rps = null;
    if (num == 0) {
      rps = RPS.ROCK;
    } else if (num == 1) {
      rps = RPS.PAPER;
    } else if (num == 2) {
      rps = RPS.SCISSORS;
    }

    return rps;
  }
}
