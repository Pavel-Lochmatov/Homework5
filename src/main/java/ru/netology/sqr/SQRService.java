package ru.netology.sqr;

import static java.lang.Math.sqrt;

public class SQRService {

    public int findCountSqrt(int minborder,int maxborder) {
        int counter = 0;
        for (int i = 0; i <= maxborder; i++) {
            double sqrminborder=sqrt(minborder);
            if (i >=sqrminborder && i * i <= maxborder) {
             counter=counter+1;
            }
        }
        return counter;
    }

}
