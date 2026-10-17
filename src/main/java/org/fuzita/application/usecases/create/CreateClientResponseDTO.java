package org.fuzita.application.usecases.create;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.fuzita.domain.client.ClientStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.UUID;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateClientResponseDTO {

    private UUID id;
    private String name;
    private String clientKey;
    private String clientSecret;
    private ClientStatus status;
    private Instant createdAt;

}
