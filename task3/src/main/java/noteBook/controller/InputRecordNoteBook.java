package noteBook.controller;

import noteBook.entities.Address;
import noteBook.entities.Group;
import noteBook.entities.Record;
import noteBook.exceptions.LoginNotUniqException;
import noteBook.model.Model;
import noteBook.view.View;

import java.util.Scanner;

import static noteBook.controller.RegexContainer.*;
import static noteBook.view.TextConstant.*;


public class InputRecordNoteBook {
    private Model model;
    private View view;
    private Scanner sc;

    public Model getModel() {
        return model;
    }
    public void setModel(Model model) {
        this.model = model;
    }

    public View getView() {
        return view;
    }
    public void setView(View view) {
        this.view = view;
    }

    public Scanner getSc() {
        return sc;
    }
    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public InputRecordNoteBook() {
    }
    public InputRecordNoteBook(Model model, View view, Scanner sc) {
        this.model = model;
        this.view = view;
        this.sc = sc;
    }

    public void inputRecord() {

        UtilityController utilityController = new UtilityController(sc, view);

        Record record = new Record();

        String str = (String.valueOf(View.bundle.getLocale()).equals("ua")) ? REGEX_NAME_UKR : REGEX_NAME_LAT;

        String lastName = utilityController.inputStringValueWithScanner(LAST_NAME, str);

        String firstName = utilityController.inputStringValueWithScanner(FIRST_NAME, str);

        String middleName = utilityController.inputStringValueWithScanner(MIDLE_NAME, str);

        String login = utilityController.inputStringValueWithScanner(LOGIN_DATA, REGEX_LOGIN);

        String comment = utilityController.inputStringValueWithScanner(COMMENT_DATA, REGEX_NAME_UKR);
        //Enum
        Group groupName = utilityController.inputGroupValueWithScanner(GROUP_DATA, REGEX_GROUP);

        String phoneHome = utilityController.inputStringValueWithScanner(PHONE_HOME_DATA, REGEX_PHONE);
        String phoneMobile1 = utilityController.inputStringValueWithScanner(PHONE_MOBILE_1_DATA, REGEX_PHONE);
        String phoneMobile2 = utilityController.inputStringValueWithScanner(PHONE_MOBILE_2_DATA, REGEX_PHONE);

        String email = utilityController.inputStringValueWithScanner(EMAIL_DATA, REGEX_EMAIL);

        String skype = utilityController.inputStringValueWithScanner(SKYPE_DATA, REGEX_LOGIN);

        String postCode = utilityController.inputStringValueWithScanner(POST_CODE_DATA, REGEX_POST_INDEX);

        String city = utilityController.inputStringValueWithScanner(CITY_DATA, REGEX_NAME_UKR);

        String street = utilityController.inputStringValueWithScanner(STREET_DATA, REGEX_NAME_UKR);

        String streetNumber = utilityController.inputStringValueWithScanner(STREET_NUMBER_DATA, REGEX_NUMBER);

        String apartmentNumber = utilityController.inputStringValueWithScanner(APARTMENT_NUMBER_DATA, REGEX_NUMBER);

        record.setFirstName(firstName);
        record.setNickName(login);
        record.setLastName(lastName);
        record.setMiddleName(middleName);
        record.setFullName(lastName +" "+ firstName.charAt(0)+".");
        record.setComments(comment);
        record.setGroup(groupName);
        record.setPhoneHome(phoneHome);
        record.setPhoneMobile1(phoneMobile1);
        record.setPhoneMobile2(phoneMobile2);
        record.setEmail(email);
        record.setSkype(skype);

        Address address = new Address(postCode, city, street, streetNumber, apartmentNumber);
        record.setAddress(address);

        addRecordToNoteBook(record);

    }

    public void addRecordToNoteBook(Record record){

        UtilityController utilityController = new UtilityController(sc, view);

        try {
            model.createRecord(record);
            model.printNoteBookRecords();
        }
        catch (LoginNotUniqException e) {
            record.setNickName(utilityController.inputStringValueWithScanner(LOGIN_NOT_UNIQ_DATA, REGEX_LOGIN));
            addRecordToNoteBook(record);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

}