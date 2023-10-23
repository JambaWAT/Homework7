// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        {
            int total = 0;
            int salary = 15000;

            int currentMonth = 1;
            while (total <= 2459000) {
                total = total + salary;
                currentMonth++;
            }

            System.out.println("Месяц " + currentMonth + " сумма накоплений равна:" + total + " рублей");
        }
        System.out.println("Задача 2");
        {
            int i = 0;
            while (i < 10) {
                i++;
                System.out.print(i + " ");
            }
            System.out.println();

            for (int j = 10; j >= 1; j--) {
                System.out.print(j + " ");
            }

        }
        System.out.println("Задача 3");
        {
            int year = 0;
            int birthRate = 17;
            int mortality = 8;
            mortality = mortality * 12000;
            birthRate = birthRate * 12000;
            int people = 12000000;
            while (year < 10) {
                year++;
                people = people + birthRate;
                people = people - mortality;
                System.out.println("Год " + year + " численность населения составляет: " + people);

            }
        }
        System.out.println("Задача 4");
        {
            int amountPurpose = 12_000_000;
            int depositAmount = 15000;
            double monthlyPercent = 0.07;
            int month = 1;

            while (depositAmount < amountPurpose) {
                depositAmount += depositAmount * monthlyPercent;
                System.out.printf("Месяц %d, сумма накоплений: %d%n", month, depositAmount);
                month++;
            }
        }
        System.out.println("Задача 5");
        {
            int amountPurpose = 12_000_000;
            int depositAmount = 15000;
            double monthlyPercent = 0.07;
            int month = 1;

            while (depositAmount < amountPurpose) {
                depositAmount += depositAmount * monthlyPercent;
                month++;
                if (month % 6 == 0) {
                    System.out.printf("Месяц %d, сумма накоплений: %d%n", month, depositAmount);
                }
            }
        }
        System.out.println("Задача 6");
        {
            int depositAmount = 15000;
            double monthlyPercent = 0.07;
            int month = 1;
            while (month <= 108) {
                depositAmount += depositAmount * monthlyPercent;
                month++;
                if (month % 6 == 0) {
                    System.out.printf("Месяц %d, сумма накоплений: %d%n", month, depositAmount);
                }
            }
        }
        System.out.println("Задача 7");
        {
            int day = 1;
            System.out.println ("Сегодня пятница, " + day +"-е число. Необходимо подготовить отчет");
            while (day <= 31) {
                day = day + 7;
                 System.out.println("Сегодня пятница, " + day +"-е число. Необходимо подготовить отчет");

            }
        }
        System.out.println("Задача 8");
        {
            int year = 0;
            while (year < 2054) {year= year + 79;if (year % 79 == 0) {
            System.out.println("Комета прибудет в " + year + " году");}
                }

        }
    }
}

