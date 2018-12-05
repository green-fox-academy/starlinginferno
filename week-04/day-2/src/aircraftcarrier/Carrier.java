package aircraftcarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {

    int ammoStore;
    int HP;
    int carrierDMG;

    List<Aircraft> acCarrier = new ArrayList<>();

    public Carrier(int ammoStore, int HP, int carrierDMG) {
        this.ammoStore = ammoStore;
        this.HP = HP;
        this.carrierDMG = carrierDMG;
    }

    public void add() {
        acCarrier.add(new Aircraft());
    }

    public void fill() throws Exception {
        int sum = 0;
        int sumPriority = 0;
        for (int i = 0; i < acCarrier.size(); i++) {
            sum += (acCarrier.get(i).maxAmmo - acCarrier.get(i).ammo) * i;
            if (acCarrier.get(i).priority) {
                sumPriority += (acCarrier.get(i).maxAmmo - acCarrier.get(i).ammo) * i;
            }
        }
            for (int j = 0; j < acCarrier.size(); j++) {
                if (this.ammoStore >= sum) {
                    this.ammoStore -= sum;
                    acCarrier.get(j).refill(this.ammoStore);
                } else if (this.ammoStore < sum && this.ammoStore >= sumPriority) {
                    this.ammoStore -= sumPriority;
                    if (acCarrier.get(j).priority) {
                        acCarrier.get(j).refill(this.ammoStore);
                    }
                } else {
                    throw new Exception("There's not enough ammo.");
                }
            }
    }

    public void fight (Carrier carrier) {
        for (int i = 0; i < acCarrier.size(); i++) {
            this.carrierDMG += this.acCarrier.get(i).ammo;
            this.acCarrier.get(i).ammo = 0;
        }
        carrier.HP -= this.carrierDMG;
    }

    public void getStatus() {
        if (this.HP <= 0) {
            System.out.println("It's dead Jim :(");
        } else {
            System.out.println("HP: " + this.HP + ", Aircraft count: " + acCarrier.size() + " Ammo Storage: " + this.ammoStore + ", Total damage: " + this.carrierDMG);
            System.out.println("Aircrafts:");
            for (int i = 0; i < acCarrier.size(); i++) {
                acCarrier.get(i).getStatus();
            }
        }
    }

}


// HP: 5000, Aircraft count: 4, Ammo Storage: 2300, Total damage: 2280
//Aircrafts:
//Type F35, Ammo: 12, Base Damage: 50, All Damage: 600