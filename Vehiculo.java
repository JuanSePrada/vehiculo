package Vehiculo;
// Clase padre
public class Vehiculo {

    // Atributos
    protected String marca;
    protected int velocidad;

    // Constructor vacío
    public Vehiculo() {
    }

    // Constructor con parámetros
    public Vehiculo(String marca, int velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Velocidad: " + velocidad + " km/h");
    }

    // Método para acelerar
    public void acelerar(int incremento) {
        velocidad += incremento;
        System.out.println("El vehículo aceleró a " + velocidad + " km/h");
    }

    public void encender() {    
        System.out.println("El vehículo está encendido");
    }

    // Metodo para apagar
    public void apagar() {
        System.out.println("El vehículo  se encuentra" + velocidad + " 0 km/h");
    }


    // Metodo reparar

    public void reparar() {
        System.out.println("El vehículo está encendido");
    }

}