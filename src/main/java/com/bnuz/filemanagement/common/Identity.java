package com.bnuz.filemanagement.common;

public enum Identity {

    USER(0),
    ADMIN(1);

    Integer identity;

    Identity(Integer identity){
        this.identity = identity;
    }

    public Integer getIdentity() {
        return identity;
    }
}
