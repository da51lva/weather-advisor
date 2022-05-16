package com.techreturners.masterofarts.weatheradvisor.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Schema(description = "Encapsulation of the current weather")
public class Weather {

    /**
     * Current temperature in degrees C
     */
    @Schema(description = "Current temperature in degrees C")
    double temp;

    /**
     * Rainfall in last hour in mm
     */
    @Schema(description = "Rainfall in last hour in mm")
    long rain;

    /**
     * Current cloud cover as %
     */
    @Schema(description = "Current cloud cover as %")
    int cloud;

}
