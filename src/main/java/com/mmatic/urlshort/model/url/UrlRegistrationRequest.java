package com.mmatic.urlshort.model.url;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.http.HttpStatus;

public class UrlRegistrationRequest {

    @JsonProperty(value="Url", required = true)
    private String url;

    @JsonProperty(value="RedirectType", defaultValue = "302")
    private int redirectType = HttpStatus.MOVED_PERMANENTLY.value();

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getRedirectType() {
        return redirectType;
    }

    public void setRedirectType(int redirectType) {
        this.redirectType = redirectType;
    }
}
