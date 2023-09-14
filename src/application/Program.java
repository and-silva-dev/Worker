package application;

import entities.Worker;
import java.util.Scanner;
import entities.enums.WorkerLevel;
import entities.Department;
import entities.HourContract;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {

    public static void main(String[] args) throws ParseException {
        Scanner teclado = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter departmen's name: ");
        String departmenteName = teclado.nextLine();

        System.out.println("Enter worker data: ");

        System.out.print("Name: ");
        String workerName = teclado.nextLine();

        System.out.print("Level|: ");
        String workerLevel = teclado.nextLine();

        System.out.print("Base salary: ");
        double baseSalary = teclado.nextDouble();

        //Worker worker = new Worker(workerName, workerLevel.valueOf(workLevel), baseSalary, departmenteName);
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmenteName));

        System.out.println("How many contracts to this worker?");
        int n = teclado.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter contract #" + i + "data: ");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(teclado.next());
            System.out.println("Value per hour: ");
            double valuePerHour = teclado.nextDouble();
            System.out.println("Duration (hours): ");
            int hours = teclado.nextInt();
            HourContract contract = new HourContract(valuePerHour, hours, contractDate);
            worker.addContract(contract);
        }
        System.out.println();
        System.out.print("Enter month and year to calculate income(MM//YYYY): ");
        String monthAndYear = teclado.next();
          int month = Integer.parseInt(monthAndYear.substring(0,2));
          int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: "+worker.getDepartment().getName());
        System.out.println("Income for "+ monthAndYear + ": "+ String.format("%.2f" ,worker.income(year, month)));
        teclado.close();
    }

}
