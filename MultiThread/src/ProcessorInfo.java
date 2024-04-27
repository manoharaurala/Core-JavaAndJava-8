public class ProcessorInfo {
    public static void main(String[] args) {
        System.out.println("total processor available: "+Runtime.getRuntime().availableProcessors());
        System.out.println("total memory available to jvm: "+Runtime.getRuntime().totalMemory());
        System.out.println("total memory used by jvm: "+(Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory()));

    }
}
