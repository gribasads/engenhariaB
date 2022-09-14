/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teligamagrao;

/**
 *
 * @author ArthurCyrilloGeiger
 */
public class Pessoa {
   
    // atributos
    private String usuario = "teste";
    private String senha = "1234";
    private String nome;
    private Double saldo = 10000.00;
    private String historico = "Valor X - R$ XXXX,XX\nValor X - R$ XXXX,XX\nValor X - R$ XXXX,XX\nValor X - R$ XXXX,XX\nValor X - R$ XXXX,XX\n";

    // getters e setters
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }
}
