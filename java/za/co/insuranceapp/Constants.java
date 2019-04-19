package ke.co.insuranceapp;

public class Constants {

    public enum DialogType {
        DEPOSIT(0),
        WITHDRAW(1),
        TRANSFER(2),
        REQUEST(3),
        REPAY(4);

        private int dialogType;

        DialogType(int i) {
            dialogType = i;
        }

        public int getDialogType() {
            return dialogType;
        }

        public void setDialogType(int dialogType) {
            this.dialogType = dialogType;
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }
}
