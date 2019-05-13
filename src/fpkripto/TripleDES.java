/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpkripto;

import java.security.spec.KeySpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;
import java.util.Scanner;
import javax.crypto.spec.IvParameterSpec;

/**
 *
 * @author VICKY
 */
public class TripleDES {
    
    private static final String UNICODE_FORMAT = "UTF8";
    public static final String DESEDE_ENCRYPTION_SCHEME = "TripleDES";
    private KeySpec myKeySpec;
    private SecretKeyFactory mySecretKeyFactory;
    private Cipher cipher;
    byte[] keyAsBytes;
    private String myEncryptionKey;
    private String myEncryptionScheme;
    Scanner input = new Scanner(System.in);
    SecretKey key;
    static byte[] IV = BlumBlumShub.setIV_DES();
    
    public TripleDES()
    {
//        
    }
    
    public String setKey(String keys) throws Exception {
        myEncryptionKey = keys;
        myEncryptionScheme = DESEDE_ENCRYPTION_SCHEME;
        keyAsBytes = myEncryptionKey.getBytes(UNICODE_FORMAT);
        myKeySpec = new DESedeKeySpec(keyAsBytes);
        mySecretKeyFactory = SecretKeyFactory.getInstance(myEncryptionScheme);
        cipher = Cipher.getInstance(myEncryptionScheme);
        key = mySecretKeyFactory.generateSecret(myKeySpec);
        
        return myEncryptionKey;
    }
 
    /**
     * Method To Encrypt The String
     */
    public String encrypt(String unencryptedString) {
        String encryptedString = null;
        try {
            byte[] iv = IV;
            IvParameterSpec ivspec = new IvParameterSpec(iv);
            
            Cipher cipher = Cipher.getInstance("DESede/CTR/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, key, ivspec);
            
            byte[] plainText = unencryptedString.getBytes(UNICODE_FORMAT);
            byte[] encryptedText = cipher.doFinal(plainText);
            BASE64Encoder base64encoder = new BASE64Encoder();
            encryptedString = base64encoder.encode(encryptedText);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return encryptedString;
    }
    
    /**
     * Method To Decrypt An Encrypted String
     */
    public String decrypt(String encryptedString) {
        String decryptedText=null;
        try {
            byte[] iv = IV;
            IvParameterSpec ivspec = new IvParameterSpec(iv);
            
            Cipher cipher = Cipher.getInstance("DESede/CTR/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, key, ivspec);
        
            BASE64Decoder base64decoder = new BASE64Decoder();
            byte[] encryptedText = base64decoder.decodeBuffer(encryptedString);
            byte[] plainText = cipher.doFinal(encryptedText);
            decryptedText= bytes2String(plainText);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return decryptedText;
    }
    /**
     * Returns String From An Array Of Bytes
     */
    private static String bytes2String(byte[] bytes) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < bytes.length; i++) {
            stringBuffer.append((char) bytes[i]);
        }
        return stringBuffer.toString();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        TripleDES myEncryptor= new TripleDES();
        
        Scanner input = new Scanner(System.in);
 
        System.out.print("String To Encrypt: ");
        String encrypt = input.nextLine();
        String stringToEncrypt=(encrypt);
        
        String encrypt1 =myEncryptor.encrypt(stringToEncrypt);
        String decrypt1 =myEncryptor.decrypt(encrypt1);
        String encrypted =myEncryptor.encrypt(decrypt1);
        
        
        String decrypted=myEncryptor.decrypt(encrypted);

        
        System.out.println("Encrypted Value : " + encrypted);
        System.out.println("Decrypted Value : "+decrypted);
    }
    
}
