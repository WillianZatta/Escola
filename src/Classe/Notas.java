package Classe;

/**
 *
 * @author willi
 */
import javax.swing.JOptionPane;
public class Notas {
    
    public static void main(String[] args){
        int n1,n2,n3, media;
        String primeiroNumero, segundoNumero, terceiroNumero;
        
        primeiroNumero = JOptionPane.showInputDialog("Informe a 1 nota: ");
        segundoNumero = JOptionPane.showInputDialog ("Infome a 2 nota: ");
        terceiroNumero = JOptionPane.showInputDialog("Informe a 3 nots: ");
        
        n1 = Integer.parseInt(primeiroNumero);
        n2 = Integer.parseInt(segundoNumero);
        n3 = Integer.parseInt(terceiroNumero);
        
        media = (n1+n2+n3)/3;
        
        JOptionPane.showInputDialog(null,"A media é: " +media,"Resultado:",JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
    
}
