package Homework_1;

class Person {
    protected String lastName;
    protected String firstName;
    protected int age;

    public Person(String lastName, String firstName, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("გვარი: " + lastName);
        System.out.println("სახელი: " + firstName);
        System.out.println("ასაკი: " + age);
    }
}

class Doctor extends Person {
    private int doctorAge;
    private String department;
    private String position;
    private String hospitalName;
    private int experience;

    public Doctor(String lastName, String firstName, int age, int doctorAge, String department, String position, String hospitalName, int experience) {
        super(lastName, firstName, age);
        this.doctorAge = doctorAge;
        this.department = department;
        this.position = position;
        this.hospitalName = hospitalName;
        this.experience = experience;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("ექიმის ასაკი: " + doctorAge);
        System.out.println("განყოფილება: " + department);
        System.out.println("თანამდებობა: " + position);
        System.out.println("საავადმყოფო: " + hospitalName);
        System.out.println("სტაჟი: " + experience);
    }

    public int getDoctorAge() {
        return doctorAge;
    }

    public int getExperience() {
        return experience;
    }
}