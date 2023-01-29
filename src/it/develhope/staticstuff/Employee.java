package it.develhope.staticstuff;

public class Employee
{
    String name;
    String surname;
    String address;

    Employee(String newEmployeeName, String newEmployeeSurname, String newEmployeeAddress)
    {
        this.name = newEmployeeName;
        this.surname = newEmployeeSurname;
        this.address = newEmployeeAddress;
    }

    String getEmployeeDetails()
    {
        return "Name: " + name + "\nSurname: " + surname + "\nAddress: " + address;
    }
}
