package com.campusdual.classroom;

public class Exercise11 {
    public static void main(String[] args) {
        TVRemote redRemote = new TVRemote("Rojo");
        TVRemote blackRemote = new TVRemote("Negro");
        System.out.println(redRemote.getColor());
        System.out.println(blackRemote.getColor());
        redRemote.turnOn();
        redRemote.channelUp();
        redRemote.channelDown();
        // Establecer el canal en 0, intentar bajar un canal y comprobar que no se puede
        System.out.println(redRemote.getChannel());
        redRemote.channelDown();
        System.out.println(redRemote.getChannel());
        redRemote.volumeUp();
        redRemote.volumeDown();
        // Establecer el volumen en 0, intentar bajar el volumen y comprobar que no se puede
        System.out.println(redRemote.getVolume());
        for (int i = 20; i > 0; i--) {
            redRemote.volumeDown();
        }
        System.out.println(redRemote.getVolume());
        redRemote.volumeDown();
        System.out.println(redRemote.getVolume());
        System.out.println(redRemote.getColor());
        redRemote.turnOff();
    }

}