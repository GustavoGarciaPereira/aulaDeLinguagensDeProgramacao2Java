/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacao;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author usrlab25
 */
public class Ordenacao {
    public static int qtdComparacoes;
    public static int qtdTrocas;
  
    
    public static void ordenaSelecaoLista(ArrayList<Aluno> l) {
        int i, j, posMenor;
        Aluno tmp; 

	qtdComparacoes = 0;
	qtdTrocas = 0;
        
        long startTime = System.nanoTime();
	for (i = 0; i < l.size() - 1; i++) {
		posMenor = i;
		for (j = i+1; j < l.size(); j++) {
			qtdComparacoes++;
			if (l.get(j).matricula < l.get(posMenor).matricula) posMenor = j;
		}
		if (i != posMenor) {
			tmp = l.get(i);
                        l.set(i, l.get(posMenor));
			l.set(posMenor, tmp);
			qtdTrocas++;
		}
	}
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        
        System.out.println("");
        System.out.println("Selecao\nQuantidade Comparacoes: "+qtdComparacoes+"\nQuantidade Trocas: "+qtdTrocas);
        System.out.println("Tempo: "+TimeUnit.NANOSECONDS.toSeconds(totalTime)+" segundos"); 
    }

    public static void ordenaBolhaLista(ArrayList<Aluno> l) {
        int i;
        boolean houveTroca;
        Aluno tmp;
	qtdComparacoes = 0;
	qtdTrocas = 0;

        long startTime = System.nanoTime();
	do {
		houveTroca = false; //marca que nao houveTroca
		for (i = 0; i < l.size() - 1; i++) {
			qtdComparacoes++;
                        
                    if (l.get(i).matricula > l.get(i+1).matricula) {
                        tmp = l.get(i);
                        l.set(i, l.get(i+1));
                        l.set(i + 1, tmp);
                        houveTroca = true;
			qtdTrocas++;
                    }
		}
	} while (houveTroca);
	long endTime = System.nanoTime();
        long totalTime = endTime - startTime;

        System.out.println("");
	System.out.println("Bolha\nQuantidade Comparacoes: "+qtdComparacoes+"\nQuantidade Trocas: "+qtdTrocas);
        System.out.println("Tempo: "+TimeUnit.NANOSECONDS.toSeconds(totalTime)+" segundos");      
    }

    public static void ordenaInsercaoLista(ArrayList<Aluno> l) {
        int i, j;
        Aluno tmp; 

	qtdComparacoes = 1;
	qtdTrocas = 0;
        
        long startTime = System.nanoTime();
	for (i = 1; i < l.size(); i++) {
		tmp = l.get(i);
		qtdComparacoes++;

		for (j = i-1; j >= 0 && tmp.matricula < l.get(j).matricula; j--) {
                        l.set(j+1, l.get(j));
			qtdComparacoes++;
			qtdTrocas++;
		}
		l.set(j+1, tmp);
		qtdTrocas++;
	}
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
         
        System.out.println("");
	System.out.println("Insercao\nQuantidade Comparacoes: "+qtdComparacoes+"\nQuantidade Trocas: "+qtdTrocas);
        System.out.println("Tempo: "+TimeUnit.NANOSECONDS.toSeconds(totalTime)+" segundos");
    }  

    public static void exibirListas(ArrayList<Aluno> listaSelecao, ArrayList<Aluno> listaBolha, ArrayList<Aluno> listaInsercao) {
        int i;
        System.out.println("\nSelecao,\t Bolha,\t Insercao");
        for (i = 0; i < listaSelecao.size(); i++) {
            System.out.println(listaSelecao.get(i).matricula+" - "+listaSelecao.get(i).nome+"\t"+listaBolha.get(i).matricula+" - "+listaBolha.get(i).nome+"\t"+listaInsercao.get(i).matricula+" - "+listaInsercao.get(i).nome);
        } 
    }
}
