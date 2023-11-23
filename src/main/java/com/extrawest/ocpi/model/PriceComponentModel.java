package com.extrawest.ocpi.model;

import com.extrawest.ocpi.model.enums.TariffDimensionType;
import jakarta.validation.constraints.Digits;
import lombok.*;


@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class PriceComponentModel {
    private TariffDimensionType type;

    @Digits(integer = Integer.MAX_VALUE, fraction = 4)
    private Float price;

    @Digits(integer = Integer.MAX_VALUE, fraction = 4)
    private Float vat;

    private int step_size;
}
