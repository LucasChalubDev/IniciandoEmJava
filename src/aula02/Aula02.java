package aula02;

import javax.swing.JOptionPane;

public class Aula02 {
    public static void main(String[] args) {
        int numero1,numero2, soma;
        String numero1S, numero2S;
        
        numero1S = JOptionPane.showInputDialog("Digite o primeiro numero");
        numero2S = JOptionPane.showInputDialog("Digite o segundo numero");
        
        numero1 = Integer.parseInt(numero1S);
        numero2 = Integer.parseInt(numero2S);
        
        soma = numero1 + numero2;
        
        JOptionPane.showMessageDialog(null,"A soma é: "+soma+"..fim");
    }
    
}
