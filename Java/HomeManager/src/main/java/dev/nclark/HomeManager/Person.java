package dev.nclark.HomeManager;

import lombok.*;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@RequiredArgsConstructor(staticName = "of")
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
@Entity(name = "person")
public class Person {

    @Id
    @SequenceGenerator(
            name = "person_sequence",
            sequenceName = "person_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "person_sequence"
    )

    //person_id
    @Column(
            name = "person_id",
            updatable = false,
            nullable = false,
            columnDefinition = "SERIAL"
    )
    @Setter @Getter private int person_id;

    //person_firstname
    @Column(
            name = "person_firstname",
            nullable = false,
            columnDefinition = "TEXT"
    )
    @Setter @Getter private String person_firstname;

    //person_lastname
    @Column(
            name = "person_lastname",
            nullable = false,
            columnDefinition = "TEXT"
    )
    @Setter @Getter private String person_lastname;

    //person_description
    @Column(
            name = "person_description",
            nullable = true,
            columnDefinition = "TEXT"
    )
    @Setter @Getter private String person_description;

    //no description constructor
    public Person(int person_id, String person_firstname, String person_lastname) {
        this.person_id = person_id;
        this.person_firstname = person_firstname;
        this.person_lastname = person_lastname;
    }
}
