package homework.passengers;

import java.util.Map;

public interface Statistics {
    double totalFares(); // выручка от билетов
    Map<String, Double> avgFaresByClasses(); // средняя стоимость билетов по классам
    Map<String, Long> totalSurvived(); // выжили и не выжили
    Map<String, Long> totalSurvivedByGender(); // выжили и не выжили по полу
    Map<String, Long> totalSurvivedChildren(); // выжили и не выжили по детям
}
