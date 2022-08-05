package com.pulmuone.webservice.post.service.oopSample.lsp.rectangleToBe;

import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NewRectangleTest {

    @After
    public void cleanup ()
    {
        return;
    }

    @Test
    public void 직사각형_정사각형_면적테스트 () throws Exception {
        //given
        NewRectangle rect = new NewRectangle();

        NewSquare newSquare = new NewSquare();

        //when
        rect.setWidth(10);
        rect.setHeight(20);

        newSquare.setWidth(10);
        newSquare.setHeight(20);

        System.out.println("Rect area : " + rect.getArea());
        System.out.println("Rect2 area : " + newSquare.getArea());

        //then
        assertEquals(200, rect.getArea());
        assertEquals(400, newSquare.getArea());
    }
}