package tests.positive;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.files.DownloadActions.click;
import static constants.constants.*;

import org.openqa.selenium.Keys;

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
        $(By.id("patient.citizenshipFull.recid")).selectOption("гражданин Российской Федерации");
        //Выбор гражданства
        $(By.name("patient.identityDoc.documentType.recid")).selectOption(" Паспорт гражданина России");
        //Выбор типа документа
        $(By.id("patient.identityDoc.series")).setValue(patientIdentityDocSeries);
        //Ввод серии документа удостоверяющего личность
        $(By.id("patient.identityDoc.number")).setValue(patientIdentityDocNumber);
        //Ввод номера документа удостоверяющего личность
        $(By.id("patient.identityDoc.issuer")).setValue(patientIdentityDocIssuer);
        //Ввод органа выдавшего документ
        $(By.id("patient.identityDoc.issueDate")).setValue(patientIdentityDocIssueDate);
        //Ввод даты выдачи документа

        //Метод проверки чекбокса-без определенного места жительства
        $(By.id("patientLocationAddress.zipCode")).click();
        //Клик по полю Почтовый индекс,для скрытия календаря Дата выдачи документа и открытия видимости чек бокса
        $(By.id("patient.hasNoLivingAddress")).setSelected(true);
        //выставление значения в чек боксе -без определенного метса жительства true
        $(By.id("patient.livingAddressFull")).shouldNotBe(visible);
        //Проверка что необходимый элемент перстал быть видимым
        $(By.id("patient.hasNoLivingAddress")).setSelected(false);
        //выставление значения в чек боксе -без определенного метса жительства false



        $(By.id("patient.livingAddressFull.territorySubject.recid_search")).setValue("Липецкая область");
        //Ввод субьекта
        $(byText("Липецкая область")).click();
        //Выбор субьекта из всплывающего списка
        $(By.id("patient.livingAddressFull.zipCode")).setValue(patientLivingAddressFullZipCode);
        //Ввод почтового индекса
        $(By.id("patient.livingAddressFull.house")).setValue(patientLivingAddressFullHouse);
        //Ввод номера дома
        $(By.id("patient.livingAddressFull.corpus")).setValue(patientLivingAddressFullCorpus);
        //Ввод номер корпуса дома
        $(By.id("patient.livingAddressFull.building")).setValue(patientLivingAddressFullBuilding);
        //Ввод номера строения
        $(By.id("patient.livingAddressFull.appartment")).setValue(patientLivingAddressFullAppartment);
        //Ввод номера квартиры
        $(By.name("patient.livingAddressFull.addressType.recid")).click();
        //Выбор строки Тип адреса
        $(byText("Адрес места жительства")).click();
        //Выбор типа адреса
        $(By.xpath("//*[@id=\"patientLocationOgrn\"]")).scrollIntoView(false);
        //Скролл вниз
        $(By.id("patient.livingAddressFull.district_search")).click();
        //Выбор строки район
        $(byText("город субъектового подчинения")).click();
        //Выбор района
        $(By.id("patient.livingAddressFull.place_search")).click();
        //Выбор строки Населенный пункт
        $(byText("Липецк г")).click();
        //Выбор населенного пункта
        $(By.id("patient.livingAddressFull.street_search")).click();
        //Выбор строки Улица
        $(byText("Гагарина ул")).click();
        //Выбор улицы
        $(By.id("patient.livingAddressFull.house")).setValue("10");
        //Выбор строки Дом,ввод номера дома
        $(By.id("patient.livingAddressFull.appartment")).setValue("666");
        //Выбор строки квартира,ввод номера квартиры
        $(By.name("patientLocationType.recid")).click();
        //Выбор строки Тип местоположения
        $(byText("В медицинской организации, оказывающей медицинскую помощь в стационарных условиях")).click();
        //Выбор типа местоположения
        $(By.id("patientLocationAddress.zipCode")).setValue(patientLocationAddressZipCode2);
        //Ввод почтового индекса местоположения

        String pngFileName = screenshot("my_file_name");


    }

}
