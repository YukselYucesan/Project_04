package task02;

import java.util.Scanner;

public class PasswordControl {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.print("Password = ");
        String password= read.nextLine();
        if (Character(password)){
            System.out.println("Strong Password ✅");
        }else System.out.println("Insufficient Password ❌");
    }
    public static boolean Character(String s){
        if (s.length()>8 && s.replaceAll("[^A-Z]","").length()>0
                && s.replaceAll("[^a-z]","").length()>0
                && s.replaceAll("[^0-9]","").length()>0
                && s.replaceAll("[^! @ # $ % ^ & * ( ) _ + \\- = { } \\[ \\] ; : ' , < . > / ?]","").length()>0) {
        return true;}
        else return false;
    }
}