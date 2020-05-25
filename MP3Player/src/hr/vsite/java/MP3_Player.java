package hr.vsite.java;

import jaco.mp3.player.*;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class MP3_Player
{
    private final MP3Player player;
    private File songFile;
    private boolean repeat;
    private boolean isPlaying;
    private boolean songOpened;
    private JFileChooser fileChooser;

    
    
    public MP3_Player()
    {
        player = new MP3Player();
        repeat = false;
        isPlaying = false;
        songOpened = false;
    }
    
    public boolean IsOpened()
    {
        return songOpened;
    }

    public void OpenSong()
    {
        fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("What song do you want?");
        int res = fileChooser.showOpenDialog(null);
        if(res == JFileChooser.APPROVE_OPTION)
        {
            songFile = fileChooser.getSelectedFile();
            if(songFile.getName().endsWith(".mp3"))
            {
                player.addToPlayList(songFile);
                player.skipForward();
                songOpened = true;
            }
            else
            {
                JOptionPane.showMessageDialog(fileChooser, "Error", "Invalid file type.", JOptionPane.ERROR_MESSAGE);
                OpenSong();
            }
        }
    }
    
    public String songName()
    {
        return songFile.getName(); 
    }

    public void Stop()
    {
        player.stop();
        isPlaying = false;
    }
    
    public void Play()
    {
        if(!isPlaying) 
        {
            player.play();
            isPlaying = true;
        } 
    }
    
    public void Pause()
    {
        if(isPlaying)
        {
            player.pause();
            isPlaying = false;
        }
    }
    
    public void VolumeUp(Double valueToPlusMinus)
    {
        Mixer.Info[] mixers = AudioSystem.getMixerInfo();
        for(Mixer.Info mixerInfo : mixers){
            Mixer mixer = AudioSystem.getMixer(mixerInfo);
            Line.Info[] lineInfos = mixer.getTargetLineInfo();
            for(Line.Info lineInfo : lineInfos){
                Line line = null;
                boolean opened = true;
                try{
                    line = mixer.getLine(lineInfo);
                    opened = line.isOpen() || line instanceof Clip;
                    if(!opened){
                        line.open();
                    }
                    FloatControl volControl = (FloatControl) line.getControl(FloatControl.Type.VOLUME);
                    float currentVolume = volControl.getValue();
                    Double volumeToCut = valueToPlusMinus;
                    float changedCalc = (float) ((float)currentVolume+(double)volumeToCut);
                    volControl.setValue(changedCalc);
                    
                }catch (LineUnavailableException | IllegalArgumentException lineException){
                }finally{
                    if(line != null && !opened){
                        line.close();
                    }
                }
            }
        }
    
    }
    
    public void VolumeDown(Double valueToPlusMinus){
        Mixer.Info[] mixers = AudioSystem.getMixerInfo();
        for(Mixer.Info mixerInfo : mixers){
            Mixer mixer = AudioSystem.getMixer(mixerInfo);
            Line.Info[] lineInfos = mixer.getTargetLineInfo();
            for(Line.Info lineInfo : lineInfos){
                Line line = null;
                boolean opened = true;
                try{
                    line = mixer.getLine(lineInfo);
                    opened = line.isOpen() || line instanceof Clip;
                    if(!opened){
                        line.open();
                    }
                    FloatControl volControl = (FloatControl) line.getControl(FloatControl.Type.VOLUME);
                    float currentVolume = volControl.getValue();
                    Double volumeToCut = valueToPlusMinus;
                    float changedCalc = (float) ((float)currentVolume-(double)volumeToCut);
                    volControl.setValue(changedCalc);
                    
                }catch (LineUnavailableException | IllegalArgumentException lineException){
                }finally{
                    if(line != null && !opened){
                        line.close();
                    }
                }
            }
        }
    }
    
    public void Repeat()
    {  
        if(repeat)
        {
            repeat = false;
            player.setRepeat(repeat);
        }
        else
        {
            repeat = true;
            player.setRepeat(repeat);
        }
    }
    
    public boolean isRepeatEnable()
    {
        return repeat;
    }
    
    public boolean isPlaying()
    {
        return isPlaying;
    }
} 