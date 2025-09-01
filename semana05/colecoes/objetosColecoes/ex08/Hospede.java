package semana05.colecoes.objetosColecoes.ex08;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Hospede {
    private String id;
    private String nome;

    public Hospede(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Hospede hospede = (Hospede) o;
        return Objects.equals(id, hospede.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public void adicionarHospedeQuarto(Integer numeroQuarto,  Map<Integer, List<Hospede>> hospedes) {
        hospedes.putIfAbsent(numeroQuarto, new ArrayList<>());

        List<Hospede> lista = hospedes.get(numeroQuarto);

        if (lista.contains(this)) {
            System.out.println("Já existe um hospede com esse ID!");
        } else {
            lista.add(this);
            System.out.println("Hospede adicionado com sucesso!");
        }
    }

    @Override
    public String toString() {
        return nome + "(ID: " + id + ")";
    }
}
