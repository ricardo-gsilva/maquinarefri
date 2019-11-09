import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Maquina {
    public static void main(String args[]){
           
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha a opção: \n" 
                +"Coca-Cola = 1\n"
                +"Guaraná Antarctica = 2\n"
                + "Fanta Uva = 3\n"
                + "Fanta Laranja = 4\n"
                + "Sprite = 5\n"
                + "Guaraná Kuat = 6\n"
                + "Pepsi Cola = 7\n"
                + "Pepsi Twist = 8\n"
                + "Água = 9\n"));
        double valor = 0, valor_pago = 0, troco = 0;
        DecimalFormat df = new DecimalFormat("0.00");
                
        switch (opcao){
            case 1: JOptionPane.showMessageDialog(null, "Você escolheu COCA-COLA\n"
                    + "Valor = R$ 4,00");
                valor = 4.00;
                    break;
            case 2: JOptionPane.showMessageDialog(null, "Você escolheu GUARANÁ ANTARCTICA\n"
                    + "Valor = R$ 4,00");
                valor = 4.00;
                    break;
            case 3: JOptionPane.showMessageDialog(null, "Você escolheu FANTA UVA\n"
                    + "Valor = R$ 3,50");
                valor = 3.50;    
                    break;
            case 4: JOptionPane.showMessageDialog(null, "Você escolheu FANTA LARANJA\n"
                    + "Valor = R$ 3,50");
                valor = 3.50;    
                    break;
            case 5: JOptionPane.showMessageDialog(null, "Você escolheu SPRITE\n"
                    + "Valor = R$ 3,50");
                valor = 3.50;
                    break;
            case 6: JOptionPane.showMessageDialog(null, "Você escolheu GUARANÁ KUAT\n"
                    + "Valor = R$ 3,50");
                valor = 3.50;
                    break;
            case 7: JOptionPane.showMessageDialog(null, "Você escolheu PEPSI COLA\n"
                    + "Valor = R$ 3,50");
                valor = 3.50;
                    break;
            case 8: JOptionPane.showMessageDialog(null, "Você escolheu PEPSI TWIST\n"
                    + "Valor = R$ 3,50");
                valor = 3.50;
                    break;
            case 9: JOptionPane.showMessageDialog(null, "Você escolheu ÁGUA\n"
                    + "Valor = R$ 3,50");
                valor = 3.50;
                    break;
            default: JOptionPane.showMessageDialog(null, "Este não é um código válido!\n");        
        }
        int pagamento = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha a forma de pagamento: \n"
                + "Dinheiro = 1\n"
                + "Cartão de Crédito = 2\n"));
        
        switch (pagamento){
            case 1: valor_pago = Double.parseDouble(JOptionPane.showInputDialog(null, "Você escolheu DINHEIRO\n"
                    + "Digite o dinheiro a ser depositado:"));
                troco = valor_pago - valor;
                JOptionPane.showMessageDialog(null, "Seu troco é: R$ " +(df.format(troco)) +"\n"
                    + "Obrigado por sua compra!");
                break;
                    
            case 2: 
                troco = valor;
                JOptionPane.showMessageDialog(null, "Você escolheu CARTÃO DE CRÉDITO\n"
                    + "O valor debitado foi: R$ " +(df.format(troco)) +"\n"
                    + "Obrigado por sua compra!");
                    break;
                    
        }
    }
}
