package noteBook.controller;


public interface RegexContainer {
    // Cyrillic name
    String REGEX_NAME_UKR = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$";
    // Latin name
    String REGEX_NAME_LAT = "^[A-Z][a-z]{1,20}$";
    // login
    String REGEX_LOGIN = "^[A-Za-z0-9_-]{8,20}$";

    String REGEX_GROUP = "^[A-Z]{1,10}$";

    String REGEX_PHONE = "^[0-9]{10,12}$";

    String REGEX_EMAIL = "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$";

    String REGEX_POST_INDEX = "^[0-9]{5}$";

    String REGEX_NUMBER = "^[0-9]{1,}$";

}