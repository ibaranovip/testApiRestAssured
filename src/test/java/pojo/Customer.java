package pojo;


import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;


import com.fasterxml.jackson.annotation.JsonInclude;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "email",
        "first_name",
        "last_name",
        "username",
        "billing",
        "shipping"
})
@Generated("jsonschema2pojo")
public class Customer {

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

    /**
     * No args constructor for use in serialization
     *
     */
    public Customer() {
    }

    /**
     *
     * @param firstName
     * @param lastName
     * @param shipping
     * @param email
     * @param username
     * @param billing
     */
    public Customer(String email, String firstName, String lastName, String username, Billing billing, Shipping shipping) {
        super();
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.billing = billing;
        this.shipping = shipping;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    @JsonProperty("billing")
    public Billing getBilling() {
        return billing;
    }

    @JsonProperty("billing")
    public void setBilling(Billing billing) {
        this.billing = billing;
    }

    @JsonProperty("shipping")
    public Shipping getShipping() {
        return shipping;
    }// //

    @JsonProperty("shipping")
    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", billing=" + billing +
                ", shipping=" + shipping +
                '}';
    }
}
