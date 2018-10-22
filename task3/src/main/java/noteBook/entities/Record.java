package noteBook.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Record {

    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss ");

    private String firstName;
    private String lastName;
    private String middleName;
    private String fullName;
    private String nickName;
    private String comments;
    private Group group;
    private String phoneHome;
    private String phoneMobile1;
    private String phoneMobile2;
    private String email;
    private String skype;

    private Address address;

    private String fullAddress;
    private Date dateCreated;
    private Date dateUpdated;

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNickName() {
        return nickName;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getComments() {
        return comments;
    }
    public void setComments(String comments) {
        this.comments = comments;
    }

    public Group getGroup() {
        return group;
    }
    public void setGroup(Group group) {
        this.group = group;
    }

    public String getPhoneHome() {
        return phoneHome;
    }
    public void setPhoneHome(String phoneHome) {
        this.phoneHome = phoneHome;
    }

    public String getPhoneMobile1() {
        return phoneMobile1;
    }
    public void setPhoneMobile1(String phoneMobile1) {
        this.phoneMobile1 = phoneMobile1;
    }

    public String getPhoneMobile2() {
        return phoneMobile2;
    }
    public void setPhoneMobile2(String phoneMobile2) {
        this.phoneMobile2 = phoneMobile2;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }
    public void setSkype(String skype) {
        this.skype = skype;
    }

    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    public String getFullAddress() {
        return fullAddress;
    }
    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }
    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public Record() {
    }

    @Override
    public String toString() {
        return "Record{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", comments='" + comments + '\'' +
                ", group=" + group +
                ", phoneHome='" + phoneHome + '\'' +
                ", phoneMobile1='" + phoneMobile1 + '\'' +
                ", phoneMobile2='" + phoneMobile2 + '\'' +
                ", email='" + email + '\'' +
                ", skype='" + skype + '\'' +
                ", address=" + address +
                ", fullAddress='" + fullAddress + '\'' +
                ", dateCreated=" + simpleDateFormat.format(dateCreated) +
                ", dateUpdated=" + simpleDateFormat.format(dateUpdated) +
                '}';
    }
}
