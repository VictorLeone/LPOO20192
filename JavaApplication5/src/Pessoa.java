import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pessoa {

    private String nomePessoa;
    private String sdNasc;
    private float alturaPessoa;
    

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getDataNascimento() {
        return sdNasc;
    }

    public void setDataNascimento(String sdNasc) {
        this.sdNasc = sdNasc;
    }

    public float getAlturaPessoa() {
        return alturaPessoa;
    }

    public void setAlturaPessoa(float alturaPessoa) {
        this.alturaPessoa = alturaPessoa;
    }


    public int calculaIdade() throws ParseException {
        
        String str = getDataNascimento(); 
        String[] arrOfStr = str.split("/"); 
        
        int anoNasc = Integer.parseInt(arrOfStr[2]);
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy");
        LocalDateTime hoje = LocalDateTime.now();
        String stringAno = dtf.format(hoje);
        int ano = Integer.parseInt(stringAno);
        
        int idade = (ano-anoNasc);

        return idade;

    }
  
}
