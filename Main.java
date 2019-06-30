import java.io.*;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main{
    public static void main(String[]args) throws FileNotFoundException, IOException{
        Scanner teclado = new Scanner(System.in);
        Scanner strings = new Scanner(System.in);
        Lista sLista = new Lista();
        String texto;
        int opcion;

        do{
        System.out.println("\nElija la opcion que desee");
        System.out.println("\n1.- Leer archivo \n2.- Mostrar lista\n3.- Salir");
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
                        person.setEdad(Integer.parseInt(infos[2]));
                        sLista.add(person);
                        //System.out.println(infos.length);
                    }                    
                    break;

                case 2:
                    sLista.listar();
                    break;

            }
        }while(opcion != 3);   
    }
}