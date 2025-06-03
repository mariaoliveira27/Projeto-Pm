package model;


public class Jurado extends Profissional {
    private String nomeInstituicao;
    

    public Jurado(Instituicao instituicao, String nome, String codProfissional, String nomeInstituicao) {
        super(instituicao, nome, codProfissional);
        this.nomeInstituicao = nomeInstituicao;
    }


    public String getNomeInstituicao() {
        return nomeInstituicao;
    }

    public void setNomeInstituicao(String nomeInstituicao) {
        this.nomeInstituicao = nomeInstituicao;
    }
} 