package controller;

import model.Equipe;
import model.Projeto;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProjetoController {
    private static ProjetoController instance;
    private List<Projeto> projetos;

    private ProjetoController() {
        this.projetos = new ArrayList<>();
    }

    public static synchronized ProjetoController getInstance() {
        if (instance == null) {
            instance = new ProjetoController();
        }
        return instance;
    }

    public void adicionarProjeto(Projeto projeto) {
        projetos.add(projeto);
    }

    public List<Projeto> getProjetos() {
        return projetos;
    }

    public List<Projeto> getProjetosAprovados() {
        return projetos.stream()
                .filter(p -> p.getNotaFinal() >= 7)
                .collect(Collectors.toList());
    }

    public Projeto buscarProjetoPorEquipe(Equipe equipe) {
        return projetos.stream()
                .filter(p -> p.getEquipe().equals(equipe))
                .findFirst()
                .orElse(null);
    }
} 