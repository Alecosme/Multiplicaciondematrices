
package multiplicaciondematriz;

public class Proceso1 extends Thread  {
     private int posicion10, posicion11, posicion12;
     private int matrizA [][];
    private int matrizB [][];

    public Proceso1( int[][] matrizA, int[][] matrizB) {
        this.matrizB= matrizB;
        this.matrizA = matrizA;
    }
    
    @Override
    public void run(){
        for (int i = 0; i < 3; i++) {
            this.posicion10 += (this.matrizA[1][i])*(this.matrizB[i][0]);
            
        }
        
        for (int i = 0; i < 3; i++) {
            this.posicion11 += (this.matrizA[1][i])*(this.matrizB[i][1]);
            
        }
        for (int i = 0; i < 3; i++) {
            this.posicion12 += (this.matrizA[1][i])*(this.matrizB[i][2]);
            
        }
        
    }
    public int getPosition10 (){
    return this.posicion10;
    }
    
    public int getPosition11 (){
    
    return this.posicion11;
    }
    
    public int getPosition12(){
    return this.posicion12;
    }
    
}
