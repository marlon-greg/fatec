/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula07;

/**
 *
 * @author 1050482423018
 */
public class Produto {
    
    public static String empresa; // static indica posse - comum entre todos os objetos
    private int codigo;
    private String nome;
    private double valor;
    private boolean novo;
    private char tipo;

    public Produto(){
        
    }
    //Colocar construtor no diagrama de classes
    //CONSTRUTOR - Mesmo nome da classe, nao existe retorno, inicia maiuscula
    public Produto(int codigo, String nome, double valor, boolean novo, char tipo) {
        setCodigo(codigo);
        setNome(nome);
        setValor(valor);
        setNovo(novo);
        setTipo(tipo);
    }
    
    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", nome=" + nome + ", valor=" + valor + ", novo=" + novo + ", tipo=" + tipo +"empresa="+empresa+ '}';
    }
    
    
    
    //Era ideal utilizar o metodo toString()
    public void status() {
        System.out.println("Código: "+this.getCodigo());
        System.out.println("Nome: "+ this.getNome());
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Valor: "+this.getValor());
        System.out.println("Novo? "+this.isNovo());
    }

    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if(valor>0){
            this.valor = valor;
        }
    }

    public boolean isNovo() {
        return novo;
    }

    public void setNovo(boolean novo) {
        this.novo = novo;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
    
    
}
