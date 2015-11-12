package boletin9_2;
//Yasmin

import javax.swing.JOptionPane;

public class Boletin9_2 {

    public static void main(String[] args) {
        int acs=0;
        double ac=1;
        for(int i=10;i>=10&&i<=90;i++){
        acs=acs+i;
        ac=ac*i;
       }
        JOptionPane.showMessageDialog(null,"Suma: "+acs+"\nProducto: "+ac);
    }
    
}

