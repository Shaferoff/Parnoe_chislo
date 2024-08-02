import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader=new Scanner (System.in);
        int num;
        num = reader.nextInt();
        if (num%2==0) {
            System.out.println(num);
        }
        else {
            num=num+1;
            System.out.println(num);
        }
        System.out.println("Задача завершена.");


    }
}