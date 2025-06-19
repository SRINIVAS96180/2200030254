package builderpatternexample;

public class BuilderDemo {
    public static void main(String[] args) {
        Computer basic = new Computer.Builder()
                .cpu("Intel i3")
                .ram(8)
                .storage(256)
                .build();

        Computer gaming = new Computer.Builder()
                .cpu("AMD Ryzen 9")
                .ram(32)
                .storage(1024)
                .gpu("NVIDIA RTX 4080")
                .build();

        Computer workstation = new Computer.Builder()
                .cpu("Intel Xeon")
                .ram(64)
                .storage(2048)
                .gpu("NVIDIA Quadro")
                .build();

        System.out.println(basic);
        System.out.println(gaming);
        System.out.println(workstation);
    }
}