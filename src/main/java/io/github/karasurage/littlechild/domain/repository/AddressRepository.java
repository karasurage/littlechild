package io.github.karasurage.littlechild.domain.repository;

import io.github.karasurage.littlechild.domain.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
