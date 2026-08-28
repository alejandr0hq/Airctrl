package airctrl.model;

import java.time.LocalDateTime;

public final class Operation {
    private final Flight flight;
    private final long arrivalOrder;
    private LocalDateTime processedAt;

    public Operation(Flight flight, long arrivalOrder) {
        this.flight = flight;
        this.arrivalOrder = arrivalOrder;
    }

    public void markProcessed() {
        processedAt = LocalDateTime.now();
    }

    public Flight getFlight() {
        return flight;
    }

    public long getArrivalOrder() {
        return arrivalOrder;
    }

    public int getPriority() {
        return flight.getPriority();
    }

    public LocalDateTime getProcessedAt() {
        return processedAt;
    }
}
