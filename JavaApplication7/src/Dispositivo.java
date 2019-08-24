public class Dispositivo {
    private String marca;
    private String cor;
    private String serialNumber;
    private int anoLancamento;
    private String resTela;
    private String tipoConexao;
    
    public void set_cor(String cor) {
        this.cor = cor;
    }

    public String get_cor() {
        return cor;
    }

    public void set_marca(String marca) {
        this.marca = marca;
    }

    public String get_marca() {
        return marca;
    }
    
    public void set_serialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String get_serialNumber() {
        return serialNumber;
    }
    
    public void set_anoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int get_anoLancamento() {
        return anoLancamento;
    }
    
    public void set_resTela(String resTela) {
        this.resTela = resTela;
    }

    public String get_resTela() {
        return resTela;
    }

    public void set_tipoConexao(String tipoConexao) {
        this.tipoConexao = tipoConexao;
    }

    public String get_tipoConexao() {
        return tipoConexao;
    }

    public void ImprimeCaracteristicas() {
        System.out.println(get_marca());
        System.out.println(get_cor());
        System.out.println(get_serialNumber());
        System.out.println(get_anoLancamento());
        System.out.println(get_resTela());
        System.out.println(get_tipoConexao());
    }
    
}
