import java.util.Random;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        Random ent = new Random();

        int n = ent.nextInt(100);
        String c;

        for (int m = 0; m < 5; m++) {
            c = JOptionPane.showInputDialog("Acerte o número: ");
            int c1 = Integer.parseInt(c);
            System.out.println("Tentativas: " + c1);
            if (c1 == n) {
                JOptionPane.showMessageDialog(null, "PARABÉNS, VOCÊ ACERTOU!!!!");
                System.out.println("ACERTOU");
                break;
            } else if (c1 > n) {
                JOptionPane.showMessageDialog(null, "TENTE UM NÚMERO MENOR");
                System.out.println("TENTE UM NÚMERO MENOR");
            } else {
                JOptionPane.showMessageDialog(null, "TENTE UM NÚMERO MAIOR");
                System.out.println("TENTE UM NÚMERO MAIOR");
            }
        }
    }
}
