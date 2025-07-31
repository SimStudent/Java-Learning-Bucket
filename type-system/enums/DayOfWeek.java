// import java.lang.StringBuilder;

public enum DayOfWeek {
    Monday, Tuesday, Wednesday,Thursday,Friday,Saturday,Sunday;

    public boolean isWeekDay(){
        if(this==Saturday || this==Sunday) return false;
        else return true;
    }

    public static void main(String[] args){
        for(DayOfWeek d : DayOfWeek.values()){
            System.out.println(d.name() + " "+d.isWeekDay());
        }
    }
}
