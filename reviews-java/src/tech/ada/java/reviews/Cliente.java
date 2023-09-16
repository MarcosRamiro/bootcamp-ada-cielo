package tech.ada.java.reviews;

import java.time.LocalDate;
import java.time.Period;
import java.util.UUID;

public class Cliente implements Idade {

    private UUID uuid;
    private String nome;
    private String email;
    private LocalDate dataNascimento;

    public Cliente() {
    }

    public Cliente(UUID uuid, String nome, String email, LocalDate dataNascimento) {
        this.uuid = uuid;
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public int getIdade() {
        return Period.between(this.dataNascimento, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return "Cliente{" +
            "uuid=" + uuid +
            ", nome='" + nome + '\'' +
            ", email='" + email + '\'' +
            ", dataNascimento=" + dataNascimento +
            '}';
    }
}
