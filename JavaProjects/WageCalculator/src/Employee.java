public class Employee {
    String name;
    double salary;
    double workHours;
    int hireYear;

    public Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        double tax = 0;
        if (this.salary > 1000) {
            tax = (this.salary * 3) / 100;
        }
        return tax;

    }

    public double bonus() {
        double bonus = 0;
        if (this.workHours > 40) {
            bonus = (this.workHours - 40) * 30;
        }
        return bonus;

    }

    public double raiseSalary() {
        double raise = 0;
        if (2021 - this.hireYear < 10) {
            raise = (this.salary * 5) / 100;
        } else if (2021 - this.hireYear > 9 && 2021 - this.hireYear < 20) {
            raise = (this.salary * 10) / 100;
        } else if (2021 - this.hireYear > 20) {
            raise = (this.salary * 15) / 100;
        }
        return raise;
    }

    public double totalSalary() {
        return this.salary + bonus() + raiseSalary() - tax();
    }

    public double salaryWithoutTotal() {
        return this.salary + bonus() - tax();
    }

    public void toPrint() {
        System.out.println("Adı: " + this.name + "\n" +
                "Maaşı: " + this.salary + "\n" +
                "Çalışma Saati: " + this.workHours + "\n" +
                "Başlangıç Yılı: " + this.hireYear + "\n" +
                "Vergi: " + tax() + "\n" +
                "Bonus: " + bonus() + "\n" +
                "Maaş Artışı: " + raiseSalary() + "\n" +
                "Vergi ve Bonuslar ile birlikte maaş: " + salaryWithoutTotal() + "\n" +
                "Toplam Maaş: " + totalSalary());
    }

}
