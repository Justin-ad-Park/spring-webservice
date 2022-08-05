package com.pulmuone.webservice.post.service.oopSample.lsp.animal;

public abstract class Animal {

    protected String barkSound = "No Sound";

    public void bark(Animal animal){
        System.out.println(this.barkSound);
    }
}
