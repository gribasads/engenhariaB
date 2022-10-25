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
<<<<<<< HEAD
    private String usuario;
    private String idUsuario;
    private String senha;
    private String nome;
    private Double saldo;
    private Double limite;
    private String historico;
    private int id;    
=======
    private String usuario = "teste";
    private String senha = "1234";
    private String nome;
    private Double saldo = 10000.00;
    private String historico = "Valor X - R$ XXXX,XX\nValor X - R$ XXXX,XX\nValor X - R$ XXXX,XX\nValor X - R$ XXXX,XX\nValor X - R$ XXXX,XX\n";
>>>>>>> 5cd5844c850e4628a66e2d6ab1c92430a0c095c1

    // getters e setters
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
<<<<<<< HEAD
    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }
    
=======
>>>>>>> 5cd5844c850e4628a66e2d6ab1c92430a0c095c1
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
<<<<<<< HEAD
    
    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
=======
>>>>>>> 5cd5844c850e4628a66e2d6ab1c92430a0c095c1
}
