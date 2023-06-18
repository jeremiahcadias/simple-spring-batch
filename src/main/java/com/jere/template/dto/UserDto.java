package com.jere.template.dto;

import com.jere.template.marker.OnCreate;
import com.jere.template.marker.OnUpdate;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
public class UserDto {

    @NotBlank(message = "User Id is required", groups = OnUpdate.class)
    private String userId;

    @NotBlank(message = "First Name is required", groups = OnCreate.class)
    private String firstName;

    @NotBlank(message = "Last Name is required", groups = OnCreate.class)
    private String lastName;
}
