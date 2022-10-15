package mascotasR;

import java.util.ArrayList;

public class Mascota {

    //Atributos de la clase padre.
    protected String nombre;
    protected String raza;
    protected String color;
    protected int edad;
    

    //Constructor de la clase padre.
    public Mascota() {

    }

    //Constructor sobrecargado.
    public Mascota(String nombre, String raza, String color, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
    }

    //Métodos setters y getters (encapsulamiento).
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Método para agregar mascotas al arraylist
    public static ArrayList<Mascota> mascotas = new ArrayList<>();
    
    
    

    //Método para agregar remover mascotas del arraylist
    public void removerMas() {
        

    }

    //Calcular edad promedio mascotas
    public double calcularEdadProm() {

        return 0.0;
    }

    //Método para imprimir registro de mascotas
    public String imprimirDatos() {
        
        return "";

    }

}
