package MODULE1;

//Java program to demonstrates the
//working of switch statements
import java.io.*;

class switch_case {
public static void main(String[] args)
{
    int num = 20;
    switch (num) {
    case 5:
        System.out.println("It is 5");
        break;
    case 10:
        System.out.println("It is 10");
        break;
    case 15:
        System.out.println("It is 15");
        break;
    case 20:
        System.out.println("It is 20");
        break;
    default:
        System.out.println("Not present");
       }
  }
}

//If the break keyword is omitted, execution will continue to the next case.