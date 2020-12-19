public class Main {

    public static void main(String[] args) {
	// write your code here
        String fileName = "Lab9.txt";
        Permutation permutation = new Permutation(fileName);
        permutation.writePermutations("CODE");
        System.out.println("Written to "+ fileName +" successfully.");
    }
}
