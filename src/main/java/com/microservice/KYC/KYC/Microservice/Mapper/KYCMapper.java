package com.microservice.KYC.KYC.Microservice.Mapper;

import com.microservice.KYC.KYC.Microservice.DTO.KYCRecordDTO;
import com.microservice.KYC.KYC.Microservice.Entity.KYCRecord;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface KYCMapper {

    KYCRecordDTO toDto(KYCRecord record);
    KYCRecord toEntity(KYCRecordDTO dto);

}
