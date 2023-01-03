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
@Table(name = "checked_in")
public class CheckedIn extends BaseEntity{

    @ManyToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(name = "personal_data_id",
                nullable = false)
    private PersonalData personalData;

    @ManyToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(name = "old_address",
                nullable = true)
    private Address oldAddress;

    @ManyToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(name = "new_address",
                nullable = false)
    private Address newAddress;

    @Column(name = "check_in_date",
            nullable = false)
    private Date checkInDate;
}
