package es2;

import entities.Call;
import entities.Sim;

public class Es2 {
    public static void main(String[] args) {
        Sim sim = new Sim("341513513221");


        Call call1 = new Call(3, "341513513155");
        Call call2 = new Call(12, "3423452644244");
        Call call3 = new Call(10, "314513566161344");
        Call call4 = new Call(5, "3415667575511");
        Call call5 = new Call(5, "3156163135316");


        sim.addCall(call1);
        sim.addCall(call2);
        sim.addCall(call3);
        sim.addCall(call4);


        sim.printSimDatas();
    }
}
