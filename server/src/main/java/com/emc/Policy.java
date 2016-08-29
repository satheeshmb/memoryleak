package com.emc;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Policy {

    @Id
    private String id;

    private String policyName;

    private List<Client> clients;
}