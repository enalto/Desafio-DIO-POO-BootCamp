package br.com.enalto.dio.dominio;

public abstract class AbstractDev {
    protected abstract void inscreverBootcamp(Bootcamp bootcamp);
    protected abstract void progredir();
    protected abstract double calcularTotalXP();
    protected abstract void exibirCursos();
}
