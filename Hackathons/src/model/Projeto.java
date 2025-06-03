package model;


public class Projeto {
    private Profissional orientador;
    private Equipe equipe;
    private int notaFinal;

    public Projeto(Profissional orientador, Equipe equipe) {
        this.orientador = orientador;
        this.equipe = equipe;
        this.notaFinal = 0;
    }

    public Profissional getOrientador() {
        return orientador;
    }

    public void setOrientador(Profissional orientador) {
        this.orientador = orientador;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public int getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }
} 