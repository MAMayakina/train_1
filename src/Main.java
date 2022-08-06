import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//Задание 1
        /*     Scanner in = new Scanner(System.in);
        System.out.print("Введите OS клиента (0, если android и 1, если ios): ");
        if (in.hasNextInt()) {
            int clientOS = in.nextInt();
            System.out.println("Спасибо! Вы ввели число " + clientOS);
            if(clientOS==0){
                System.out.println("Установите версию приложения для Android по ссылке");
            } else System.out.println("Установите версию приложения для IOS по ссылке");
        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        }*/
        //Задание 2


        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите OS клиента (0, если android и 1, если ios)");
        int clientOS = in.nextInt();
        if (clientOS ==0) {System.out.println("Спасибо, вы ввели:" + clientOS + " " + "у клиента android");}
        else System.out.println("Спасибо, вы ввели:" + clientOS + " " + "у клиента IOS");


        Scanner im = new Scanner(System.in);
        System.out.println("Введите год производства устройства:");
        int clientDeviceYear = in.nextInt();
        System.out.println("Спасибо, вы ввели:" + clientDeviceYear);

        if (clientOS == 0 & clientDeviceYear>=2015){System.out.println("Установите версию приложения для Android по ссылке");}
        else if (clientOS == 0 & clientDeviceYear<2015){System.out.println("Установите облегченную версию приложения для Android по ссылке");}
        else if (clientOS == 1 & clientDeviceYear<2015){System.out.println("Установите облегченную версию приложения для IOS по ссылке");}
        else if (clientOS == 1 & clientDeviceYear>=2015){System.out.println("Установите  версию приложения для IOS по ссылке");}
        */
//Задание 3

        /* Scanner in = new Scanner(System.in);
        System.out.print("Введите год:");
        int year = in.nextInt();

        if ((year % 4 == 0) && year % 100 != 0) {
            System.out.println(year + " " + "год является високосным");
        }
        else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)){
            System.out.println(year + " " + "год является високосным");
        } else
            System.out.println(year + " " + "год не является високосным");
    }*/
//Задание 4
        /*Scanner in = new Scanner(System.in);
        System.out.print("Введите расстояние,км:");
        int deliveryDistance = in.nextInt();
        int d=0;//days
        int h=1;//шаг
        if(deliveryDistance<=20){
            d=d+h;
            System.out.println("Потребует дней:"+ d);

        }else if(deliveryDistance>20 & deliveryDistance<=60){
            d=d+2*h;
            System.out.println("Потребует дней:"+ d);
        }
        else if(deliveryDistance>60 & deliveryDistance<=100){
            d=d+3*h;
            System.out.println("Потребует дней:"+ d);
        }
        else if(deliveryDistance>100){
            d=d+4*h;
            System.out.println("Потребует дней:"+ d);
        }*/
//Задание 5
        Scanner in = new Scanner(System.in);
        System.out.print("Номер месяца: ");
        int monthNumber = in.nextInt();
        if (monthNumber>0 & monthNumber<=12) {
            switch(monthNumber){
                case 1:System.out.println("Зима,бр"); break;
                case 2:System.out.println("Зима,бр"); break;
                case 3:System.out.println("Весна,хнык");break;
                case 4:System.out.println("Весна,хнык");break;
                case 5:System.out.println("Весна,хнык");break;
                case 6:System.out.println("Лето,ммм");break;
                case 7:System.out.println("Лето,ммм");break;
                case 8:System.out.println("Лето,ммм");break;
                case 9:System.out.println("Осень,фр");break;
                case 10:System.out.println("Осень,фр");break;
                case 11:System.out.println("Осень,фр");break;
                case 12:System.out.println("Зима,бр");break;
            }

            } else System.out.println("Извините, но это явно не число или вы ввели число, больше 12. Перезапустите программу и попробуйте снова!");

    }
}