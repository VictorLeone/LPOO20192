import javax.swing.JOptionPane;

public class JPBoy {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Informe seu nome:", "Identificão", JOptionPane.PLAIN_MESSAGE);
        String idade = JOptionPane.showInputDialog(null, "Informe sua idade:", "Idade", JOptionPane.PLAIN_MESSAGE);

        try {
            int idadeInt = Integer.parseInt(idade);
            if (idadeInt <= 0) {
                JOptionPane.showMessageDialog(null, nome + " consulte-me novamente quando você nascer!", "Oops!", JOptionPane.WARNING_MESSAGE);
            } else {
                if (idadeInt >= 18) {
                    JOptionPane.showMessageDialog(null, nome + ", você pode TENTAR tirar a CNH!", "YeeHa!", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, nome + ", você não tem idade pra isso! \n Consulte-me novamente em " + (18 - idadeInt) + " anos.", "Oops!", JOptionPane.WARNING_MESSAGE);
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, nome + ", eu pedi idade, você me deu: " + idade + " ... \n LEAVE!", "Nossa, véi... NOSSA!!", JOptionPane.ERROR_MESSAGE);
        }
    }
}
