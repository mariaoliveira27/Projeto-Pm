package model;

import java.util.ArrayList;
import java.util.List;

public class Equipe {
    private List<Estudante> membros;

    public Equipe() {
        this.membros = new ArrayList<>();
    }

    public void adicionarMembro(Estudante estudante) {
        if (membros.size() < 5) {
            membros.add(estudante);
        } else {
            System.out.println("A equipe já possui 5 membros!");
        }
    }

    public List<Estudante> getMembros() {
        return membros;
    }

    public void setMembros(List<Estudante> membros) {
        this.membros = membros;
    }
} 