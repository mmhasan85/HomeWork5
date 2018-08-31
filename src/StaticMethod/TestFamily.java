package StaticMethod;

public class TestFamily {
    public static void main(String[] args) {
        Family family = new Family();
        family.familyVacationTime();

        Family.familyIncome();
        SuperFamily.familyIncome();
    }
}
