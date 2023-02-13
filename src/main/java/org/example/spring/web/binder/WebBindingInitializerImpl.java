package org.example.spring.web.binder;

import org.example.spring.web.User;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebBindingInitializer;

public class WebBindingInitializerImpl implements WebBindingInitializer {
    @Override
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(User.class, new PropertyEditorSupportImpl());
    }
}
