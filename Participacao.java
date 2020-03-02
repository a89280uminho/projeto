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
public class Participacao {
    private int idParticipacao;
    private int idRecluso;
    private int idAtividade;
    private int ativo;

    /**
     * @return the idParticipacao
     */
    public int getIdParticipacao() {
        return idParticipacao;
    }

    /**
     * @return the idRecluso
     */
    public int getIdRecluso() {
        return idRecluso;
    }

    /**
     * @return the idAtividade
     */
    public int getIdAtividade() {
        return idAtividade;
    }

    /**
     * @return the ativo
     */
    public int getAtivo() {
        return ativo;
    }

    /**
     * @param idParticipacao the idParticipacao to set
     */
    public void setIdParticipacao(int idParticipacao) {
        this.idParticipacao = idParticipacao;
    }

    /**
     * @param idRecluso the idRecluso to set
     */
    public void setIdRecluso(int idRecluso) {
        this.idRecluso = idRecluso;
    }

    /**
     * @param idAtividade the idAtividade to set
     */
    public void setIdAtividade(int idAtividade) {
        this.idAtividade = idAtividade;
    }

    /**
     * @param ativo the ativo to set
     */
    public void setAtivo(int ativo) {
        this.ativo = ativo;
    }
}
