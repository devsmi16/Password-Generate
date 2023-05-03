import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int length = 10; // şifre uzunluğu
        System.out.println(generatePassword(length));
    }
    public static String generatePassword(int length){
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+";
        StringBuilder password = new StringBuilder();

        Random random = new Random();
        for (int i = 0; i < length; i++){
            int index = random.nextInt(characters.length());
            password.append(characters.charAt(index));
        }
        return password.toString();
    }
}