
public class BasicSpace {
	
	//���\�b�h�����\�b�h
	private static void Add(int mode[], int Vec[], int key){
		int temp[] = mode.clone();
		
		

		for(int j=0;j<temp.length;j++){
			temp[j] = temp[j]+key;
			if(temp[j] > 11){
				temp[j] = temp[j]-12;
			}
			Vec[temp[j]]++;
		}
			
	}
	
	 //�R�[�h�\�������X�P�[���O�̎�
	private static void Check(int mode[], int Vec[], int Deg){
		int temp[] = mode.clone();
		
		for(int j=0;j<temp.length;j++){
			temp[j] = temp[j]+Deg;
			if(temp[j] > 11){
				temp[j] = temp[j]-12;
			}
			if(Vec[temp[j]] == 1){
				Vec[temp[j]]++;
			}
		}

		
		
		
	}
	
	//�������烁�\�b�h
	public static int calcBasicSpaceDistance(int fromDeg , String fromKind, int fromKey , String fromMode , int toDeg , String toKind, int toKey , String toMode){

		int BasicSpaceDistance = 0;
		
		int fromkey  = fromKey;
		int	tokey    = toKey;
		
		int fromVec[] = {0,0,0,0,0,0,0,0,0,0,0,0};
		int toVec[]   = {0,0,0,0,0,0,0,0,0,0,0,0};
		final int diatonic[] = {0,2,4,5,7,9,11};
		final int majorTriad[] = {0,4,7};
		final int minorTriad[] = {0,3,7};
		final int M7[] = {0,4,7,11};
		final int Mm7[] = {0,4,7,10};
		final int m7[] = {0,3,7,10};
		final int mM7[] = {0,3,7,11};
		final int mFlat5[] = {0,3,6};
		final int mFlat57[] = {0,3,6,10};
		final int dim7[] = {0,3,6,9};
		final int fifth[] = {0,7};
		
		
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
				
		
		
		//�X�P�[����Level.e
		if(fromMode.equals("M") || fromMode.equals("m")){
			Add(diatonic, fromVec, fromkey);
			}
		if(toMode.equals("M") || toMode.equals("m")){
			Add(diatonic, toVec, tokey);
			}
		
		
		//�R�[�h�\����Level.d
		//�\�������X�P�[���O�̉��̂Ƃ��������𑫂�
		if(fromKind.equals("M")){
			Add(majorTriad, fromVec, fromDeg);
			Check(majorTriad, fromVec, fromDeg);
			}
		if(toKind.equals("M")){
			Add(majorTriad, toVec, toDeg);
			Check(majorTriad, toVec, toDeg);
		}
		if(fromKind.equals("m")){
			Add(minorTriad, fromVec, fromDeg);
			Check(minorTriad, fromVec, fromDeg);
			}
		if(toKind.equals("m")){
			Add(minorTriad, toVec, toDeg);
			Check(minorTriad, toVec, toDeg);
		}
		if(fromKind.equals("M7")){
			Add(M7, fromVec, fromDeg);
			Check(M7, fromVec, fromDeg);
			}
		if(toKind.equals("M7")){
			Add(M7, toVec, toDeg);
			Check(M7, toVec, toDeg);
		}
		if(fromKind.equals("Mm7")){
			Add(Mm7, fromVec, fromDeg);
			Check(Mm7, fromVec, fromDeg);
			}
		if(toKind.equals("Mm7")){
			Add(Mm7, toVec, toDeg);
			Check(Mm7, toVec, toDeg);
		}
		if(fromKind.equals("m7")){
			Add(m7, fromVec, fromDeg);
			Check(m7, fromVec, fromDeg);
			}
		if(toKind.equals("m7")){
			Add(m7, toVec, toDeg);
			Check(m7, toVec, toDeg);
		}
		if(fromKind.equals("mM7")){
			Add(mM7, fromVec, fromDeg);
			Check(mM7, fromVec, fromDeg);
			}
		if(toKind.equals("mM7")){
			Add(mM7, toVec, toDeg);
			Check(mM7, toVec, toDeg);
		}
		if(fromKind.equals("mFlat5")){
			Add(mFlat5, fromVec, fromDeg);
			Check(mFlat5, fromVec, fromDeg);
			}
		if(toKind.equals("mFlat5")){
			Add(mFlat5, toVec, toDeg);
			Check(mFlat5, toVec, toDeg);
		}
		if(fromKind.equals("mFlat57")){
			Add(mFlat57, fromVec, fromDeg);
			Check(mFlat57, fromVec, fromDeg);
			}
		if(toKind.equals("mFlat57")){
			Add(mFlat57, toVec, toDeg);
			Check(mFlat57, toVec, toDeg);
		}
		if(fromKind.equals("dim7")){
			Add(dim7, fromVec, fromDeg);
			Check(dim7, fromVec, fromDeg);
			}
		if(toKind.equals("dim7")){
			Add(dim7, toVec, toDeg);
			Check(dim7, toVec, toDeg);
		}
		
		
		
		//�Z�u���X�Ƃ��܂��܂�����
		
		//�g���C�A�hLevel.c
		if(fromKind.equals("M") || fromKind.equals("M7") || fromKind.equals("Mm7")){
			Add(majorTriad, fromVec, fromDeg);
			}
		if(toKind.equals("M") || toKind.equals("M7") || toKind.equals("Mm7")){
			Add(majorTriad, toVec, toDeg);
		}
		if(fromKind.equals("m") || fromKind.equals("m7") || fromKind.equals("mM7")){
			Add(minorTriad, fromVec, fromDeg);
			}
		if(toKind.equals("m") || toKind.equals("m7") || toKind.equals("mM7")){
			Add(minorTriad, toVec, toDeg);
		}
		if(fromKind.equals("mFlat5") || fromKind.equals("mFlat57") || fromKind.equals("dim7")){
			Add(mFlat5, fromVec, fromDeg);
			}
		if(toKind.equals("mFlat5") || toKind.equals("mFlat57") || toKind.equals("dim7")){
			Add(mFlat5, toVec, toDeg);
		}
		
		
		//fifth Level.b
		Add(fifth, fromVec, fromDeg);
		Add(fifth, toVec, toDeg);
		
		
		//root Level.a
		for(int i=0;i<12;i++){
			if(i == fromDeg){
				fromVec[i]++;
			}
			if(i == toDeg){
				toVec[i]++;
			}
		}
		
		
		//�x�[�V�b�N�X�y�[�X���������߂�
		for(int i=0;i<12;i++){
			if(toVec[i]>fromVec[i]){
				BasicSpaceDistance = BasicSpaceDistance+(toVec[i]-fromVec[i]);
			}
		}
	
		return BasicSpaceDistance;
	}

}
