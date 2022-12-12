import java.util.Scanner;


class Main {

        public static double sum ( double num1, double num2, double num3){
            return num1 + num2 + num3;
        }
        public static void main (String[]args){
            double num1;
            double num2;
            double num3;

            Scanner scan = new Scanner(System.in);

            while (true) {
                System.out.print("Введите первое число: ");
                String line1 = scan.nextLine();
                try {
                    num1 = Double.parseDouble(line1);
                    break;

                } catch (NumberFormatException e) {
                    System.out.println("Вы ввели не верное 1-е число ");
                }
            }



            while (true) {
                System.out.print("Введите второе число: ");
                String line2 = scan.nextLine();

                try {
                    num2 = Double.parseDouble(line2);
                    break;

                } catch (NumberFormatException e) {
                    System.out.println("Вы ввели не верное 2-е число ");
                }
            }


            while (true) {
                System.out.print("Введите третье число: ");
                String line3 = scan.nextLine();

                try {
                    num3 = Double.parseDouble(line3);
                    break;

                } catch (NumberFormatException e) {
                    System.out.println("Вы ввели не верное 3-е число ");
                }
            }


            double result = sum(num1, num2, num3);

            System.out.printf("Сумма чисел равна: " + "%.1f", result);// "%.1f"- позволяет обрезать цифры после занятой до 1 (1f)
        }
    }
