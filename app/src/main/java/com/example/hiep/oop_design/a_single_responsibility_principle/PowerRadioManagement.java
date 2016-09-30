package com.example.hiep.oop_design.a_single_responsibility_principle;

/**
 * Created by Hiep on 9/30/2016.
 */
public class PowerRadioManagement {
    public  enum PowerStage{
        ON,OFF
    }

    private Radio mRadio;
    public PowerRadioManagement(Radio mRadio) {
        this.mRadio = mRadio;
    }

    public void setOnRadio(){
        if (mRadio!=null && mRadio.getPowerStage()==PowerStage.OFF){
            mRadio.setPowerStage(PowerStage.ON);
        }
    }

    public void setOffRadio(){
        if (mRadio!=null && mRadio.getPowerStage()==PowerStage.ON){
            mRadio.setPowerStage(PowerStage.OFF);
        }
    }
}
