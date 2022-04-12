/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int media =0,cont100=0,contimp=0 , contval =0,contpar=0,n,s = 0;
        do{
        n = Integer.parseInt(JOptionPane.showInputDialog(null,
                "<html>Informe um Número: <br><em>(valor 0 interrompe)</em></br></html>"));
         s += n;
         if(n!=0){
         contval++;
         if (n%2==0){
             contpar++;
         }else{ 
             contimp++;
         } if(n>100){
             cont100++;
         }
          media = s/contval;  
        }} while (n != 0);
        JOptionPane.showMessageDialog(null,"<html>Resultado final <hr>" +
                "<br>Somatório vale: "+s+
                "<br>Total de Pares: "+contpar+
                "<br>Total de Valores: "+contval+
                "<br>Total de Impares: "+contimp+
                "<br>Acima de 100: "+cont100+
                "<br>Média dos valores: "+media+"</html>");
}
}
