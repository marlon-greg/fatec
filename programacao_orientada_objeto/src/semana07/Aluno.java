/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula07;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author 1050482423018
 */
public class Aluno implements Serializable{
//    public static String instituicao;
    public String ra, nome;
    public int idade;
    
    public static String gravar(Aluno a){
        String retorno = "Objeto armazenado com sucesso";
        try{
            FileOutputStream fos = new FileOutputStream("aluno.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(a);
            oos.flush();
            oos.close();
        }
        catch(IOException e){
            retorno = "Falha ao gravar o objeto";
        }
        return retorno;
    }
    
//    public Aluno ler(){
//        
//    }
}
