package com.example.carownerapp;

import android.app.Application;

import java.util.ArrayList;

public class ApplicationClass extends Application {
    public static ArrayList<Car> cars;
    @Override
    public void onCreate() {
        super.onCreate();
        cars = new ArrayList<Car>();
        cars.add(new Car("Mercedes","AMG-W500","Mustapha Idris Suleiman","CST/17/COM/01112","MSI12KT","08061651401"));
        cars.add(new Car("Ford","F-350","Na'im Musa","CST/17/COM/01130","NMK30KT","09035818507"));
        cars.add(new Car("Bugatti","VEYRON","Abdullahi Idris","CST/17/COM/01110","AIH10BC","08031591755"));
        cars.add(new Car("Porsche","CAYMAN","Halliru Abubakar Dabai","CST/17/COM/01080","HAD80KT","08086929719"));
        cars.add(new Car("Volkswagen","ATLAS","Ahmed Abdullahi Hassan","CST/17/COM/01103","AAH03KN","08065504803"));
        cars.add(new Car("Nissan","ALTIMA","Ibrabim Sunusi Alkali","CST/17/COM/01140","ISA40KN","08039206270"));
        cars.add(new Car("Porsche","GTS","Mustapha Bashir","CST/17/COM/01093","MBD93DR","08060353774"));
        cars.add(new Car("Toyota","AVALON","Maryam Muktar Ali","CST/17/COM/01087","MMA87KN","08184712181"));
        cars.add(new Car("Kia","SELTO","Ishaq Mariam Oyiza","CST/17/COM/01114","IMO14KG","08137563353"));
        cars.add(new Car("Volkswagen","TIGUAN","Yakubu Sheffi Oyiza","CST/16/COM/00774","YSO74KG","08158334199"));
        cars.add(new Car("Bugatti","CHIRON","Peter Owen Ugochukwu","CST/13/COM/00571","POU71KD","07061610961"));
        cars.add(new Car("Toyota","CAMRY","Hajarat Garba Mu'azu","CST/16/COM/00579","HGM79KN","08038371220"));
        cars.add(new Car("Ford","F-150","Abdulmajeed Hameed","CST/17/COM/01158","AHK58KG","08038083701"));
        cars.add(new Car("Kia","CERATO","Muhammed Adeiza Adam","CST/17/COM/01085","MAA85KG","07034782651"));
        cars.add(new Car("Mercedes","E350","Yakub Y Abdulkarim","CST/17/COM/01073","YYA73KD","08068992128"));
        cars.add(new Car("Volkswagen","JETTA","Daniel John Odhegba","CST/17/COM/01133","DJO13KT","08146007081"));
        cars.add(new Car("Porsche","BOXTER","Umar Faruk Isah","CST/16/COM/00642","UFI42FT","09076207193"));
        cars.add(new Car("Ford","F-600","Shamsuddeen Garba","CST/17/COM/01164","SGG64GM","09032695324"));
        cars.add(new Car("Nissan","ARMADA","Bilal Hussaini Mustapha","CST/16/COM/00618","BHM18AB","09055014596"));
    }
}
