public class Pers {
    private String name;
    private int day;
    private String month;
    private int year;
    private String email;
    private String phoneNumber;
    private String surname;
    private int weight;
    private String bloodPressure;
    private int stepsPerDay;

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getStepsPerDay() {
        return stepsPerDay;
    }

    public void setStepsPerDay(int stepsPerDay) {
        this.stepsPerDay = stepsPerDay;
    }

    public Pers(String name, int day, String month, int year, String email, String phoneNumber, String surname, int weight, String bloodPressure, int stepsPerDay) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.surname = surname;
        this.weight = weight;
        this.bloodPressure = bloodPressure;
        this.stepsPerDay = stepsPerDay;
    }
    private int age;

    public int getAge() {
        return age;
    }
    public void printAccountInfo(){
        int presentYear = 2023;
        age = presentYear - year;
        System.out.println("Дані користовача " + getName() + " " + getSurname() + ": " + "\n Дата народження: "+ getDay() + " . " + getMonth() + " . " + getYear() + "\n Возраст: "
        + getAge() + "\n Email: " + getEmail() + "\n Номер телефону: " + getPhoneNumber()+ "\n Вага: " + getWeight() + "\n Тиск: " + getBloodPressure() + "\n Кількість пройдених кроків: "
        + getStepsPerDay()+ ".");
        System.out.println();
    }
}
