package pl.sda.advanced.oop1;

public class ExperimentalObject {
    private Integer notFinalImmutable; // Immutable - niezmienne
    private final Integer finalImmutable; // Da sie zmienic wartosc nie da sie zmienic referencji
    private final TestPerson testPerson;

    public ExperimentalObject(Integer notFinalImmutable, Integer finalImmutable, TestPerson testPerson) {
        this.notFinalImmutable = notFinalImmutable;
        this.finalImmutable = finalImmutable;
        this.testPerson = testPerson;
    }

    @Override
    public String toString() {
        return "ExperimentalObject{" +
                "notFinalImmutable=" + notFinalImmutable +
                ", finalImmutable=" + finalImmutable +
                ", person=" + testPerson +
                '}';
    }

    public void setNotFinalImmutable(Integer notFinalImmutable) {
        this.notFinalImmutable = notFinalImmutable;
    }

    public Integer getNotFinalImmutable() {
        return notFinalImmutable;
    }

    public Integer getFinalImmutable() {
        return finalImmutable;
    }

    public TestPerson getTestPerson() {
        return testPerson;
    }
}
