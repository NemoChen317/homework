package com.post_office;

public abstract class Box {
    float length;
    float width;
    int height;
    abstract boolean validate(float length , float width , int height);
}
