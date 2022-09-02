package open.data.consume.deputados;

import java.io.IOException;

public interface ApiPort<T> {

    T pegar() throws IOException, InterruptedException;

}
