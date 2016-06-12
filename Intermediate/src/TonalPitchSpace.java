
public class TonalPitchSpace {
	
	public static float calcTonalPitchSpace(int fromDeg , String fromKind , int fromKey , String fromMode , int toDeg , String toKind , int toKey , String toMode){
		
		float tonalPitchSpace = Region.calcRegionDistance(fromKey, fromMode, toKey, toMode)
								+BasicSpace.calcBasicSpaceDistance(fromDeg , fromKind , fromKey , fromMode , toDeg , toKind , toKey , toMode)
								+DiatonicCircleDistance.calcDiatonicCircleDistance(fromDeg , fromKind , fromKey , fromMode , toDeg , toKind , toKey , toMode);
		
		
		return tonalPitchSpace;
	}

}
