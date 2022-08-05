package com.pulmuone.webservice.post.service.oopSample.lsp.chainofresponsibility;

public abstract class Handler {
    public String name;
    private Handler next;

    public Handler(String name) {
        this.name = name;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    public void handleRequest(int number) {
        if(canHandle(number)) {
            doSomething(number);
        } else if (next != null) {
            next.handleRequest(number);
        } else {
            System.out.println("처리할 수 있는 객체 없음");
        }
    }

    public void doSomething(int number) {
        System.out.println(name + "(으)로 처리");
    }

    public abstract boolean canHandle(int number);
}

