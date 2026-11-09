
public class Estudiante extends Persona {
    private final String carrera;
    public Estudiante (String nombre, String carrera){
       super (nombre);
        this.carrera = carrera;
    }

    /**
     *
     */
    @Override
    public void mostrarDatos(){System.out.println("Estudiante: " + nombre +"Carrera: " + carrera); }
    
    
}
