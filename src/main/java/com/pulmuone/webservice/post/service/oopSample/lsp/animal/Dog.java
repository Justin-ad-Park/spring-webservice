package com.pulmuone.webservice.post.service.oopSample.lsp.animal;

public class Dog extends Animal implements WhoAmI {

    public Dog() {
        this.barkSound = "Bow Wow";
    }

    public void getSound(Dog dog)
    {
        System.out.println("Dog : " + dog.barkSound);
    }

    public Dog call()
    {
        return this;
    }

//    public Dog call()
//    {
//        return new HoundDog();
//    }

//    public HoundDog call()
//    {
//        return new Dog();
//    }

//    public Animal call()
//    {
//        return new Animal();
//    }
}
