package poo.data;

/**
 * La clase Book representa un libro con un título, un género y una edad recomendada.
 * Esta clase incluye métodos para obtener y establecer estos valores, así como validaciones
 * para asegurarse de que los valores sean correctos.
 */

public class Book {
    
    private String titulo;
    private String genero;
    private int edad;
    private int id;

    /**
     * Constructor de la clase Book. Crea una nueva instancia de un libro con un título, género y edad.
     * 
     * @param titulo Es la variable del título del libro.
     * @param genero Es la variable del género del libro.
     * @param edad La edad recomendada para el libro.
     * @throws IllegalArgumentException Si el título contiene números o está vacío,
     *                                  si el género está vacío o nulo, o si la edad es menor o igual a 0.
     */

    public Book(String titulo, String genero, int edad, int id){
        setTitulo(titulo);
        setGenero(genero);
        setEdad(edad);
        setID(id);
    }

    /**
     * Obtiene el título del libro.
     * @return El título del libro.
     */

    public String getTitulo(){
        return titulo;
    }

    /**
     * Obtiene el género del libro.
     * @return El género del libro.
     */

    public String getGenero(){
        return genero;
    }

    /**
     * Obtiene la edad recomendada para el libro.
     * @return La edad recomendada para el libro.
     */

    public int getEdad(){
        return edad;
    }
    /**
     * Obtiene el ID del libro.
     * @return El ID del libro.
     */

    public int getID(){
        return id;
    }

    /**
     * Establece el título del libro. Valida que el título no contenga números
     * y que no esté vacío ni sea nulo.
     * @param titulo El título del libro.
     * @throws IllegalArgumentException Si el título contiene números o está vacío.
     */

    public void setTitulo(String titulo){
        if(titulo.matches(".*\\d.*") && titulo == null || titulo.trim().isEmpty()){
            throw new IllegalArgumentException("El titulo no puede contener números ni estar vacio.");
        }else {
            this.titulo = titulo;
        }
    }

    /**
     * Establece el género del libro. Valida que el género no esté vacío ni sea nulo.
     * @param genero El género del libro.
     * @throws IllegalArgumentException Si el género está vacío o es nulo.
     */

    public void setGenero(String genero){
        if(genero == null || genero.isEmpty()){
            throw new IllegalArgumentException("El campo no puede estar en blanco.");
        }else{
            this.genero = genero;
        }
    }
    
    /**
     * Establece la edad recomendada para el libro. Valida que la edad sea mayor a 0.
     * @param edad La edad recomendada para el libro.
     * @throws IllegalArgumentException Si la edad es menor o igual a 0.
     */

    public void setEdad(int edad){
        if(edad <= 0){
            throw new IllegalArgumentException("La edad debe ser mayor a 0.");
        }else{
            this.edad = edad;
        }
    }

    public void setID(int id){
        int sizeId = String.valueOf(id).length();
        if(sizeId < 4 || sizeId > 4){
            throw new IllegalArgumentException("El ID debe tener exactamente 4 digitos.");
        }else{
            this.id = id;
        }
    }
}
