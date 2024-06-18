package com.demoqa.utils;

import com.demoqa.entities.Employee;
import com.demoqa.entities.PracticFormEntity;
import com.github.javafaker.Faker;

import java.util.Arrays;
import java.util.List;

public class RandomUtils {
    private static final Faker faker = new Faker();

    public  PracticFormEntity generateRandomPracticFormEntity() {
      PracticFormEntity practicFormEntity = new PracticFormEntity();

               practicFormEntity.setFirstName(faker.name().firstName());
                practicFormEntity.setLastName(faker.name().lastName());
                practicFormEntity.setEmail(faker.internet().emailAddress());
                practicFormEntity.setPhoneNumber(faker.phoneNumber().subscriberNumber(10));
                practicFormEntity.setSubjects("Maths");
                practicFormEntity.setUploadPicture("/Users/owner/PycharmProjects/AiProjets/imageProcess/koordinat/img/img.png");
                practicFormEntity.setCurrentAddress(faker.address().fullAddress());
                return practicFormEntity;

    }
    public Employee createMockEmployee(){
        Employee employee = new Employee();
        employee.setFirstName(faker.name().firstName());
        employee.setLastName(faker.name().lastName());
        employee.setAge(faker.number().numberBetween(18,100));
        employee.setEmail(faker.internet().emailAddress());
        employee.setSalary(faker.number().numberBetween(1000000,200000000));
       employee.setDepartment(faker.job().position());
       return employee;
    }

    private static String getRandomGender() {
        List<String> genders = Arrays.asList("Male", "Female", "Other");
        return genders.get(faker.random().nextInt(genders.size()));
    }

    private static String getRandomState() {
        List<String> states = Arrays.asList("NCR", "Uttar Pradesh", "Haryana", "Punjab");
        return states.get(faker.random().nextInt(states.size()));
    }

    private static String getRandomCity() {
        List<String> cities = Arrays.asList("Delhi", "Agra", "Lucknow", "Noida");
        return cities.get(faker.random().nextInt(cities.size()));
    }

    private static String getRandomHobby() {
        List<String> hobbies = Arrays.asList("Sports", "Reading", "Music");
        return hobbies.get(faker.random().nextInt(hobbies.size()));
    }
}
