package com.example.hiep.oop_design.a_single_responsibility_principle;

/**
 * Created by Hiep on 9/30/2016.
 */
public class DisplayRadioDetailManagement {
    private Radio mRadio;

    public DisplayRadioDetailManagement(Radio mRadio) {
        this.mRadio = mRadio;
    }

    public void displayPowerStage(){
        if (mRadio!=null){
            if (mRadio.getPowerStage()== PowerRadioManagement.PowerStage.ON){
                System.out.println("Radio has been powered on");
            }else {
                System.out.println("Radio has been powered off");
            }
        }
    }

    public void displayVolume(){
        if (mRadio!=null && mRadio.getPowerStage()== PowerRadioManagement.PowerStage.ON){
            System.out.println("Volume: "+mRadio.getVolume());
        }
    }
}
