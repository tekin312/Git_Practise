package day09_IfStatement;

public class Alcohol {
    public static void main(String[] args) {
        /* 4. write a java program that can identify
        if a person is eligible to buy alcohol
         */
        boolean hasID=true;
        int age=19;
        boolean eligible=hasID && age>=21;
                       // true && false ====> false
        String result="";
        if(eligible==true){

            //System.out.println("Eligible to buy alcohol");

         result="Eligible to buy alcohol";

        }
        if (eligible==false){

           // System.out.println("Go buy milk");
            result="You are not old enough to buy alcohol";

        }
        System.out.println(result);

        }

}
