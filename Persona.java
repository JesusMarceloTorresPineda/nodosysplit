import java.time.Year;
public class Persona{
    public String nombre;
    public String matricula;
    public int edad = 0;
    public int fechaNacimiento;

    public Persona(){

    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setFechaNacimiento(int fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
        calculoEdad(fechaNacimiento);
    }

    public String getNombre(){
        return nombre;
    }
    public String getMatricula(){
        return matricula;
    }
    public int getEdad(){
        return edad;
    }
    public int getFechaNacimiento(){
        return fechaNacimiento;
    }

    private void calculoEdad(int anio){
        this.edad = Year.now().getValue() - anio;
    }    
}