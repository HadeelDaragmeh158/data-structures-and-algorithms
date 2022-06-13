package leftJoin;

import leftJoin.Hash.HashTable;

import java.util.ArrayList;
import java.util.List;

public class LeftJoin {
    public List<String> leftJoin(HashTable t1, HashTable t2){

        List<String> lstLeftJoin = new ArrayList<>();
        System.out.println();
        for(Object key : t1.keys()){
            if(t1.contains(key)){

                lstLeftJoin.add(" { " + key +  " , " + t1.get(key)+ " , " + t2.get(key)+ " }  ");
            } else{

                lstLeftJoin.add(" { " + key + " , " + t1.get(key) + " , " + null + " } ");
            }
        }
        return lstLeftJoin;
    }
}
