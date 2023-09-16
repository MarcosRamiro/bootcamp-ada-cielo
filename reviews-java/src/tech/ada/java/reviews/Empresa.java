package tech.ada.java.reviews;

import java.util.UUID;

public class Empresa {

    private UUID uuid;
    private String nome;
    private String email;
    private Area area;

    enum Area {
        AUTOMOVEIS, TELEFONIA, SERVICO, ELETRONICOS, FINANCAS, EDUCACAO, SAUDE, CONSTRUCAO, MOVEIS, ALIMENTACAO
    }
}
