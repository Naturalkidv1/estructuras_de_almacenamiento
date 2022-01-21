package array_list;

public class ejercicio_de_prueba {

    public static void main(String[] args) {

        // excepción posible: ArrayIndexOutofBonds
        int[] num = new int[3];

        for (int i = 0; i < num.length; i++) {
            num[i] = 3;
        }

        int[] num2 = {1, 2, 3, 4, 5, 6};
        
        for (int i = 0; i < num2.length; i++) {
            System.out.println(num2[i]+"");
        }
    }

}
