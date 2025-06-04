# Sistema de Gerenciamento de Hackathon Universitário

## Autores
- Maria Clara Gomes Silva de Oliveira

## Visão Geral
Sistema desenvolvido para gerenciar Hackathons Universitários, com foco no controle de projetos, equipes, apresentações e avaliações. O sistema utiliza o padrão de projeto Singleton para garantir uma única instância das coleções de dados em memória.

## Arquitetura do Sistema

### Padrão Singleton
O sistema implementa o padrão Singleton nos controladores principais:
- `ProjetoController`: Gerencia a coleção de projetos
- `EquipeController`: Gerencia a coleção de equipes
- `ApresentacaoController`: Gerencia a coleção de apresentações

Cada controlador garante:
- Uma única instância em toda a aplicação
- Acesso thread-safe através do método `getInstance()`
- Encapsulamento da coleção de dados

### Estrutura de Diretórios
```
Hackathons/
├── src/
│   ├── controller/     # Controladores (Singleton)
│   ├── model/         # Classes de domínio
│   └── Main.java      # Ponto de entrada da aplicação
└── DiagramaUML.png    # Diagrama de classes
```

## Funcionalidades Principais

### Gerenciamento de Equipes
- Cadastro de equipes com até 5 alunos
- Vinculação de projetos às equipes
- Controle de membros e responsáveis

### Gerenciamento de Projetos
- Cadastro de projetos
- Vinculação com equipes
- Controle de apresentações
- Cálculo de notas finais

### Sistema de Avaliação
- Formação de bancas avaliadoras (4 jurados)
- Registro de notas por jurado
- Cálculo automático de média
- Filtro de projetos aprovados (nota ≥ 7)

## Exemplo de Uso

O sistema demonstra suas funcionalidades através do método `main`, que:
1. Cria duas equipes com 5 alunos cada
2. Associa um projeto único para cada equipe
3. Configura bancas avaliadoras (4 jurados por projeto)
4. Calcula notas finais baseadas nas avaliações
5. Lista projetos aprovados usando Stream API

## Como Executar

1. Navegue até o diretório do projeto:
```sh
cd "c:\Users\maria\OneDrive\Documentos\Projeto Pm\Hackathons\src"
```

2. Compile o projeto:
```sh
javac controller\ProjetoController.java Main.java
```

3. Execute a aplicação:
```sh
java Main
```

## Tecnologias Utilizadas
- Java
- Padrão de Projeto Singleton
- Stream API para manipulação de coleções
- Programação Orientada a Objetos