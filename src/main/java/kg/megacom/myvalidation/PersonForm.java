package kg.megacom.myvalidation;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.Date;

public class PersonForm {
    @NotNull
    @Size(min=2, max=30, message = "Имя должно содержать не менее 2 и не более 30 символов")
    private String name;

    @NotNull(message = "Возраст не менее 18 лет и не больше 65 лет")
    @Min(18)
    @Max(65)
    private Integer age;

    @NotEmpty
    @Email(message = "Например: email@example.com")
    private String email;

    @Min(1)
    @Max(5)
    @Positive
    private int experience;

    @PastOrPresent
    @NotNull
    @DateTimeFormat(pattern="yyyy/MM/dd")
    private Date careerStart;

    @Future
    @NotNull
    @DateTimeFormat(pattern="yyyy/MM/dd")
    private Date endContract;

    @Past
    @NotNull
    @DateTimeFormat(pattern="yyyy/MM/dd")
    private Date birthday;

    @NotNull(message = "For instance: 11.12.13.144")
    @Pattern(regexp = "^[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}$", flags = Pattern.Flag.MULTILINE)
    private String ipAddress;


    private boolean confirmation;
    @AssertTrue(message = "Я согласен(на) с обработкой данных")
    public boolean getConfirmation(){
        return confirmation;
    }

    @Size(min = 2, message = "Знание как минимум двух языков")
    private ArrayList<Boolean> arrayList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Date getCareerStart() {
        return careerStart;
    }

    public void setCareerStart(Date careerStart) {
        this.careerStart = careerStart;
    }

    public Date getEndContract() {
        return endContract;
    }

    public void setEndContract(Date endContract) {
        this.endContract = endContract;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public boolean isConfirmation() {
        return confirmation;
    }

    public void setConfirmation(boolean confirmation) {
        this.confirmation = confirmation;
    }

    public ArrayList<Boolean> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Boolean> arrayList) {
        this.arrayList = arrayList;
    }

    public String toString() {
        return "Person(Name: " + this.name + ", Age: " + this.age + ")";
    }
}

