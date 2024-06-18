package com.demoqa.pages;

import com.demoqa.entities.PracticFormEntity;
import com.demoqa.helper.WebElementActions;
import com.demoqa.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;

public class PracticeForm extends BasePage {


    @FindBy(id = "firstName")
    public WebElement fistName;

    @FindBy(id = "lastName")
    public WebElement lastName;

    @FindBy(id = "userEmail")
    public WebElement userEmail;

    @FindBy(xpath = "//label[text()='Male']")
    public WebElement genderMale;

    @FindBy(xpath = "//label[text()='Female']")
    public WebElement genderFemale;
    @FindBy(xpath = "//label[text()='Other']")
    public WebElement genderOther;

    @FindBy(id = "userNumber")
    public WebElement phoneNumber;

    @FindBy(id = "subjectsInput")
    public WebElement subjects;

    @FindBy(xpath = "//label[text()='Sports']")
    public WebElement hobbies;
    @FindBy(xpath = "//label[text()='Reading']")
    public WebElement hobbiesR;
    @FindBy(xpath = "//label[text()='Music']")
    public WebElement hobbiesMusic;
    @FindBy(id="uploadPicture")
    public WebElement uploadPicture;

    @FindBy(id = "currentAddress")
    public WebElement currAddress;

    @FindBy(id = "react-select-3-input")
    public WebElement SelectState;

    @FindBy(id = "react-select-4-input")
    public WebElement SelectCity;

    @FindBy(id = "submit")
    public WebElement submitButton;
    @FindBy(id="closeLargeModal")
    public WebElement CloseModal;

    private String [] states = {"NCR", "Uttar Pradesh", "Haryana","Rajasthan"};
    private String[][] cities = {{"Delhi", "Gurgaon", "Noida", },{"Agra", "lucknow", "Merrut", },{"karnal", "Panipat" },{"Jaipur", "Jaiselmer"}};


   public  PracticeForm fillForm(PracticFormEntity practicFormEntity) throws InterruptedException {
       webElementActions.sendKeys(fistName,practicFormEntity.getFirstName())
               .sendKeys(lastName,practicFormEntity.getLastName())
               .sendKeys(userEmail,practicFormEntity.getEmail())
               .click(getRandomGender())
               .sendKeys(phoneNumber,practicFormEntity.getPhoneNumber())
               .sendKeysWithEnter(subjects,practicFormEntity.getSubjects())
               .click(getRandomHobbies())
               .sendKeys(uploadPicture,practicFormEntity.getUploadPicture())
               .sendKeys(currAddress,practicFormEntity.getCurrentAddress());

       String randomState = getRandomState();
       webElementActions.sendKeysWithEnter(SelectState,randomState);
       String randomCities = getRandomCityForState(getRandomState());
       webElementActions.sendKeysWithEnter(SelectCity,randomCities);
       webElementActions.jsClick(submitButton);
       Thread.sleep(3000);
       webElementActions.jsClick(CloseModal);
       Thread.sleep(10000);

       return this;

   }
   private WebElement getRandomGender(){
       WebElement [] gender ={genderMale, genderFemale,genderOther};
       int randomIndex = new Random().nextInt(gender.length);
       return gender[randomIndex];

   }
   private WebElement getRandomHobbies(){
       WebElement [] hobbiesGeneral = {hobbies,hobbiesR,hobbiesMusic};
       int randomInd = new Random().nextInt(hobbiesGeneral.length);
       return  hobbiesGeneral[randomInd];

   }
   private String getRandomState(){
       Random random = new Random();
       int randInd = random.nextInt(states.length);
       return  states[randInd];
   }
   private String getRandomCityForState(String state){
       int stateIndex = -1;
       for(int i=0; i < states.length; i++){
           if(states[i].equals(state)){
               stateIndex =i;
               break;
           }

       }
       if(stateIndex==-1){
           return "";
       }
       String [] citiesForState = cities[stateIndex];
       Random random =  new Random();
       int citiesIndex =random.nextInt(citiesForState.length);
       return citiesForState[citiesIndex];

   }





    }

