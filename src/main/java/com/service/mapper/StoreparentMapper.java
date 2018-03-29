package com.service.mapper;

import com.domain.*;
import com.service.dto.StoreparentDTO;

import org.mapstruct.*;
import java.util.List;

/**
 * Mapper for the entity Storeparent and its DTO StoreparentDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface StoreparentMapper {

    StoreparentDTO storeparentToStoreparentDTO(Storeparent storeparent);

    List<StoreparentDTO> storeparentsToStoreparentDTOs(List<Storeparent> storeparents);

    Storeparent storeparentDTOToStoreparent(StoreparentDTO storeparentDTO);

    List<Storeparent> storeparentDTOsToStoreparents(List<StoreparentDTO> storeparentDTOs);
}
