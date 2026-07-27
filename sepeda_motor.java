public class sepeda_motor {
    private String merk;
    private long harga;

    public void setMerk(String merkMotor) {
        merk = merkMotor;
    }

    public String getMerk() {
        return merk;
    }

    public long harga(long hargaMotor) {
        return harga = hargaMotor;
    }

    public class Main {
        public static void main (String[] args) {
            sepeda_motor motor = new sepeda_motor();
            motor.setMerk("yamaha");
            System.out.println("Motor Ini Bermerek: " + motor.getMerk());
            System.out.println("Motor Ini Berharga: " + motor.harga(11000000));
        }
    }
}
