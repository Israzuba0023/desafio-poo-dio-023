package br.com.dio.desafio;

import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java Básico");
        curso1.setDescricao("Curso introdutório de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("POO com Java");
        curso2.setDescricao("Entenda os pilares da POO");
        curso2.setCargaHoraria(10);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Sessão para tirar dúvidas");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Aprenda Java do zero ao avançado");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Camila");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila: " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteúdos Concluídos Camila: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());

        System.out.println("-------------------------------------------------");

        Dev dev2 = new Dev();
        dev2.setNome("João");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João: " + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("Conteúdos Concluídos João: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());
    }
}

