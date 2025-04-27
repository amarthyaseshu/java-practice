package recordbuilder;

// need to add io.soabase.record-builder dependency
//@RecordBuilder
public record Person(
    String name,
    int age,
    String email
) {}