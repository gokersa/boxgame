public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    int dodge;

    Match (Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run () {
        if (isCheck()){
            while (this.f1.weight>0 && this.f2.weight>0){
                int chance = Math.round((float)Math.random());
                System.out.println("chance : "+chance);
                if(chance ==0){
                    f2.health = f1.hit(f2);
                    if (isWinn())break;
                    f1.health = f2.hit(f1);
                    if (isWinn()) break;
                }
                if(chance ==1){
                    f1.health = f2.hit(f1);
                    if (isWinn()) break;
                    f2.health = f1.hit(f2);
                    if (isWinn()) break;
                    }
                System.out.println(this.f1.health);
            }
        }else{
            System.out.println("Dövüşçülerin sikletleri uygun değildir.");
        }

    }

    public boolean isCheck (){
        return((this.f1.weight>=this.minWeight&&this.f1.weight<=this.maxWeight) && (this.f2.weight>=this.minWeight&&this.f2.weight<=this.maxWeight));
    }
    boolean isWinn(){
        if (this.f1.health==0){
            System.out.println("Dövüşü kazanan: " + this.f2.name);
            return true;
        }
        else if (this.f2.health==0){
            System.out.println("Dövüşü kazanan: " + this.f1.name);
            return true;
        }
        return false;
    }

   }

