package com.service.mapper;

import com.domain.*;
import com.service.dto.StorepwtDTO;

import org.mapstruct.*;
import java.util.List;

/**
 * Mapper for the entity Storepwt and its DTO StorepwtDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface StorepwtMapper {

    StorepwtDTO storepwtToStorepwtDTO(Storepwt storepwt);

    List<StorepwtDTO> storepwtsToStorepwtDTOs(List<Storepwt> storepwts);

    Storepwt storepwtDTOToStorepwt(StorepwtDTO storepwtDTO);

    List<Storepwt> storepwtDTOsToStorepwts(List<StorepwtDTO> storepwtDTOs);
}
