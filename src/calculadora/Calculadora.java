/*Construir un programa que simule el funcionamiento de una 
calculadora que puede realizar las  cuatro operaciones aritméticas 
básicas (suma, resta, producto y división) con valores numéricos enteros. El usuario debe especificar la operación con el primer carácter del primer parámetro de la línea de comandos: S o s para la suma, R o r para la resta, P, p,
M o m para el producto y D o d para la división.
*/
package calculadora;

import javax.swing.JOptionPane;


public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1, numero2, suma, resta, mult, div;
        char operacion;
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LE NUMERO"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog(" DIGITE EL SEGUNDO NUMERO"));
      
        operacion = JOptionPane.showInputDialog("DIGITE LA OPERACION QUE DESEA REALIZAR").charAt(0);
        switch(operacion){
            case 's':
            case 'S': suma = numero1+ numero2;
                      JOptionPane.showMessageDialog(null, " la suma es: "+suma);
                       break;
            case 'r':
            case 'R': resta= numero1 - numero2;
                       JOptionPane.showMessageDialog(null,"La resta es: " +resta);
                       break;
            case 'p':
            case 'P': 
            case 'm':
            case 'M': mult = numero1 * numero2;
                     JOptionPane.showMessageDialog(null,"La multiplicacion es: " +mult);
                     break;
            case 'd':
            case 'D': div = numero1/numero2;
                     JOptionPane.showMessageDialog(null, "La division es:  "+div);
                      break;
                      
            default: JOptionPane.showMessageDialog(null,"Se equivoco de operacion");
                     
    
        }
    }
    
}




/* PUNTO 12: Pedir una nota de 0 a 10 
y que mostrarla de la forma insuficiente, suficiente, bien, notable 
y sobresaliente
*/