package enumeration.test;

public class AuthGradeMain1_1 {
    public static void main(String[] args) {
        AuthGrade[] vales = AuthGrade.values();
        for(AuthGrade value : vales) {
            System.out.println("grade=" + value.name() + " level=" + value.getLevel() + " 설명=" + value.getDescription());
        }
    }
}
