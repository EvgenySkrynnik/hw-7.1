import java.time.LocalDate;

public class Methods {
    public static void main(String[] args) {
    }

    //Реализуйте метод, который получает в качестве параметра год,
    // проверяет, является ли он високосным, и выводит результат в консоль.
    //Результат программы выведите в консоль. Если год  високосный, то напечатайте сообщение:
    // «...  год — високосный год». Если год невисокосный, то: «... год — невисокосный год».
    public static void printLeapYear(int year) {
        printLeapYear(year);
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год — високосный год ");
        } else {
            System.out.println(year + " год —не високосный год ");
        }
    }

    //Напишите метод, куда подаются два параметра:
    // тип операционной системы (0 — iOS, 1 — Android ) и год выпуска устройства.
    //Если устройство старше текущего года, предложите ему установить облегченную версию.
    //Текущий год можно получить таким способом:
    //int currentYear = LocalDate.now().getYear();
    //Или самим задать значение вручную — ввести в переменную числовое значение.
    //В результате программа должна выводить в консоль сообщение,
    // какую версию приложения (обычную или облегченную) и для какой ОС (Android или iOS)
    // установить пользователю.
    public static void printVersion(int os, int year) {
        printVersion(1, 0);
        int currentYear = LocalDate.now().getYear();
        if (currentYear == year && os == 1) {
            System.out.println("установите обычную версию для Android");
        } else if (currentYear > year && os == 1) {
            System.out.println("установите облегченая версию для Android");
        } else if (currentYear == year && os == 0) {
            System.out.println("установите обычную версию для iOS");
        } else {
            System.out.println("установите облегченая версию для iOS");
        }
    }


    //Ваша задача — доработать код, а именно написать метод,
    // который на вход принимает дистанцию и возвращает итоговое количество дней доставки.


    public static int howMuchDeliveryDaysNeed(int knowTheDistance ) {
        int howMuchDeliveryDaysNeed = 0;
        if (knowTheDistance <= 20) {
            howMuchDeliveryDaysNeed = 1;
        } else if (knowTheDistance > 20 && knowTheDistance <= 60) {
            howMuchDeliveryDaysNeed++;
        } else if (knowTheDistance > 60 && knowTheDistance <= 100) {
            howMuchDeliveryDaysNeed++;
        } else if (knowTheDistance > 100) {
            return -1;
        }
        return howMuchDeliveryDaysNeed;

    }
}

