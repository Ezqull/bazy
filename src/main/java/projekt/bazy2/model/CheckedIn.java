package projekt.bazy2.model;

import jakarta.persistence.Column;

public class CheckedIn extends BaseEntity{

    @Column(name = "street",
            nullable = false,
            length = 50)
    private String street;
}
