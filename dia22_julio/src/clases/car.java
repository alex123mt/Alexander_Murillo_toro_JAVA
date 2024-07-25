package clases;

import interfaces.vehiclesActions;

public class car extends vehicles implements vehiclesActions {
    private Integer windows;

    @Override
    public void move(){
        System.out.println(" i am moving with four wheels");
    }


    @Override
    public void playMusic(String song){
        System.out.printf("playing now (%s)", song);
    }

    public car(){}

    public car(String model, String brand, Integer windows){
        super(model,brand);
        this.windows=windows;
    }


    public Integer getWindows(Integer windows){
        return this.windows;
    }

    public void setWindows(Integer windows) {
        this.windows = windows;
    } 

    @Override
    public String toString(){
        return "motorcycle: "+
                "model:"+ getModel()+
                "brand"+ getBrand()+
                "windows" + getWindows(windows);
    }
    
}
