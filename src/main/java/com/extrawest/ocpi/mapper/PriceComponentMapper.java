package com.extrawest.ocpi.mapper;

import com.extrawest.ocpi.model.PriceComponentModel;
import com.extrawest.ocpi.model.dto.tariff.PriceComponent;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PriceComponentMapper {
    PriceComponentModel toModel(PriceComponent dto);

    PriceComponent toDto(PriceComponentModel model);
}
