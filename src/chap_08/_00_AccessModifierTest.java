package chap_08;

import chap_07.BlackBoxRefurbish;

public class _00_AccessModifierTest {
    public static void main(String[] args) {

        BlackBoxRefurbish b_one = new BlackBoxRefurbish();
        b_one.modelName = "까망이"; // public
        // b_one.resolution = "FHD"; // default
        // b_one.price = 650000; // private
        // b_one.color = "블랙"; // protected

    }
}
