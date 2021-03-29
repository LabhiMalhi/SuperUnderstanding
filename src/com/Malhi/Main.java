package com.Malhi;

import java.util.Scanner;

public class Main extends Person{



    String name;

    public Main( String name){
           this.name=name;
    }



    public void Deatails(){
        System.out.println("Local Name => "+this.name);
        System.out.println("Super Name => "+ super.name);
    }
}
