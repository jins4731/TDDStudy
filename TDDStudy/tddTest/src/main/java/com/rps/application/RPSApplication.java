package com.rps.application;

public class RPSApplication {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    RPSGame user = new RPSGame(1);
    RPSGame com = new RPSGame();
    RPSResult rpsResult = new RPSResult();

    RPS userRps = user.executeRPS();
    RPS comRps = com.rendomExecuteRPS();
    Result result = rpsResult.getResult(userRps, comRps);

    System.out.println("사용자: " + userRps);
    System.out.println("컴퓨터: " + comRps);
    System.out.println("결과: " + result);
  }

}
