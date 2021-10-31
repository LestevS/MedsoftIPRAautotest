package tests.positive;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static constants.constants.*;

public class CreateNewRefferal {
    @Test
    public void test() {
        open("http://q4-demo.medsoft.su:9000/");
        //open Личный кабинет
        $(By.id("login")).setValue(login);
        //ввод логина в поле логин
        $(By.name("password")).setValue(password);
        //ввод пароля в поле пароль
        $(By.name("enter")).click();
        //нажатие кнопки войти
        $(By.id("tb_toolbar_item_referral")).click();
        //Выбор в верхнем тулбаре Направления на МСЭ
        $(By.id("tb_person_list_toolbar_item_referral-new")).click();
        //Нажатие кнопки Добавить направление
        $(By.id("patient.lastName")).setValue(patLastName);
        //Ввод Фамилия пациента
        $(By.id("patient.firstName")).setValue(patFirstName);
        //Ввод Имя пациента
        $(By.id("patient.secondName")).setValue(patSecName);
        //Ввод Отчество пациента
        $(By.id("patient.birthDate")).setValue(patBirthDate);
        //Ввод Дата рождения пациента
        $(By.id("patient.gender")).selectOption("Мужской");
        //Выбор пола пациента
        $(By.id("patient.snils")).setValue(patSnils);
        //Ввод СНИЛС пациента


        String pngFileName = screenshot("my_file_name");

    }

}
