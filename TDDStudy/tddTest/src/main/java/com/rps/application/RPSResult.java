package com.rps.application;

public class RPSResult {

  public Result getResult(RPS user, RPS com) {

    Result result = null;

    if (user == com) {
      result = Result.DRAW;
    }

    if (user == RPS.ROCK) {
      if (com == RPS.PAPER) {
        result = Result.LOSE;
      } else if (com == RPS.SCISSORS) {
        result = Result.WIN;
      }
    } else if (user == RPS.PAPER) {
      if (com == RPS.ROCK) {
        result = Result.WIN;
      } else if (com == RPS.SCISSORS) {
        result = Result.LOSE;
      }
    } else if (user == RPS.SCISSORS) {
      if (com == RPS.ROCK) {
        result = Result.LOSE;
      } else if (com == RPS.PAPER) {
        result = Result.WIN;
      }
    }

    return result;
  }
}
