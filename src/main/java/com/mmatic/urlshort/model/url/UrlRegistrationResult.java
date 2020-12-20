package com.mmatic.urlshort.model.url;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UrlRegistrationResult {

    @JsonProperty (value="ShortUrl")
    private String shortUrl;

    public UrlRegistrationResult(String shortUrl) {
        this.shortUrl = shortUrl;
    }
}
