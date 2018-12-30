package homework6.domain;
    public enum FreezerVolume {
        SFreezer, MFreezer, LFreezer;
        public  String FreezerVolumeInf (){
            switch (this) {
                case SFreezer:
                    return "103";
                case MFreezer:
                    return "143";
                case LFreezer:
                    return "173";
                default:
                    return "";
            }
        }
    }

