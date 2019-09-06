/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quick;

/**
 *
 * @author emergency
 */
public class Helloworld {
    public String Hello;

    public Helloworld(String Hello) {
        this.Hello = Hello;
    }

    public Helloworld() {
    }


    public void printHello() {
        System.out.println("Hello "+this.Hello+"!");
    }

    public void setHello(String Hello) {
        this.Hello = Hello;
    }
           
}
