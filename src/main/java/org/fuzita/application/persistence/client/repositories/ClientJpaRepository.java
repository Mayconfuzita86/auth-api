package org.fuzita.application.persistence.client.repositories;

import org.fuzita.application.persistence.client.entities.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClientJpaRepository
        extends JpaRepository<ClientEntity, UUID> {
}
