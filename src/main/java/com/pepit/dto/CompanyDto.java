package com.pepit.dto;

import lombok.*;

import java.util.List;

@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CompanyDto {

    Long id;

    String providerName;

    String providerEmail;

    String site;

    String adress;

    String telephone;

    String presentation;

    List<Long> members;
}
