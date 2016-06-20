
public class Region {
	
	public static float calcRegionDistance(int fromKey , String fromMode , int toKey , String toMode){
		
		float regiondistance = 0;
		
		int fromkey = fromKey;
		int	tokey   = toKey;
		
		
		//���s���̏���
		if(fromMode.equals("m") || fromMode.equals("hm"))
		{
			fromkey = fromkey+3;
			if(fromkey>11)
				fromkey = fromkey-12;
		}
		if(toMode.equals("m") || toMode.equals("hm"))
		{
			tokey = tokey+3;
			if(tokey>11)
				tokey = tokey-12;
		}
		
		
		
		if(fromkey - tokey ==0){
			if(!fromMode.equals(toMode))
				regiondistance = (float)0.5;
		}
		else if(fromkey - tokey ==7||fromkey - tokey ==-7||fromkey - tokey ==5||fromkey - tokey ==-5){
			regiondistance = 1;
		}
		else if(fromkey - tokey ==2||fromkey - tokey ==-2||fromkey - tokey ==10||fromkey - tokey ==-10){
			regiondistance = 2;
		}
		else if(fromkey - tokey ==9||fromkey - tokey ==-9||fromkey - tokey ==3||fromkey - tokey ==-3){
			regiondistance = 3;
		}
		else if(fromkey - tokey ==4||fromkey - tokey ==-4||fromkey - tokey ==8||fromkey - tokey ==-8){
			regiondistance = 4;
		}
		else if(fromkey - tokey ==11||fromkey - tokey ==-11||fromkey - tokey ==1||fromkey - tokey ==-1){
			regiondistance = 5;
		}
		else if(fromkey - tokey ==6||fromkey - tokey ==-6){
			regiondistance = 6;
		}
		else{
			regiondistance = 99;
		}

//		if(!(fromMode.equals(toMode)))
//			regiondistance = regiondistance + (float)0.5;
		
		/*
		//well would you look at that
		//���s���Ԃɂ����钲�ԋ�����0.5�ɐݒ�
		if(!fromMode.equals(toMode)){
			regiondistance = regiondistance+0.5;
		}
		*/
		
		
		return regiondistance;
		
	}

}
