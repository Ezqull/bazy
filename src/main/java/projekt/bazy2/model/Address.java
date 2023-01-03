package projekt.bazy2.model;

import jakarta.persistence.Column;

public class Address extends BaseEntity{

    @Column(name = "street",
            nullable = false,
            length = 50)
    private String street;

    @Column(name = "postal_code",
            nullable = false,
            length = 5)
    private String postal_code;

    @Column(name = "city",
            nullable = false,
            length = 30)
    private String city;

    @Column(name = "state",
            nullable = false,
            length = 20)
    private String state;

    @Column(name = "country",
            nullable = false,
            length = 20)
    private String country;
}
