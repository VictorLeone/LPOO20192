package recursividade;
import javax.swing.JOptionPane;

public class TesteRecursividade {

    static int[] vetor = {1, 2, 3, 4, 5};

    public static void main(String[] args) {

        String[] exercicios = {"Ex. I", "Ex. II", "Ex. III", "Ex. IV", "Ex. V", "Ex. VI", "Ex. VII", "Ex. VIII", "Ex. IX", "Ex. X", "Sair"};

        JOptionPane.showMessageDialog(null, "Esta é apenas uma classe de testes.\nPortanto, todas as variáveis foram definadas estaticamente.");
        String selecao = (String) JOptionPane.showInputDialog(null, null, "Atividades",
                JOptionPane.QUESTION_MESSAGE, null, exercicios, exercicios[0]);

        switch (selecao) {
            case "Ex. I":
                JOptionPane.showMessageDialog(null, "10! equivale a:\n" + Recursividade.fatorial(10));
                break;
            case "Ex. II":
                JOptionPane.showMessageDialog(null, "15º número da Fibonacci:\n" + Recursividade.fibonacci(15));
                break;
            case "Ex. III":
                JOptionPane.showMessageDialog(null, "Iversão de 12345:\n" + Recursividade.inversao(12345, 0));
                break;
            case "Ex. IV":
                JOptionPane.showMessageDialog(null, "Soma de {1,2,3,4,5}:\n" + Recursividade.somaVetor(vetor, 0));
                break;
            case "Ex.V":
                JOptionPane.showMessageDialog(null, "Soma dos algarismos entre 0 e 10:\n" + Recursividade.somaZeroToN(10));
                break;
            case "Ex. VI":
                JOptionPane.showMessageDialog(null, "Nope!");
                break;
            case "Ex. VII":
                JOptionPane.showMessageDialog(null, "Nope!");
                break;
            case "Ex. VIII":
                JOptionPane.showMessageDialog(null, "Nope!");
                break;
            case "Ex. IX":
                JOptionPane.showMessageDialog(null, "Algarismos entre 0 e 10:\n(Console)");
                Recursividade.ascToN(10);
                break;
            case "Ex. X":
                JOptionPane.showMessageDialog(null, "Algarismos entre 10 e 0:\n (Console)");
                Recursividade.descToN(10);
                break;
            case "Sair":
                JOptionPane.showMessageDialog(null, "Você escolheu sair.");
                break;

        }

    }

}
