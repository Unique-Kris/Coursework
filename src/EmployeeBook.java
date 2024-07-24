public class EmployeeBook {
    private final Employee[] employee;
    private int size;

    public EmployeeBook() {
        this.employee = new Employee[10];
    }

    public void addEmployee(String fullName, int department, int salary) {
        if (size >= employee.length) {
            System.out.println("Нельзя добавить работника, закончилось место");
        }
        Employee newEmployee = new Employee(fullName, department, salary);
        employee[size++] = newEmployee;
    }

    public void printAllEmployee() {
        for (int i = 0; i < size; i++) {
            System.out.println(employee[i].getFullName());
        }
    }

    public void findEmployee(String fullName) {
        for (int i = 0; i < size; i++) {
            if (employee[i].getFullName().equals(fullName)) {
                System.out.println(employee[i].getFullName());
                return;
            }
        }
        System.out.println(fullName + " не найден");
    }

    public void removeEmployee(String fullName) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getFullName().equals(fullName)) {
                System.out.println(employee[i].getFullName() + " удален");
                System.arraycopy(employee, i + 1, employee, i, size - i - 1);
                employee[size - 1] = null;
                size--;
                return;
            }
        }
    }

    public int calculateTotalSalary() {
        int result = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                result = result + employee[i].getSalary();
            }
        }
        System.out.println("Общая сумма затрат: " + result);
        return result;
    }

    public Employee getEmployeeWithMinSalary() {
        Employee minSalary = employee[0];
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() < minSalary.getSalary()) {
                minSalary = employee[i];
            }
        }
        System.out.println("Минимальная Зарплата: " + minSalary);
        return minSalary;
    }

    public Employee getEmployeeWithMaxSalary() {
        Employee maxSalary = employee[0];
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() > maxSalary.getSalary()) {
                maxSalary = employee[i];
            }
        }
        System.out.println("Максимальная Зарплата: " + maxSalary);
        return maxSalary;
    }

    public int calculateMediumSalary() {
        int result = 0;
        int mediumSum = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                result = result + employee[i].getSalary();
                mediumSum = result / employee.length;
            }
        }
        System.out.println("Средняя сумма затрат: " + mediumSum);
        return result;
    }

    public int getSize() {
        return size;
    }
}