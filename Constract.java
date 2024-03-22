/* Constructor

In Java, a constructor is a special type of method that is automatically called when
an object of a class is created.
The purpose of a constructor is to initialize the newly created object. */
class Constructor {
    private String name;
    private String surname;
    private int schoolNo;
    private int birthyear;

    public Constructor () { // -> constuctor method
       this.name = "not entered";
       this.surname = "not entered";
       this.schoolNo = 0000;
       this.birthyear = 2006;
        System.out.println(this.name);
        System.out.println(this.surname);
        System.out.println(this.schoolNo);
        System.out.println(this.birthyear);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSchoolNo() {
        return schoolNo;
    }

    public void setSchoolNo(int schoolNo) {
        this.schoolNo = schoolNo;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(int birthyear) {

        this.birthyear = birthyear;

    }

}

public class Constract {
    public static void main(String[] args) {

        Constructor constructor = new Constructor();


        constructor.setName("Alex");
        System.out.println(constructor.getName());

    }
}
