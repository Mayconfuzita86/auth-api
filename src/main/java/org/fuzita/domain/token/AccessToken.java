package org.fuzita.domain.token;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.Instant;

@Getter
@AllArgsConstructor
public class AccessToken {

    private final String value;
    private final String tokenType;
    private final Instant expiresAt;

}
