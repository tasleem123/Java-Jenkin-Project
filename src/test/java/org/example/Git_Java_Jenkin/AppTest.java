package org.example.Git_Java_Jenkin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//import org.example.Java_jenkins_docker.App;

public class AppTest {
    
//  @Test
//  public void shouldAnswerWithTrue() {
//    assertTrue(true);
//  }
  
  @Test
	public void testInputIsEven() {
		assertTrue(App.checkIfInputIsAnEvenNumber(22));
	}
}
