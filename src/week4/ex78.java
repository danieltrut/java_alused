package week4;

public class ex78 {
        public static void main(String[] args) {
            BoundedCounter minutes = new BoundedCounter(59);
            BoundedCounter hours = new BoundedCounter(23);

            int i = 0;
            while ( i < 121 ) {
                System.out.println( hours + ":" + minutes);   // the current time printed
                // advance minutes
                minutes.countMin();
                if ( i == 59 ) {
                    minutes.toZero();
                    hours.countHour();
                }

                // if minutes become zero, advance hours
                i++;
            }
        }
}
