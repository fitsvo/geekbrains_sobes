public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder("Carrey", "James")
                                    .withMiddleName("Eugene")
                                    .withAddress("Carrey's address")
                                    .withGender("male")
                                    .withCountry("Canada")
                                    .withAge(60)
                                    .withPhone("+199945688821")
                                .build();


    }
}
