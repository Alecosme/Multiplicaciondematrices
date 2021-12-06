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
        System.out.println(multi1.getPosition00());
         System.out.println(multi1.getPosition01());
          System.out.println(multi1.getPosition02());
        Proceso1 process1 = new Proceso1(matriz,matriz2);
        process1.start();
        process1.run();
      
        System.out.println(process1.getPosition10());
        System.out.println(process1.getPosition11());
         System.out.println(process1.getPosition11());
         process1.stop();
         
          Proceso2 process2 = new Proceso2(matriz,matriz2);
        process2.start();
        process2.run();
      
        System.out.println(process2.getPosition20());
        System.out.println(process2.getPosition21());
         System.out.println(process2.getPosition22());
     process2.stop();
        System.out.println("Matriz resultante: ");
        System.err.println(multi1.getPosition00()+" "+multi1.getPosition01()+" "+multi1.getPosition02());
        System.out.println(process1.getPosition10()+" "+process1.getPosition11()+" "+ process1.getPosition12());
        System.out.println(process2.getPosition20()+" "+process2.getPosition21()+" "+process2.getPosition22());
    }
    
}
