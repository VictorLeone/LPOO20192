
public class Pilha {
    char elementos[];
    int cima;

    public Pilha(int size, int a) {
        elementos = new char[size];
        cima = a;
    }

    public void push(char add) {
        cima++;
        elementos[cima] = add;
    }

    public char pop() {
        char add;
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
