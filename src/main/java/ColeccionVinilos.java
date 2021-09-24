import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class ColeccionVinilos {
    public static void main(String[] args) {
        printmenu();
        creararchivo();
    }

    public static void creararchivo(){
        try{
        String ruta = "coleccion.txt";
        String contenido = "Contenido de ejemplo, hola";
        File file = new File(ruta);
        // Si el archivo no existe es creado
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(contenido);
        bw.close();
    } catch(
    Exception e)

    {
        e.printStackTrace();
    }

}
    static int lineasTotales;
    static int totalCoincidencias;
    public static void buscarPalabra(File archivo, System palabra)

    public static void printmenu() {
        System.out.println("espacio maximo coleccion: "+vinilos.lenght);
        System.out.println("hay un total de: "+vinilos);

        System.out.println("hay un total de: "+(vinilos.length-vinilos)+" de espacio disponible");




    }

}
