package org.machine_coding.Hotel_Management.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.machine_coding.Hotel_Management.commons.HousekeepingType;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Housekeeping {

    private Integer houseKeeperId;
    private HousekeepingType housekeepingType;
    private Integer roomId;
    private LocalDate dateServiced;
    private LocalTime momentServiced;
}
