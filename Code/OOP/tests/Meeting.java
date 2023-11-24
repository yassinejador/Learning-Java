public class Meeting {
    public String subject;
    public Hour start, end;

    public Meeting(String str, Hour s, Hour e) {
        subject = str;
        start = s;
        end = e;
    }

    public int getDuration() { //En Minutes
        return (end.hour * 60 + end.minute) - (start.hour * 60 + start.minute);
    }
}
