package com.mycompany.memoria;


import java.io.File;
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thiago
 */
public class ListaArquivos {
    
    
    
    
    
    public  ArrayList<String> listagemArquivo(String caminho){
       
        try{
            File diretorio = new File(caminho);
            File fileList[] = diretorio.listFiles();
        
            ArrayList<String> arquivosListado = new ArrayList<String>();  



            for ( int i = 0; i < fileList.length; i++ ){
                arquivosListado.add(fileList[i].getAbsolutePath());
                //System.out.println(arquivosListado.get(i));
            }
            
        return arquivosListado;
        
        }catch(Exception ex){
            return null;
        }
        
    }
    
}
