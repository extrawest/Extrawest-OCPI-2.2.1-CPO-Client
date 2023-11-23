package com.extrawest.ocpi.mapper;

import com.extrawest.ocpi.model.TariffElementModel;
import com.extrawest.ocpi.model.dto.tariff.TariffElement;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = PriceComponentMapper.class)
public interface TariffElementMapper {
    TariffElementModel toModel(TariffElement tariffDTO);

    TariffElement toDto(TariffElementModel tariff);
}
