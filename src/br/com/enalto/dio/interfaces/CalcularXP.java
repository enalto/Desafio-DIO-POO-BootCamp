package br.com.enalto.dio.interfaces;

import static br.com.enalto.dio.dominio.Conteudo.XP;

public interface CalcularXP {
    default double calcular(){ return XP+20d;};
}
