package org.example.publisherr.repositories;

import org.example.publisherr.domain.MensajeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MensajeRepository extends JpaRepository<MensajeEntity, Long> {

}
