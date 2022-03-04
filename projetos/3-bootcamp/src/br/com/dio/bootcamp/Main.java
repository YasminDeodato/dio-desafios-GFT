package br.com.dio.bootcamp;

import br.com.dio.bootcamp.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Conteudos do Bootcamp
        Curso c1 = new Curso("Dominando IDES", "Aprenda a usar InteliJ e Eclipse", 54);
        Curso c2 = new Curso("Metodos HTTP", "Metodos HTTP e APIS", 30);

        Mentoria m1 = new Mentoria("Mentoria POO", "Bootcamp com POO", LocalDate.parse("2022-03-01"));

        //Projetos do Bootcamp
        Projeto p1 = new Projeto("Primeiro Repositorio", "Aplique os conhecimentos de Git e GitHub na pratica", "Git", "Full-stack", "Basico");
        Projeto p2 = new Projeto("Banco Digital", "Desenvolva suas habilidades de POO com esse Projeto de Banco Digital", "Java", "Back-end", "Intermediario");
        Projeto p3 = new Projeto("Bootcamp", "Desenvolva suas habilidades de POO implementando na pratica um Projeto de Bootcamp", "Java", "Back-end", "Intermediario");

        //Bootcamp
        Bootcamp bootcamp = new Bootcamp("Bootcamp DIO GFT #4 Java", "Torne-se uma Pessoa Desenvolvedora Java e concorra a uma das vagas na GFT no final.");
        bootcamp.getConteudos().add(c1);
        bootcamp.getConteudos().add(p1);
        bootcamp.getConteudos().add(c2);
        bootcamp.getConteudos().add(m1);
        bootcamp.getConteudos().add(p2);
        bootcamp.getConteudos().add(p3);

        //Pessoas Desenvolvedoras
        Dev dev1 = new Dev("Yasmin");
        Dev dev2 = new Dev("Mario");

        System.out.println("*****Yasmin*****\n  Conteudos inscritos: " + dev1.getConteudosInscritos());
        dev1.inscreverBootcamp(bootcamp);
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        System.out.println("  Conteudos inscritos: " + dev1.getConteudosInscritos());
        System.out.println("  Conteudos concluidos: " + dev1.getConteudosConcluidos());
        System.out.println("  Qtd. conteudos concluida: " + dev1.getConteudosConcluidos().size()
                + " | Qtd. conteudos a serem completados: " +  dev1.getConteudosInscritos().size());
        System.out.println("  XP: " + dev1.calcularTotalXp());


        System.out.println("\n*****Mario*****\n  Conteudos inscritos: " + dev2.getConteudosInscritos());
        dev2.inscreverBootcamp(bootcamp);
        dev2.progredir();
        System.out.println("  Conteudos inscritos: " + dev2.getConteudosInscritos());
        System.out.println("  Conteudos concluidos: " + dev2.getConteudosConcluidos());
        System.out.println("  Qtd. conteudos concluida: " + dev2.getConteudosConcluidos().size()
                + " | Qtd. conteudos a serem completados: " +  dev2.getConteudosInscritos().size());
        System.out.println("  XP: " + dev2.calcularTotalXp());

    }
}
