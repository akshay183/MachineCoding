package org.machine_coding.Hotel_Management.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.machine_coding.Hotel_Management.commons.PaymentMode;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {

    private PaymentMode paymentMode;
    private Integer transactionId;
    private Integer bookingId;
    private LocalDateTime dateTime;
    private Integer customerId;
}
