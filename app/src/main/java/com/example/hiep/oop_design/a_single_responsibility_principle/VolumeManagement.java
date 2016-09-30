package com.example.hiep.oop_design.a_single_responsibility_principle;

/**
 * Created by Hiep on 9/30/2016.
 */
public class VolumeManagement {
    private Radio mRadio;
    public static final int VOLUME_SEEK=1;
    public static final int VOLUME_DEFAULT=50;
    public static final int VOLUME_MAX=100;

    public VolumeManagement(Radio mRadio) {
        this.mRadio = mRadio;
    }

    public void volumeUp(){
        if (mRadio!=null) {
            int volume=mRadio.getVolume();
            if (volume < VOLUME_MAX) {
                mRadio.setVolume(volume + VOLUME_SEEK);
            }
        }
    }

    public void volumeDown(){
        if (mRadio!=null) {
            int volume=mRadio.getVolume();
            if ( volume> 0) {
                mRadio.setVolume(volume - VOLUME_SEEK);
            }
        }
    }
}
