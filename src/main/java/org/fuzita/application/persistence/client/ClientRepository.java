package org.fuzita.application.persistence.client;

import org.fuzita.domain.client.Client;

public interface ClientRepository {

    Client save(Client client);
}
