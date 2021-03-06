package com.backend.domain.moment.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class MomentRequest {

    @NotNull
    @JsonProperty("location_id")
    private Long locationId;

    @NotNull
    @JsonProperty("trip_id")
    private Long tripId;

    @NotNull
    private String content;

    @NotNull
    private int cost;

    @NotNull
    private int sequence;

}
