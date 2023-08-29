package uniderp.loo.escola.dominio;

import java.time.LocalDate;

public class professor extends basePessoa {

    private String registro;
    private LocalDate datavContratacao;
    public String getRegistro() {
        return registro;
    }
    public void setRegistro(String registro) {
        this.registro = registro;
    }
    public LocalDate getDatavContratacao() {
        return datavContratacao;
    }
    public void setDatavContratacao(LocalDate datavContratacao) {
        this.datavContratacao = datavContratacao;
    }
    public professor(int codigo, String nome, String endereco, String telefone, LocalDate data, String rg, String cpf,
            LocalDate dataInsercao, String registro, LocalDate datavContratacao) {
        super(codigo, nome, endereco, telefone, data, rg, cpf, dataInsercao);
        this.registro = registro;
        this.datavContratacao = datavContratacao;
    }

public professor(){


}

}

