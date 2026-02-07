public class HomeWrok13 {
    public static class LoginException extends Exception {
        public LoginException() {
            super("Вход в систему не выполнен");
        }

        public LoginException(String message) {
            super(message);
        }
    }

    public static class PasswordException extends Exception {
        public PasswordException() {
            super("Неправильный пароль");
        }

        public PasswordException(String message) {
            super(message);
        }
    }

    public static boolean validate(String login, String password, String confirmPassword) {
        try {
            if (!login.matches("[A-Za-z0-9_]+") || login.length() > 20) {
                throw new LoginException();
            }
            if (!password.matches("[A-Za-z0-9_]+") || password.length() > 20 || !password.equals(confirmPassword)) {
                throw new PasswordException();
            }

            return true;

        } catch (LoginException | PasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static void main(String[] args) {
        
        String login = "user123";
        String password = "123456";
        String confirmPassword = "123456";

        if (validate(login, password, confirmPassword)) {
            System.out.println("Регистрация прошла успешно");
        } else {
            System.out.println("Регистрация не пройдена");
        }
    }
}
