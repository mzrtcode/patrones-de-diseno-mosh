package com.codewithmosh.mediator;

public class ListBox extends UIControl{

    private String selection;

    public ListBox(DialogBox owner) {
        super(owner);
    }



    public void setSelection(String selection) {
        this.selection = selection;
        owner.changed(this);
    }

    public String getSelection() {
        return selection;
    }
}
