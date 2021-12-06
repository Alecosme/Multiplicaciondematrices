
package multiplicaciondematriz;


public class Proceso2 extends Thread {
       private int posicion20, posicion21, posicion22;
     private int matrizA [][];
    private int matrizB [][];

    public Proceso2( int[][] matrizA, int[][] matrizB) {
        this.matrizB= matrizB;
        this.matrizA = matrizA;
    }
    
    @Override
    public void run(){
        for (int i = 0; i < 3; i++) {
            this.posicion20 += (this.matrizA[2][i])*(this.matrizB[i][0]);
            
        }
        
        for (int i = 0; i < 3; i++) {
            this.posicion21 += (this.matrizA[2][i])*(this.matrizB[i][1]);
            
        }
        for (int i = 0; i < 3; i++) {
            this.posicion22 += (this.matrizA[2][i])*(this.matrizB[i][2]);
            
        }
        
    }
    public int getPosition20 (){
    return this.posicion20;
    }
    
    public int getPosition21 (){
    
    return this.posicion21;
    }
    
    public int getPosition22(){
    return this.posicion22;
    }
}
