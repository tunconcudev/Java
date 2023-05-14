class LessonOne{
    public static void main(String[] args) {


        System.out.println("Hello World!");
        System.out.println("I am learning Java");
        // Primitive data types
        byte number1 = 127;
        short number2 = 32767;
        int number3 = 2147483647;
        long number4 =  9223372036854775807L;
        float number5 = 3.4e+038F; // stores up to 6-7 decimal digits
        double number6 = 1.7e+308; // stores up to 15 decimal digits
        boolean isTrue = false;
        char character = 'T';
        
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);
        System.out.println(number5);
        System.out.println(number6);
        System.out.println(isTrue);
        System.out.println(character);

        // Non-Primitive data types String,array,classes etc.
        String name = "Mac";
        System.out.println(name);
        System.out.println("---------------------------------------------------------------------------------");
        
        // Type casting

        int myInt = 6;
        double myDouble = myInt;
        System.out.println(myDouble);

        double myVar = 6.0;
        int myVar1 = (int) myVar;
        System.out.println(myVar1);

        System.out.println("---------------------------------------------------------------------------------");

        // Swap two variables

        String x = "Hello";
        String y = "World!";
        System.out.println("\nBefore swap \nx:"+x+"\ny: "+y);

        String temp = x;
        x = y;
        y = temp;

        System.out.println("After swap \nx:"+x+"\ny: "+y);


        System.out.println("---------------------------------------------------------------------------------");

        




    }
}