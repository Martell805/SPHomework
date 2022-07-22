package secondCourse.task2_4;

public class Task2_4 {
    public static void solution(){
        String[] logins = {"Account1", "Account_2", "Account-3"};
        String[] passwords = {"1qwe_rty", "1qwe_rty", "1qwe-rty"};
        String[] confirmPasswords = {"1qwe_rty", "another_password", "1qwe-rty"};

        for (int i = 0; i < logins.length; i++) {
            if(VerificationService.verifyAccount(logins[i], passwords[i], confirmPasswords[i])){
                System.out.println("Вход в " + logins[i]);
            } else {
                System.out.println("Неверные данные для " + logins[i]);
            }
        }
    }
}
