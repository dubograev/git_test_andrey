package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    @BeforeAll
    static void setUp() {
        Configuration.startMaximized = true;
    }

    String  testURL = "https://demoqa.com/automation-practice-form",
            firstname = "Joe",
            lastname = "Biden",
            userEmail = "andreddd111@gmail.com",
            gender = "Female",
            userNumber = "8002001010",
            monthOfBirthday = "May",
            yearOfBirthday = "1990",
            dayOfBirthday = "14",
            subject1 = "Maths",
            subject2 = "English",
            hobby1 = "Sports",
            hobby2 = "Music",
            picture = "image.jpg",
            address = "Russia \n" +
                    "Pyatigorsk \n" +
                    "ul. Lenina, 300",
            state = "Haryana",
            city = "Karnal";
}
