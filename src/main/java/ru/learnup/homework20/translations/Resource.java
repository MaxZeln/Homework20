package ru.learnup.homework20.translations;

import lombok.Data;
import org.springframework.context.support.ResourceBundleMessageSource;

@Data
public class Resource {

    private ResourceBundleMessageSource resource;

    public Resource() {
        resource = new ResourceBundleMessageSource();
        resource.setBasename("text");
    }
}
