package com.pulmuone.webservice.post.service.oopSample.lsp.animal;

public class HoundDog extends Dog {

    public HoundDog() {
        this.barkSound = "Hound Wownd";
    }

    public void getSound(HoundDog dog)
    {
        super.getSound(dog);
        System.out.println("HoundDog : " + dog.barkSound);
    }
}
