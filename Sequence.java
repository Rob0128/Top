import java.util.ArrayList;

public interface Sequence
{
	void push( String st );
	ArrayList<String> getTopThree();
	void reset();
}