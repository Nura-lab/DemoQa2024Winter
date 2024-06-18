package com.demoqa.entities;

import lombok.*;
import org.openqa.selenium.WebElement;

import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class PracticFormEntity {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String genderMale;
    private String genderFemale;
    private String genderOther;
    private String subjects;
    private String hobbies;
    private String hobbiesR;
    private String hobbiesMusic;
    private String currentAddress;
    private String uploadPicture;
    private String SelectState;
    private String SelectCity;
    private String submitButton;
    private String closeModal;
}
