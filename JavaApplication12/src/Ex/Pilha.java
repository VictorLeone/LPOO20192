package Ex;

public class Pilha {
    String elementos[];
    int cima;

    public Pilha() {
        elementos = new String[20];
        cima = -1;
    }

    public void push(String add) {
        cima++;
        elementos[cima] = add;
    }

    public String pop() {
        String add;
        add = elementos[cima];
        cima--;
        return add;
    }

    public boolean isFull() {
        return (cima == 9);
    }

    public boolean isEmpty() {
        return (cima == -1);
    }

}

