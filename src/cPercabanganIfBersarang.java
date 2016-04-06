/**
 * Created by Agengrikh on 06/04/2016.
 */
public class cPercabanganIfBersarang {
    int nilai = 6;
    char index;
    if(nilai >= 8){
        index = 'A';
    }else if(nilai >= 7){
        index = 'B';
    }else if(nilai >= 6){
        index = 'C';
    }else if(nilai >= 5){
        index = 'D';
    }else{
        index = 'E';
    }
    System.out.println(index);
}
