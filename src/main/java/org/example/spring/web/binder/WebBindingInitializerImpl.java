package org.example.spring.web.binder;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebBindingInitializer;

public class WebBindingInitializerImpl implements WebBindingInitializer {
    @Override
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(ConverterBean.class, new PropertyEditorSupportImpl());
    }
}
