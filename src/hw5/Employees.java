package hw5;

public class Employees {
    String name;
    String position;
    String email;
    String phone_number;
    int salary;
    int age;

    public Employees(String name, String position, String email, String phone_number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone_number = phone_number;
        this.salary = salary;
        this.age = age;

    }

    public boolean printInfo() {
        System.out.println("Имя пользователя: " + name + "; Должность: " + position + "; Возраст: " + age + "; Электронная почта: " + email + "; Номер телефона: " + phone_number);
        return false;
    }

    public static void main(String[] args) {

        Employees[] employees = new Employees[5];
        employees[0] = new Employees("Иванов Иван", "Босс Всея Руси", "glavboss@mail.ru", "+74666565655", 250000, 50);
        employees[1] = new Employees("Петров Петр", "Зам босса", "zamglavboss@mail.ru", "+7554546666", 180000, 45);
        employees[2] = new Employees("Сидоров Сидр", "Зам зама босса", "zamzamglavboss@mail.ru", "+795855555", 150000, 40);
        employees[3] = new Employees("Добрынин Добрыня", "Младший босс", "junboss@mail.ru", "+7989898988", 80000, 35);
        employees[4] = new Employees("Владимирова Влада", "Личная уборщица Главного босса", "megaboss@mail.ru", "+7777777777", 4000000, 20);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].age > 40) {
                System.out.println(employees[i].printInfo());
                System.out.println();

            }
        }
    }
}


