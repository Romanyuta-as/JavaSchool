package HomeWork.HomeWork6;

/**
 * Created by 1 on 14.09.2016.
 */
 public class MyCalc implements ICalc{

     @Override
     public double sum(double x, double y) {
         return x+y;
     }

     @Override
     public double div(double x, double y) {
         return x / y;
     }

     @Override
     public double extent(double x, double y) {
         return Math.pow(x,y);
     }
 }
