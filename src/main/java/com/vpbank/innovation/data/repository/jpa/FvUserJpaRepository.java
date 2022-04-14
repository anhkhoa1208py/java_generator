package com.vpbank.innovation.data.repository.jpa;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.vpbank.innovation.bean.jpa.FvUserEntity;

/**
 * Repository : FvUser.
 */
public interface FvUserJpaRepository extends PagingAndSortingRepository<FvUserEntity, BigDecimal> {

}
