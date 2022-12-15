package number6_nested;

public class RadioModele {

    public RadioModele() {
        System.out.println("RadioModule initialized");
    }

    public void call(String number) {
        int length = 10;
//локальный класс. только дефолтный модификатор
        class GSMModule {
            private String phoneNumber;
            private int validNumber;

            public GSMModule(String phoneNumber) {
                this.phoneNumber = phoneNumber;
            }

            public boolean isValid() {
                if (phoneNumber.length() != length) {
                    return false;
                } else {
                    try {
                        validNumber = Integer.parseInt(phoneNumber);
                        return true;
                    } catch (NumberFormatException e) {
                        return false;
                    }
                }
            }

            public void dialIn(){
                if(isValid()) {
                    System.out.println("Calling phone number " + validNumber);
                } else {
                    System.out.println("Phone number is invalid. Please correct phone number");
                }
            }
        }

        GSMModule module = new GSMModule(number);
        module.dialIn();

    }
}
