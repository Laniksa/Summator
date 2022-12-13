import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Main {

    public static int count = 1;
    public static double sum = 0;
    public static double sumList(List <Double> list){
        for (double d:list) {
            sum+=d;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner slag = new Scanner(System.in);
        int kol;
        while(true){
            System.out.println("Введите количество слагаемых ");
            String str = slag.nextLine();

            try {
                 kol = Integer.parseInt(str);
                 break;

            } catch(NumberFormatException e){
                System.out.println("Вы ввели не верное число ");
            }
        }

        List<Double> list = new ArrayList<>();

        for (int i = 0; i < kol; i++) {

            Scanner scan = new Scanner(System.in);
            while (true) {
                double num;
                System.out.print("Введите " + count + "-e число: ");
                String line = scan.nextLine();
                try {
                    num = Double.parseDouble(line);
                    count++;
                    list.add(num);
                    System.out.println(list);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Вы ввели не верное " + count + "-e число ");
                }
            }
        }
        System.out.println("Сумма чисел равна: "+String.format("%.1f", sumList(list)));
    }
}
