package tn.zelda.projects.java8.samples.optional;

enum Side { NONE, LEFT, RIGHT }

public class ChainLink {
    private ChainLink left, right;
    
    public void append(ChainLink rightPart) {
        if (this.right != null)
            throw new IllegalStateException("Link is already connected.");

        this.right = rightPart;
        rightPart.left = this;
    }
    
    public Side longerSide() {

        int left = computetLeftSide(this, 0);
        int right = computetRightSide(this, 0);
        if(left > right) {
            return Side.LEFT;
        }else if(right > left){
            return  Side.RIGHT;
        }else {
            return Side.NONE;
        }
    }

    public int computetLeftSide(ChainLink l, int length ) {
        if(l.left != null) {
            return computetLeftSide(l.left,length+1);
        }else{
            return length;
        }
    }

    public int computetRightSide(ChainLink l, int length ) {
        if(l.right != null) {
            return computetLeftSide(l.right,length+1);
        }else{
            return length;
        }
    }

    
    public static void main(String[] args) {
        ChainLink left = new ChainLink();
        ChainLink middle = new ChainLink();
        ChainLink right = new ChainLink();
        left.append(middle);
        middle.append(right);

        System.out.println(left.longerSide());
    }
}