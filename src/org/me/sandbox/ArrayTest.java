package org.me.sandbox;

import java.lang.reflect.Array;

/**
 * Created by bjjeong on 8/12/15.
 */
public class ArrayTest {
    protected Class elemClass;


    public static void main(String[] args) {
        new ArrayTest().arrayInstance();
    }

    private void arrayInstance() {
        System.out.printf("--- array new instance test ---\n");

        try {
            Object[] value = null;
            this.elemClass = String.class;
            value = (Object[])((Object[]) Array.newInstance(this.elemClass, 5177));
            System.out.printf("string array length: %d\n", value.length);
        }
        catch (Error error){
            System.out.println(error);
        }
    }
}
