package aula02;

import javax.swing.JOptionPane;
       
public class Aula02_part2 {
     
    public static void main(String[] args) {
        int numero;
        String numeroS;
        
        numeroS = JOptionPane.showInputDialog("Digite o numero");
        numero = Integer.parseInt(numeroS);
        
        for (int i = 0; i < numero; i++){
            int inicio = 1;
            int fim = numero - 1;
            for (int j = 1; j <= fim; j++){
                inicio = inicio * j;
            }
            JOptionPane.showMessageDialog(null, "Fatorial de "+fim+" é "+inicio);
        }
    }
}
