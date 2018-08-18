package oopConcept;

public class TestHuman {

    public static void main(String[] args) {

        Human human = new SuperHuman();

        human.Birth();
        human.LifeTime();
        human.Death();

        SuperHuman sh = new SuperHuman(5102);

        sh.PowerLoose();

        SuperRobot sr = new SuperHuman();

        sr.MisUse();

        sh.setDOB("Jan 01 1990");
        System.out.println(sh.getDOB());
        sh.setSSN(111223333);
        System.out.println(sh.getSSN());
        sh.setSex('M');
        System.out.println(sh.getSex());
        sh.SuperHuman("5102_KBM SIDDIQUE");


    }
}
