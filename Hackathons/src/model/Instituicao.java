package model;

public abstract class Instituicao {
    private String nomeInstituicao;
    private String endereco;
    private String cnpj;

    public Instituicao(String nomeInstituicao, String endereco, String cnpj) {
        this.nomeInstituicao = nomeInstituicao;
        this.endereco = endereco;
        this.cnpj = cnpj;
    }

    public abstract void gerenciarInstituicao();

    // Getters and Setters
    public String getNomeInstituicao() {
        return nomeInstituicao;
    }

    public void setNomeInstituicao(String nomeInstituicao) {
        this.nomeInstituicao = nomeInstituicao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
} 