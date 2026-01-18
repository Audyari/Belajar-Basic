
public class Main {

    public static String[] model = {};

    public static void main(String[] args) {

        model = new String[] { "Audy", "Budi", "Citra", "Dewi", null, "" };

        viewTodoList(model);

    }

    // ini adalah VIEW untuk menampilkan data
    public static void viewTodoList(String[] todoItems) {

        // ini adalah logic untuk mengecek apakah todoItems kosong atau tidak
        if (todoItems == null || todoItems.length == 0) {
            System.out.println("TodoList Masih Kosong");
            return;
        }

        System.out.println("TodoList : ");

        // Tampilkan items
        for (int i = 0; i < todoItems.length; i++) {
            String item = todoItems[i];
            String displayText = formatItemForDisplay(item);
            System.out.println((i + 1) + ". " + displayText);
        }

    }

    // Helper method untuk format tampilan item
    private static String formatItemForDisplay(String item) {
        if (item == null)
            return "Data tidak ada";
        if (item.isEmpty())
            return "Data tidak ada";
        if (item.trim().isEmpty())
            return "Data tidak ada";
        return item;
    }

    // ini adalah VIEW untuk menambahkan data
    public static void viewAddTodoList() {

        System.out.println("Menambahkan TodoList : ");

    }

    // ini adalah VIEW untuk menghapus data
    public static void viewRemoveTodoList() {

        System.out.println("Menghapus TodoList : ");

    }

    // ini adalah VIEW untuk update data
    public static void viewUpdateTodoList() {

        System.out.println("Update TodoList : ");

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