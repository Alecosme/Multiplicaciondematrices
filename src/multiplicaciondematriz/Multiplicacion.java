
package multiplicaciondematriz;


public class Multiplicacion {
    private int matrizA [][];
    private int matrizB [][];
    private int sizeF;
    private int sizeC;
    private int matrizresult[][]=new int [3][3];
    private int posicion00, posicion01, posicion02;
    private int posicion10, posicion11, posicion12;
    private int posicion20, posicion21, posicion22;

    public Multiplicacion(int[][] matrizA, int[][] matrizB, int sizeF, int sizeC) {
        this.matrizA = matrizA;
        this.matrizB = matrizB;
        this.sizeF = sizeF;
        this.sizeC = sizeC;
    }
   
    public void product(){
        for (int i = 0; i < 3; i++) {
            
                int temporal =0;
                this.posicion00 += (this.matrizA[0][i])*(this.matrizB[i][0]);  
        }
          for (int i = 0; i < 3; i++) {
            
                int temporal =0;
                this.posicion01 += (this.matrizA[0][i])*(this.matrizB[i][1]);  
        }
            for (int i = 0; i < 3; i++) {
            
                int temporal =0;
                this.posicion02 += (this.matrizA[0][i])*(this.matrizB[i][2]);  
        }
        
 
    }
     public int   getPosition00(){
    
    return this.posicion00;
    }
     
     public int   getPosition01(){
    
    return this.posicion01;
    }
     
     public int   getPosition02(){
    
    return this.posicion02;
    }
    
    
}
