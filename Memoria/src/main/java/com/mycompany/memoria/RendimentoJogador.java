/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.memoria;

/**
 *
 * @author Thiago
 */
public class RendimentoJogador {
    
    
    
    public String redimentoTotal(int contadorJogadas, int contadorJogadasAcertadas){
        double doubleRendimentoPorcentagem =0;
        String strRendimentoPorcentagem =null;
        
        
        doubleRendimentoPorcentagem =(double) contadorJogadasAcertadas / contadorJogadas *100;
        strRendimentoPorcentagem = String.format("%.2f", doubleRendimentoPorcentagem);
        
        //System.out.println("Total Jogadas " +contadorJogadas +" Total Jogadas Acertadas  " +contadorJogadasAcertadas);
        //System.out.println("Redimento" +longRendimentoPorcentagem);

        if(doubleRendimentoPorcentagem >= 90){
            return "Seu rendimento no jogo foi Excelente " + strRendimentoPorcentagem+ " %";
        
        }else if(doubleRendimentoPorcentagem < 90 && doubleRendimentoPorcentagem >= 75){
             return "Seu rendimento no jogo foi Bom " + strRendimentoPorcentagem + " %";
        
        }else if(doubleRendimentoPorcentagem < 75 && doubleRendimentoPorcentagem >= 40){
             return "Seu rendimento no jogo foi Regular " + strRendimentoPorcentagem + " %";
        
        }else if(doubleRendimentoPorcentagem < 40 && doubleRendimentoPorcentagem >= 0){
             return "Tente outra vez, Seu rendimento no jogo foi abaixo do esperado " + strRendimentoPorcentagem + " %";
        }
        
        return null;
   }
    
    
    public String vencedorJogo(int pontosJogador, int pontosComputador){
        
        if(pontosJogador == pontosComputador){
            return "Empate!!!";
        
        }else if(pontosJogador > pontosComputador){
            return "Parábens, você venceu o Jogo!!!";
        
        }else if(pontosJogador < pontosComputador){
            return "Você perdeu o Jogo, Tente novamente!!!";  
        }
        return null;
    }
}
