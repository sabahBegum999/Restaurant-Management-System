/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myrestaurant;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Superclass {
    public double vegnoodles;
    public double chknnoodles;
    public double chknburger;
    public double chknpizza;
    public double frenchfries;
    
    public double thumsup;
    public double coca;
    public double pepsi;
    public double sevenup;
    public double sprite;
    
    public double Meals;
    public double Beverages;
    public double TotalMB;
    
    public double AlltotalMb;
    
    public double GetAmount(){
        
        Meals=vegnoodles+chknnoodles+chknburger+chknpizza+frenchfries;
        Beverages=thumsup+coca+pepsi+sevenup+sprite;
        TotalMB=Meals+Beverages;
        
        AlltotalMb=TotalMB;
        return AlltotalMb;
        
        
        
    }
            
    private JFrame frame;
    public void iExitSystem(){
        
        frame=new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Restaurant management system",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
            
        }
        
        
    }
    
    public double pvegnoodles=100;
    public double pchknnoodles=80;
    public double pchknburger=90;
    public double pchknpizza=300;
    public double pfrenchfries=150;
    
    public double pthumsup=50;
    public double pcoca=55;
    public double ppepsi=55;
    public double psevenup=60;
    public double psprite=65;
    
    
    public double mcTax=0.90;
    
    public Double cFindTax(double cAmount)
    {
        double FindTax= cAmount-(cAmount*mcTax);
        return FindTax;
    }
    
         
    
}
