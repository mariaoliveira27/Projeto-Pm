package model;


public class Universidade extends Instituicao {
    private String codUniversidade;

    public Universidade(String nomeInstituicao, String endereco, String cnpj, String codUniversidade) {
        super(nomeInstituicao, endereco, cnpj);
        this.codUniversidade = codUniversidade;
    }

    @Override
    public void gerenciarInstituicao() {
        System.out.println("Gerenciando Universidade: " + getNomeInstituicao());
    }

    public void gerenciarUniversidade() {
        System.out.println("Gerenciando Universidade com código: " + codUniversidade);
    }

    public String getCodUniversidade() {
        return codUniversidade;
    }

    public void setCodUniversidade(String codUniversidade) {
        this.codUniversidade = codUniversidade;
    }
} 