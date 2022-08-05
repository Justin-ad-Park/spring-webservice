package com.pulmuone.webservice.post.service.oopSample.lsp.rectangleToBe;

import org.springframework.stereotype.Service;

/** 정사각형
 직사각형을 확장해서 폭과 높이가 같도록 메소드를 오버라이드 한다.
 */
@Service
public class NewSquare extends Tetragon {

    public void setWidth(int width) {
        this.width = width;
        this.height = width;
    }

    public void setHeight(int height) {
        this.width = height;
        this.height = height;
    }
}
