import bm_Hamming.Hamming;

public class Main {
    public static void main(String[] args) {
MicroBlog microBlog = new MicroBlog();
        String expected = "Fly 🛫";
        String result = microBlog.truncate(expected);
        System.out.println(result);
    }
};