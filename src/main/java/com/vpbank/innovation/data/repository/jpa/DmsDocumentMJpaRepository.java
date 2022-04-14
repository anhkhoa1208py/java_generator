package com.vpbank.innovation.data.repository.jpa;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.vpbank.innovation.bean.jpa.DmsDocumentMEntity;

/**
 * Repository : DmsDocumentM.
 */
public interface DmsDocumentMJpaRepository extends PagingAndSortingRepository<DmsDocumentMEntity, BigDecimal> {

}
