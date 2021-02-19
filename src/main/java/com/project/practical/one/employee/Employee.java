package com.project.practical.one.employee;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Getter
@Setter
public class Employee {
    private int id;
    private String name;
    private String mobile;
}
