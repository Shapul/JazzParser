//コード一つ一つをインスタンスとするため、クラスとした
class Chord {
	
	int chord_number;//何番目のコードか
	String tone;//見た目のコード
	String harmony;//和声は？
	String function;//機能は？
	String local_key;//部分的にはどの調であるか
	int resolution_from;//どこから解決されたコードであるか
	int resolution_to;//どこへ解決するコードであるか
	String resolution_type;//解決の種類は？
	
	
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
