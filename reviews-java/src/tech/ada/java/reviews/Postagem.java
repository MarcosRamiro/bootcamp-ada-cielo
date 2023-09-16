package tech.ada.java.reviews;

import java.time.LocalDateTime;
import java.util.UUID;

public abstract class Postagem {

    protected UUID uuid;
    protected LocalDateTime localDateTime;
    protected Usuario autor;

    public abstract String tipoPostagem();

}
