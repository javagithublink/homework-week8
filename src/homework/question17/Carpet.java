package homework.question17;

public class Carpet {

    double cost;

    Carpet (double cost){
        if (cost <0){
            this.cost = cost = 0;
        }
        this.cost=cost;
    }

    public double getCost(){
        return this.cost;
    }
}

