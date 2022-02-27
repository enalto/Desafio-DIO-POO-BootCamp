package br.com.enalto.dio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private LocalDate dataMentoria;

    public LocalDate getDataMentoria() {
        return dataMentoria;
    }

    public void setDataMentoria(LocalDate dataMentoria) {
        this.dataMentoria = dataMentoria;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", dataMentoria=" + dataMentoria +
                '}';
    }

    @Override
    public double calcular() {
        return XP+20D;
    }
}
