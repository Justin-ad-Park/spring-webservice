package com.pulmuone.webservice.post.service.oopSample.lsp.rectangle;

import org.springframework.stereotype.Service;

// 직사각형
//  가로, 세로를 입력받는다.
//  면적을 계산한다.
@Service
public class Rectangle {
    int width = 0;
    int height = 0;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    //  면적
    public int getArea() {
        return width * height;
    }

}

