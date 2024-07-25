package clases;

public class vehicles extends abstractVehicles {
    private String model ; 
    private String brand; 

    //constructor 
    // empty

    public vehicles(){}

    public vehicles(String model, String brand){
        this.model = model;
        this.brand= brand;
    }

    // methods
    public void move(){
        System.out.println("I,m clas father");
    }

    // Getter
    public String getBrand(){
        return this.brand;
    }

    public String getModel(){
        return this.model;
    }

    // setter
    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setModel(String model){
        this.model = model;
    }


    //tostring
    @Override
    public String toString(){
        return "model: "+this.getModel()+" and brand "+this.getBrand();
    }
}
