/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacao;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *
 * @author usrlab25
 */
public class Principal {
    public static void main(String[] args) throws FileNotFoundException {
        Arquivo arquivo = new Arquivo();
        String diretorioArquivo =  arquivo.open();
        ArrayList<Aluno> listaSelecao = new ArrayList<>();
        ArrayList<Aluno> listaBolha = new ArrayList<>();
        ArrayList<Aluno> listaInsercao = new ArrayList<>();
        
        listaSelecao = arquivo.lerArquivoLista(diretorioArquivo);
        listaBolha.addAll(listaSelecao);
        listaInsercao.addAll(listaSelecao);
        
        Ordenacao.exibirListas(listaSelecao, listaBolha, listaInsercao);
        
        Ordenacao.ordenaSelecaoLista(listaSelecao);
        Ordenacao.ordenaInsercaoLista(listaInsercao);
        Ordenacao.ordenaBolhaLista(listaBolha);
        
        Ordenacao.exibirListas(listaSelecao, listaBolha, listaInsercao);
    }
}
