package dev.nclark;

// extends Object can create super version which has no arguments and does nothing???
// research what super does to learn more
public class Pet {

    //    elements of object
    private final int id;
    private final String name;
    private final String type;
    private final String gender;

    private Integer age;
    private final int primaryOwnerId;
    private final Integer secondaryOwnerId;

    //        constructor
//    A finalized field must have a constructor
//    want to have Pets with and without age? Make multiple constructors
    private Pet(final int pId, final String pName, final String pType, final String pGender,
                final Integer pAge, final int pPrimaryOwnerId, final Integer pSecondaryId) {
        id = pId;
        name = pName;
        type = pType;
        gender = pGender;
        age = pAge;
        primaryOwnerId = pPrimaryOwnerId;
        secondaryOwnerId = pSecondaryId;
    }



    public static Pet of(final int pId, final String pName, final String pType, final String pGender,
                         final Integer pAge, final int pPrimaryOwnerId, final Integer pSecondaryId) {
        return new Pet(pId, pName, pType, pGender, pAge, pPrimaryOwnerId, pSecondaryId);
    }

    //    This entire setup is for if you really need to cache the hash for something, but also need age to be mutable.
//    Seems like a really obscure use case
    public void setAge(final Integer pAge) {
        age = pAge;
        hashCode = null;
    }

    public String getName() {
        return name;
    }

    //only when necessary
    private Integer hashCode = null;

    @Override
    public int hashCode() {
        if (hashCode == null) {
            //calculate hash code here
            hashCode = 15;
        }
        return hashCode;
    }

//    this is the cleaner, more frequently used solution
    /*
    @Override
    public int hashCode() {
        return 15;
    }*/


}
