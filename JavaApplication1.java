package javaapplication1;

public class JavaApplication1 {
    
    private int id_user;
    private String name_user;
    private String email;
    private String password;
    private String address;
    private int phone_number;
    private String role;
    private int active;
    
    public int getId_user() {
        return id_user;
        }
    
    public void setId_user (int id_user) {
        this.id_user = id_user;
    }
    
    public String getName_user() {
        return name_user;
    }
    
    public void setName_user (String name_user) {
        this.name_user = name_user;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail (String email){
        this.email = email;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public int getPhone_number(){
        return phone_number;
    }
    
    public void setPhone_number(int phone_number){
        this.phone_number = phone_number;
    }
    
    public String getRole(){
        return role;
    }
    
    public void setRole(String role){
        this.role = role;
    }
    
    public int getActive(){
        return active;
    }
    
    /**
     *
     * @param active
     */
    public void setActive(int active){
        this.active = active;
    }
}