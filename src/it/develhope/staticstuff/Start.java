package it.develhope.staticstuff;

public class Start
{
    public static void main(String[] args)
    {
        Employee emp1 = new Employee("Mario", "Rossi", "via roma 1");
        Employee emp2 = new Employee("Giuseppe", "Verdi", "via roma 2");

        Badge bdg1 = new Badge(emp1);
        Badge bdg2 = new Badge(emp2);

        System.out.println("Badge 1 details:");
        bdg1.showBadgeDetails();
        System.out.println("\nBadge 2 details:");
        bdg2.showBadgeDetails();

    }

}
