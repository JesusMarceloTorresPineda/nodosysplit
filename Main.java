import java.io.*;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.time.Year;

public class Main{
    public static void main(String[]args) throws FileNotFoundException, IOException{
        Scanner teclado = new Scanner(System.in);
        Scanner strings = new Scanner(System.in);
        Lista sLista = new Lista();
        String texto;
        int opcion;

        do{
        System.out.println("\nElija la opcion que desee");
        System.out.println("\n1.- Leer archivo \n2.- Mostrar lista\n3.- Buscar por matricula\n4.- Total de alumnos Inscritos \n5.-Salir");
        opcion = teclado.nextInt();
            switch(opcion){
                case 1:
                    FileReader archivo = new FileReader("Prueba.txt");
                    BufferedReader container = new BufferedReader(archivo);
                    while((texto = container.readLine()) != null){
                        Persona person = new Persona();
                        String[] infos = texto.split(" ");
                        person.setMatricula(infos[0]);
                        person.setNombre(infos[1]);
                        person.setFechaNacimiento(Integer.parseInt(infos[2]));
                        sLista.add(person);
                        //System.out.println(infos.length);
                    }                    
                    break;

                case 2:
                    sLista.listar();
                    break;
                case 3:
                    System.out.println("Ingrese la matricula");
                    String buscar = strings.next();
                    Persona alumno = sLista.findById(buscar);
                    if(alumno!=null){
                        System.out.println(alumno.getNombre() + " " + alumno.getFechaNacimiento() + " " + alumno.getEdad());
                    }else{
                        System.out.println("No se encontro el alumno");
                    }
                    break;
                case 4:
                    System.out.println("hay " + sLista.getTamanio() + " alumnos inscritos");
                    break;
                default:
                    System.out.println("Vuelve a intentarlo");
            }
        }while(opcion != 5);   
    }
}