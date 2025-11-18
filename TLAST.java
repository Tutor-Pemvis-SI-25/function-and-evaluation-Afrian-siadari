//Afrian Josse Siadari - 12S25003
import java.util.*;
import java.lang.Math;

public class TLAST {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] ltugas = new String[10];
        String perintah;
        int i;

        perintah = input.nextLine();
        do {
            perintah = input.nextLine();
            if (perintah.equals("---")) {
            } else {
                if (perintah.equals("add task")) {
                    for (i = 0; i <= 10; i++) {
                        ltugas[i] = input.nextLine();
                        Kmatkul[i] = input.nextLine();
                        status[i] = input.nextLine();
                        kesulitan[i] = input.nextLine();
                        dedline[i] = input.nextLine();
                        keterangan[i] = input.nextLine();
                        if (ltugas[i].equals("---")) {
                            i = 10;
                        }
                    }
                    perintah = input.nextLine();
                    if (perintah.equals("show assignment")) {
                    } else {
                        if (perintah.equals("update task status")) {
                        }
                    }
                }
            }
        } while (!perintah.equals("---"));
    }
}

