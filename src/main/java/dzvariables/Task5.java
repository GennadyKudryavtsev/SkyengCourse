package dzvariables;

public class Task5 {
    public static void main(String[] args) {
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;

        System.out.println("Masha");
        int sumMasha = masha * 12;
        System.out.println("Сумма за год до повышения " + sumMasha);

        int salaryIncreaseMasha = masha * 10/100 + masha;
        System.out.println("Месячная зарплата после повышения " + salaryIncreaseMasha);
        System.out.println("Сумма за год после повыщения " + salaryIncreaseMasha * 12);
        System.out.println(" ");

        System.out.println("Denis");
        int sumDenis = denis * 12;
        System.out.println("Сумма за год до повышения " + sumDenis);

        int salaryIncreaseDenis = denis * 10/100 + denis;
        System.out.println("Месячная зарплата после повышения " + salaryIncreaseDenis);
        System.out.println("Сумма за год после повыщения " + salaryIncreaseDenis * 12);
        System.out.println(" ");

        System.out.println("Kristina");
        int sumKristina = kristina * 12;
        System.out.println("Сумма за год до повышения " + sumKristina);

        int salaryIncreaseKristina = kristina * 10/100 + kristina;
        System.out.println("Месячная зарплата после повышения " + salaryIncreaseKristina);
        System.out.println("Сумма за год после повыщения " + salaryIncreaseKristina * 12);

    }
}
