// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // cycle skypro part 2
        //task 1
        int investing = 0;
        int salary = 29_000;
        int month = 0;
        while (investing <= 2_459_000) {
            month++;
            investing = (investing + salary) + investing/100;
            System.out.println("Месяц " +month+ ", сумма накоплений равна " +investing+ " рублей");
        }

        //task 2
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println("");
        for (; i >= 1; i--){
            System.out.print(i + " ");
        }
        System.out.println("");
        // task 3
        int totalPeople = 12_000_000, deadInYear = 8, bornInYear = 17, year = 0;
        while (year < 10) {
            year++;
            totalPeople =totalPeople +(((totalPeople/1000)*17) - ((totalPeople/1000) * 8));
            System.out.println("Год "+year+", численность населения составляет "+ totalPeople);
        }
        // task 4-5
        int savingsAccount = 15_000;
        int monthSpent = 0;
        do {
            monthSpent++;
            savingsAccount = savingsAccount + (savingsAccount/100*7);
            if (monthSpent % 6 == 0 && monthSpent !=0) {
                System.out.println("Прошло " + monthSpent + " накопленно: "+ savingsAccount);
            }

        }
        while (savingsAccount <= 12_000_000);

        //task 6
        int yearSpent = 9;
        monthSpent = 0;
        int monthSpentForSaving = yearSpent * 12;
        int savingsAccount1 = 15_000;
        while (monthSpentForSaving > monthSpent) {
            monthSpent++;
            savingsAccount1 = savingsAccount1 + (savingsAccount1/100*7);
            if(monthSpent % 6 == 0) {
                System.out.println("Прошло " + monthSpent + " накопленно: " + savingsAccount1);
            }
        }

        //task 7
        int dayInMonth = 31;
        int firstFriday =4;
        for (; firstFriday <= dayInMonth; firstFriday += 7) {
            System.out.println("Сегодня пятница, "+firstFriday+"-е число. Необходимо подготовить отчет.");
        }

        //task 8
        int currentYear = 2023;
        int pastYear = currentYear - 200;
        int futureYear = currentYear + 100;

        for (int year1 = 0; year1 <= futureYear; year1 += 79) {
            boolean shouldPrint = year1 >= pastYear && year1 <= futureYear ? true : false;
            if(shouldPrint) {
                System.out.println(year1);
            }
        }
    }
}