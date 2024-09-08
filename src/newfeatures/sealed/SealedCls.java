package newfeatures.sealed;
//Java17 feature
//The subclasses of a sealed class must follow one of the following rules:
//
//final: If a subclass is marked final, it cannot be further extended.
//sealed: If a subclass is marked sealed, it must define its own set of permitted subclasses.
//non-sealed: If a subclass is marked non-sealed, it can be freely extended by any other class.
public sealed class SealedCls permits FinalCls, SealedClass, NonSealedClass{
}
