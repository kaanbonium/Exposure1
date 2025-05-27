package Introduction;

public class VariableIntro {

    public static void main(String[] args) {
        /**
        /* To Create a variable:
         * datatype name = value;
         */
        double salary = 10000.56;
        int bonus = 250;


        /*
        * Casting a vairbale means changing its datatype
        * * to change a primitive data  type, pu  the new type in ()
        *
         */
        bonus = (int)salary;

        System.out.println(salary);
        System.out.println(bonus);
    }



}