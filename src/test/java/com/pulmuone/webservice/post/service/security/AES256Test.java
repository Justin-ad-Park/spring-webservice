package com.pulmuone.webservice.post.service.security;

import org.aspectj.lang.annotation.After;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class AES256Test {

    @Autowired
    private AES256 aes256;

    @After("")
    public void cleanup ()
    {
        return;
    }

    @Test
    public void AES256_암복호화값이일치한다 () throws Exception {
        //given
        String plainText = "Test^ABC^123";

        //when
        String encryptedText = aes256.encrypt(plainText);
        String decryptedText = aes256.decrypt(encryptedText);

        //then
        System.out.println("EncryptedText : " + encryptedText);
        System.out.println("DecryptedText : " + decryptedText);

        assertThat(plainText.equals(decryptedText));
    }
}