package com.ajreifsnyder.IntegratedNumPad;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;

/**
 * @author areif-dev
 */
public class Main {

    /**
     * Add the global key listener
     * @param args None
     */
    public static void main(String[] args) {

        System.setOut(null);
        System.setErr(null);

        try {
            GlobalScreen.registerNativeHook();
        } catch (NativeHookException e) {
            e.printStackTrace();
            System.exit(1);
        }

        GlobalScreen.addNativeKeyListener(new KeyController());
    }
}