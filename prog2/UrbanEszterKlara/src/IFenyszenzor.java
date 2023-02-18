import java.time.LocalTime;

public interface IFenyszenzor {
    int fenyIntenzitastMer();

    void napHosszBeallit(LocalTime napKelte, LocalTime napNyugta);
}
