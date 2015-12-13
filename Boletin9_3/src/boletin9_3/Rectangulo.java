package boletin9_3;
//Yasmin

import javax.swing.JOptionPane;

public class Rectangulo {
    int base;
    int altura;
    public void baseAltura(){
      base=Integer.parseInt(JOptionPane.showInputDialog("Introduce base "));
      altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce altura "));
       if(base>0 && altura>0){
       JOptionPane.showMessageDialog(null,"El área es: "+(base*altura));
       }
       else{
       JOptionPane.showMessageDialog(null,"Inserte dos números positivos");        
    }   
    }
    
   
}
