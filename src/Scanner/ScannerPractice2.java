package Scanner;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //this is creation of scanner object
        System.out.println("Please enter your name");//If I remove ln after the println, user type same line in
                                                     //"please enter your name" Khaliun etc.
        String name = input.nextLine();
        System.out.println("Your name is "+name);

        System.out.println("Please enter your last name ");
        String lastName = input.nextLine();

        System.out.println("Your full name is "+name+ " " +lastName);

        System.out.println("Please enter your age");
        int age = input.nextInt();

        System.out.println("your age will be "+ (age +10)+ " in 10 years");
        int ageIn5Years = age + 5;
        System.out.println("Your age will be "+ageIn5Years + " in next 5 years");

        System.out.println("Please enter your city name ");

       name += input.nextLine();
        System.out.println(name);//name + city name --> KhaliunChicago



       String number = "1";
       number += "2";//number + "2";
       number += 2; //number + 2;
        System.out.println(number);


        //input.nextLine(); --> This is scanner


    }
}
