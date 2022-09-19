public class Person {
    private final String firstName;
    private final String lastName;
    private final String middleName;
    private final String country;
    private final String address;
    private final String phone;
    private final int age;
    private final String gender;

    public Person(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.middleName = builder.middleName;
        this.country = builder.country;
        this.address = builder.address;
        this.phone = builder.phone;
        this.age = builder.age;
        this.gender = builder.gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getCountry() {
        return country;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    /**
     * The builder class.
     */
    public static class Builder {

        private final String firstName;
        private final String lastName;
        private String middleName;
        private String country;
        private String address;
        private String phone;
        private int age;
        private String gender;

        /**
         * Constructor
         */
        public Builder(String firstName, String lastName) {
            if (firstName == null || lastName == null) {
                throw new IllegalArgumentException("firstName and lastName can not be null");
            }
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Builder withMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Builder withCountry(String country) {
            this.country = country;
            return this;
        }

        public Builder withAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder withPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder withAge(int age) {
            this.age = age;
            return this;
        }

        public Builder withGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }


}
