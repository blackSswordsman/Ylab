package com.astra;

import java.util.Optional;

public  class AuthenticationService {

    public static final AuthenticationService INSTANCE = new AuthenticationService();


    public boolean authenticateUser(String login, String password){
        Optional<Credentials> optionalCredentials = CredentialsRepository.INSTANCE.getByLogin(login);
        if(optionalCredentials.isEmpty()){
            return false;
        } else if (optionalCredentials.get().verifyPassword(password)) {
            CurrentUserHolder.setCurrentUser(optionalCredentials.get().getUser());
            return true;
        }
        return false;
    }

    public void registerUser(Credentials credentials) throws LoginConflictException {
        if (!CredentialsRepository.INSTANCE.existsByLogin(credentials.getLogin())) {
            CredentialsRepository.INSTANCE.save(credentials);
        } else {
            throw new LoginConflictException(credentials.getLogin());
        }
    }
}
