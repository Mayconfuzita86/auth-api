package org.fuzita.domain.client;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.time.Instant;
import java.util.UUID;


@Getter
@AllArgsConstructor
public class Client {

    private final UUID id;
    private final String name;
    private final String clientKey;
    private final String clientSecretHash;
    private final ClientStatus status;
    private final Instant createdAt;

    public boolean isActive() {
        return status == ClientStatus.ACTIVE;
    }

}
