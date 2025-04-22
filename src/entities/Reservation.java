package entities;

import exceptions.DomainException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reservation {
    private Integer roomNumber;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) throws DomainException {
        if (!checkOut.isAfter(checkIn)) { // Dependendo do exemplo ele não chega a cair nesse if-else
            throw new DomainException("Error in reservation: Check-out date must be after check-in date");
        }
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public Long duration() {
        return ChronoUnit.DAYS.between(getCheckIn(), getCheckOut());
    }

    public void updateDates(LocalDate checkIn, LocalDate checkOut) throws DomainException {
        LocalDate now = LocalDate.now();

        if (checkIn.isBefore(now) || checkOut.isBefore(now)) {
            throw new DomainException("Error in reservation: Reservation dates for update must be future dates");
        }
        if (!checkOut.isAfter(checkIn)) { // Dependendo do exemplo ele não chega a cair nesse if-else
            throw new DomainException("Error in reservation: Check-out date must be after check-in date");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Room " + roomNumber + ", check-in: " + dtf.format(checkIn) + ", check-out: " + dtf.format(checkOut) + ", " + duration() + " nights";
    }
}
