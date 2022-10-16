import java.util.Scanner;
public class Example1722 {
    public static void main(String[] argv) {
        int hours;
        int minutes;
        int seconds;

        System.out.println("Enter a hour:");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        hours = inputValue.nextInt();
        //////////////////////////
        System.out.println("Enter a minutes:");
        Scanner minut;
        minut = new Scanner(System.in);
        minutes = minut.nextInt();
        /////////////////////////
        System.out.println("Enter a seconds:");
        Scanner second;
        second = new Scanner(System.in);
        seconds = second.nextInt();
///////////////////////////////////////////////////////////
        // comentario de prueba
        seconds = seconds + 1;
        if (seconds > 59) {
            seconds = 0;
            minutes = minutes + 1;
        }
        if (minutes > 59) {
            minutes = 0;
            hours = hours + 1;

        }
        System.out.print("The current time is: "+hours+" ");
        System.out.print("The current time is: "+minutes+" ");
        System.out.println("The current time is: "+seconds+" ");


    }
}
