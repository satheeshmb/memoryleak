package hello.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Arrays;

@Document
public class Policy {

    @Id
    private String id;

    @Version
    private Long version;

    /** policy names need to be unique */
    @Indexed(unique = true)
    private String policyName;
}