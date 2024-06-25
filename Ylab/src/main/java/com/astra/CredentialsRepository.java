package com.astra;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class CredentialsRepository {
    public static final CredentialsRepository INSTANCE = new CredentialsRepository();
    private final Map<String,Credentials> credentialsMap = new ConcurrentHashMap<>();

    public Optional<Credentials> getByLogin(String login) {
        return Optional.ofNullable(credentialsMap.get(login));
    }
    public boolean existsByLogin(String login){
       return credentialsMap.containsKey(login);
    }
    public void save(Credentials credentials){
        credentialsMap.put(credentials.getLogin(),credentials);
    }
}
