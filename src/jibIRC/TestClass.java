/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jibIRC;



/**
 *
 * @author Owner
 */
public class TestClass {
    
    public static void main(String[] args){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JibIRC frame = new JibIRC();
                frame.setSize(800, 600);
                frame.setVisible(true);
            }
        });



    }

}
