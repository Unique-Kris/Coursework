public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.addEmployee("Иванов Иван Иванович", 1, 20000);
        employeeBook.addEmployee("Иванов Иван Олегович", 2, 25000);
        employeeBook.addEmployee("Федоров Иван Иванович", 1, 23000);
        employeeBook.addEmployee("Федоров Олег Иванович", 3, 27000);
        employeeBook.addEmployee("Сидоров Иван Олегович", 1, 30000);
        employeeBook.addEmployee("Сидоров Олег Иванович", 3, 24000);
        employeeBook.addEmployee("Петренко Иван Константинович", 2, 26000);
        employeeBook.addEmployee("Петренко Иван Олегович", 2, 31000);
        employeeBook.addEmployee("Поляков Роман Валерьевич", 3, 19000);
        employeeBook.addEmployee("Поляков Геннадий Иванович", 2, 32000);

        employeeBook.printAllEmployee();
        employeeBook.calculateTotalSalary();
        employeeBook.getEmployeeWithMinSalary();
        employeeBook.getEmployeeWithMaxSalary();
        employeeBook.calculateMediumSalary();
        System.out.println();

        employeeBook.findEmployee("Сидоров Иван Олегович");
        employeeBook.removeEmployee("Сидоров Иван Олегович");
        employeeBook.findEmployee("Сидоров Иван Олегович");
        employeeBook.printAllEmployee();
   }
}
