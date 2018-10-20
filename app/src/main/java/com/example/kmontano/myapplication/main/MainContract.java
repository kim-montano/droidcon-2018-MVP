package com.example.kmontano.myapplication.main;

public interface MainContract {
    interface View{
        void showSignInScreen();

        void showSignUpScreen();
    }

    interface Presenter{

        void goToSignIn();

        void goToSignUp();
    }
}
