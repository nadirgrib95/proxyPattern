public class ATMMachine implements GetATMData{

    ATMState hasCard;
    ATMState noCard;
    ATMState hasCorrectPin;
    ATMState atmOutOfMoney;

    ATMState atmState;

    int cashInMachine = 2000;

    public ATMState getYesCardState() { return hasCard; }
    public ATMState getNoCardState() { return noCard; }
    public ATMState getHasPin() { return hasCorrectPin; }
    public ATMState getNoCashState() { return atmOutOfMoney; }

    // NEW STUFF

    public ATMState getATMState() { return atmState; }

    @Override
    public ATMState getATMData() {
        return atmState;
    }

    public int getCashInMachine() { return cashInMachine; }
}
