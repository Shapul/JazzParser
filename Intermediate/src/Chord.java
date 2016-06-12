//�R�[�h�����C���X�^���X�Ƃ��邽�߁A�N���X�Ƃ���
class Chord {
	
	int chord_number;//���Ԗڂ̃R�[�h��
	String tone;//�����ڂ̃R�[�h
	String harmony;//�a���́H
	String function;//�@�\�́H
	String local_key;//�����I�ɂ͂ǂ̒��ł��邩
	int resolution_from;//�ǂ�����������ꂽ�R�[�h�ł��邩
	int resolution_to;//�ǂ��։�������R�[�h�ł��邩
	String resolution_type;//�����̎�ނ́H
	
	
	void diatonic(String newmain_key, String tone){
		String data[];
		data = Find_diatonic.find_diatonic(newmain_key , tone);
		harmony = data[0];
		function = data[1]; 
	}
	
	void dominant_motion(String newmain_key , String tone){
		harmony = Find_dominant_motion.find_dominant_motion(newmain_key , tone);
	}
	
	

}
