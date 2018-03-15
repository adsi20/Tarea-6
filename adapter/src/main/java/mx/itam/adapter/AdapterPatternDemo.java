package mx.itam.adapter;

public class AdapterPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AudioPlayer audioPlayer = new AudioPlayer();

	      audioPlayer.play("mp3", "elSapito.mp3");
	      audioPlayer.play("mp4", "BailedelGorila.mp4");
	      audioPlayer.play("vlc", "TItanicTheme.vlc");
	      audioPlayer.play("avi", "HimnoNacional.avi");
	}

}
