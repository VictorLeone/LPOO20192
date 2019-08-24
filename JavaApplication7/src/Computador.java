public class Computador extends Dispositivo{
    private int gerCPU;
    private int freqRAM;   
    private boolean allinOne;
    
    
    public void set_gerCPU(int gerCPU) {
        this.gerCPU = gerCPU;
    }

    public int get_gerCPU() {
        return gerCPU;
    }
    
    public void set_freqRAM(int freqRAM) {
        this.freqRAM = freqRAM;
    }

    public int get_freqRAM() {
        return freqRAM;
    }  
 
    public void set_allinOne(boolean allinOne) {
        this.allinOne = allinOne;
    }

    public boolean get_allinOne() {
        return allinOne;
    }     
    
    @Override
    public void ImprimeCaracteristicas() {
        super.ImprimeCaracteristicas();
        System.out.println(get_gerCPU());
        System.out.println(get_freqRAM());
        System.out.println(get_allinOne());
    }    
}
