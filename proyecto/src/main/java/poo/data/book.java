package poo.data;

public class Book {
    private String titulo;
    private String genero;
    private int edad;

    public Book(String titulo, String genero, int edad){
        setTitulo(titulo);
        setGenero(genero);
        setEdad(edad);
    }

    public String getTitulo(){return titulo;}
    public String getGenero(){return genero;}
    public int getEdad(){return edad;}

    public void setTitulo(String titulo){
        if(titulo.matches(".*\\d.*") && titulo == null || titulo.trim().isEmpty()){
            throw new IllegalArgumentException("El titulo no puede contener números ni estar vacio.");
        }else {
            this.titulo = titulo;
        }
    }

    public void setGenero(String genero){
        if(genero == null || titulo.isEmpty()){
            throw new IllegalArgumentException("El campo no puede estar en blanco.");
        }else{
            this.genero = genero;
        }
    }
    
    public void setEdad(int edad){
        if(edad == 0){
            throw new IllegalArgumentException("La edad debe ser mayor a 0.");
        }else{
            this.edad = edad;
        }
    }
}
