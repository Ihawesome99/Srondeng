package Latihan4;
public class Bus3 {
    public int penumpang;
    public int maxpenumpang;
    /**
     *
     * @param maxpenumpang
     */
    public Bus3(int maxpenumpang)
    {
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }        
    //Method Mutator
    public void addpenumpang (int penumpang)
    {
        int temp;
        temp = this.penumpang+penumpang;
        if (temp> maxpenumpang)
        {
            System.out.println("Penumpang Melebihi Kuota ");
        }
        else
        {
            this.penumpang=temp;
        }
    }
    public void getpenumpang (int password)
    {
        if (password==24)
        {
            System.out.println("Password Benar");
        }
        else
        {
            System.out.println("Password salah");
        }           
    }
    public void cetakpenumpang()
    {
        System.out.println("Penumpang Bus Sekarang= "+penumpang);
        System.out.println("Maksimum penumpang yang seharusnya adalah= "+maxpenumpang);
    }      
}