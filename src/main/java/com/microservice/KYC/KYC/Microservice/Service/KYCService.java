package com.microservice.KYC.KYC.Microservice.Service;

import com.microservice.KYC.KYC.Microservice.DTO.KYCRecordDTO;
import com.microservice.KYC.KYC.Microservice.Entity.KYCRecord;
import com.microservice.KYC.KYC.Microservice.Enum.KycStatus;
import com.microservice.KYC.KYC.Microservice.Mapper.KYCMapper;
import com.microservice.KYC.KYC.Microservice.Repository.KYCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.microservice.KYC.KYC.Microservice.Enum.KycStatus.Verified;

@Service
public class KYCService {

    KYCRepository kycRepository;

    KYCMapper mapper;

    public KYCService(KYCRepository kycRepository, KYCMapper mapper) {
        this.kycRepository = kycRepository;
        this.mapper = mapper;
    }

    public KYCRecordDTO createKYC(KYCRecordDTO kycdto)
    {
       KYCRecord kycRecord = mapper.toEntity(kycdto);
       return mapper.toDto(kycRepository.save(kycRecord));
    }

    public KYCRecordDTO verifyRequest(KYCRecordDTO recordDTO) {
      KYCRecord record= mapper.toEntity(recordDTO);
       record.setStatus(Verified);

        return mapper.toDto(record);
    }

}
