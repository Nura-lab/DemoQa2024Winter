//package com.demoqa.pages;
//
//import com.demoqa.entities.Employee;
//import com.demoqa.drivers.DriverManager;
//import com.demoqa.helper.WebElementActions;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Optional;
//import java.util.Set;
//
//public class WebTables extends BasePage {
//
//    private WebElementActions webElementActions;
//
//    @FindBy(id = "addNewRecordButton")
//    public WebElement addNewBtn;
//
//    @FindBy(id = "firstName")
//    public WebElement firstNameInput;
//
//    @FindBy(id = "lastName")
//    public WebElement lastNameInput;
//
//    @FindBy(id = "age")
//    public WebElement ageInput;
//
//    @FindBy(id = "userEmail")
//    public WebElement emailInput;
//
//    @FindBy(id = "salary")
//    public WebElement salaryInput;
//
//    @FindBy(id = "department")
//    public WebElement departmentInput;
//
//    @FindBy(id = "submit")
//    public WebElement submitBtn;
//
//    @FindBy(id = "edit-record-1")
//    public WebElement editBtn;
//
//    @FindBy(id = "delete-record-1")
//    public WebElement deleteBtn;
//
//    @FindBy(css = ".rt-tbody .rt-tr-group")
//    private List<WebElement> tableRows;
//
//    public WebTables() {
//        webElementActions = new WebElementActions();
//        PageFactory.initElements(DriverManager.getDriver(), this);
//    }
//
//    public WebTables addNewEmployee(Employee employee) {
//        webElementActions.click(addNewBtn)
//                .sendKeys(firstNameInput, employee.getFirstName())
//                .sendKeys(lastNameInput, employee.getLastName())
//                .sendKeys(ageInput, String.valueOf(employee.getAge()))
//                .sendKeys(emailInput, employee.getEmail())
//                .sendKeys(salaryInput, String.valueOf(employee.getSalary()))
//                .sendKeys(departmentInput, employee.getDepartment())
//                .click(submitBtn);
//        return this;
//    }
//
//    public ArrayList<Employee> getEmployeesFromTable() {
//        ArrayList<Employee> employees = new ArrayList<>();
//        for (WebElement row : tableRows) {
//            List<WebElement> cells = row.findElements(By.cssSelector(".rt-td"));
//            String firstName = cells.get(0).getText();
//            String lastName = cells.get(1).getText();
//            String ageText = cells.get(2).getText().replaceAll("[^0-9]", "");
//            String email = cells.get(3).getText();
//            String salaryText = cells.get(4).getText().replaceAll("[^0-9]", "");
//            String department = cells.get(5).getText();
//
//            if (firstName.isEmpty() || lastName.isEmpty() || ageText.isEmpty() ||
//                    email.isEmpty() || salaryText.isEmpty() || department.isEmpty()) {
//                continue;
//            }
//            int age = Integer.parseInt(ageText.trim());
//            int salary = Integer.parseInt(salaryText.trim());
//
//            employees.add(new Employee(firstName, lastName, age, email, salary, department));
//        }
//        return employees;
//    }
//
//    public WebTables deleteEmployee(Employee employee) {
//        webElementActions.click(editBtn);
//        emailInput.clear();
//        webElementActions.sendKeys(emailInput, employee.getEmail())
//                .click(submitBtn);
//        return this;
//    }
//
//    public WebTables clear() {
//        webElementActions.click(deleteBtn);
//        return this;
//    }
//
//    public List<String> checkAndHandleDuplicates(List<String> emails) {
//        Optional<Exception> optionalException = hasDuplicates(emails) ?
//                Optional.of(new Exception("Duplicate emails found in the list.")) : Optional.empty();
//
//        optionalException.ifPresentOrElse(
//                e -> System.err.println("Please change your email list to remove duplicates."),
//                () -> System.out.println("No duplicate emails found.")
//        );
//
//        return emails;
//    }
//
//    private boolean hasDuplicates(List<String> emails) {
//        Set<String> emailSet = new HashSet<>(emails);
//        return emailSet.size() < emails.size();
//    }
//}
