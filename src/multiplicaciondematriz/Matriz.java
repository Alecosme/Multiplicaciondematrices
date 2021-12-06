// Nelson A. Cosme Diaz 
// Luis Alejandro Perez

package multiplicaciondematriz;


public class Matriz {

    
    public static void main(String[] args) {
     
     int sizec=3;
     int sizef=3;
      int matriz [][]= {{2,3,4},{3,2,4},{4,5,6}};
     int matriz2 [][]={{2,3,4},{3,2,4},{4,5,6}};
     Multiplicacion multi1 = new Multiplicacion(matriz,matriz2,sizef,sizec);
        multi1.product();
        System.out.println(multi1.getMatriz());
        Proceso1 process1 = new Proceso1(matriz,matriz2);
        process1.start();
        process1.run();
        process1.stop();
        System.out.println(process1.getnumber());
       

    }
    
}
