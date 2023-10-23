import java.util.Scanner;

class Particle {
    private int energy;

    public Particle(int energy) {
        this.energy = energy;
    }

    public int getEnergy() {
        return energy;
    }

    public void collide(Particle other) {
        if (this.energy > 0 && other.getEnergy() > 0) {
            int diff = Math.abs(this.energy - other.getEnergy());
            this.energy = diff;
            other.energy = 0;
        }
    }
}
public class w9{
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        Particle[] particles = new Particle[N];
        for (int i = 0; i < N; i++) {
            int energy = scanner.nextInt();
            particles[i] = new Particle(energy);
        }
        scanner.close();

        int totalEnergy = 0;
        boolean collisionOccurred;

        do {
            collisionOccurred = false;
            for (int i = 0; i < N - 1; i++) {
                if (particles[i].getEnergy() > 0 && particles[i + 1].getEnergy() > 0) {
                    particles[i].collide(particles[i + 1]);
                    collisionOccurred = true;
                }
            }
        } while (collisionOccurred);

        for (Particle particle : particles) {
            totalEnergy += particle.getEnergy();
        }

        System.out.println(totalEnergy-1);
    }
}
