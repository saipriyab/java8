package java8;

public interface Guitar {
default void play()
{
	System.out.println("Playing guitar");
}
}
