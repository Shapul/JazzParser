
public class DiatonicCircleDistance {
	
	
	public static int calcDiatonicCircleDistance(int fromDeg , String fromKind , int fromKey , String fromMode , int toDeg , String toKind , int toKey , String toMode){
		
		int diatonicCircle[] ={0,0,0,0,0,0,0};
		int diatonicChord[] ={0,0,0,0,0,0,0};
		int diatonicCircleDistance = 0;
		int fromMin;
		int fromMinNum = 0;
		int toMin;
		int toMinNum = 0;
		
		int Experiment = 1;
		
		
		if(fromMode.equals("M")){
			diatonicChord[0] = fromKey;
			diatonicChord[1] = 2+fromKey;
			diatonicChord[2] = 4+fromKey;
			diatonicChord[3] = 5+fromKey;
			diatonicChord[4] = 7+fromKey;
			diatonicChord[5] = 9+fromKey;
			diatonicChord[6] = 11+fromKey;	
		}
		else if((fromMode.equals("m"))||(fromMode.equals("hm"))){
			diatonicChord[0] = fromKey;
			diatonicChord[1] = 2+fromKey;
			diatonicChord[2] = 3+fromKey;
			diatonicChord[3] = 5+fromKey;
			diatonicChord[4] = 7+fromKey;
			diatonicChord[5] = 8+fromKey;
			diatonicChord[6] = 10+fromKey;
		}
		
		for(int i=0;i<7;i++){
			if(diatonicChord[i]>11){
				diatonicChord[i] = diatonicChord[i]-12;
			}
		}
		
		
		if(fromMode.equals("M")){
			diatonicCircle[0] = BasicSpace.calcBasicSpaceDistance(diatonicChord[0], "M" , fromKey, fromMode,fromDeg, fromKind, fromKey, fromMode);
			diatonicCircle[1] = BasicSpace.calcBasicSpaceDistance(diatonicChord[1], "m" , fromKey, fromMode,fromDeg, fromKind, fromKey, fromMode);
			diatonicCircle[2] = BasicSpace.calcBasicSpaceDistance(diatonicChord[2], "m" , fromKey, fromMode,fromDeg, fromKind, fromKey, fromMode);
			diatonicCircle[3] = BasicSpace.calcBasicSpaceDistance(diatonicChord[3], "M" , fromKey, fromMode,fromDeg, fromKind, fromKey, fromMode);
			diatonicCircle[4] = BasicSpace.calcBasicSpaceDistance(diatonicChord[4], "M" , fromKey, fromMode,fromDeg, fromKind, fromKey, fromMode);
			diatonicCircle[5] = BasicSpace.calcBasicSpaceDistance(diatonicChord[5], "m" , fromKey, fromMode,fromDeg, fromKind, fromKey, fromMode);
			diatonicCircle[6] = BasicSpace.calcBasicSpaceDistance(diatonicChord[6], "mFlat5" , fromKey, fromMode,fromDeg, fromKind, fromKey, fromMode);
		}
		
		if((fromMode.equals("m"))||(fromMode.equals("hm"))){
			diatonicCircle[0] = BasicSpace.calcBasicSpaceDistance(diatonicChord[0], "m" , fromKey, fromMode,fromDeg, fromKind, fromKey, fromMode);
			diatonicCircle[1] = BasicSpace.calcBasicSpaceDistance(diatonicChord[1], "mFlat5" , fromKey, fromMode,fromDeg, fromKind, fromKey, fromMode);
			diatonicCircle[2] = BasicSpace.calcBasicSpaceDistance(diatonicChord[2], "M" , fromKey, fromMode,fromDeg, fromKind, fromKey, fromMode);
			diatonicCircle[3] = BasicSpace.calcBasicSpaceDistance(diatonicChord[3], "m" , fromKey, fromMode,fromDeg, fromKind, fromKey, fromMode);
			diatonicCircle[4] = BasicSpace.calcBasicSpaceDistance(diatonicChord[4], "M" , fromKey, fromMode,fromDeg, fromKind, fromKey, fromMode);
			diatonicCircle[5] = BasicSpace.calcBasicSpaceDistance(diatonicChord[5], "M" , fromKey, fromMode,fromDeg, fromKind, fromKey, fromMode);
			diatonicCircle[6] = BasicSpace.calcBasicSpaceDistance(diatonicChord[6], "M" , fromKey, fromMode,fromDeg, fromKind, fromKey, fromMode);
		}
		
		fromMin = diatonicCircle[0];
		
		for(int i=1;i<7;i++){
			if(diatonicCircle[i]<fromMin){
				fromMin = diatonicCircle[i];
				fromMinNum = i;
			}
		}
		
		//�l�a���ɑ΂��čăg���C
		if(!(fromMin == 0)){
			
			if(fromMode.equals("M")){
				diatonicCircle[0] = BasicSpace.calcBasicSpaceDistance(diatonicChord[0], "M7" , fromKey, fromMode,fromDeg, fromKind, fromKey, fromMode);
				diatonicCircle[1] = BasicSpace.calcBasicSpaceDistance(diatonicChord[1], "m7" , fromKey, fromMode,fromDeg, fromKind, fromKey, fromMode);
				diatonicCircle[2] = BasicSpace.calcBasicSpaceDistance(diatonicChord[2], "m7" , fromKey, fromMode,fromDeg, fromKind, fromKey, fromMode);
				diatonicCircle[3] = BasicSpace.calcBasicSpaceDistance(diatonicChord[3], "M7" , fromKey, fromMode,fromDeg, fromKind, fromKey, fromMode);
				diatonicCircle[4] = BasicSpace.calcBasicSpaceDistance(diatonicChord[4], "Mm7" , fromKey, fromMode,fromDeg, fromKind, fromKey, fromMode);
				diatonicCircle[5] = BasicSpace.calcBasicSpaceDistance(diatonicChord[5], "m7" , fromKey, fromMode,fromDeg, fromKind, fromKey, fromMode);
				diatonicCircle[6] = BasicSpace.calcBasicSpaceDistance(diatonicChord[6], "mFlat57" , fromKey, fromMode,fromDeg, fromKind, fromKey, fromMode);
			}
			
			if((fromMode.equals("m"))||(fromMode.equals("hm"))){
				diatonicCircle[0] = BasicSpace.calcBasicSpaceDistance(diatonicChord[0], "m7" , fromKey, fromMode,fromDeg, fromKind, fromKey, fromMode);
				diatonicCircle[1] = BasicSpace.calcBasicSpaceDistance(diatonicChord[1], "mFlat57" , fromKey, fromMode,fromDeg, fromKind, fromKey, fromMode);
				diatonicCircle[2] = BasicSpace.calcBasicSpaceDistance(diatonicChord[2], "M7" , fromKey, fromMode,fromDeg, fromKind, fromKey, fromMode);
				diatonicCircle[3] = BasicSpace.calcBasicSpaceDistance(diatonicChord[3], "m7" , fromKey, fromMode,fromDeg, fromKind, fromKey, fromMode);
				diatonicCircle[4] = BasicSpace.calcBasicSpaceDistance(diatonicChord[4], "Mm7" , fromKey, fromMode,fromDeg, fromKind, fromKey, fromMode);
				diatonicCircle[5] = BasicSpace.calcBasicSpaceDistance(diatonicChord[5], "M7" , fromKey, fromMode,fromDeg, fromKind, fromKey, fromMode);
				diatonicCircle[6] = BasicSpace.calcBasicSpaceDistance(diatonicChord[6], "Mm7" , fromKey, fromMode,fromDeg, fromKind, fromKey, fromMode);
			}
			
			fromMin = diatonicCircle[0];
			
			for(int i=1;i<7;i++){
				if(diatonicCircle[i]<fromMin){
					fromMin = diatonicCircle[i];
					fromMinNum = i;
				}
			}
			
			
			
			if(!(fromMin == 0)){
				diatonicCircleDistance=diatonicCircleDistance+Experiment;
			}
			
		}
		
		
/////////////////////////////////////////////////////////////////////////////		
		//��������to
		if(fromMode.equals("M")){
			diatonicChord[0] = fromKey;
			diatonicChord[1] = 2+fromKey;
			diatonicChord[2] = 4+fromKey;
			diatonicChord[3] = 5+fromKey;
			diatonicChord[4] = 7+fromKey;
			diatonicChord[5] = 9+fromKey;
			diatonicChord[6] = 11+fromKey;	
		}
		else if((fromMode.equals("m"))||(fromMode.equals("hm"))){
			diatonicChord[0] = fromKey;
			diatonicChord[1] = 2+fromKey;
			diatonicChord[2] = 3+fromKey;
			diatonicChord[3] = 5+fromKey;
			diatonicChord[4] = 7+fromKey;
			diatonicChord[5] = 8+fromKey;
			diatonicChord[6] = 10+fromKey;
		}
		
		for(int i=0;i<7;i++){
			if(diatonicChord[i]>11){
				diatonicChord[i] = diatonicChord[i]-12;
			}
		}
		
		
		if(fromMode.equals("M")){
			diatonicCircle[0] = BasicSpace.calcBasicSpaceDistance(diatonicChord[0], "M" , fromKey, fromMode,toDeg, toKind, toKey, toMode);
			diatonicCircle[1] = BasicSpace.calcBasicSpaceDistance(diatonicChord[1], "m" , fromKey, fromMode,toDeg, toKind, toKey, toMode);
			diatonicCircle[2] = BasicSpace.calcBasicSpaceDistance(diatonicChord[2], "m" , fromKey, fromMode,toDeg, toKind, toKey, toMode);
			diatonicCircle[3] = BasicSpace.calcBasicSpaceDistance(diatonicChord[3], "M" , fromKey, fromMode,toDeg, toKind, toKey, toMode);
			diatonicCircle[4] = BasicSpace.calcBasicSpaceDistance(diatonicChord[4], "M" , fromKey, fromMode,toDeg, toKind, toKey, toMode);
			diatonicCircle[5] = BasicSpace.calcBasicSpaceDistance(diatonicChord[5], "m" , fromKey, fromMode,toDeg, toKind, toKey, toMode);
			diatonicCircle[6] = BasicSpace.calcBasicSpaceDistance(diatonicChord[6], "mFlat5" , fromKey, fromMode,toDeg, toKind, toKey, toMode);
		}
		
		if((fromMode.equals("m"))||(fromMode.equals("hm"))){
			diatonicCircle[0] = BasicSpace.calcBasicSpaceDistance(diatonicChord[0], "m" , fromKey, fromMode,toDeg, toKind, toKey, toMode);
			diatonicCircle[1] = BasicSpace.calcBasicSpaceDistance(diatonicChord[1], "mFlat5" , fromKey, fromMode,toDeg, toKind, toKey, toMode);
			diatonicCircle[2] = BasicSpace.calcBasicSpaceDistance(diatonicChord[2], "M" , fromKey, fromMode,toDeg, toKind, toKey, toMode);
			diatonicCircle[3] = BasicSpace.calcBasicSpaceDistance(diatonicChord[3], "m" , fromKey, fromMode,toDeg, toKind, toKey, toMode);
			diatonicCircle[4] = BasicSpace.calcBasicSpaceDistance(diatonicChord[4], "M" , fromKey, fromMode,toDeg, toKind, toKey, toMode);
			diatonicCircle[5] = BasicSpace.calcBasicSpaceDistance(diatonicChord[5], "M" , fromKey, fromMode,toDeg, toKind, toKey, toMode);
			diatonicCircle[6] = BasicSpace.calcBasicSpaceDistance(diatonicChord[6], "M" , fromKey, fromMode,toDeg, toKind, toKey, toMode);
		}
		
		toMin = diatonicCircle[0];
		
		for(int i=1;i<7;i++){
			if(diatonicCircle[i]<toMin){
				toMin = diatonicCircle[i];
				toMinNum = i;
			}
		}
		
		//�l�a���ɑ΂��čăg���C
		if(!(toMin == 0)){
			
			if(fromMode.equals("M")){
				diatonicCircle[0] = BasicSpace.calcBasicSpaceDistance(diatonicChord[0], "M7" , fromKey, fromMode,toDeg, toKind, toKey, toMode);
				diatonicCircle[1] = BasicSpace.calcBasicSpaceDistance(diatonicChord[1], "m7" , fromKey, fromMode,toDeg, toKind, toKey, toMode);
				diatonicCircle[2] = BasicSpace.calcBasicSpaceDistance(diatonicChord[2], "m7" , fromKey, fromMode,toDeg, toKind, toKey, toMode);
				diatonicCircle[3] = BasicSpace.calcBasicSpaceDistance(diatonicChord[3], "M7" , fromKey, fromMode,toDeg, toKind, toKey, toMode);
				diatonicCircle[4] = BasicSpace.calcBasicSpaceDistance(diatonicChord[4], "Mm7" , fromKey, fromMode,toDeg, toKind, toKey, toMode);
				diatonicCircle[5] = BasicSpace.calcBasicSpaceDistance(diatonicChord[5], "m7" , fromKey, fromMode,toDeg, toKind, toKey, toMode);
				diatonicCircle[6] = BasicSpace.calcBasicSpaceDistance(diatonicChord[6], "mFlat57" , fromKey, fromMode,toDeg, toKind, toKey, toMode);
			}
			
			if((fromMode.equals("m"))||(fromMode.equals("hm"))){
				diatonicCircle[0] = BasicSpace.calcBasicSpaceDistance(diatonicChord[0], "m7" , fromKey, fromMode,toDeg, toKind, toKey, toMode);
				diatonicCircle[1] = BasicSpace.calcBasicSpaceDistance(diatonicChord[1], "mFlat57" , fromKey, fromMode,toDeg, toKind, toKey, toMode);
				diatonicCircle[2] = BasicSpace.calcBasicSpaceDistance(diatonicChord[2], "M7" , fromKey, fromMode,toDeg, toKind, toKey, toMode);
				diatonicCircle[3] = BasicSpace.calcBasicSpaceDistance(diatonicChord[3], "m7" , fromKey, fromMode,toDeg, toKind, toKey, toMode);
				diatonicCircle[4] = BasicSpace.calcBasicSpaceDistance(diatonicChord[4], "Mm7" , fromKey, fromMode,toDeg, toKind, toKey, toMode);
				diatonicCircle[5] = BasicSpace.calcBasicSpaceDistance(diatonicChord[5], "M7" , fromKey, fromMode,toDeg, toKind, toKey, toMode);
				diatonicCircle[6] = BasicSpace.calcBasicSpaceDistance(diatonicChord[6], "Mm7" , fromKey, fromMode,toDeg, toKind, toKey, toMode);
			}
			
			toMin = diatonicCircle[0];
			
			for(int i=1;i<7;i++){
				if(diatonicCircle[i]<toMin){
					toMin = diatonicCircle[i];
					toMinNum = i;
				}
			}
			
			
			if(!(toMin == 0)){
				diatonicCircleDistance=diatonicCircleDistance+Experiment;
			}
			
		}
		
		
		if((fromMinNum-toMinNum == 2)||(fromMinNum-toMinNum == -2)||(fromMinNum-toMinNum == 5)||(fromMinNum-toMinNum == -5)){
			diatonicCircleDistance = diatonicCircleDistance + 3;
		}
		else if((fromMinNum-toMinNum == 4)||(fromMinNum-toMinNum == -4)||(fromMinNum-toMinNum == 3)||(fromMinNum-toMinNum == -3)){
			diatonicCircleDistance = diatonicCircleDistance + 1;
		}
		else if((fromMinNum-toMinNum == 1)||(fromMinNum-toMinNum == -1)||(fromMinNum-toMinNum == 6)||(fromMinNum-toMinNum == -6)){
			diatonicCircleDistance = diatonicCircleDistance + 2;
		}
		
		
		
		return diatonicCircleDistance;
	
	}

}
