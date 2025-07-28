package com.microservice.KYC.KYC.Microservice.Repository;

import com.microservice.KYC.KYC.Microservice.Entity.KYCRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KYCRepository extends JpaRepository<KYCRecord,Long>

{

}
