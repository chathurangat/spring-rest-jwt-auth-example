package com.chathuranga.rest.jwt.auth;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Component
public class SecretKeyProvider {
    public byte[] getKey() throws URISyntaxException, IOException {
        return Files.readAllBytes(Paths.get(this.getClass().getResource("/sample.key").toURI()));
    }
}
