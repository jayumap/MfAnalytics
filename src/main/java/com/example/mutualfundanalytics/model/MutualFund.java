package com.example.mutualfundanalytics.model;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "mutual_funds")
public class MutualFund {
    @Id
    private long schemeCode;

    @Column(name = "scheme_name")
    private String schemeName;

    @Column(name = "amc_name")
    private String amcName;

    @Column(name = "category")
    private String category;

    @OneToMany(mappedBy = "mutualFund", cascade = CascadeType.ALL)
    private List<NavRecord> navRecords;
}
