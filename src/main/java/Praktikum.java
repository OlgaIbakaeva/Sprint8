import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        /*
             В этом методе заложи логику работы с классом Account.
             Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
         */
        System.out.println("Введите имя и фамилию через пробел, от 3 до 19 символов: ");;
        Scanner console = new Scanner(System.in); // Ввод System.in позволяет вводить только по одному символу. Поэтому создаем объект класса Scanner
        String name = console.nextLine(); // Читаем с клавиатуры строку текста.
        Account account = new Account(name);
        if (account.checkNameToEmboss()) {
            System.out.println(name + " можно напечатать на банковской карте.");
        } else {
            System.out.println(name + " нельзя напечатать на банковской карте.");
        }
    }
}
