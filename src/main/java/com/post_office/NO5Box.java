package com.post_office;

public class NO5Box extends Box{

    float length = 39.5f;
    float width = 27.5f;
    int height = 23;

    @Override
    boolean validate(float length, float width, int height) {
        if(length < this.length && width < this.width && height < this.height)
            return  true;
        return false;
    }
}
