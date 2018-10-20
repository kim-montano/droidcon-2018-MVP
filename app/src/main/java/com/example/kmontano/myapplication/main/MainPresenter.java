package com.example.kmontano.myapplication.main;

public class MainPresenter implements  MainContract.Presenter{
    private MainContract.View mView;

    MainPresenter(MainContract.View view){
        mView = view;
    }

    @Override
    public void goToSignIn() {
        mView.showSignInScreen();
    }

    @Override
    public void goToSignUp() {
        mView.showSignUpScreen();
    }
}
