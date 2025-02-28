package com.furkanarslan.pageable.entitiy;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Department")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "location")
    private String location;
    @Column(name = "name")
    private String name;




}
