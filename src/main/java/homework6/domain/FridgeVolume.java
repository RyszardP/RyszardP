package homework6.domain;

public enum FridgeVolume {
    SFridge, MFridge, LFridge;
    public  String FridgeVolumeInf (){
        switch (this) {
            case SFridge:
                return "180";
            case MFridge:
                return "200";
            case LFridge:
                return "220";
            default:
                return "";
        }
    }
}
