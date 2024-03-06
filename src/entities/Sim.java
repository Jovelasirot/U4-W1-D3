package entities;


public class Sim {
    private String phoneNumber;
    private double remainingLoad;
    private Call[] lastCalls;
    private int numCalls;


    public Sim(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.remainingLoad = 0.0;
        this.lastCalls = new Call[5];
        this.numCalls = 0;
        for (int i = 0; i < lastCalls.length; i++) {
            lastCalls[i] = new Call(0, "");
        }
    }


    public void printSimDatas() {
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Load remaining: " + remainingLoad + "$");

        System.out.println("Last five calls:");
        for (int i = 0; i <= numCalls; i++) {
            Call call = lastCalls[i];
            System.out.println("Number called: " + call.getNumberCalled());
            System.out.println("Call Duration: " + call.getDuration() + "min");
            System.out.println("-----------------------");
        }
    }

    public void addCall(Call call) {
        if (numCalls < 5) {
            lastCalls[numCalls] = call;
            numCalls++;
        } else {
            for (int i = 0; i < 4; i++) {
                lastCalls[i] = lastCalls[i + 1];

            }
            lastCalls[4] = call;
        }
    }


}
