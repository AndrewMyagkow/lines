import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String f = null;
        int ks = sc.nextInt();
        sc.nextLine();
        String[] mas = new String[ks];
        for (int i=0;i<ks;i++)
        {
            mas[i] = sc.nextLine();

        }
        int z = sc.nextInt();
        sc.nextLine();
        String[] masx = new String[z];
        String[] masy = new String[z];
        for (int i=0;i<z;i++)
        {
            f = sc.nextLine();
            masx[i]=f.substring(0,f.indexOf(" "));
            masy[i]=f.substring(f.lastIndexOf(" ")+1,f.length());
        }
        String[] neww = new String[ks];

        for (int i=0;i<ks;i++)
        {
            for (int j=0;j<z;j++)
            {
                neww[i] = mas[i].replace(masx[j],masy[j]);
                String aaa = (masx[j].substring(0,1));
                aaa=aaa.toUpperCase();
                aaa = aaa.concat(masx[j].substring(1,masx[j].length()));
                String bbb = (masy[j].substring(0,1));
                bbb=bbb.toUpperCase();
                bbb = bbb.concat(masy[j].substring(1,masy[j].length()));
                neww[i] = mas[i].replace(aaa,bbb);

                mas[i]=neww[i];

            }

        }

        for (int i=0;i<ks;i++)
        {
            for (int j=0;j<z;j++)
            {
                neww[i] = mas[i].replace(masx[j],masy[j]);

                mas[i]=neww[i];

            }
            System.out.println(neww[i]);
        }
    }
}