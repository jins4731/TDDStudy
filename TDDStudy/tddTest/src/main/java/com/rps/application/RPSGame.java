package com.rps.application;

public class RPSGame {
  int num = 0;

  public RPSGame() {
    // TODO Auto-generated constructor stub
  }

  public RPSGame(int num) {
    this.num = num;
  }

  public RPS executeRPS() {
    RPSConvertor convertor = new RPSConvertor();
    return convertor.getRPS(num);
  }

  public RPS rendomExecuteRPS() {
    RPSConvertor convertor = new RPSConvertor();
    int random = (int) (Math.random() * 3) + 1;
    return convertor.getRPS(random);
  }
}
