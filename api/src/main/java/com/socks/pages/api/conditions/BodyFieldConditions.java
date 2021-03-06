package com.socks.pages.api.conditions;

import io.restassured.response.Response;
import lombok.RequiredArgsConstructor;
import org.hamcrest.Matcher;

@RequiredArgsConstructor
public class BodyFieldConditions implements Condition {

    private final String jsonPath;
    private final Matcher matcher;


    public void check(Response response) {
        response.then().assertThat().body(jsonPath, matcher);

    }

    @Override
    public String toString() {
        return "Body Field [" + jsonPath + " ] " + matcher;
    }
}
