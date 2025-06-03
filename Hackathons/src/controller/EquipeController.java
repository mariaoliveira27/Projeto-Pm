package controller;

import model.Equipe;
import model.Estudante;
import java.util.ArrayList;
import java.util.List;

public class EquipeController {
    private static EquipeController instance;
    private List<Equipe> equipes;

    private EquipeController() {
        this.equipes = new ArrayList<>();
    }

    public static synchronized EquipeController getInstance() {
        if (instance == null) {
            instance = new EquipeController();
        }
        return instance;
    }

    public void adicionarEquipe(Equipe equipe) {
        equipes.add(equipe);
    }

    public List<Equipe> getEquipes() {
        return equipes;
    }

    public Equipe buscarEquipePorMembro(Estudante estudante) {
        return equipes.stream()
                .filter(e -> e.getMembros().contains(estudante))
                .findFirst()
                .orElse(null);
    }
} 