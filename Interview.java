//Design a program to find out employee object from employee array having 2nd maximum salary,
class Interview{
    static class Employee{
        int id;
        String name;
        double salary;

        Employee(int i,String n,double s){
            id = i;
            name = n;
            salary = s;
        }
    }
    public static void main(String[] args) {
        Employee[] emp = {
            new Employee(101, "Amit", 50000),
            new Employee(102, "Ravi", 70000),
            new Employee(103, "Sujit", 60000),
            new Employee(104, "Neha", 90000),
            new Employee(105, "Priya", 80000)
        };
        Employee max = null;
        Employee secondMax = null;

        for(int i = 0;i<emp.length;i++){
            Employee e = emp[i];
             if (max == null || e.salary > max.salary) {
        secondMax = max;
        max = e;
    } 
    else if (secondMax == null || e.salary > secondMax.salary) {
        secondMax = e;
    }

        }
        if (secondMax != null) {
            System.out.println("Employee with 2nd Highest Salary:");
            System.out.println("ID: " + secondMax.id);
            System.out.println("Name: " + secondMax.name);
            System.out.println("Salary: " + secondMax.salary);
        } else {
            System.out.println("2nd maximum salary not found");
        }
    }
}