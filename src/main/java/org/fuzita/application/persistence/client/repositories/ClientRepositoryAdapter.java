package org.fuzita.application.persistence.client.repositories;

import lombok.RequiredArgsConstructor;
import org.fuzita.application.persistence.client.mappers.ClientPersistenceMapper;
import org.fuzita.domain.client.Client;
import org.fuzita.domain.client.repository.ClientRepository;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ClientRepositoryAdapter implements ClientRepository {

    private final ClientJpaRepository clientJpaRepository;

    @Override
    public Client save(Client client) {
        var entity = ClientPersistenceMapper.toEntity(client);
        var savedEntity = clientJpaRepository.save(entity);

        return ClientPersistenceMapper.toDomain(savedEntity);
    }
}
