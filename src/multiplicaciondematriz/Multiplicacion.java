
package multiplicaciondematriz;


public class Multiplicacion {
    private int matrizA [][];
    private int matrizB [][];
    private int sizeF;
    private int sizeC;
    private int matrizresult[][]=new int [3][3];

    public Multiplicacion(int[][] matrizA, int[][] matrizB, int sizeF, int sizeC) {
        this.matrizA = matrizA;
        this.matrizB = matrizB;
        this.sizeF = sizeF;
        this.sizeC = sizeC;
    }
    public int  getMatriz(){
    
    return matrizA[0][2];
    }
    public void product(){
        
    }
    
    
}
