package com.microservice.KYC.KYC.Microservice.Controller;

import com.microservice.KYC.KYC.Microservice.DTO.KYCRecordDTO;
import com.microservice.KYC.KYC.Microservice.Entity.KYCRecord;
import com.microservice.KYC.KYC.Microservice.Service.KYCService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kyc")
@Tag(name = "KYC Verification", description = "Endpoints for KYC operations")
public class KYCController {

    KYCService kycService;

    @Autowired
    public KYCController(KYCService kycService) { this.kycService = kycService;
    }

    @PostMapping
    @Operation(summary="create a new KYC Record")
    public ResponseEntity<KYCRecordDTO> create(KYCRecordDTO dto)
    {
       KYCRecordDTO kycRecordDTO= kycService.createKYC(dto);
        return ResponseEntity.ok(kycRecordDTO);
    }

    @PostMapping("/verify")
    @Operation(summary = "Verify the KYC Record")
    public ResponseEntity<KYCRecordDTO> verify(KYCRecordDTO kycRecordDTO)
    {
     return ResponseEntity.ok(kycService.verifyRequest(kycRecordDTO));
    }
}
