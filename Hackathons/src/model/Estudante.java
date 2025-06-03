package model;


public class Estudante extends Pessoa {
    private String codEstudante;

    public Estudante(Instituicao instituicao, String nome, String codEstudante) {
        super(instituicao, nome);
        this.codEstudante = codEstudante;
    }

    @Override
    public void gerenciarPessoa() {
        System.out.println("Gerenciando Estudante: " + nome);
    }


    public String getCodEstudante() {
        return codEstudante;
    }

    public void setCodEstudante(String codEstudante) {
        this.codEstudante = codEstudante;
    }
} 
