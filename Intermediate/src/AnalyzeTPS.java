

public class AnalyzeTPS {
	
	//�R�[�h�l�[���̓�͕�
	static String ChordName[][]=
		//	Input.getInput().clone();
		{
			
		
		//1
		//Dm - FM modulation (relative)
		{ "4", "m7" },
		{ "9", "Mm7" },
		{ "2", "m7" },
		{ "7", "Mm7" },
		{ "0", "M" },
		{ "7", "m7" },
		{ "0", "Mm7" },
		{ "5", "M" },
		//*/
		
		/*
		//2
		//GM - DM modulation
		{ "7", "M" },
		{ "0", "M" },
		{ "2", "Mm7" },
		{ "7", "M" },
		{ "9", "Mm7" },
		{ "2", "M" },
		//*/
		
		/*
		//3
		//Apparently all EbM, rel. minor doesn't give anything
		{ "11", "M7" },
		{ "10", "Mm7" },
		{ "3", "M7" },
		{ "11", "M7" },
		{ "10", "Mm7" },
		{ "3", "M7" },
		{ "9", "mFlat57" },
		{ "8", "m7" },
		{ "7", "m7" },
		//{ "6", "dim7" },
		{ "5", "m7" },
		{ "10", "Mm7" },
		{ "3", "M7" },
		//*/
		
		/*
		//4
		//Dm-CM, Am instead of CM happens but isn't good (CM cadence)
		{ "4", "m7" },
		{ "9", "Mm7" },
		{ "2", "m7" },
		{ "1", "Mm7" },
		{ "0", "M" },
		{ "2", "m7" },
		{ "7", "Mm7" },
		{ "0", "M" },
		//*/
		
		//random thought but the longer the sequence the lower the probability of having an output in the wrong key if you do maj/min, like 3
		
		/*
		//5
		//Gm
		{ "9", "mFlat57" },
		{ "2", "Mm7" },
		{ "7", "m" },
		{ "9", "mFlat57" },
		{ "2", "Mm7" },
		{ "7", "m" },
		//*/
		
		/*
		//6
		//BbM-Gm rel modulation :(
		{ "0", "m7" },
		{ "5", "Mm7" },
		{ "10", "M7" },
		{ "3", "M7" },
		{ "9", "mFlat57" },
		{ "2", "Mm7" },
		{ "7", "m" },
		//*/
		
		/*
		//7
		//FM-Dm rel modulation
		//adding region cost makes Am appear which is not very nice
		{ "5", "M7" },
		{ "10", "M" },
		{ "0", "Mm7" },
		{ "5", "M7" },
		{ "4", "mFlat57" },
		{ "9", "Mm7" },
		{ "2", "m7" },
		{ "11", "mFlat57" },
		{ "4", "Mm7" },
		{ "9", "M7" },
		{ "7", "m7" },
		{ "0", "Mm7" },
		{ "5", "M" },
		//*/
		
		/*
		//8
		//well who knows nothing works with that one
		{ "2", "M" },
		{ "6", "m7" },
		{ "7", "M7" },
		{ "7", "m7" },
		{ "0", "Mm7" },
		{ "5", "M7" },
		{ "4", "m7" },
		{ "9", "Mm7" },
		{ "2", "m" },
		{ "0", "m7" },
		//*/
		
		
		/*
		//9
		//Am cadence
		{"9","m"},
		{"2","m"},
		{"4","m7"},
		{"9","m"},
		//*/
		
		};
		
	
	//�o�͕�
	static String ChordOutput[][] = new String[ChordName.length][4];

	
	public static void analyzeTPS(){
/*		
		String InputChords[][] = Input.StringToChords();
		System.out.println(ChordName.length == InputChords.length);
*/		
		
		//�m�[�h�����A�i�[
				String[][][] ChordNode = new String[ChordName.length][24][2];
				//ChordNode[i]<->ChordName[i]
				//ChordNode[i][j][0]:shortest path distance from 1st node, [1]:previous node in that path(i>0) 
				//0->23:enumerates all possible keys in M(j<12)/m(j>=12)
				
				for(int i=0;i<ChordName.length;i++){
					for(int j=0;j<24;j++){
						ChordNode[i][j][0] = "0";//���̃m�[�h�ɓ��B����܂ł̍ŒZ����
						ChordNode[i][j][1] = "No";//"No"�̓p�X���O�̃m�[�h����ʂ��Ă��Ă��Ȃ��Ƃ������ƁD�p�X���ʂ��Ă���Ȃ炻�̔ԍ������D
						
					}
				}
				
			
				//find shortest distances
				for(int i=0;i<ChordNode.length-1;i++){
					//1st M-> then m-> that way if there's an m we're sure it was shorter (not equal)
					for(int j=0;j<12;j++){
						for(int k=0;k<12;k++){
							//MM [i][k]->[i+1][j]
							float d = TonalPitchSpace.calcTonalPitchSpace(Integer.parseInt(ChordName[i][0]), ChordName[i][1], k, "M", 
																Integer.parseInt(ChordName[i+1][0]), ChordName[i+1][1], j, "M");
							
							if((Float.parseFloat(ChordNode[i][k][0]) + d) < Float.parseFloat(ChordNode[i+1][j][0]) || Float.parseFloat(ChordNode[i+1][j][0])== 0 ){
								ChordNode[i+1][j][0] = (Float.parseFloat(ChordNode[i][k][0]) + d)+"";//�ŒZ�����̍X�V
								ChordNode[i+1][j][1] = k+"";//�p�X���ʂ��Ă���Ȃ炻�̔ԍ������D
							}
							//Mm [i][k]->[i+1][j+12]
							d = TonalPitchSpace.calcTonalPitchSpace(Integer.parseInt(ChordName[i][0]), ChordName[i][1], k, "M", 
									Integer.parseInt(ChordName[i+1][0]), ChordName[i+1][1], j, "m");

							if((Float.parseFloat(ChordNode[i][k][0]) + d) < Float.parseFloat(ChordNode[i+1][j+12][0]) || Float.parseFloat(ChordNode[i+1][j+12][0])== 0 ){
								ChordNode[i+1][j+12][0] = (Float.parseFloat(ChordNode[i][k][0]) + d)+"";
								ChordNode[i+1][j+12][1] = k+"";
							}
						}
					}
					for(int j=0;j<12;j++){
						for(int k=0;k<12;k++){
							//mM [i][k+12]->[i+1][j]
							float d = TonalPitchSpace.calcTonalPitchSpace(Integer.parseInt(ChordName[i][0]), ChordName[i][1], k, "m", 
									Integer.parseInt(ChordName[i+1][0]), ChordName[i+1][1], j, "M");

							if((Float.parseFloat(ChordNode[i][k+12][0]) + d) < Float.parseFloat(ChordNode[i+1][j][0]) || Float.parseFloat(ChordNode[i+1][j][0])== 0 ){
								ChordNode[i+1][j][0] = (Float.parseFloat(ChordNode[i][k+12][0]) + d)+"";
								ChordNode[i+1][j][1] = (k+12)+"";
							}
							//mm [i][k+12]->[i+1][j+12]
							d = TonalPitchSpace.calcTonalPitchSpace(Integer.parseInt(ChordName[i][0]), ChordName[i][1], k, "m", 
									Integer.parseInt(ChordName[i+1][0]), ChordName[i+1][1], j, "m");

							if((Float.parseFloat(ChordNode[i][k+12][0]) + d) < Float.parseFloat(ChordNode[i+1][j+12][0]) || Float.parseFloat(ChordNode[i+1][j+12][0])== 0 ){
								ChordNode[i+1][j+12][0] = (Float.parseFloat(ChordNode[i][k+12][0]) + d)+"";
								ChordNode[i+1][j+12][1] = (k+12)+"";
							}							
							
						}
					}
				}
				
				float distance = 0;
				int path = 0;
				
				//find last node of shortest path
				//�ŏI�m�[�h�݂̂̏���
				for(int j=0; j<24; j++){
					if(Float.parseFloat(ChordNode[ChordName.length-1][j][0]) < distance ||distance==0 ){
						distance = Float.parseFloat(ChordNode[ChordName.length-1][j][0]);
						path = j;
					}
				}
			
				for(int i=ChordNode.length-1; i>-1; i--){
						
						//�A�E�g�v�b�g�Ɋi�[
						ChordOutput[i][0] = ChordName[i][0];
						ChordOutput[i][1] = ChordName[i][1];
						if(path<12){
							ChordOutput[i][2] = path+"";
							ChordOutput[i][3] = "M";
						}
						else{
							ChordOutput[i][2] = (path-12)+"";
							ChordOutput[i][3] = "m";
						}
						
						//path�̍X�V
						if(i!=0)
							path = Integer.parseInt(ChordNode[i][path][1]);
						
				}
		
		return;
		
	}
	
	
	//test to see if we can do with only majors. Turns out we can't because sometimes minor is shorter and rel. major is >= another major
	public static void major_analyzeTPS()
	{
//		String InputChords[][] = Input.StringToChords();
		
		//�m�[�h�����A�i�[
		String[][][] ChordNode = new String[ChordName.length][24][2];
		//ChordNode[i]<->ChordName[i]
		//ChordNode[i][j][0]:shortest path distance from 1st node, [1]:previous node in that path(i>0) 
		//0->11:enumerates all possible keys in M
		
		for(int i=0;i<ChordName.length;i++)
		{
			for(int j=0;j<12;j++)
			{
				ChordNode[i][j][0] = "0";//���̃m�[�h�ɓ��B����܂ł̍ŒZ����
				ChordNode[i][j][1] = "No";//"No"�̓p�X���O�̃m�[�h����ʂ��Ă��Ă��Ȃ��Ƃ������ƁD�p�X���ʂ��Ă���Ȃ炻�̔ԍ������D
			}
		}
				
			
		//find shortest distances
		for(int i=0;i<ChordNode.length-1;i++)
		{
			for(int j=0;j<12;j++)
			{
				for(int k=0;k<12;k++)
				{
					//[i][k]->[i+1][j]
					float d = TonalPitchSpace.calcTonalPitchSpace(Integer.parseInt(ChordName[i][0]), ChordName[i][1], k, "M", 
								Integer.parseInt(ChordName[i+1][0]), ChordName[i+1][1], j, "M");
							
					if((Float.parseFloat(ChordNode[i][k][0]) + d) < Float.parseFloat(ChordNode[i+1][j][0]) 
							|| Float.parseFloat(ChordNode[i+1][j][0])== 0 )
					{
						ChordNode[i+1][j][0] = (Float.parseFloat(ChordNode[i][k][0]) + d)+"";//�ŒZ�����̍X�V
						ChordNode[i+1][j][1] = k+"";//�p�X���ʂ��Ă���Ȃ炻�̔ԍ������D
					}
				}
			}
		}
				
		float distance = 0;
		int path = 0;
			
		//find last node of shortest path
		//�ŏI�m�[�h�݂̂̏���
		for(int j=0; j<12; j++)
		{
			if(Float.parseFloat(ChordNode[ChordName.length-1][j][0]) < distance ||distance==0 )
			{
				distance = Float.parseFloat(ChordNode[ChordName.length-1][j][0]);
				path = j;
			}
		}
	
		for(int i=ChordNode.length-1; i>-1; i--)
		{
			//�A�E�g�v�b�g�Ɋi�[
			ChordOutput[i][0] = ChordName[i][0];
			ChordOutput[i][1] = ChordName[i][1];
			if(path<12)
			{
				ChordOutput[i][2] = path+"";
				ChordOutput[i][3] = "M";
			}
			else
			{
				ChordOutput[i][2] = (path-12)+"";
				ChordOutput[i][3] = "m";
			}
				
			//path�̍X�V
			if(i!=0)
				path = Integer.parseInt(ChordNode[i][path][1]);
		}

		return;
	}
	
}