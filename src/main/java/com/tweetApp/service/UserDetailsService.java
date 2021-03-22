package com.tweetApp.service;

import com.tweetApp.domain.UserDetails;
import com.tweetApp.exception.FieldIsRequiredException;
import com.tweetApp.exception.UserAlreadyExitsException;

import java.text.ParseException;
import java.util.List;

public interface UserDetailsService {

    public UserDetails getRegistrationDetails() throws Exception;
    public void registerNewUser() throws UserAlreadyExitsException, ParseException, FieldIsRequiredException;
    public List<UserDetails> getAllUserDetails();
    public boolean login(String email,String password) ;
    public void forgotPassword() ;
    public void getAllUser();
    public  void resetPassword(String emailId);
    public UserDetails getUserInfo(String email);
}
