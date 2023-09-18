package entity;

import jakarta.persistence.*;
import lombok.*;

//테이블 역할
@Entity
@Table(name = "Tourism")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TourismEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String TourismName;

    @Column
    private String TourismAddress;

    @Column
    private String TourismDescription;
}
