package com.techreturners.masterofarts.weatheradvisor.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Weather {

    double temp;
    long rain;
    int cloud;

}
