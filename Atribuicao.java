/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author user
 */
public class Atribuicao {
    private int idAtribuicao;
    private int idRecluso;
    private int idRecompensa;
    private int ativo;
//Construtores
    public Atribuicao(int id, int idrec, int recompensa) {
        this.idAtribuicao = id;
        this.idRecluso = idrec;
        this.idRecompensa = recompensa;
        this.ativo = 0;
    }
    public Atribuicao(Atribuicao atr) {
        this.idAtribuicao = atr.getIdAtribuicao();
        this.idRecluso = atr.getIdRecluso();
        this.idRecompensa = atr.getIdRecompensa();
        this.ativo = atr.getAtivo();
    }

    /**
     * @return the idAtribuicao
     */
    public int getIdAtribuicao() {
        return idAtribuicao;
    }

    /**
     * @return the idRecluso
     */
    public int getIdRecluso() {
        return idRecluso;
    }

    /**
     * @return the idRecompensa
     */
    public int getIdRecompensa() {
        return idRecompensa;
    }

    /**
     * @return the ativo
     */
    public int getAtivo() {
        return ativo;
    }

    /**
     * @param idAtribuicao the idAtribuicao to set
     */
    public void setIdAtribuicao(int idAtribuicao) {
        this.idAtribuicao = idAtribuicao;
    }

    /**
     * @param idRecluso the idRecluso to set
     */
    public void setIdRecluso(int idRecluso) {
        this.idRecluso = idRecluso;
    }

    /**
     * @param idRecompensa the idRecompensa to set
     */
    public void setIdRecompensa(int idRecompensa) {
        this.idRecompensa = idRecompensa;
    }

    /**
     * @param ativo the ativo to set
     */
    public void setAtivo(int ativo) {
        this.ativo = ativo;
    }
}