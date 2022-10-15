package mascotasR;

public class Felinos extends Mascota{
    
    //Atributos de la clase    
    protected String libreToxo;
    
    
    //Constructor de la clase hija
    public Felinos (){
        
    }
    
    //Constructor sobrecargado, hereda atributos clase padre (Mascota).
    public Felinos(String libreToxo, String nombre, String raza, String color, int edad) {
        super(nombre, raza, color, edad);
        this.libreToxo = libreToxo;
    }
    
    //Método para calcular total felinos
    public Felinos calcularTotalFelin(){
        
        return null;
    }
    
    //Métodos setters y getters (encapsulamiento)
    public String getLibreToxo() {
        return libreToxo;
    }

    public void setLibreToxo(String libreToxo) {
        this.libreToxo = libreToxo;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
