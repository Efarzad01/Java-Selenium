package oopConcept;

public class SuperHuman extends SuperRobot implements Human {

    private String DOB;
    private int SSN;
    private char Sex;

    SuperHuman(){

    }
    SuperHuman(int a){
    System.out.println(a);
    }
    public void SuperHuman(){

    }
    public void SuperHuman(String b){
        System.out.println(b);
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public char getSex() {
        return Sex;
    }

    public void setSex(char sex) {
        Sex = sex;
    }



    public void Birth() {

        System.out.println("Super Human born with super natural power");

    }
    public void LifeTime() {

        System.out.println("Super Human use their super natural power for mankind");
    }
    public void Death(){

        System.out.println("Super natural power complite the circle with super human's death");

    }
    public void PowerLoose(){
        System.out.println("Super human can loose their power temporarelly in their life time");
    }
    public void MisUse(){

        System.out.println("Super Robot can be used in battlefield");
    }

}
