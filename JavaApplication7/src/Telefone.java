public class Telefone extends Dispositivo {

    private boolean semFio;
    private int freqOper;
    private String numero;
    private double comprFio;
    private double capacidadeBateria;

    public void set_semFio(boolean semFio) {
        this.semFio = semFio;
    }

    public boolean get_semFio() {
        return semFio;
    }

    public void set_freqOper(int freqOper) {
        this.freqOper = freqOper;
    }
    
    public String get_freqOper() {
        return (freqOper+"GHz");
    }

    public void set_numero(String numero) {
        this.numero = numero;
    }

    public String get_numero() {
        return numero;
    }

    public void set_comprFio(double comprFio) {
        this.comprFio = comprFio;
    }

    public double get_comprFio() {
        return comprFio;
    }

    public void set_capacidadeBateria(double capacidadeBateria) {
        this.capacidadeBateria = capacidadeBateria;
    }

    public String get_capacidadeBateria() {
        return (capacidadeBateria + "mAh");
    }

    @Override
    public void ImprimeCaracteristicas() {
        super.ImprimeCaracteristicas();
        System.out.println(get_semFio());
        System.out.println(get_numero());
        System.out.println(get_comprFio());
        System.out.println(get_capacidadeBateria());
        System.out.println(get_freqOper());
    }

}
