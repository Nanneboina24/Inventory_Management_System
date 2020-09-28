/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billing;

/**
 *
 * @author gajic
 */
public class Sales1 {
    private String bno;
   
    private int qty;
    private String pname;
    private int mrp;
    private int price;
    
    public Sales1(String bno,int qty,String pname,int mrp, int price)
    {
        this.bno=bno;
        
        this.qty=qty;
        this.pname=pname;
        this.mrp=mrp;
        this.price=price;
        
        
    }
            
    public String getbno()
    {
        return bno;
    }
    public String getpname()
    {
        return pname;
    }
    public int getmrp()
    {
        return mrp;
    }
    public int getprice()
    {
        return price;
    }
    public int getqty()
    {
        return qty;
    }
    
}
