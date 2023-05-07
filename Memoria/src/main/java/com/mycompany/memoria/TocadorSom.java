/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.memoria;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author Thiago
 */
public class TocadorSom {
    
        String  path;


    public void tocaSom(String strCaractere){
   
       
             try{
                Clip clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(new File(strCaractere)));
                clip.start();
             
             }catch (Exception exc){
                exc.printStackTrace(System.out);
             }
             
   
    }
}
