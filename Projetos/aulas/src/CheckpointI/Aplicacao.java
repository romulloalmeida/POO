package CheckpointI;

import java.util.LinkedList;
import java.util.List;

public class Aplicacao {

    public static void main(String[] args) {
        // Criando aluno
        Aluno carlos = new Aluno();
        carlos.setCpf("12512598778");
        carlos.setEmail("calos@gmail.com");
        carlos.setNome("Carlos Costa");
        carlos.setSexo("Masculino");
        // Criando Telefone do carlos
        Telefone carlosTel = new Telefone(994845685,11);
        carlos.setTelefone(carlosTel);
        // Criando Endereço do carlos
        Endereco carlosEnd = new Endereco();
        carlosEnd.setNumero(14);
        carlosEnd.setLogradouro("rua das olivas");
        carlosEnd.setBairro("Figueiras");
        carlosEnd.setCep("02154588");
        carlosEnd.setCidade("São Paulo");
        carlosEnd.setEstado("São Paulo");
        carlos.setEndereco(carlosEnd);

        // Criando curso
        Curso ingles = new Curso(OpcaoCurso.INGLES);

        // Criando Professor
        Professor carlinhos = new Professor();
        carlinhos.setValorHora(8.80);
        List<Formacao> carlinhosFormacao = new LinkedList<>();
        carlinhosFormacao.add(Formacao.SUPERIOR);
        carlinhos.setListaFormacao(carlinhosFormacao);
        carlinhos.setCpf("7878788887");
        carlinhos.setEmail("Calinhos@gmail.com");
        carlinhos.setEndereco(carlosEnd);
        carlinhos.setTelefone(carlosTel);
        carlinhos.setNome("Carlos Barbossa");
        carlinhos.setSexo("Masculino");


        // Criando Turma
        Turma turma01IM = new Turma("01",Turno.Manha);
        turma01IM.setCurso(ingles);
        turma01IM.setProfessor(carlinhos);
        List<Aluno> listaAlunos01IM = new LinkedList<>();
        listaAlunos01IM.add(carlos);
    }
}
