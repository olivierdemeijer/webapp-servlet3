package com.clouway;

/**
 * @author Miroslav Genov (miroslav.genov@clouway.com)
 */
public class App {

  public static void main(String[] args) {
    Jetty jetty = new Jetty(8080);
    jetty.start();
  }
}
