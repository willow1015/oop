package oop;

import java.util.ArrayList;

public class Shape {

    protected Vector2d position; // 필수
    protected Vector3d color;

    ArrayList<OnClickListener> listeners = new ArrayList<OnClickListener>();

    public void onClick(Vector2d point) {
        for (OnClickListener onClickListener : listeners) {
            onClickListener.Onclick(point);
        } //브로드캐스팅해주는거
    }

    public void setPosition(Vector2d position) {
        this.position = position;
    }

    public void setColor(Vector3d color){
        this.color = color;
    }

    public void addOnClickListener(OnClickListener l){
        listeners.add(l);
    }

    
    
}