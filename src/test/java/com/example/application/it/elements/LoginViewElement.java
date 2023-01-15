package com.example.application.it.elements;

import com.vaadin.flow.component.login.testbench.LoginFormElement;
import com.vaadin.flow.component.orderedlayout.testbench.VerticalLayoutElement;
import com.vaadin.testbench.annotations.Attribute;
import org.junit.Assert;

@Attribute(name ="class", contains = "login-view")
public class LoginViewElement extends VerticalLayoutElement {

    public boolean login(String username, String password){
        // Find the LoginForm used on the page
        LoginFormElement form = $(LoginFormElement.class).first();
        // Enter the credentials and log in
        form.getUsernameField().setValue(username);
        form.getPasswordField().setValue(password);
        form.getSubmitButton().click();

        return !$(LoginViewElement.class).onPage().exists();
    }
}
