package fr.midix.services.common;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordManager {

    public static String cryptPassword(String password){
                
        byte[] defaultBytes = password.getBytes();
        try{
            MessageDigest algorithm = MessageDigest.getInstance("MD5");
            algorithm.reset();
            algorithm.update(defaultBytes);
            byte messageDigest[] = algorithm.digest();
                    
            StringBuffer hexString = new StringBuffer();
            for (int i=0;i<messageDigest.length;i++) {
                hexString.append(Integer.toHexString(0xFF & messageDigest[i]));
            }
            return hexString.toString();
        }catch(NoSuchAlgorithmException nsae){
                nsae.printStackTrace();    
        }
        return null;
    }

}