package DataAccess.Interface;

import Entities.Nguoi;

import java.io.IOException;
import java.util.ArrayList;

public interface INguoiDAL {
    void Luu(ArrayList<Nguoi> nguois) throws IOException;
    ArrayList<Nguoi> Doc();
}
