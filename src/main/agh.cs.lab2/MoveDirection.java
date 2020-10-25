public enum MoveDirection {

    FORWARD, BACKWARD, LEFT, RIGHT;

    @Override
    public String toString(){
        switch(this) {
            case FORWARD: return "do przodu";
            case BACKWARD: return "do tylu";
            case LEFT: return "w lewo";
            case RIGHT: return "w prawo";
        }
        return "";
    }
}
