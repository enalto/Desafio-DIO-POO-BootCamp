package br.com.enalto.dio;

import br.com.enalto.dio.dominio.*;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Bootcamp bootcamp = new Bootcamp();

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Introdução ao JAVA");
        curso1.setCargaHoraria(40);

        Curso curso2 = new Curso();
        curso2.setTitulo("Angular");
        curso2.setDescricao("Front end iniciante");
        curso2.setCargaHoraria(30);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria");
        mentoria.setDescricao("Mentoria de bootcamp");
        mentoria.setDataMentoria(LocalDate.of(2022, 02, 23));

        bootcamp.setConteudos(Set.of(curso1, curso2, mentoria));

        Dev devEnalto = new Dev();
        devEnalto.setNome("Enalto");
        devEnalto.inscreverBootcamp(bootcamp);

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");

        System.out.println("Conteudos inscritos");
        System.out.println(devEnalto.getConteudosInscritos());

        System.out.println("\nConteudos concluidos");
        System.out.println(devEnalto.getConteudosConcluidos());

        System.out.println("Conteudo concluido");
        devEnalto.progredir();
        devEnalto.progredir();
        System.out.println(devEnalto.getConteudosConcluidos());

        System.out.println("Conteudos em andamento");
        System.out.println(devEnalto.getConteudosInscritos());

        System.out.println(devEnalto.calcularTotalXP());
    }
}
