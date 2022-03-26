package Tasks;
import java.util.Scanner;
public class Class {
    public static void Task36() {
        /**
         * Задание №36
         * Даны натуральное число n.
         * Вычислить P = (1 - 1/(2^2))+(1 - 1/(3^2)) + ... (1 - 1/(n^2));
         */

        System.out.println("Task#36");
        System.out.println("Введите значение n");
        int n = new Scanner(System.in).nextInt();
        if (n < 2) {
            System.out.println("Error: n < 2"); //Проверка на условие;
        } else {
            double P = 0;
            for (int i = 2; i <= n; i++) {
               P += (1 - 1 / (Math.pow(i, 2)));
            }
            System.out.println("P = " + P); //Вывод ответа;
        }
    }


    public static void Task61() {
        /**Составить программу возведения натурального числа в квадрат, учитывая следующую закономерность:
         * a. 1^2 = 1
         * b. 2^2 = 1 + 3
         * c. 3^2 = 1 + 3 + 5
         * d. 4^2 = 1 + 3 + 5 + 7
         * e. …
         * f. n^2 = l + 3 + 5 + 7 + 9 + ... + 2n – 1
         */
        System.out.println("Tesk#61");
        System.out.println("Введите значение n");
        int n = new Scanner(System.in).nextInt();
        int s = 0;     //Переменная для ответа;
        // Вместо System.out.println(Math.pow(n, 2)) использую метод указаный в условии;
          for (int i = 1; i <= n; i++ ){
            s = s + (2 * i - 1);
          }
        System.out.println(n + "^2 = " + s);  //Вывод ответа;
    }


    public static void Task86() {
        /**
         * Известно сопротивление каждого из элементов электрической цепи.
         * Определить общее сопротивление цепи, если:
         * a) Все элементы соединены последовательно;
         * b) Все элементы соединены параллельно.
         */
        System.out.println("Tesk#86");
        System.out.println("1 - последовательно;\n2 - параллельно;");
        int n = new Scanner(System.in).nextInt(); //Выбор варианта расчета сопротивления;

          if(n == 1){ // последовательное;
              int R1, R2;
              System.out.println("Все элементы соединины последовательно.");
              System.out.println("Введите R1");
              R1 = new Scanner(System.in).nextInt();
              System.out.println("Введите R2");
              R2 = new Scanner(System.in).nextInt();
              System.out.println("Ответ: " + (R1 + R2)); //расчет по формуле;
          }
          if(n == 2){ //параллельное;
              System.out.println("Все элементы соединены параллельно.");
              int R1, R2;
              System.out.println("Введите R1");
              R1 = new Scanner(System.in).nextInt();
              System.out.println("Введите R2");
              R2 = new Scanner(System.in).nextInt();
              System.out.println("Ответ: " + (R1 * R2)/(R1 + R2)); //расчет по формуле;
          }

    }


    public static void Task111() {
        /** Составить программу-генератор простых чисел, в основу положить формулу
         * 2x^2 + 29 при 0 <= x <= 28.
         */
        System.out.println("Task#111");
        System.out.println("Enter X: "); //Ввод Х;
        int x = new Scanner(System.in).nextInt();
        if (x >= 0 || x<=28){

            for (int i=0; i<=x; ++i)
                System.out.println( 2 * Math.pow(i, 2) + 29);

        //вывод простых чисел по формуле;
        }
        else{  //в случае, если X не по условию;
            System.out.println("Invalid value of x!");
        }
    }


    public static void Task137() {
        /** Найдите все трёхзначные натуральные числа,
         * равные сумме кубов своих цифр.
         */
        System.out.println("Task#137");
        int x1, x2, x3;
        for (int x = 1; x < 1000; x++){ //прохожу по всем трёхзначным;
            x1 = x % 10;          //нахожу первое число;
            x2 = (x / 100) % 10;  //нахожу второе число;
            x3 = (x / 1000) % 10; //нахожу третье число;
            if((Math.pow(x1, 3) + Math.pow(x2, 3) + Math.pow(x3, 3)) == x){ //проверка;
                System.out.println("You number: " + x); //если подходим, то вывожу;
            }
        }
    }
    public static void main(String[] args) {
       Task36();
       Task61();
       Task86();
       Task111();
       Task137();
    }
}
