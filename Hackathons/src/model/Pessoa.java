package model;



public abstract class Pessoa {
    protected Instituicao instituicao;
    protected String nome;

    public Pessoa(Instituicao instituicao, String nome) {
        this.instituicao = instituicao;
        this.nome = nome;
    }

    public abstract void gerenciarPessoa();

    // Getters and Setters
    public Instituicao getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(Instituicao instituicao) {
        this.instituicao = instituicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
} 