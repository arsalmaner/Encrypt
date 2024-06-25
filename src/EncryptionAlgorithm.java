public enum EncryptionAlgorithm {
    PBE_WITH_MD5_AND_DES("PBEWithMD5AndDES"),
    PBE_WITH_MD5_AND_TRIPLE_DES("PBEWithMD5AndTripleDES"),
    PBE_WITH_SHA1_AND_DES_EDE("PBEWithSHA1AndDESede"),
    PBE_WITH_SHA1_AND_RC2_40("PBEWithSHA1AndRC2_40"),
    PBE_WITH_SHA1_AND_RC2_128("PBEWithSHA1AndRC2_128"),
    PBE_WITH_SHA1_AND_RC4_40("PBEWithSHA1AndRC4_40"),
    PBE_WITH_SHA1_AND_RC4_128("PBEWithSHA1AndRC4_128"),
    PBE_WITH_SHA256_AND_128BIT_AES_CBC_BC("PBEWithSHA256And128BitAES-CBC-BC"),
    PBE_WITH_SHA256_AND_192BIT_AES_CBC_BC("PBEWithSHA256And192BitAES-CBC-BC"),
    PBE_WITH_SHA256_AND_256BIT_AES_CBC_BC("PBEWithSHA256And256BitAES-CBC-BC");

    private final String algorithm;

    EncryptionAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public String getAlgorithm() {
        return this.algorithm;
    }
}
