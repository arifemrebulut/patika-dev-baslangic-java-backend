public class AsalSayilar {
    public static void main(String[] args) {
        System.out.println("1 den 100 e kadar olan asal sayılar: ");

        int sayac = 0;
        for(int i = 2; i <= 100; i++)
        {
            int kontrol = 0;
            for (int j = 2; j < i; j++)
            {
                if (i % j == 0)
                {
                    kontrol = 1;
                    break;
                }
            }

            if(kontrol==0)
            {
                System.out.print(i+"\n");
                sayac++;
            }
        }
    }
}
