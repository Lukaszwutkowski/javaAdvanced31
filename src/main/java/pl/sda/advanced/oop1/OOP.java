package pl.sda.advanced.oop1;

public class OOP {

    public static void main(String[] args) {
        immutableExample();

        int sum = CalculatorUtils.sum(4,6);
        System.out.println(sum);

    }

    private static void immutableExample() {
        TestPerson testPerson = new TestPerson();
        testPerson.setFirstName("Anna");
        testPerson.setSurname("Nowak");
        testPerson.setAgr(19);

        ExperimentalObject experimentalObject =
                new ExperimentalObject(1,2, testPerson);
        System.out.println(experimentalObject);
        TestPerson sameTestPerson = experimentalObject.getTestPerson();
        System.out.println(testPerson == sameTestPerson);
        System.out.println(testPerson.equals(sameTestPerson));
        System.out.println(testPerson);
        testPerson.setSurname("Kowalska");

        System.out.println(testPerson);

        experimentalObject.setNotFinalImmutable(20);
        System.out.println(experimentalObject);

        Integer finalImmutable = experimentalObject.getFinalImmutable();
        finalImmutable++;
        System.out.println(experimentalObject);
    }


}
