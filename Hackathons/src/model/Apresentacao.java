package model;

import java.time.LocalDateTime;

public class Apresentacao {
    private Projeto projeto;
    private Avaliavel banca;
    private Sala local;
    private LocalDateTime dataHora;

    public Apresentacao(Projeto projeto, Avaliavel banca, Sala local, LocalDateTime dataHora) {
        this.projeto = projeto;
        this.banca = banca;
        this.local = local;
        this.dataHora = dataHora;
    }

    public void avaliar() {
        double nota = banca.calcularNotaFinal();
        System.out.println("Projeto " + projeto.getEquipe().getMembros().get(0).getNome() + 
                         " avaliado com nota: " + nota);
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public Avaliavel getBanca() {
        return banca;
    }

    public void setBanca(Avaliavel banca) {
        this.banca = banca;
    }

    public Sala getLocal() {
        return local;
    }

    public void setLocal(Sala local) {
        this.local = local;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
} 