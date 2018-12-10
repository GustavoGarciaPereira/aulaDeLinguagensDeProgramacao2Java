/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacao;

/**
 *
 * @author usrlab25
 */
public class Aluno {
    public int matricula;
    public String nome;

    public Aluno(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    Aluno(int matricula) {
        this.matricula = matricula;
    }
}
