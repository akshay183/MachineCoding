package org.machine_coding.Snake_Ladder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class Player {

    int id;

    String playerName;

    int numMatchesPlayed;
}
