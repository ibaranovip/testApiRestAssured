package pojo;

import org.apache.commons.lang3.RandomStringUtils;
import org.codehaus.jackson.annotate.JsonProperty;

public class CustomerBuilder {
    @JsonProperty("email")
    private String email;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("username")
    private String username;
    @JsonProperty("billing")
    private Billing billing;
    @JsonProperty("shipping")
    private Shipping shipping;

    public CustomerBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public CustomerBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public CustomerBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public CustomerBuilder setUsername(String username) {
        this.username = username;
        return this;
    }

    public CustomerBuilder setBilling(Billing billing) {
        this.billing = billing;
        return this;
    }

    public CustomerBuilder setShipping(Shipping shipping) {
        this.shipping = shipping;
        return this;
    }
    public Customer build() {
        return new Customer(email,lastName, firstName, username, billing, shipping);
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
