package com.ecomerce.infraestructure.database.repository.jpa;

import com.ecomerce.infraestructure.database.model.PriceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Repository;

import java.time.OffsetDateTime;

@Repository
public interface JpaPriceRepository extends JpaRepository<PriceEntity, Long> {

  @Query(value = "from prices p" +
      " where p.productId = :productId" +
      " and p.brandId = :brandId" +
      " and p.startDate < :applyDate and p.endDate > :applyDate" +
      " order by p.priority desc")
  Streamable<PriceEntity> findPriceApplyDate (Long productId, Long brandId, OffsetDateTime applyDate);

}
