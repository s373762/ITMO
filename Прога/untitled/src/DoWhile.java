import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args){
        Scanner сканнер = new Scanner(System.in);
        System.out.println("Введите 5");
        int myInt = сканнер.nextInt();
        while(myInt!=5){
            System.out.println("Далбаёб 5 говорю. Ты чё тупой ?");
            myInt = сканнер.nextInt();
        }
        System.out.println("Вы ввели 5");
    }
}
