/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Administrador
 */
public class cidade {
    
    private int codigo;
    private String nome;

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }
    
    @Override
    public String toString() {
        return nome;
    }
    
    
    
}
