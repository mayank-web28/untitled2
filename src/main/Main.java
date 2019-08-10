package main;
import java.util.Scanner;
4
public class Main {
    public static void main (String[]arg){
        Scanner object= new Scanner(System.in);
        int num=object.nextInt();
        for(int i=1; i<=10; ++i){
            System.out.println(num*i);
        }object.close();
    }
}
