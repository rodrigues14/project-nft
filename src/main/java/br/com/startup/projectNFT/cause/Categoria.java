package br.com.startup.projectNFT.cause;

public enum Categoria {
    ALIMENTACAO("Alimentação"),
    EDUCACAO("Educação"),
    SANITARIO("Sanitario"),
    VESTIMENTENTA("Vestimenta"),
    ANIMAIS("Animais"),
    INCENDIOS("Incêndios"),

    INUNDACOES("Inundações");

    private String descricao;

    private Categoria(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
