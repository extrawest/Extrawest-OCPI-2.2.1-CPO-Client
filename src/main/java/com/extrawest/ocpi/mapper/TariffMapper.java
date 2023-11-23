package com.extrawest.ocpi.mapper;

import com.extrawest.ocpi.model.TariffModel;
import com.extrawest.ocpi.model.dto.tariff.TariffDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = TariffElementMapper.class)
public interface TariffMapper {
    TariffModel toModel(TariffDto tariffDTO);

    TariffDto toDto(TariffModel tariff);
}
