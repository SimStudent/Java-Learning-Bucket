public enum OrderStatus {
    PLACED, SHIPPED, DELIVERED, CANCELLED;

    public boolean canCancel(){
        if(this==CANCELLED || this==DELIVERED) return false;
        else return true;
    }
    

}
