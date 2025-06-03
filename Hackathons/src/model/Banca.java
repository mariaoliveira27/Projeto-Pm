package model;

import java.util.HashMap;
import java.util.Map;

public class Banca implements Avaliavel {
    private Projeto projetoAvaliado;
    private Map<Jurado, Integer> jurados;

    public Banca(Projeto projetoAvaliado) {
        this.projetoAvaliado = projetoAvaliado;
        this.jurados = new HashMap<>();
    }

    public void adicionarJurado(Jurado jurado, int nota) {
        if (jurados.size() < 4) {
            jurados.put(jurado, nota);
        } else {
            System.out.println("A banca já possui 4 jurados!");
        }
    }

    @Override
    public double calcularNotaFinal() {
        if (jurados.isEmpty()) {
            return 0;
        }
        double somaNotas = jurados.values().stream().mapToInt(Integer::intValue).sum();
        double media = somaNotas / jurados.size();
        projetoAvaliado.setNotaFinal((int) media);
        return media;
    }

    public Projeto getProjetoAvaliado() {
        return projetoAvaliado;
    }

    public void setProjetoAvaliado(Projeto projetoAvaliado) {
        this.projetoAvaliado = projetoAvaliado;
    }

    public Map<Jurado, Integer> getJurados() {
        return jurados;
    }

    public void setJurados(Map<Jurado, Integer> jurados) {
        this.jurados = jurados;
    }
} 
