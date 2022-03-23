package com.bumblebee.designpattern.creational.builder;

public class House {

    private Long houseId;
    private String address;
    private String type;
    private Long price;
    private String phone;

    public Long getHouseId() {
        return houseId;
    }
    public String getAddress() {
        return address;
    }
    public String getType() {
        return type;
    }
    public Long getPrice() {
        return price;
    }
    public String getPhone() {
        return phone;
    }

    private House(HouseBuilder builder) {
        this.houseId = builder.houseId;
        this.address = builder.address;
        this.type = builder.type;
        this.price = builder.price;
        this.phone = builder.phone;
    }

    public static class HouseBuilder{

        private Long houseId;
        private String address;
        private String type;
        private Long price;
        private String phone;

        // 필수값 생성자
        public HouseBuilder(Long houseId, String address, String type) {
            this.houseId = houseId;
            this.address = address;
            this.type = type;
        }

        public HouseBuilder price(Long price) {
            this.price = price;
            return this;
        }

        public HouseBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public House build() {
            return new House(this);
        }

    }


}
