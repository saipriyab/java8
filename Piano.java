package java8;

public interface Piano {
	default void play()
	{
		System.out.println("Playing piano");
	}
}
