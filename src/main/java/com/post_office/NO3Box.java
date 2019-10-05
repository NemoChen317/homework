package com.post_office;

public class NO3Box extends Box{

    float length = 23;
    float width = 14;
    int height = 13;
    @Override
    boolean validate(float length, float width, int height) {
        if(length < this.length && width < this.width && height < this.height)
            return  true;
        return false;
    }
}
