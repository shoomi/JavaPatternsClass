package structural.composite;

// Дає змогу згрупувати декілька об'єктів у деревоподібну структуру, а потім працювати з нею так, ніби це одиничний об'єкт.
// Створюємо клас, в якому будуть зберігатись на дочірні обєкти за умови, що всі будуть унаслідуватись від одного інтерфейсу, що дасть змогу додавати в основний клас
// різні дочерні класи
public class Main {
    public static void main(String[] args) {
        Department salesDepartment = new SalesDepartment(1, "Sales department");
        Department financialDepartment = new FinancialDepartment(
                2, "Financial department");

        HeadDepartment headDepartment = new HeadDepartment(
                3, "Head department");

        headDepartment.addDepartment(salesDepartment);
        headDepartment.addDepartment(financialDepartment);

        headDepartment.printDepartmentName();
    }
}
