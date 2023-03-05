public class Main {
    public static void main(String[] args) {

        int cost = 156; //стоимость билета
        int oneMile = 20; //количество рублей для одной мили

        int bonus = cost / oneMile;

        System.out.println("Начислено " + bonus + " бонусных миль");
    }
}