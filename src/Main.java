import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create an instance of StandardPBEStringEncryptor
        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();

        // Set the password - application specific password
        encryptor.setPassword("password");

        // Set the algorithm - see EncryptionAlgorithm enum class
        encryptor.setAlgorithm("algorithm");

        // Secret to encrypt or decrypt
        String secret = "secret";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 'e' to encrypt or 'd' to decrypt:");
        String input = scanner.nextLine().trim().toLowerCase();

        switch (input) {
            case "e" -> encrypt(secret, encryptor);
            case "d" -> decrypt(secret, encryptor);
            default -> {
                System.out.println("Error: Invalid input. Program will terminate.");
                System.exit(1);
            }
        }
    }

    private static void encrypt(String secret, StandardPBEStringEncryptor encryptor) {
        // Your encryption logic here
        System.out.println("Encryption block executed.");
        // Encrypt the input
        String encryptedText = encryptor.encrypt(secret);

        // Print the encrypted text
        System.out.println("Encrypted: " + encryptedText);
    }

    private static void decrypt(String secret, StandardPBEStringEncryptor encryptor) {
        // Your decryption logic here
        System.out.println("Decryption block executed.");
        // Decrypt the input
        String decryptedText = encryptor.decrypt(secret);

        // Print the decrypted text
        System.out.println("Decrypted: " + decryptedText);
    }

}