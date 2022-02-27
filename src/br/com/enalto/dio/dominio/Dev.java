package br.com.enalto.dio.dominio;

import java.util.*;
import java.util.function.Consumer;

public class Dev extends AbstractDev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    @Override
    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    @Override
    public void progredir() {
        Optional<Conteudo> firstConteudo = conteudosInscritos.stream().findFirst();

        firstConteudo.ifPresentOrElse(new Consumer<Conteudo>() {
            @Override
            public void accept(Conteudo conteudo) {
                conteudosConcluidos.add(conteudo);
                conteudosInscritos.remove(conteudo);
            }
        }, () -> {
            new RuntimeException("Não há conteudo para progredir!");
        });
    }

    @Override
    public double calcularTotalXP() {
        double sum = conteudosInscritos.stream()
                .mapToDouble(conteudo -> conteudo.calcular())
                .sum();

        return sum;
    }

    @Override
    public void exibirCursos() {
        System.out.println(getConteudosInscritos());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return nome.equals(dev.nome) && conteudosInscritos.equals(dev.conteudosInscritos) && conteudosConcluidos.equals(dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
