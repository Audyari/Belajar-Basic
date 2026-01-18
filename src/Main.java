
public class Main {

    public static String[] model = {};

    public static void main(String[] args) {

        model = new String[] { "Audy", "Budi", "Citra", "Dewi", "Eka" };

        tampilData();

    }

    // ini adalah method untuk menampilkan data
    public static void tampilData() {
        for (int i = 0; i < model.length; i++) {
            System.out.println(model[i]);
        }
    }

    // ini adalah method untuk menambah data
    public static void tambahData(String data) {

    }

    // ini adalah method untuk menghapus data
    public static void hapusData(String data) {

    }

    // ini adalah method untuk update data
    public static void updateData(String data) {

    }
}