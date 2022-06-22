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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//Client Objects
		Client C1 = new Client();
		//reserving a table
		System.out.println("What do you want to reserve? do you want to recieve a table?");
		String i = in.nextLine();
		C1.setTabelno("A1");
		System.out.println("your table is " + C1.getTabelno());
		C1.Reserve();
		//1- make an order by preparing then served
		C1.Order();
		String x = in.nextLine();
		C1.setOrder(x);
		//order date
		String y = in.nextLine();
		C1.setDate(y);
		//order time
		String z = in.nextLine();
		C1.setTime(z);
		C1.setOrderno("A2");
		System.out.println("your order Number is "+C1.getOrderno()+" and it is " + C1.getOrder() +" on "+ C1.getDate() + " at " + C1.getTime());
		C1.setTabelno("A1");
		C1.Order(x);
		//cancel an order ();
		C1.Cancel();}
	
	}

    

