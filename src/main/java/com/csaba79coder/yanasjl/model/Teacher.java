package com.csaba79coder.yanasjl.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "teacher")
public class Teacher extends User {

    private boolean isContractor;
}
