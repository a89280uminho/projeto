/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;
import java.util.*;
/**
 *
 * @author Pedro Fernandes
 */
public class Atividade {
    private int id_activity;
    private String name_activity;
    private int id_spacefk;
    private int date_activity;
    private int initial_time;
    private int final_time;
    private int score_activity;
    private int active;

    public int getId_activity() {
        return id_activity;
    }

    public void setId_activity(int id_activity) {
        this.id_activity = id_activity;
    }

    public String getName_activity() {
        return name_activity;
    }

    public void setName_activity(String name_activity) {
        this.name_activity = name_activity;
    }

    public int getId_spacefk() {
        return id_spacefk;
    }

    public void setId_spacefk(int id_spacefk) {
        this.id_spacefk = id_spacefk;
    }

    public int getDate_activity() {
        return date_activity;
    }

    public void setDate_activity(int date_activity) {
        this.date_activity = date_activity;
    }

    public int getInitial_time() {
        return initial_time;
    }

    public void setInitial_time(int initial_time) {
        this.initial_time = initial_time;
    }

    public int getFinal_time() {
        return final_time;
    }

    public void setFinal_time(int final_time) {
        this.final_time = final_time;
    }

    public int getScore_activity() {
        return score_activity;
    }

    public void setScore_activity(int score_activity) {
        this.score_activity = score_activity;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }
    
    
}
