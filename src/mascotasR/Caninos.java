package mascotasR;


public class Caninos extends Mascota {

    //Atributos de la clase
    protected String nivelEntrena;

    //Constructor de la clase
    public Caninos() {

    }
    //Constructor sobrecargado, hereda atributos clase padre (Mascota)
    public Caninos(String nivelEntrena, String nombre, String raza, String color, int edad) {
        super(nombre, raza, color, edad);
        this.nivelEntrena = nivelEntrena;
    }
    
    //Método para calcular total de caninos
     public Felinos calcularTotalCanin(){
        
        return null;
    }
    
    //Métodos setters y getters (encapsulamiento)
    public String getNivelEntrena() {
        return nivelEntrena;
    }

    public void setNivelEntrena(String nivelEntrena) {
        this.nivelEntrena = nivelEntrena;
    }
     
     
    
    
}
