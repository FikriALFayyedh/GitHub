public class Tugas_GravityCalculator {
    public static void main(String[] args) {

    double  gravity =-9.81;        // Gravitasi
	double  initialVelocity = 0.0; // kecepatan awal
	double  fallingTime = 10.0;    // Waktu jatuh
	double  initialPosition = 0.0; // Posisi awal
	double  finalPosition = 0.0;   // Posisi akhir

    // x(t) = 0.5 × at2 + vit + xi
	finalPosition = finalPosition = (gravity * (fallingTime * fallingTime)/2) + (initialVelocity * fallingTime) + initialPosition;
    // Posisi akhir = Posisi akhir = (Gravitasi * (Waktu jatuh * Waktu Jatuh)/2) + (kecepatan Awal * Waktu Jatuh) + Posisi Awal;         

    System.out.println("The object's position after " + fallingTime +" seconds is " + finalPosition + " m.");

	}
}

