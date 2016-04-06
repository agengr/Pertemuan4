/**
 * Created by Agengrikh on 06/04/2016.
 */
public class dPercabanganSwitchElse {
    int hari = 5;
    switch(hari){
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
            System.out.println("Bukan Hari Libur");
            break;
        case 7:
            System.out.println("Hari Libur");
            break;
        default:
            System.out.println("Hari Tidak Diketahui");
            break;
    }
}
