package org.machine_coding.Hotel_Management.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Room {

    private Integer bookingId;
    private Integer roomTypeId;
    private Integer roomId;
    private Boolean isAllotted;

}
