package pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.RandomStringUtils;

public class ShippingBuild {
    @JsonProperty("first_name")
    private String first_name;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("company")
    private String company;
    @JsonProperty("address_1")
    private String address1;
    @JsonProperty("address_2")
    private String address2;
    @JsonProperty("city")
    private String city;
    @JsonProperty("state")
    private String state;
    @JsonProperty("postcode")
    private String postcode;
    @JsonProperty("country")
    private String country;
    @JsonProperty("email")
    private String email;
    @JsonProperty("phone")
    private String phone;

    public ShippingBuild setFirst_name(String first_name) {
        this.first_name = first_name;
        return this;
    }

    public ShippingBuild setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public ShippingBuild setCompany(String company) {
        this.company = company;
        return this;
    }

    public ShippingBuild setAddress1(String address1) {
        this.address1 = address1;
        return this;
    }

    public ShippingBuild setAddress2(String address2) {
        this.address2 = address2;
        return this;
    }

    public ShippingBuild setCity(String city) {
        this.city = city;
        return this;
    }

    public ShippingBuild setState(String state) {
        this.state = state;
        return this;
    }

    public ShippingBuild setPostcode(String postcode) {
        this.postcode = postcode;
        return this;
    }

    public ShippingBuild setCountry(String country) {
        this.country = country;
        return this;
    }

    public ShippingBuild setEmail(String email) {
        this.email = email;
        return this;
    }

    public ShippingBuild setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public Shipping build(){
        return new Shipping(first_name, lastName,company,address1,address2,city,state,postcode,country);
    }
    public static String generateRandomEmail(int length) {
        //log.info("Generating a Random email String");
        String allowedChars = "abcdefghijklmnopqrstuvwxyz" + "1234567890" + "_-.";
        String email = "";
        String temp = RandomStringUtils.random(length, allowedChars);
        email = temp.substring(0, temp.length() - 9) + "@testdata.com";
        return email;
    }
}
