package controller;


import model.Apresentacao;
import model.Projeto;
import java.util.ArrayList;
import java.util.List;

public class ApresentacaoController {
    private static ApresentacaoController instance;
    private List<Apresentacao> apresentacoes;

    private ApresentacaoController() {
        this.apresentacoes = new ArrayList<>();
    }

    public static synchronized ApresentacaoController getInstance() {
        if (instance == null) {
            instance = new ApresentacaoController();
        }
        return instance;
    }

    public void adicionarApresentacao(Apresentacao apresentacao) {
        apresentacoes.add(apresentacao);
    }

    public List<Apresentacao> getApresentacoes() {
        return apresentacoes;
    }

    public Apresentacao buscarApresentacaoPorProjeto(Projeto projeto) {
        return apresentacoes.stream()
                .filter(a -> a.getProjeto().equals(projeto))
                .findFirst()
                .orElse(null);
    }
}
