public class EX1491_average {
    public static void main(String[] args) {
        int[] salary = {4000,3000,1000,2000};
        System.out.println(average(salary));
        
    }
    public static double average(int[] salary) {
        double total = 0;
        int min = salary[0];
        int max = salary[0];
        for (int i = 0; i < salary.length; i++) {
            if (salary[i] < min) {
                min = salary[i];
            }
            if (salary[i] > max) {
                max = salary[i];
            }
            total += salary[i];
        }
        return (double)(total - max - min) / (salary.length - 2);
    }
}
