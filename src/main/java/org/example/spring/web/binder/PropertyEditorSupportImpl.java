package org.example.spring.web.binder;

import java.beans.PropertyEditorSupport;

public class PropertyEditorSupportImpl extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        System.out.println("PropertyEditorSupport");
        if(text.contains(",")){
            var strings = text.split(",");
            var converterBean = new ConverterBean();
            converterBean.setName(strings[0]);
            converterBean.setAge(Integer.parseInt(strings[1]));
            setValue(converterBean);
        }else {
            setValue(null);
        }
    }
}
