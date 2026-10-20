package org.fuzita.application.persistence.client.mappers;

import org.fuzita.application.persistence.client.entities.ClientEntity;
import org.fuzita.domain.client.Client;

public class ClientPersistenceMapper {

    private ClientPersistenceMapper() {
    }

    public static ClientEntity toEntity(Client client) {
        if (client == null) {
            return null;
        }

        return ClientEntity.builder()
                .id(client.getId())
                .name(client.getName())
                .clientKey(client.getClientKey())
                .clientSecretHash(client.getClientSecretHash())
                .status(client.getStatus())
                .createdAt(client.getCreatedAt())
                .build();
    }

    public static Client toDomain(ClientEntity entity) {
        if (entity == null) {
            return null;
        }

        return new Client(
                entity.getId(),
                entity.getName(),
                entity.getClientKey(),
                entity.getClientSecretHash(),
                entity.getStatus(),
                entity.getCreatedAt()
        );
    }
}
