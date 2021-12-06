
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
    }
    public int getnumber (){
    return this.posicion10;
    }
    
}
