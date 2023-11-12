package org.machine_coding.Hotel_Management.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.machine_coding.Hotel_Management.commons.Block;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Admin {

    private Integer id;
    private String name;
    private Block block;
    private Integer hotelId;
}
