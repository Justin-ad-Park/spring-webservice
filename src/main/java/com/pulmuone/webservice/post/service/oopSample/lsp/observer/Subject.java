package com.pulmuone.webservice.post.service.oopSample.lsp.observer;

import java.util.Observable;

public class Subject extends Observable {
    private String content;

    private void changedStatus() {
        this.setChanged();      //통보할 내용이 변경되었음을 알림
        this.notifyObservers(); //옵저버에게 통보
    }

    public void setContent(String newContent) {
        this.content = newContent;

        this.changedStatus();
    }

    public String getContent() {
        return content;
    }

}
