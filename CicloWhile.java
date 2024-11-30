
package ciclofor.java;
import javax.swing.JOptionPane;
public class CicloWhile {
    public static void main(String args []){
       float Cu1, Cu2,Cu3, Cu4, Cu5, prom;
       int alumno=1;
       while (alumno<=34){
    Cu1=Float.parseFloat(JOptionPane.showInputDialog("Ingresa la calificacion de la Unidad 1"));
    Cu2=Float.parseFloat(JOptionPane.showInputDialog("Ingresa la calificacion de la Unidad 2"));
    Cu3=Float.parseFloat(JOptionPane.showInputDialog("Ingresa la calificacion de la Unidad 3"));
    Cu4=Float.parseFloat(JOptionPane.showInputDialog("Ingresa la calificacion de la Unidad 4"));
    Cu5=Float.parseFloat(JOptionPane.showInputDialog("Ingresa la calificacion de la Unidad 5"));
    prom=(Cu1+Cu2+Cu3+Cu4+Cu5)/5;
    System.out.println("Tu promedio es de"+ prom );
    alumno++;
}
    
}

}     

