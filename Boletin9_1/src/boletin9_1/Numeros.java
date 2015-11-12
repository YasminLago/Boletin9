package boletin9_1;
//Yasmin

import javax.swing.JOptionPane;

public class Numeros {
   int numero;
    int p=0;
    int n=0;
    int c=0;
    
public void clasificacionNum(){
    for(int i=0;i<10;i++){
    numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
    if(numero>0)
        p++;
    
    else if(numero<0)
        n++;
    
    else
        c++;
    }
}
public void numeros(){
    JOptionPane.showMessageDialog(null,"Positivos: "+(p++)+"\n Negativos: "+(n++)+"\n Ceros: "+(c++));
    
    
}

}