package org.machine_coding.Hotel_Management.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RoomType {

    private String roomType;
    private Integer charges;
    private Integer id;
}
