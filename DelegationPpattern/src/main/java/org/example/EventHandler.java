package org.example;

import java.util.ArrayList;
import java.util.List;

public class EventHandler {
    private List<Event> objects;

    public EventHandler() {
        objects= new ArrayList<Event>();
    }

    public void addEvent(Object object,String methodname, Object... args){
        objects.add(new Event(object,methodname,args));
    }

    public void notifyX() throws Exception {
        for (Event e:objects){
            e.invoke();
        }
    }
}
