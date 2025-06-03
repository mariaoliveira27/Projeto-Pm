

import model.*;
import controller.ApresentacaoController;
import controller.EquipeController;
import controller.ProjetoController;

import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criar universidade
        Universidade universidade = new Universidade("Universidade Federal", "Rua Principal, 123", "123456789", "UF001");

        // Criar equipes
        Equipe equipe1 = new Equipe();
        Equipe equipe2 = new Equipe();

        // Adicionar alunos às equipes
        for (int i = 1; i <= 5; i++) {
            Estudante aluno1 = new Estudante(universidade, "Aluno" + i + "Equipe1", "EST" + i);
            Estudante aluno2 = new Estudante(universidade, "Aluno" + i + "Equipe2", "EST" + (i + 5));
            equipe1.adicionarMembro(aluno1);
            equipe2.adicionarMembro(aluno2);
        }

        // Adicionar equipes ao gerenciador
        EquipeController.getInstance().adicionarEquipe(equipe1);
        EquipeController.getInstance().adicionarEquipe(equipe2);

        // Criar orientadores
        Profissional orientador1 = new Profissional(universidade, "Orientador1", "PROF001");
        Profissional orientador2 = new Profissional(universidade, "Orientador2", "PROF002");

        // Criar projetos
        Projeto projeto1 = new Projeto(orientador1, equipe1);
        Projeto projeto2 = new Projeto(orientador2, equipe2);

        // Adicionar projetos ao gerenciador
        ProjetoController.getInstance().adicionarProjeto(projeto1);
        ProjetoController.getInstance().adicionarProjeto(projeto2);

        // Criar jurados
        Jurado jurado1 = new Jurado(universidade, "Jurado1", "JUR001", "Universidade Federal");
        Jurado jurado2 = new Jurado(universidade, "Jurado2", "JUR002", "Universidade Federal");
        Jurado jurado3 = new Jurado(universidade, "Jurado3", "JUR003", "Universidade Federal");
        Jurado jurado4 = new Jurado(universidade, "Jurado4", "JUR004", "Universidade Federal");

        // Criar bancas
        Banca banca1 = new Banca(projeto1);
        Banca banca2 = new Banca(projeto2);

        // Adicionar jurados às bancas
        banca1.adicionarJurado(jurado1, 8);
        banca1.adicionarJurado(jurado2, 7);
        banca1.adicionarJurado(jurado3, 9);
        banca1.adicionarJurado(jurado4, 8);

        banca2.adicionarJurado(jurado1, 6);
        banca2.adicionarJurado(jurado2, 7);
        banca2.adicionarJurado(jurado3, 6);
        banca2.adicionarJurado(jurado4, 7);

        // Criar salas
        Sala sala1 = new Sala("Sala 101");
        Sala sala2 = new Sala("Sala 102");

        // Criar apresentações
        Apresentacao apresentacao1 = new Apresentacao(projeto1, banca1, sala1, LocalDateTime.now());
        Apresentacao apresentacao2 = new Apresentacao(projeto2, banca2, sala2, LocalDateTime.now().plusHours(1));

        // Adicionar apresentações ao gerenciador
        ApresentacaoController.getInstance().adicionarApresentacao(apresentacao1);
        ApresentacaoController.getInstance().adicionarApresentacao(apresentacao2);

        // Realizar avaliações
        apresentacao1.avaliar();
        apresentacao2.avaliar();

        // Listar projetos aprovados
        System.out.println("\nProjetos aprovados (nota >= 7):");
        List<Projeto> projetosAprovados = ProjetoController.getInstance().getProjetosAprovados();
        projetosAprovados.forEach(p -> System.out.println("Projeto da equipe " + 
            p.getEquipe().getMembros().get(0).getNome() + " - Nota: " + p.getNotaFinal()));
    }
} 