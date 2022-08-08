package com.pulmuone.webservice.post.service.oopSample.lsp.rectangle;

import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {

    @After
    public void cleanup ()
    {
        return;
    }

    @Test
    public void 직사각형_정사각형_면적테스트 () throws Exception {
        //given
        Rectangle rect = new Rectangle();

        //선언은 직사각형이지만, 하위 클래스인 정사각형으로 생성
        Rectangle rect2 = new Square();

        //when
        rect.setWidth(10);
        rect.setHeight(20);

        rect2.setWidth(10);
        rect2.setHeight(20);

        System.out.println("Rect area : " + rect.getArea());
        System.out.println("Rect2 area : " + rect2.getArea());

        //then
        assertEquals(200, rect.getArea());

        //assertEquals(200, rect2.getArea());
        assertEquals(400, rect2.getArea());
    }
}