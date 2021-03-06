package com.lihoy21gmail.audioprogect;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Model extends Observable {
    private static Model instance;
    private int myBufferSize = 14000;
    private int sampleRate = 8000;
    private short[] myBuffer = new short[myBufferSize];
    private List<short[]> array_of_words = new ArrayList<>();
    private int SpeechRecognitionResult;
    private boolean changeResult = false;
    double array_of_MFCC[][];

    private Model(){}

    public int getSpeechRecognitionResult() {
        return SpeechRecognitionResult;
    }

    public void setSpeechRecognitionResult(int speechRecognitionResult) {
        SpeechRecognitionResult = speechRecognitionResult;
        setChanged();
        notifyObservers();
    }

    public boolean isChangeResult() {
        return changeResult;
    }

    public void setChangeResult(boolean changeResult) {
        this.changeResult = changeResult;
    }

    public List<short[]> getArray_of_words() {
        return array_of_words;
    }

    public void setArray_of_words(List<short[]> array_of_words) {
        this.array_of_words = array_of_words;
        setChanged();
        notifyObservers();
    }

    public static Model getInstance(){
        if(instance == null){
            instance = new Model();
        }
        return instance;
    }

    public int getMyBufferSize() {
        return myBufferSize;
    }

    public int getSampleRate() {
        return sampleRate;
    }

    public short[] getMyBuffer() {
        return myBuffer;
    }

    public void setMyBuffer(short[] myBuffer) {
        this.myBuffer = myBuffer;
    }

    public double[][] getArray_of_MFCC() {
        return array_of_MFCC;
    }

    public void setArray_of_MFCC(double[][] array_of_MFCC) {
        this.array_of_MFCC = array_of_MFCC;
        setChanged();
        notifyObservers();
    }
}
