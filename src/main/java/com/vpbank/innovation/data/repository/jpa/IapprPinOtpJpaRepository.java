package com.vpbank.innovation.data.repository.jpa;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.vpbank.innovation.bean.jpa.IapprPinOtpEntity;

/**
 * Repository : IapprPinOtp.
 */
public interface IapprPinOtpJpaRepository extends PagingAndSortingRepository<IapprPinOtpEntity, BigDecimal> {

}
