package ru.itmo.wp.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class PostCredentials {
    @NotNull
    @NotEmpty
    @Size(min = 2, max = 100)
    private String title;

    @NotNull
    @NotEmpty
    @Size(min = 1, max = 65000)
    private String text;

    @Pattern(regexp = "[a-zA-Z\\s]*", message = "Expected only Latin letters")
    private String tags;

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
