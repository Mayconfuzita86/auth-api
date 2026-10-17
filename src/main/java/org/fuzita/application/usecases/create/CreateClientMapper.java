package org.fuzita.application.usecases.create;

import org.fuzita.domain.client.Client;

public interface CreateClientMapper {

    static CreateClientResponseDTO toOutput(
            Client client,
            String clientSecret
    ) {
        if (client == null) {
            return null;
        }

        return CreateClientResponseDTO.builder()
                .id(client.getId())
                .name(client.getName())
                .clientKey(client.getClientKey())
                .clientSecret(clientSecret)
                .status(client.getStatus())
                .createdAt(client.getCreatedAt())
                .build();
    }
}
