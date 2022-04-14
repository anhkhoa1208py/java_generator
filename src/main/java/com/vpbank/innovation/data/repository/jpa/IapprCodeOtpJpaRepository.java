package com.vpbank.innovation.data.repository.jpa;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.vpbank.innovation.bean.jpa.IapprCodeOtpEntity;

/**
 * Repository : IapprCodeOtp.
 */
public interface IapprCodeOtpJpaRepository extends PagingAndSortingRepository<IapprCodeOtpEntity, BigDecimal> {

}
