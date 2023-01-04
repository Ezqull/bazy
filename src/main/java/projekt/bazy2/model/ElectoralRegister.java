package projekt.bazy2.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "electoral_register")
public class ElectoralRegister extends BaseEntity{

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "personal_data_id",
                referencedColumnName = "id")
    private PersonalData personalData;

    @Column(name = "date_of_receipt_of_voting_rights",
            nullable = false)
    private Date dateOfReceipt;

    @Column(name = "constituency",
            nullable = false,
            length = 40)
    private String constituency;
}
