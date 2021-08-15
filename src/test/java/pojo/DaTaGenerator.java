package pojo;

import com.github.javafaker.Faker;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Locale;

public class DaTaGenerator {
    private final Faker faker;

    private static final Logger logger = LogManager.getLogger(DaTaGenerator.class);

    public DaTaGenerator() {
        faker = new Faker(new Locale("ru-RU"));
    }

    public Customer createCustomerData() {
        //
        Customer customer = new CustomerBuilder().
                setEmail(CustomerBuilder.generateRandomEmail(11)).
                setFirstName(faker.name().firstName()).setLastName(faker.name().lastName()).setUsername(CustomerBuilder.generateRandomEmail(16)).
                setBilling(createBillingData()).setShipping(createShippingData()).build();
        logger.info(customer);
        return customer;
    }
    //
    public Billing createBillingData() {
        Billing billing = new BillingBuild().
                setPhone(faker.phoneNumber().cellPhone()).setAddress1(faker.address().streetAddress()).setAddress2(faker.address().streetAddress()).setCompany(faker.company().name()).setEmail(BillingBuild.generateRandomEmail(15)).setCity(faker.address().cityName()).setCountry(faker.country().name()).setFirst_name(faker.name().firstName()).setLastName(faker.name().lastName()).setPostcode(faker.address().zipCode()).setState(faker.address().stateAbbr()).setCountry(faker.company().name()).build();
    return billing;}
    //
    public Shipping createShippingData() {
        Shipping shipping = new ShippingBuild().setFirst_name(faker.name().firstName()).setLastName(faker.name().lastName()).
                setCompany(faker.company().name()).setAddress1(faker.address().streetAddress()).setCity(faker.address().cityName()).setState(faker.address().state()).setPostcode(faker.address().zipCode()).setCountry(faker.country().name()).build();

return shipping;}}

