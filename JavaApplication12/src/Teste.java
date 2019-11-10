
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

public class Teste {

    public static void main(String[] args) {
        String saida = "";

        String entrada = JOptionPane.showInputDialog("Palavra:");

        Pilha teste = new Pilha(entrada.length(), -1);

        for (int i = 0; i < entrada.length(); i++) {
            teste.push(entrada.charAt(i));
        }

        while (!teste.isEmpty()) {
            char elementos = teste.pop();
            saida = saida + Character.toString(elementos);
        }
        String linha1 = (saida);

        if (entrada.length() != 0) {
            if (toLowerCase(entrada).equals(toLowerCase(saida))) {
                JOptionPane.showMessageDialog(null, linha1 + "\nÉ palíndromo!");
            } else {
                JOptionPane.showMessageDialog(null, linha1 + "\nNão é palíndromo!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não há dados!");
        }

    }
}
