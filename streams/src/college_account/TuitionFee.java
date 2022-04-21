package college_account;
@FunctionalInterface
public interface TuitionFee<T> {
     Integer calculateTuitionFees(String courseType,int basicFee,int noOfSemesters);
}
