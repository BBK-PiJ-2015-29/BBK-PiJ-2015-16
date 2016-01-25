package mergesort;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    private int length;

    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        ms.launch();
    }

    public void launch() {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add((int) Math.abs(10000 * Math.random()));
        }
        printList(list);
        System.out.println("=> => =>");
        list = sort(list);
        printList(list);
    }

    public List<Integer> sort(List list) {
        if (list.size() <= 1) {
            return list;
        }
        //split array in half
        List<Integer> front = new ArrayList<Integer>();
        List<Integer> back = new ArrayList<Integer>();
        for (int i = 0; i < list.size() / 2; i++) {
            int z = (int) list.get(i);
            front.add(z);
        }
        for (int i = list.size() / 2; i < list.size(); i++) {
            int z = (int) list.get(i);
            back.add(z);
        }
        //sort each half
        sort(front);
        sort(back);

        //integration
        int frontCount = 0;
        int backCount = 0;
        int buildListIndex = 0;
        while (frontCount < front.size() && backCount < back.size()) {
            if (front.get(frontCount) < back.get(backCount)) {
                int z = (int) front.get(frontCount);
                list.set(buildListIndex, z);
                frontCount++;
            } else {
                int z = (int) back.get(backCount);
                list.set(buildListIndex, z);
                backCount++;
            }
            buildListIndex++;
        }

        while (frontCount < front.size()) {
            int z = (int) front.get(frontCount);
            list.set(buildListIndex, z);
            frontCount++;
            buildListIndex++;
        }
        while (backCount < back.size()) {
            int z = (int) back.get(backCount);
            list.set(buildListIndex, z);
            backCount++;
            buildListIndex++;
        }
        return list;
    }

    public void printList(List list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get((i)) + " < ");
        }
        System.out.println();
    }
}