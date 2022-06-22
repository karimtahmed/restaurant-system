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
class Table extends Restaurant {

    private String Tabelno;
    private String Orderno;

    //empty constructor ;
    public Table() {
        super();
        this.Tabelno = "";
        this.Orderno = "";
    }

//table constructor
    public Table(String Tabelno, String Orderno) {

        this.Tabelno = Tabelno;
        this.Orderno = Orderno;
    }

//table +  restaurant 
    public Table(String Tabelno, String Orderno, String menue, String location, String name) {
        super(menue, location, name);
        this.Tabelno = Tabelno;
        this.Orderno = Orderno;
    }

    //setters and getters 
    public String getTabelno() {
        return Tabelno;
    }

    public void setTabelno(String Tabelno) {
        this.Tabelno = Tabelno;
    }

    public String getOrderno() {
        return Orderno;
    }

    public void setOrderno(String Orderno) {
        this.Orderno = Orderno;
    }

    public void Reserve() {

        System.out.println("The table  " + getTabelno() + " is succesfully reserved ");

    }

    @Override
    public String Order() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
