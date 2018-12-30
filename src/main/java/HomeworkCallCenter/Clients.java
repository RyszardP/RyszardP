package HomeworkCallCenter;

public class Clients {
    public String clientName;
    public int clientID;
    public int speakTimeMS = 2000;

    public Clients(String clientName, int clientID) {
        this.clientName = clientName;
        this.clientID = clientID;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public int getSpeakTimeMS() {
        return speakTimeMS;
    }

    public void setSpeakTimeMS(int speakTimeMS) {
        this.speakTimeMS = speakTimeMS;
    }
}
