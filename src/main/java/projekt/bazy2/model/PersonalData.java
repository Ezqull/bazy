package projekt.bazy2.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "personal_data")
public class PersonalData extends BaseEntity{

    @Column(name = "name",
            nullable = false,
            length = 20)
    private String name;

    @Column(name = "last_name",
            nullable = false,
            length = 50)
    private String lastName;

    @Column(name = "personal_id",
            nullable = false,
            length = 11)
    private String personalId;

    @Column(name = "passport_id",
            nullable = false,
            length = 9)
    private String passportId;

    @Column(name = "birth_date",
            nullable = false)
    private LocalDate birthDate;

    @Column(name = "fathers_name",
            nullable = false,
            length = 20)
    private String fathersName;

    @Column(name = "mothers_name",
            nullable = false,
            length = 20)
    private String mothersName;

    @OneToMany(mappedBy = "personalData",
            cascade = {CascadeType.MERGE, CascadeType.REMOVE}, fetch = FetchType.EAGER)
    private List<CheckedIn> checkIns = new ArrayList<>();

    @OneToOne(mappedBy = "personalData")
    private ElectoralRegister electoralRegister;
}
