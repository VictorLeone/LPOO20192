package Ex;

import javax.swing.JOptionPane;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

public class Teste {

    public static void main(String[] args) {
        String[] valorPrioridade = {"Alta", "Normal"};
        String entrada = JOptionPane.showInputDialog("Elemento:");

        Pilha comPri = new Pilha();
        Pilha semPri = new Pilha();

        Object prioridade = JOptionPane.showInputDialog(null, "Informe a prioridade:", "Prioridade", JOptionPane.DEFAULT_OPTION, null, valorPrioridade, "0");
        if (prioridade == "Alta") {
            comPri.push(entrada);
        } else {
            semPri.push(entrada);
        }
    }
}
