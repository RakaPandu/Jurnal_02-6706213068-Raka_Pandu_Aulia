package Tugas_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GenArrayList<ATK> aTKList = new GenArrayList<>(9);
        GenArrayList<Bag> bagList = new GenArrayList<>(9);

        for (int i = 0; i < 4; i++) {
            String kodeBarang = input.next();
            String jenisBarang = input.next();
            String namaBarang = input.next();
            int stok = input.nextInt();

            if (!(kodeBarang.split("")[0].equals("A") || kodeBarang.split("")[0].equals("B"))) {
                bagList.addData(new Bag(kodeBarang, jenisBarang, namaBarang, stok));
            } else {
                aTKList.addData(new ATK(kodeBarang, jenisBarang, namaBarang, stok));
            }
        }
        System.out.println();
        System.out.println("ATK :");
        aTKList.displaySort();

        System.out.println("Bag :");
        bagList.displaySort();
        System.out.println();

        int question2;
        int remove;
        int questions = 0;
        int edit;

        System.out.print("Apakah Anda ingin menggunakan fitur lain? (y/n)");
        String opsi = input.next();

        if (opsi.equals("y")) {
            System.out.println("(1 = add, 2 = remove, 3 = edit, 4 = display)");
            questions = input.nextInt();
        }
        else {
            System.out.println("Menghentikan Program");
        }

            while (questions != 0) { //stop
                if (questions == 1) { //add barang
                    System.out.println("Masukan barang :");

                    String kodeBarang = input.next();
                    String jenisBarang = input.next();
                    String namaBarang = input.next();
                    int stok = input.nextInt();

                    if (!(kodeBarang.split("")[0].equals("A") || kodeBarang.split("")[0].equals("B"))) {
                        bagList.addData(new Bag(kodeBarang, jenisBarang, namaBarang, stok));
                    } else {
                        aTKList.addData(new ATK(kodeBarang, jenisBarang, namaBarang, stok));
                    }
                    System.out.println();
                    System.out.println("ATK :");
                    aTKList.displaySort();

                    System.out.println("Bag :");
                    bagList.displaySort();
                    System.out.println();
                }

                if (questions == 2) { //remove
                    System.out.println("(1 = ATK, 2 = Bag)");
                    question2 = input.nextInt();

                    if (question2 == 1) {
                        System.out.println("Masukan baris ke berapa, (diawali dari 0) barang yang ingin di remove :");
                        remove = input.nextInt();
                        aTKList.removeData(remove);
                        aTKList.displaySort();
                    } else {
                        System.out.println("Masukan baris ke berapa, (diawali dari 0) barang yang ingin di remove :");
                        remove = input.nextInt();
                        bagList.removeData(remove);
                        bagList.displaySort();
                    }
                }
                if (questions == 3) { //edit
                    System.out.println("(1 = ATK, 2 = Bag)");
                    question2 = input.nextInt();

                    if (question2 == 1) {
                        System.out.println("Masukan baris ke berapa diawali dari 0 barang yang ingin di edit :");
                        edit = input.nextInt();

                        System.out.println("Masukan Barang pengganti :");
                        String kodeBarang = input.next();
                        String jenisBarang = input.next();
                        String namaBarang = input.next();
                        int stok = input.nextInt();

                        ATK aTKEdit = new ATK(kodeBarang, jenisBarang, namaBarang, stok);
                        aTKList.editData(edit,aTKEdit);

                        System.out.println();
                        System.out.println("ATK :");
                        aTKList.displaySort();
                        System.out.println();

                    } else {
                        System.out.println("Masukan baris ke berapa diawali dari 0 barang yang ingin di edit :");
                        edit = input.nextInt();

                        System.out.println("Masukan Barang pengganti :");
                        String kodeBarang = input.next();
                        String jenisBarang = input.next();
                        String namaBarang = input.next();
                        int stok = input.nextInt();

                        Bag bagEdit = new Bag(kodeBarang, jenisBarang, namaBarang, stok);
                        bagList.editData(edit,bagEdit);

                        System.out.println();
                        System.out.println("Bag :");
                        bagList.displaySort();
                        System.out.println();
                    }
                }
                else {
                    System.out.println();
                    System.out.println("ATK :");
                    aTKList.displaySort();

                    System.out.println("Bag :");
                    bagList.displaySort();
                    System.out.println();
                }
                System.out.println();
                System.out.print("Apakah Anda ingin  lain? (y/n)");
                opsi = input.next();

                if (opsi.equals("y")) {
                    System.out.println("(1 = add, 2 = remove, 3 = edit, 4 = display)");
                    questions = input.nextInt();
                } else {
                    System.out.println();
                    System.out.println("Menghentikan Program");
                    questions = 0;
                }
            }
    }
}
