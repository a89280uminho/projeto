package javaapplication1;

public class recluso {
    private int id_recluso;
    private String nome_recluso;
    private String data_nascimento;
    private String data_entrada;
    private int score_recluso;
    private int active;
    
    public int getId_recluso() {
        return id_recluso;
    }
    
    public void setId_recluso(int id_recluso) {
        this.id_recluso = id_recluso;
    }
    
    public String getNome_recluso() {
        return nome_recluso;
    }
    
    public void setNome_recluso(String nome_recluso) {
        this.nome_recluso = nome_recluso;
    }
    
    public String getData_nascimento(){
        return data_nascimento;
    }
    
    public void setData_nascimento(String data_nascimento){
        this.data_nascimento = data_nascimento;
    }
    
    public String getData_entrada(){
        return data_entrada;
    }
    
    public void setData_entrada(String data_entrada){
        this.data_entrada = data_entrada;
    }
    
    public int getScore_recluso(){
        return score_recluso;
    }
    
    public void setScore_recluso(int score_recluso){
        this.score_recluso = score_recluso;
    }
    
    public int getActive(){
        return active;
    }
    
    public void setActive(int active){
        this.active = active;
    }
}
