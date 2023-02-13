package org.example.spring.web.binder;

import org.example.spring.web.User;

import java.beans.PropertyEditorSupport;

public class PropertyEditorSupportImpl extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        System.out.println("PropertyEditorSupport");
        if(text.contains(",")){
            var strings = text.split(",");
            var user = new User();
            user.setName(strings[0]);
            user.setAge(Integer.parseInt(strings[1]));
            setValue(user);
        }else {
            setValue(null);
        }
    }
}
