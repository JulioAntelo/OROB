import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner milector = new Scanner(System.in);
        String i="*";
        int x=0;
        int y;
        int repeticiones=0;
        System.out.println("dime un valor para hacerle la piramide");
        y = milector.nextInt();
        while (x!=y){
            x++;
            while (repeticiones<x){
                repeticiones++;
            }
        }
    }
}