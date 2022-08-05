package com.pulmuone.webservice.post.service.oopSample.lsp.builderPattern;

public class Car {
    private final String brand;
    private final String engine;
    private final String name;
    private final int price;

    // 직접 생성 못하도록 Private으로...
    private Car(Builder builder) {
        this.brand = builder.brand;
        this.engine = builder.engine;
        this.name = builder.name;
        this.price = builder.price;
    }

    @Override
    public String toString() {
        return String.format("이름 : %1s, 엔진 : %2s, 브랜드 : %3s, 가격 : %4d", name, engine, brand, price);
    }

    //내부 static 클래스로 빌더
    public static class Builder {
        private String brand;
        private String engine;
        private String name;
        private int price;

        // 필수적인 필드 : brand
        public Builder Brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder Engine(String engine) {
            this.engine = engine;
            return this;
        }

        public Builder Name(String name) {
            this.name = name;
            return this;
        }

        public Builder Price(int price) {
            this.price = price;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
