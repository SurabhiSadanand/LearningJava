
public class PremiumMember {

	public static void main(String[] args) {
		
		String requiredMembershipType = "Gold";
		String membershipType = "Gold";
		
	    int pointsNeeded = 5000;
	    int earnedPoints = 5000;
		
		boolean isMembershipTypeGold = membershipType.equals(requiredMembershipType);
		boolean isPointsEarned = earnedPoints>=pointsNeeded;
		boolean isPremiumMember = isMembershipTypeGold && isPointsEarned;
		
		System.out.println("is Premium Member: "+isPremiumMember);
	}

}
