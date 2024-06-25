# Encrypt
# Encryption-Decryption Application

This Java application provides encryption and decryption functionality using the `StandardPBEStringEncryptor` class from the Jasypt (Java Simplified Encryption) library. The application supports various encryption algorithms and allows the user to choose between encrypting and decrypting text inputs.

## Features

- **Encryption**: Encrypt a plaintext string using a specified algorithm.
- **Decryption**: Decrypt an encrypted string using the same algorithm used for encryption.
- **Algorithm Selection**: Choose from a variety of supported encryption algorithms.
- **Error Handling**: Display error messages for invalid inputs and terminate the program gracefully.

## Supported Algorithms

The application supports the following encryption algorithms:

- `PBEWithMD5AndDES`
- `PBEWithMD5AndTripleDES`
- `PBEWithSHA1AndDESede`
- `PBEWithSHA1AndRC2_40`
- `PBEWithSHA1AndRC2_128`
- `PBEWithSHA1AndRC4_40`
- `PBEWithSHA1AndRC4_128`
- `PBEWithSHA256And128BitAES-CBC-BC` (requires Bouncy Castle provider)
- `PBEWithSHA256And192BitAES-CBC-BC` (requires Bouncy Castle provider)
- `PBEWithSHA256And256BitAES-CBC-BC` (requires Bouncy Castle provider)

## Setup

1. **Clone the Repository**:
   ```sh
   git clone https://github.com/your-username/encryption-decryption-app.git
   cd encryption-decryption-app

