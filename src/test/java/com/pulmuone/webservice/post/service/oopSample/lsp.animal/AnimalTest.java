package com.pulmuone.webservice.post.service.oopSample.lsp.animal;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AnimalTest {

    @After
    public void cleanup ()
    {
        return;
    }

    @Test
    public void 동물_개_사냥개테스트 () throws Exception {
        //given
        Dog dog = new Dog();

        //when
        Dog callDog = dog.call();

        System.out.println(dog.barkSound);
        System.out.println(callDog.barkSound);

        //then
//        assertEquals(200, rect.getArea());
//        assertEquals(200, rect2.getArea());
    }
}