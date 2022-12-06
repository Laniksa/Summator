import java.util.Scanner;


class Main {
    public static int counter = 0;// глобальный счетчик
    public static double parseNumeric (String str){//метод для преобразования строки в число double
        double num = 0;

        counter++;
        try{
            num = Double.parseDouble(str);

        }catch(NumberFormatException e){
             System.out.println ("Вы ввели не верное "+counter+"-е число ");
        }
        return num;
    }

    public static double sum (double num1, double num2, double num3){
        return num1+num2+num3;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");

        String line1 = scan.nextLine();
        System.out.print("Введите второе число: ");
        String line2 = scan.nextLine();
        System.out.print("Введите третье число: ");
        String line3 = scan.nextLine();

        double result = sum(parseNumeric(line1), parseNumeric(line2),parseNumeric(line3));

        System.out.printf("Сумма чисел равна: "+"%.1f",result);// "%.1f"- позволяет обрезать цифры после занятой до 1 (1f)
    }
}