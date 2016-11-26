package matrix;

/**
 * Created by roman on 23.11.16.
 */
public class Matrix {
    int n;//число строк
    int m;//число столбцов
    double arr[][];

    Matrix(){
        n=1;
        m=1;
        arr[n][m]=0;
    }

    Matrix(int N){
        for(int i=0;i<N;i++){
        for(int j=0;i<N;j++){
            arr[i][j]=0;
        }
        }
    }

    public String toString() {
        String s = null;
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; i < this.m; j++) {
                s = (s + arr[i][j] + " ");
            }
            s = (s + "/n");
        }
        return s;
    }
}