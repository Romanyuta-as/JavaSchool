package HomeWork.HomeWork17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by 1 on 07.09.2016.
 */
public class Example2 {
    public static void main(String[] args) {
        int [][] mass = new int[20][30];
        //List<Integer> mass = new ArrayList();
        int diagSumm=0;
        int max;
        max=0;
        for(int i =0;i<20;i++){
            for (int j = 0;j<30;j++){
                mass[i][j] = ((int) (Math.random()/1.18));
            }

        }

        for(int i =0;i<20;i++){
            for (int j = 0;j<30;j++){
                if(i==j){
                    diagSumm = diagSumm+mass[i][j];
                }
                if(mass[i][j]>max){
                    max=mass[i][j];
                }
            }

        }


    }

    static class Matrix{
        private Integer[][] mass;
        private int sizeI,sizeY;

        public Matrix(int sizeI, int sizeY) {
            this.sizeI = sizeI;
            this.sizeY = sizeY;
            mass = new Integer[sizeI][sizeY];
        }

        public void init(){
            for(int i =0;i<20;i++){
                for (int j = 0;j<30;j++){
                    mass[i][j] = ((int) (Math.random()/1.18));
                }

            }
        }

        public int getSizeI() {
            return sizeI;
        }

        public int getSizeY() {
            return sizeY;
        }

        public int prinDiag(){
            int summa=0;
            for(int i =0;i<getSizeI();i++) {
                for (int j = 0; j < getSizeY(); j++) {
                    if (i == j) {
                        summa = summa + mass[i][j];
                    }
                }
            }
            return summa;
        }

        public int maximum()
        {
            int max=0;
            for(int i =0;i<getSizeI();i++){
                for (int j = 0;j<getSizeY();j++){
                    if(mass[i][j]>max){
                        max=mass[i][j];
                    }
                }

            }
            return max;
        }
    }
}
