package model;


public class Sala {
    private String identificacao;

    public Sala(String identificacao) {
        this.identificacao = identificacao;
    }

    public void gerenciarSala() {
        System.out.println("Gerenciando sala: " + identificacao);
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }
} 