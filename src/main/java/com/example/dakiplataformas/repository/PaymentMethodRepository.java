package com.example.dakiplataformas.repository;

import com.example.dakiplataformas.model.PaymentMethodEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PaymentMethodRepository extends JpaRepository<PaymentMethodEntity, UUID> {

    List<PaymentMethodEntity> findByIsActiveTrue();

}
