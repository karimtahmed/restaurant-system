/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author karem
 */
class Order extends Table {

    private String Order;

    private String Date;

    private String Time;

    public Order() {
        super();
    }

    // if we dont need all the variables in another class //order constructor 
    public Order(String Order, String Date, String Time) {
        this.Order = Order;
        this.Date = Date;
        this.Time = Time;
    }
// if we  need all the variables in the calss and the another class (extended from)

    public Order(String Order, String Date, String Time, String Tabelno, String Orderno) {
        super(Tabelno, Orderno);
        this.Order = Order;
        this.Date = Date;
        this.Time = Time;
    }
    public void Cancel() {
        System.out.println("The " + getOrderno() + " is canceled ");
    }
    public String getOrder() {

        return Order;

    }
    public void setOrder(String Order) {
        this.Order = Order;

    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }
}