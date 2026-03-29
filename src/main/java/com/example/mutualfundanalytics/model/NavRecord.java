package com.example.mutualfundanalytics.model;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "nav_records")
public class NavRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nav_data")
    private String nav;

    @Column(name = "category")
    private Date date;

    @ManyToOne
    @JoinColumn(name = "scheme_code")
    private MutualFund mutualFund;

}
