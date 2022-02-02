
package com.shop.entities;

/**
 *
 * @author deepanshu
 */
public class Message {
    private String Content;
    private String Type;
    private String cssClass;

    public String getContent() {
        return Content;
    }

    public void setContent(String Content) {
        this.Content = Content;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getCssClass() {
        return cssClass;
    }

    public void setCssClass(String cssClass) {
        this.cssClass = cssClass;
    }

    public Message(String Content, String Type, String cssClass) {
        this.Content = Content;
        this.Type = Type;
        this.cssClass = cssClass;
    }


}

