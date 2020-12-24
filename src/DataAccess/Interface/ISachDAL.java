package DataAccess.Interface;

import Entities.Sach;

import java.io.IOException;
import java.util.ArrayList;

public interface ISachDAL {
    void Luu(ArrayList<Sach>saches) throws IOException;
    ArrayList<Sach>Doc();

}
