package com.csaba79coder.yanasjl.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class User extends Identifier {

    String firstName;
    String lastName;
    String email;
}
