package com.sasstech.sapphire.controllers;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@RunWith(MockitoJUnitRunner.class)
public class HomeControllerTest {

    private HomeController homeController = new HomeController();

    @Test
    public void shouldViewHome(){
        // given

        // when
        String homeView = homeController.entryView();

        // then
        assertThat(homeView, is("home"));
    }

}
