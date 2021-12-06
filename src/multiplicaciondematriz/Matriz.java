// Nelson A. Cosme Diaz 
// Luis Alejandro Perez

package multiplicaciondematriz;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Matriz {

    
    public static void main(String[] args) {
     int opcion;
    
     int sizec=3;
     int sizef=3;
      int matriz [][]= {{2,3,4},{3,2,4},{4,5,6}};
     int matriz2 [][]={{2,3,4},{3,2,4},{4,5,6}};
     // Aquí se crea el archivo para ser serializado
       //SERIALIZACION
        try {
       String path = "C:\\Users\\aleja\\OneDrive\\Escritorio\\AA pucmm Trabajos\\Cuarto Cuatrimestre\\Programación orientada a objetos\\Multiplicaciondematriz\\matrizA.dat";
         String path2 = "C:\\Users\\aleja\\OneDrive\\Escritorio\\AA pucmm Trabajos\\Cuarto Cuatrimestre\\Programación orientada a objetos\\Multiplicaciondematriz\\matrizB.dat"; 
       ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(path)); 
       obj.writeObject(matriz);   
        ObjectOutputStream obj2 = new ObjectOutputStream(new FileOutputStream(path2)); 
         obj.writeObject(matriz2);
     } catch (Exception e) {
         System.out.println(e.getMessage());
         
     }
     
     
     
     // hilo main
     Multiplicacion multi1 = new Multiplicacion(matriz,matriz2,sizef,sizec);
        multi1.product();
        // hilo numero 1
        Proceso1 process1 = new Proceso1(matriz,matriz2);
        process1.start();
        process1.run();
         process1.stop();
         // hilo numero 2
          Proceso2 process2 = new Proceso2(matriz,matriz2);
        process2.start();
        process2.run(); 
     process2.stop();
        System.out.println("Matriz resultante: ");
        System.err.println(multi1.getPosition00()+" "+multi1.getPosition01()+" "+multi1.getPosition02());
        System.out.println(process1.getPosition10()+" "+process1.getPosition11()+" "+ process1.getPosition12());
        System.out.println(process2.getPosition20()+" "+process2.getPosition21()+" "+process2.getPosition22());
    }
    
    
    
 
    
}
