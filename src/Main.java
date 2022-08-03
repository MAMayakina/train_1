import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.print("Введите OS клиента (0, если android и 1, если ios): ");
        if (in.hasNextInt()) {
            int clientOS = in.nextInt();
            System.out.println("Спасибо! Вы ввели число " + clientOS);
            if(clientOS==0){
                System.out.println("Установите версию приложения для Android по ссылке");
            } else System.out.println("Установите версию приложения для IOS по ссылке");
        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        }

    }
}