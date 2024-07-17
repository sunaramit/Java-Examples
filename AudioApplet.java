import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class AudioApplet extends Applet implements ActionListener {
    private AudioClip audioClip;
    private JButton playButton;
    private JButton stopButton;
    private JButton pauseButton;
    private boolean isPlaying = false;

    @Override
    public void init() {
        // Load the audio clip
        audioClip = getAudioClip(getCodeBase(), "audiofile.wav");

        // Create buttons
        playButton = new JButton("Play");
        stopButton = new JButton("Stop");
        pauseButton = new JButton("Pause");

        // Add action listeners
        playButton.addActionListener(this);
        stopButton.addActionListener(this);
        pauseButton.addActionListener(this);

        // Create a panel and add buttons to it
        JPanel panel = new JPanel();
        panel.add(playButton);
        panel.add(stopButton);
        panel.add(pauseButton);

        // Add the panel to the applet
        setLayout(new BorderLayout());
        add(panel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == playButton) {
            if (!isPlaying) {
                audioClip.play();
                isPlaying = true;
            } else {
                audioClip.loop();
            }
        } else if (e.getSource() == stopButton) {
            audioClip.stop();
            isPlaying = false;
        } else if (e.getSource() == pauseButton) {
            audioClip.stop();
            isPlaying = false;
        }
    }
}
