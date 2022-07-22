package secondCourse.task2_4;

import secondCourse.task2_4.exceptions.WrongLoginException;
import secondCourse.task2_4.exceptions.WrongPasswordException;

public class VerificationService {
    private static void verifyLogin(String login){
        if(!login.matches("[a-zA-Z0-9_]*") || login.length() > 20) {
            throw new WrongLoginException();
        }
    }

    private static void verifyPassword(String password, String confirmPassword){
        if(!password.matches("[a-zA-Z0-9_]*") || password.length() > 20 || !password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        }
    }

    public static boolean verifyAccount(String login, String password, String confirmPassword){
        try{
            verifyLogin(login);
            verifyPassword(password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            return false;
        }
        return true;
    }
}
