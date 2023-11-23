package com.extrawest.ocpi.model;

import com.extrawest.ocpi.model.dto.DisplayText;
import com.extrawest.ocpi.model.dto.Price;
import com.extrawest.ocpi.model.dto.location.EnergyMix;
import com.extrawest.ocpi.model.enums.TariffType;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "tariffs")
@Data
@NoArgsConstructor
public class TariffModel {

    private String countryCode;

    private String partyId;

    @Id
    private String id;

    private String currency;

    private TariffType type;

    private List<DisplayText> tariffAltText;

    private String tariffAltUrl;

    private Price minPrice;

    private Price maxPrice;

    private List<TariffElementModel> elements;

    private LocalDateTime startDateTime;

    private LocalDateTime endDateTime;

    private EnergyMix energyMix;

    private LocalDateTime lastUpdated;
}