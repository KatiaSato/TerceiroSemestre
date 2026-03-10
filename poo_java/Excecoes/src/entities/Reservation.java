package entities;

import exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(Date checkOut, Date checkIn, int roomNumber) throws DomainException {
        if (!checkIn.after(checkIn)) {
            throw  new DomainException("Check-out date most be after check-in date");
        }
        this.checkOut = checkOut;
        this.checkIn = checkIn;
        this.roomNumber = roomNumber;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }
    public long duration() {
        /*calcular a diferença entre as datas em milesegundos
          getTime() devolve a quantidade em milesegundos daquela data*/
        long diff = checkOut.getTime() - checkIn.getTime();
        //TimeUnit (tipo enumerado) - classe para converter milesegundos para dias*/
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }
    /*Atualiza o checkin*/
    public void updateDates(Date checkIn, Date checkOut) throws DomainException {
        /*checkIn do objeto recebe o valor de checkin do metodo que veio como argumento */
        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)) {
            /*Excecao usada quando argumentos passados para o metodo sao invalidos*/
            throw new DomainException("Reservation dates for update must be future dates");
        }
        if (!checkOut.after(checkIn)) {
            throw new DomainException("Error in reservation: Check-out date must be future dates");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }
    @Override
    public String toString() {
        return "Room"
                + roomNumber
                + ", check-in: "
                + sdf.format(checkIn)
                + ", check-out: "
                + sdf.format(checkOut)
                + ", "
                + duration()
                + " nights";
    }
}
