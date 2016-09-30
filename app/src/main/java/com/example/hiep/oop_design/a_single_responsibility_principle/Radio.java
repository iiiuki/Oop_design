package com.example.hiep.oop_design.a_single_responsibility_principle;

/**
 * Created by Hiep on 9/30/2016.
 */
public class Radio {
    private PowerRadioManagement.PowerStage powerStage= PowerRadioManagement.PowerStage.OFF;
    private PowerRadioManagement mPowerRadioManagement;
    private VolumeManagement mVolumeManagement;
    private DisplayRadioDetailManagement mDisplayRadioDetailManagement;
    private int volume=VolumeManagement.VOLUME_DEFAULT;

    public Radio() {
        mPowerRadioManagement=new PowerRadioManagement(this);
        mVolumeManagement=new VolumeManagement(this);
    }

    public PowerRadioManagement.PowerStage getPowerStage() {
        return powerStage;
    }

    public void setPowerStage(PowerRadioManagement.PowerStage powerStage) {
        this.powerStage = powerStage;
    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >=0 && volume <= VolumeManagement.VOLUME_MAX) {
            this.volume = volume;
        }
    }

    public void powerOn(){
        mPowerRadioManagement.setOnRadio();
    }

    public void powerOff(){
        mPowerRadioManagement.setOffRadio();
    }


    public void volumeUp(){
        mVolumeManagement.volumeUp();
    }

    public void volumeDown(){
        mVolumeManagement.volumeDown();
    }

    public void displayRadioDetail(){
        mDisplayRadioDetailManagement.displayPowerStage();
        mDisplayRadioDetailManagement.displayVolume();
    }
}
