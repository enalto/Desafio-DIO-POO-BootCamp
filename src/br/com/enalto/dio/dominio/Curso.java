package br.com.enalto.dio.dominio;

public class Curso extends Conteudo{
    private int cargaHoraria;

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcular() {
        return XP*getCargaHoraria();
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getTitulo() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
