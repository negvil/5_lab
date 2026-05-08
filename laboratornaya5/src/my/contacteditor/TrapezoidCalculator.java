package my.contacteditor;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TrapezoidCalculator implements Runnable {
    private double start;      
    private double end;      
    private double step;      
    private double partialResult;
    private long executionTime; // время выполнения в миллисекундах
    
    public TrapezoidCalculator(double start, double end, double step) {
        this.start = start;
        this.end = end;
        this.step = step;
        this.partialResult = 0.0;
        this.executionTime = 0;
    }
    
    public double getPartialResult() {
        return partialResult;
    }
    
    public long getExecutionTime() {
        return executionTime;
    }
    
    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        LocalTime startLocalTime = LocalTime.now();
        
        double current = start;
        double sum = 0;
        
        while (current < end) {
            double h = Math.min(step, end - current);
            sum += h * (Math.sqrt(current) + Math.sqrt(current + h)) / 2;
            current += h;
        }
        
        partialResult = sum;
        executionTime = System.currentTimeMillis() - startTime;
        LocalTime endLocalTime = LocalTime.now();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
        
        System.out.println("Поток " + Thread.currentThread().getName());
        System.out.println("Время начала: " + startLocalTime.format(formatter));
        System.out.println("Время окончания: " + endLocalTime.format(formatter));
        System.out.println("Время выполнения: " + executionTime + " мс");
        System.out.println("Интервал: [" + start + "; " + end + "]");
        System.out.println("Результат: " + partialResult);
    }
}