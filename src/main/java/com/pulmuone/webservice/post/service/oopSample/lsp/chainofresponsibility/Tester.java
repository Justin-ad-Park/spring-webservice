package com.pulmuone.webservice.post.service.oopSample.lsp.chainofresponsibility;

public class Tester {
    public static void main(String[] args) {
        Handler oddHandler = new OddHandler();
        Handler evenHandler = new EvenHandler();

        oddHandler.setNext(evenHandler);

        for(int i = 1; i < 10; i++) {
            oddHandler.handleRequest(i);
        }
    }
}
