/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author crisl
 */
public class Arquivo {
    public String open() throws FileNotFoundException {
        JButton Open = new JButton();
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new java.io.File("E:\\PesquisaOrdenacao"));
         
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Documento de Texto", "txt", "text");
        file.setFileFilter(filter);
        file.addChoosableFileFilter(filter);
        
        file.setDialogTitle("Abrir");
        file.setFileSelectionMode(JFileChooser.FILES_ONLY);
        if (file.showOpenDialog(Open) == JFileChooser.APPROVE_OPTION){
            System.out.println("Você selecionou: "+file.getSelectedFile().getAbsolutePath());
            return ""+(file.getSelectedFile().getAbsolutePath());
        }
        else{
            return null;
        } 
    }
    
    public int[] lerArquivoVetor(String diretorioArquivo, int quantidade) {
         // tamanho do vetor
        int vetor[] = new int[quantidade];
        int i = 0;
        
        File file = new File(diretorioArquivo);
        try {
            FileReader reader = new FileReader(file);
            BufferedReader input = new BufferedReader(reader);
            String linha;
            
            while ((linha = input.readLine()) != null) {
                vetor[i] = Integer.parseInt(linha);
                i++;
            }
            input.close();
        } catch (IOException e){
            System.out.println("Erro: "+e);
            System.exit(0);
        }
        
        return vetor;
    }

    public int lerTamanhoArquivo(String diretorioArquivo) {
        int quantidade = 0;
        File file = new File(diretorioArquivo);
        try {
            FileReader reader = new FileReader(file);
            BufferedReader input = new BufferedReader(reader);
            String linha;
            
            while ((linha = input.readLine()) != null) {
                quantidade++;
            }
            input.close();
        } catch (IOException e){
            System.out.println("Erro: "+e);
            System.exit(0);
        }
        
        return quantidade;    
    }

    public ArrayList lerArquivoLista(String diretorioArquivo) {
        ArrayList<Aluno> lista = new ArrayList<>();
        int i = 0;
        
        File file = new File(diretorioArquivo);
        try {
            FileReader reader = new FileReader(file);
            BufferedReader input = new BufferedReader(reader);
            String linha;
            String vetor[];
            while ((linha = input.readLine()) != null) {
                vetor = linha.split(" ");
                lista.add(new Aluno(Integer.parseInt(vetor[0]), vetor[1]));
            }
            input.close();
        } catch (IOException e){
            System.out.println("Erro: "+e);
            System.exit(0);
        }
        
        return lista;    
    }
   

}
