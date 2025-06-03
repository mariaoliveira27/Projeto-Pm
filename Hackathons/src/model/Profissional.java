package model;


public class Profissional extends Pessoa {
    private String codProfissional;

    public Profissional(Instituicao instituicao, String nome, String codProfissional) {
        super(instituicao, nome);
        this.codProfissional = codProfissional;
    }

    @Override
    public void gerenciarPessoa() {
        System.out.println("Gerenciando Profissional: " + nome);
    }

    public String getCodProfissional() {
        return codProfissional;
    }

    public void setCodProfissional(String codProfissional) {
        this.codProfissional = codProfissional;
    }
} 