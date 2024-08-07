package main;
import br.com.dio.desafio.dominio.Graduacao;
import br.com.dio.desafio.dominio.Disciplina;
import br.com.dio.desafio.dominio.Aluno;
import br.com.dio.desafio.dominio.CursosExtras;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    	//Criação da disciplia 1 e setando os valores dos parâmetros
        Disciplina disciplina1 = new Disciplina();
        disciplina1.setTitulo("Algoritmo");
        disciplina1.setDescricao("Disciplina do curso de sistemas de informação");
        disciplina1.setCargaHoraria(25);

        //Criação da disciplia 2 e setando os valores dos parâmetros
        Disciplina disciplina2 = new Disciplina();
        disciplina2.setTitulo("Grafos");
        disciplina2.setDescricao("Disciplina do curso de sistemas de informaçãos");
        disciplina2.setCargaHoraria(30);
        
        //Criação da disciplia 3 e setando os valores dos parâmetros
        Disciplina disciplina3 = new Disciplina();
        disciplina3.setTitulo("Programação Orientada a Objetos");
        disciplina3.setDescricao("Disciplina do curso de sistemas de informaçãos");
        disciplina3.setCargaHoraria(40);
        
        //Criação da disciplia 4 e setando os valores dos parâmetros
        Disciplina disciplina4 = new Disciplina();
        disciplina4.setTitulo("Cálculo Integral");
        disciplina4.setDescricao("Disciplina do curso de engenharia civil");
        disciplina4.setCargaHoraria(60);

        //Criação do curso extra e setando os valores dos parâmetros
        CursosExtras curso_extra = new CursosExtras();
        curso_extra.setTitulo("Unified Modeling Language - UML");
        curso_extra.setDescricao("Curso extra para horas complementares");
        curso_extra.setData(LocalDate.now());

        //Criando a primeira graduação, setando os valores dos parâmetros e adicionando as disciplinas
        Graduacao sistema = new Graduacao();
        sistema.setNome("Sistemas de Informação");
        sistema.setDescricao("Graduação em Sistemas de Informação");
        sistema.getConteudos().add(disciplina1);
        sistema.getConteudos().add(disciplina2);
        sistema.getConteudos().add(disciplina3);
        sistema.getConteudos().add(curso_extra);
        
        //Criando a segunda graduação, setando os valores dos parâmetros e adicionando as disciplinas
        Graduacao civil = new Graduacao();
        civil.setNome("Engenharia Civil");
        civil.setDescricao("Graduação em engenharia Civil");
        civil.getConteudos().add(disciplina4);

        //Criando o primeiro aluno, setando os valores dos parâmetros e adicionando na graduação
        Aluno rodrigo = new Aluno();
        rodrigo.setNome("Rodrigo");
        rodrigo.inscreverGraduacao(sistema);
        System.out.println("Conteúdos Inscritos Rodrigo:" + rodrigo.getConteudosInscritos());
        rodrigo.progredir();
        rodrigo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Rodrigo:" + rodrigo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Rodrigo:" + rodrigo.getConteudosConcluidos());
        System.out.println("XP:" + rodrigo.calcularTotalXp());

        System.out.println("-------");

        //Criando o segundo aluno, setando os valores dos parâmetros e adicionando na graduação
        Aluno adriano = new Aluno();
        adriano.setNome("Adriano");
        adriano.inscreverGraduacao(civil);
        System.out.println("Conteúdos Inscritos Adriano:" + adriano.getConteudosInscritos());
        adriano.progredir();
        adriano.progredir();
        adriano.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Adriano:" + adriano.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Adriano:" + adriano.getConteudosConcluidos());
        System.out.println("XP:" + adriano.calcularTotalXp());

    }

}