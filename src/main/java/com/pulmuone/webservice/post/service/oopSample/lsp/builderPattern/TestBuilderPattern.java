package com.pulmuone.webservice.post.service.oopSample.lsp.builderPattern;

public class TestBuilderPattern {
    public static void main(String[] args)  {
        Car car = new Car.Builder()
                .Name("슈퍼카")
                .Engine("3.0V6")
                .Price(150000)
                .build();

        System.out.println(car.toString());
    }
}
