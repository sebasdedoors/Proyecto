package poo.data;

public class User {
    private String name; 
    private String status;

    public User(String name, String status){
        setName(name);
        setStatus(status);
    }

    public String getName(){return name;}
    public String getStatus(){return status;}

    public void setName(String name){
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("El espacio no debe de estar vacio.");
        }else{
            this.name = name;
        }
    }

    public void setStatus(String status){
        if(status == null || status.isEmpty()){
            throw new IllegalArgumentException("No puede quedarse vacio este espacio.");
        }else{
            this.status = status;
        }
    }

}
