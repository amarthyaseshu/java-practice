package recordbuilder;

//@RecordBuilder
public record Person2(
    String name,
  //  @RecordBuilder.Default int age(18), // Default age = 18
    String email
){}
