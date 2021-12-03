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
        System.out.println(matriz.length);
        System.out.println(multi1.getMatriz());
        
//        System.out.println("size:"+matriz.length);
//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz.length; j++) {
//                
//                System.out.print(matriz[i][j]);
//                
//            }
//            System.out.println("");
//        }
//        
//        System.out.println("");
//        System.out.println("size:"+matriz2.length);
//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz.length; j++) {
//                
//                System.out.print(matriz2[i][j]);
//                
//            }
//            System.out.println("");
//        }
    }
    
}
