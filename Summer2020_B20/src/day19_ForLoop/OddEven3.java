package day19_ForLoop;
    /*
1. write a program that can print all the ODD numbers between 0 ~ 100 that can be divisible by 3 & 5
2. write a program that can print all the EVEN numbers between 0 ~ 100 that can be divisible by 3 & 5
 */


public class OddEven3 {
    public static void main(String[] args) {
        //    Task01:
        // i: 1 3 5 7 9 11 13 15 17 19 21 .... 99

        for(int i=1;i<=100;i+=2){
            if(i%5==0 && i%3==0){
                System.out.print(i+" ");
            }


        }
        System.out.println();
        System.out.println("===================");

        //Task02:

        //i:  0 2 4 6 8 10  ... 100
        for(int i=0;i<=100;i+=2){
            if(i%5==0 && i%3==0){
                System.out.print(i+" ");
            }
        }


    }

}
