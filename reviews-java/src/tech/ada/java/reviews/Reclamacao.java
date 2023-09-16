package tech.ada.java.reviews;

public class Reclamacao extends Postagem {

    @Override
    public String tipoPostagem() {
        return this.getClass().getName();
    }
}
