public class Methods {
public static void main (String[] args) {
    task1();
    task2();
    task3();
}
    private static void printLeapYear(int year) {
}public static void task1(){
        System.out.println( "задача 1 ");

    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
        System.out.println(year + "год является високосным");
    } else {
        System.out.println(year + "год является не високосным");

    }}public static void task2(){
private static void printVersion(int os,int year) {
    int currentYear = LocalDate.now().getYear();
    if (currentYear == year && os == 1) {
        System.out.println("Установите обычную версию для Android");
    } else if ( currentYear > year && os == 1) {
        System.out.println("Установите облегченную версию для Android");
    } else if ( currentYear == year && os == 0) {
        System.out.println("Установите обычную версию для IOS");
    } else {
        System.out.println("Установите облегченную версию для IOS");

    }}}}public static void task3(){
    public static void knowTheDistance (int howMuchDeliveryDaysNeed){
        knowTheDistance(122);
    }var  result = howMuchDeliveryDaysNeed ;{
            if (result == -1) {
                System.out.println("Доставки нет");
            }else {
                System.out.println("Доставка займет"+result);
            }
        }}}

