// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       int balance = 65; //сумма на счёте
       int pay = 2100; //сумма пополнения счёта
       int bonus; // бонус при пополнении счёта больше тысячи
       if (pay>1000) {
           bonus = (balance + pay) / 100;
       }  else {
           bonus = 0;
       }
       System.out.println(bonus);
    }
}