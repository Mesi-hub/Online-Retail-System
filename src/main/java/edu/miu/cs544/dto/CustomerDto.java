package edu.miu.cs544.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {
    Long id;
    private String firstName;
    private String lastName;
    private String email;

}