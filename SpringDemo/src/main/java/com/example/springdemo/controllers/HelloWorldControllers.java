package com.example.springdemo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController // OverRida klassen RestController
public class HelloWorldControllers {

    @RequestMapping("/") //Vilken URL den ska svara på
    public String helloWorld(){
        return "Hello World!";
    }

    @RequestMapping("/esp")
    public String  helloEspanol(){
        return "Hola Mundo";
    }

    @RequestMapping("/swe")
    public String  hejSweden(){
        return "Hej Världen!";
    }

    @RequestMapping("/hello") //write localhost:8080/hello?fName=Name&lName=Name måste matcha
    public String  addFoo(@RequestParam String fName, @RequestParam String lName){
        return "Hejsan " + fName + " " + lName;
    }

  public int randomInt(){
      int min = 1;
      int max = 10;

      Random random = new Random();
      //return(int)(Math.random(10)*1

      int value = random.nextInt(max + min); //+ min;
      return value;
  }

    @RequestMapping("/random") //write localhost:8080/hello?fName=Name&lName=Name måste matcha
    public String random(@RequestParam(required = false) String luckyYou) {

        if(luckyYou.equalsIgnoreCase("animal")) {
            return animals();
        }
        else if (luckyYou.equalsIgnoreCase("number")){
            return String.valueOf(randomInt());
        }
        else{
            return "I don't understand";
        }
    }



    public String animals(){
        String[] luckyAnimals = new String[] {"Border-Collie", "Mus", "Råtta", "Ko" , "Häst" , "Katt" , "Hund"};
        return luckyAnimals[randomInt()];

    }

}
