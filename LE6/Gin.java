class Gin extends Decorator{
    Gin(Offering offering){
        this.offering = offering ;
    }
    String getName(){
        return offering.getName() + "with gin";
    }
    int getPrice(){
        return offering.getPrice() + 55;
    }
}