package copyingarrays;

public class ArrayCopier {

    private void copy(int src[], int dst[]) {

        // print starting arrays
        System.out.println("Start with:");
        System.out.print("src as: ");
        for (int i = 0; i < src.length; i++) {
            System.out.print(src[i] + " ");
        }
        System.out.println();
        System.out.print("dst as: ");
        for (int i = 0; i < dst.length; i++) {
            System.out.print(dst[i] + " ");
        }
        System.out.println();

        //copy src into dst

        // src is same length or longer
        if (src.length >= dst.length) {
            for (int i = 0; i < dst.length; i++) {
                dst[i] = src[i];
            }
        }
        // src shorter, fill rest of dst with zeros

        if (src.length < dst.length) {
            for (int i = src.length; i < dst.length; i++) {
                dst[i] = 0;
            }
        }

        // print finishing arrays
        System.out.println("At the end:");
        System.out.print("src as: ");
        for (int i = 0; i < src.length; i++) {
            System.out.print(src[i] + " ");
        }
        System.out.println();
        System.out.print("dst as: ");
        for (int i = 0; i < dst.length; i++) {
            System.out.print(dst[i] + " ");
        }
        System.out.println();
    }
}

	