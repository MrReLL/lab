/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import searchplayers.SearchingLikeGoogle;
import betonthat.Login;
import betonthat.Register1;
import sportstestr.SportsTestR;
/**
 *
 * @author tnjones5
 */
public class Main extends SearchingLikeGoogle {
    public static void main(String[] args) {
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
     
        
    }
  
 
}