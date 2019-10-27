public class TryThisShit {
    public static void main (String[]args){
        Lista Teste = new Lista();
        
        Teste.addNode(25);
        Teste.addNode(354);
        Teste.addNode(18);
        Teste.addNode(978);
        Teste.addNode(514);
        Teste.printList();
        
        Teste.removeNode(978);
        Teste.printList();
    }
}
