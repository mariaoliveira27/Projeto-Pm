package model;

public class Empresa extends Instituicao {
    private String codEmpresa;

    public Empresa(String nomeInstituicao, String endereco, String cnpj, String codEmpresa) {
        super(nomeInstituicao, endereco, cnpj);
        this.codEmpresa = codEmpresa;
    }

    @Override
    public void gerenciarInstituicao() {
        System.out.println("Gerenciando Empresa: " + getNomeInstituicao());
    }

    public void gerenciarEmpresa() {
        System.out.println("Gerenciando Empresa com código: " + codEmpresa);
    }

    public String getCodEmpresa() {
        return codEmpresa;
    }

    public void setCodEmpresa(String codEmpresa) {
        this.codEmpresa = codEmpresa;
    }
} 