package tech.ada.java.reviews;

public class Elogio extends Postagem {

    @Override
    public String tipoPostagem() {
        return this.getClass().getName();
    }
}
