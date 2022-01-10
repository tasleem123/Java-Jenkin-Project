package org.example.Git_Java_Jenkin;

public class App {
  public static void main(String[] args) {
//    System.out.println("Hello World!");
	  System.out.println(checkIfInputIsAnEvenNumber(120));
  }
  
  public static boolean checkIfInputIsAnEvenNumber(int num) {
		
		return num%2 == 0;
	}
}
