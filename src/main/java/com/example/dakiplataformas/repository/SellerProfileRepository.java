package com.example.dakiplataformas.repository;

import com.example.dakiplataformas.model.SellerProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SellerProfileRepository extends JpaRepository<SellerProfileEntity, UUID> {
}
