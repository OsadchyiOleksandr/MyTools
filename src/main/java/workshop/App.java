package workshop;

public class App {
    public static void main(String[] args) {
        // Приклад використання генератора паролів
        int passwordLength = 12;
        PasswordGenerator passwordGenerator = new PasswordGenerator();
        String generatedPassword = passwordGenerator.generatePassword(passwordLength);
        System.out.println("Згенерований пароль: " + generatedPassword);
    }
}
