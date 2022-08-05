package com.pulmuone.webservice.post.service.oopSample.lsp.observer;

public class ObserverTest {

    public static void main(String[] args) {
        Subject subject = new Subject();
        Subscriber subscriber1 = new Subscriber("구독자1", subject);
        Subscriber subscriber2 = new Subscriber("구독자2", subject);
        Subscriber subscriber3 = new Subscriber("구독자3");
        Subscriber subscriber4 = new Subscriber("구독자4");

        subject.addObserver(subscriber3);
        subject.setContent("새로운 뉴스");


        Subject subject2 = new Subject();
        subject2.addObserver(subscriber1);
        subject2.addObserver(subscriber4);
        subject2.setContent("새로운 학술자료");

        subject.deleteObserver(subscriber1);
        subject.deleteObserver(subscriber2);
        subject.setContent("새로운 뉴스2");

    }
}
