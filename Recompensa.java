/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Date;

/**
 *
 * @author user
 */
public class Recompensa {
    private int idRecompensa;
    private String nomeRecompensa;
    private Date validade;
    private int pontos;
    private int ativo;

    /**
     * @return the idRecompensa
     */
    public int getIdRecompensa() {
        return idRecompensa;
    }

    /**
     * @return the nomeRecompensa
     */
    public String getNomeRecompensa() {
        return nomeRecompensa;
    }

    /**
     * @return the validade
     */
    public Date getValidade() {
        return validade;
    }

    /**
     * @return the pontos
     */
    public int getPontos() {
        return pontos;
    }

    /**
     * @return the ativo
     */
    public int getAtivo() {
        return ativo;
    }

    /**
     * @param idRecompensa the idRecompensa to set
     */
    public void setIdRecompensa(int idRecompensa) {
        this.idRecompensa = idRecompensa;
    }

    /**
     * @param nomeRecompensa the nomeRecompensa to set
     */
    public void setNomeRecompensa(String nomeRecompensa) {
        this.nomeRecompensa = nomeRecompensa;
    }

    /**
     * @param validade the validade to set
     */
    public void setValidade(Date validade) {
        this.validade = validade;
    }

    /**
     * @param pontos the pontos to set
     */
    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    /**
     * @param ativo the ativo to set
     */
    public void setAtivo(int ativo) {
        this.ativo = ativo;
    }
}
