package DomainObjects;

public class Address {

    private final String city;
    private final String country;
    private final String state;
    private final int id;

    public Address(AddressBuilder addressBuilder) {
        this.id = addressBuilder.id;
        this.city = addressBuilder.city;
        this.state = addressBuilder.state;
        this.country = addressBuilder.country;
    }

    public static class AddressBuilder {

        private String city, country, state;
        private int id;

        public Address build() {
            return new Address(this);
        }

        public AddressBuilder Id(int value) {
            this.id = this.hashCode();
            return this;
        }

        public AddressBuilder City(String value) {
            this.city = value;
            return this;
        }

        public AddressBuilder State(String value) {
            this.state = value;
            return this;
        }

        public AddressBuilder Counrty(String value) {
            this.country = value;
            return this;
        }

    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }

    public int getAddressId() {
        return id;
    }

}
