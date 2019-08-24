public class Celular extends Telefone {

    private String operadora;
    private String bandaOper;
    private int gerConexao;
    private int resCamera;
    private double tamTela;

    public void set_operadora(String operadora) {
        this.operadora = operadora;
    }

    public String get_operadora() {
        return operadora;
    }

    public void set_bandaOper(String bandaOper) {
        this.bandaOper = bandaOper;
    }

    public String get_bandaOper() {
        return bandaOper;
    }

    public void set_gerConexao(int gerConexao) {
        this.gerConexao = gerConexao;
    }

    public String get_gerConexao() {
        return (gerConexao+"G");
    }

    public void set_resCamera(int resCamera) {
        this.resCamera = resCamera;
    }

    public String get_resCamera() {
        return (resCamera+"MP");
    }

    public void set_tamTela(double tamTela) {
        this.tamTela = tamTela;
    }

    public String get_tamTela() {
        return (tamTela+"'");
    }

    @Override
    public void ImprimeCaracteristicas() {
        super.ImprimeCaracteristicas();
        System.out.println(get_operadora());
        System.out.println(get_bandaOper());
        System.out.println(get_gerConexao());
        System.out.println(get_resCamera());
        System.out.println(get_tamTela());
    }

}