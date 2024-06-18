//import com.demoqa.entities.Employee;
//import org.testng.annotations.Test;
//
//import java.util.Arrays;
//import java.util.List;
//
//public class WebTablesTest extends BaseTest {
//
//    @Test(description = "Test adding employees and checking for duplicate emails")
//    public void testAddEmployeesAndCheckDuplicates() {
//        driver.get("https://demoqa.com/webtables");
//
//        // Создаем и добавляем двух сотрудников
//        Employee employee1 = randomUtils.createMockEmployee();
//        Employee employee2 = randomUtils.createMockEmployee();
//
//        webTables.addNewEmployee(employee1);
//        webTables.addNewEmployee(employee2);
//
//        // Получаем список сотрудников из таблицы
//        List<Employee> employees = webTables.getEmployeesFromTable();
//
//        // Проверяем наличие сотрудников в таблице
//        for (Employee employee : employees) {
//            System.out.println(employee);
//        }
//
//        // Создаем список email для проверки на дубликаты
//        List<String> emails = Arrays.asList(employee1.getEmail(), employee2.getEmail(), employee1.getEmail());
//
//        // Проверяем и обрабатываем дубликаты email
//        webTables.checkAndHandleDuplicates(emails);
//
//        // Применяем метод очистки для удаления тестовых данных
//        webTables.clear();
//    }
//}
