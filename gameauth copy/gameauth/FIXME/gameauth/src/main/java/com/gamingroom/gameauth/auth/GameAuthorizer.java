package com.gamingroom.gameauth.auth;

import io.dropwizard.auth.Authorizer;

public class GameAuthorizer implements Authorizer<GameUser> 
{
    @Override
    public boolean authorize(GameUser user, String role) {
    	
        // FIX ME: Finish the authorize method based on BasicAuth Security Example
        // Return true if the user's role matches the given role
    return user.getRole().equals(role);
    	
    }
}