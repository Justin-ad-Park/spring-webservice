package com.pulmuone.webservice.post.service.oopSample.lsp.observer;

import java.util.Observable;
import java.util.Observer;

public class Subscriber implements Observer {
    private String subscriberName = "";
    private String content = "";

    public Subscriber(String name) {
        this.subscriberName = name;
    }

    public Subscriber(String name, Observable observable) {
        this.subscriberName = name;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof Subject) {
            Subject subject = (Subject)o;

            this.content = subject.getContent();
            display();
        }
    }

    public void display() {
        System.out.println(String.format("구독자 : %1s 구독 메시지 : %2s", this.subscriberName, this.content ));
    }
}
