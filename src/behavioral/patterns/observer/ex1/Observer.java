package behavioral.patterns.observer.ex1;

import java.time.LocalDateTime;

public interface Observer {
    void update(int australia, int america, int uk, LocalDateTime localDateTime);
}
