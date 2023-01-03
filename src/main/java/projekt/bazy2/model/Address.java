package projekt.bazy2.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "address")
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

    @OneToMany(mappedBy = "oldAddress",
            cascade = {CascadeType.MERGE, CascadeType.REMOVE}, fetch = FetchType.EAGER)
    private List<CheckedIn> oldCheckIns = new ArrayList<>();

    @OneToMany(mappedBy = "newAddress",
            cascade = {CascadeType.MERGE, CascadeType.REMOVE}, fetch = FetchType.EAGER)
    private List<CheckedIn> newCheckIns = new ArrayList<>();
}
