package com.csaba79coder.yanasjl.model;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class User extends Identifier {

    String firstName;
    String lastName;
    String email;
}
