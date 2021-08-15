package pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.RandomStringUtils;

public class BillingBuild {
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

    public BillingBuild setFirst_name(String first_name) {
        this.first_name = first_name;
        return this;
    }

    public BillingBuild setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public BillingBuild setCompany(String company) {
        this.company = company;
        return this;
    }

    public BillingBuild setAddress1(String address1) {
        this.address1 = address1;
        return this;
    }

    public BillingBuild setAddress2(String address2) {
        this.address2 = address2;
        return this;
    }

    public BillingBuild setCity(String city) {
        this.city = city;
        return this;
    }

    public BillingBuild setState(String state) {
        this.state = state;
        return this;
    }

    public BillingBuild setPostcode(String postcode) {
        this.postcode = postcode;
        return this;
    }

    public BillingBuild setCountry(String country) {
        this.country = country;
        return this;
    }

    public BillingBuild setEmail(String email) {
        this.email = email;
        return this;
    }

    public BillingBuild setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public static String generateRandomEmail(int length) {
        //log.info("Generating a Random email String");
        String allowedChars = "abcdefghijklmnopqrstuvwxyz" + "1234567890" + "_-.";
        String email = "";
        String temp = RandomStringUtils.random(length, allowedChars);
        email = temp.substring(0, temp.length() - 9) + "@testdata.com";
        return email;
    }
    public Billing build(){
        return new Billing(first_name, lastName, company, address1, address2,city,state,postcode,country,email,phone);
    }
}
