package clases;

import interfaces.vehiclesActions;

public class motorcycle extends vehicles implements vehiclesActions{
    private boolean chain;

    @Override
    public void move(){
        System.out.println("i am moving with two wheels");
    }



    @Override
    public void playMusic(String song){
        System.out.printf("playing now (%s)", song);
    }


    public motorcycle(){}

    public motorcycle(String model, String brand, Boolean chain){
        super(model,brand);
        this.chain=chain;
    }

    public boolean getChain(boolean chain){
        return this.chain;
    }

    public void setChain(boolean chain) {
        this.chain = chain;
    } 

    @Override
    public String toString(){
        return "motorcycle: "+
                "model:"+ getModel()+
                "brand"+ getBrand()+
                "chain" + getChain(chain);
    }
}
