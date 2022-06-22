/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author karem
 */
class Client extends Order {

    Scanner in = new Scanner(System.in);

    public Client(){
    }

    public Client(String Order, String Date, String Time) {
        super(Order, Date, Time);
        
    }

    public Client(String Order, String Date, String Time, String Tabelno, String Orderno) {
        super(Order, Date, Time, Tabelno, Orderno);
    }

    
    @Override
    public String Order() {

    System.out.println("what is your order details :");

    return null;
    }
    
    //served order 
    
    public void Order(String order) {
        System.out.println("The order " + getOrderno() + " is served"+" With "+getTabelno());

    }
}
