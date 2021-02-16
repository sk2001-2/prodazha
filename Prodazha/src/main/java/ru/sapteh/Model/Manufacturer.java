package ru.sapteh.Model;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@EqualsAndHashCode
@RequiredArgsConstructor

public class Manufacturer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 50)
    @NonNull

    private  String name;

    @OneToMany(fetch = FetchType.LAZY), 

    }
}
