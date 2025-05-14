package com.pixelacademy.springdemo_app.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    @GetMapping("/seva")
    public String sevaV() {
        return "Sevastian Vascan!";
    }

    @GetMapping("/dudu")
    public String sanduG() {
        return "Sandu Guzun!";
    }

    @GetMapping("/tanea")
    public String taneaC() {
        return "Tatiana Ceban!";
    }

    @GetMapping("/vera")
    public String veraB() {
        return "Vera Bradu!";
    }


    @GetMapping("/meniu")
    public String meniu() {
       paste();
       sarmale();
       supa();

       String a = "\nPaste" + " papusoi";
       String b = "Nu";


        return "Meniu data 14 mai 2025! <br> <br>" + supa() +
                " <br> " + sarmale() +
                " <br> " + paste() ;
    }

    @Override
    public String toString() {
        return "Geeks object => {" +

                "felul 1 ='" + paste() + '\'' +
                ",felul 2 ='" + supa() + '\''+
                ",felul 3 ='" + sarmale() + '\''+
                '}'
                ;
    }

    public static void pizza() {
        System.out.println("Pizza");
    }

    static void sushi() {
        System.out.println("Sushi");
    }

    static void kebab() {
        System.out.println("Kebab");
    }



    @GetMapping("/paste")
   public static String paste() {
        return "Paste bolognese!";
    }
    @GetMapping("/sarm")
   public static String sarmale() {
        return "Sarmale moldovenesti!";
    }

    @GetMapping("/supa")
   public static String supa() {
        return "Supa de SECRET!";
    }


}
