//import javax.swing.JFrame;
 import java.util.*;

public class IntermediateAnnouncement {
	
	 
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
	
		/*
		//コードネームの入力部
		String ChordName[][] =
				{
					//{ "2", "m" },
					//{ "7", "Mm7" },
					//{ "0", "M" },
					//{ "11", "mflat57" },
					//{ "4", "Mm7" },
					//{ "9", "Mm7" },
					
				{ "2", "m" },
				{ "7", "Mm7" },
				{ "0", "M" },
				{ "7", "m" },
				{ "0", "Mm7" },
				{ "5", "M" },
				
				
					//{ "0", "M" },
					//{ "9", "Mm7" },
					//{ "2", "M" },
					//{ "7", "Mm7" },
					//{ "0", "M" },
					//{ "7", "m" },
					//{ "0", "Mm7" },
					//{ "5", "M" }
				};
		
		//出力部
		String[][] ChordOutput = new String[ChordName.length][4];
			
		
		//ノード生成、格納
		String[][][] ChordNode = new String[ChordName.length][24][6];
		
		for(int i=0;i<ChordName.length;i++){
			for(int j=0;j<24;j++){
				ChordNode[i][j][0] = ChordName[i][0];
				ChordNode[i][j][1] = ChordName[i][1];
				
				if(j<12){
					ChordNode[i][j][2] = ""+j;
					ChordNode[i][j][3] = "M";
				}
				else{
					ChordNode[i][j][2] = (j-12)+"";
					ChordNode[i][j][3] = "m";
				}
				
				ChordNode[i][j][4] = "0";//そのノードに到達するまでの最短距離
				ChordNode[i][j][5] = "No";//"No"はパスが前のノードから通ってきていないということ．パスが通っているならその番号が入る．
				
			}
		}
		
	
		
		for(int i=0;i<ChordNode.length-1;i++){
			for(int j=0;j<24;j++){
				for(int k=0;k<24;k++){
					int d = TonalPitchSpace.calcTonalPitchSpace(Integer.parseInt(ChordNode[i][k][0]), ChordNode[i][k][1], Integer.parseInt(ChordNode[i][k][2]), ChordNode[i][k][3], 
														Integer.parseInt(ChordNode[i+1][j][0]), ChordNode[i+1][j][1], Integer.parseInt(ChordNode[i+1][j][2]), ChordNode[i+1][j][3]);
					
					if((Integer.parseInt(ChordNode[i][k][4]) + d) < Integer.parseInt(ChordNode[i+1][j][4]) || Integer.parseInt(ChordNode[i+1][j][4])== 0 ){
						ChordNode[i+1][j][4] = (Integer.parseInt(ChordNode[i][k][4]) + d)+"";//最短距離の更新
						ChordNode[i+1][j][5] = k+"";//パスが通っているならその番号が入る．
					}
					
				}
			}
		}
		
		int distance = 0;
		int path = 0;
		
		for(int i=ChordNode.length-1; i>-1; i--){
			
			//最終ノードのみの処理
			if(i==ChordNode.length-1){
				for(int j=0; j<24; j++){
					if(Integer.parseInt(ChordNode[i][j][4]) < distance ||distance==0 ){
						distance = Integer.parseInt(ChordNode[i][j][4]);
						path = j;
					}		
				}
				
				//アウトプットに格納
				ChordOutput[i][0] = ChordNode[i][path][0];
				ChordOutput[i][1] = ChordNode[i][path][1];
				ChordOutput[i][2] = ChordNode[i][path][2];
				ChordOutput[i][3] = ChordNode[i][path][3];
				
				//pathの更新
				path = Integer.parseInt(ChordNode[i][path][5]);
			}
			//最初のノードのみの処理
			else if(i == 0){
				//アウトプットに格納
				ChordOutput[i][0] = ChordNode[i][path][0];
				ChordOutput[i][1] = ChordNode[i][path][1];
				ChordOutput[i][2] = ChordNode[i][path][2];
				ChordOutput[i][3] = ChordNode[i][path][3];
			}
			//それ以外のノードに関して
			else{
				//アウトプットに格納
				ChordOutput[i][0] = ChordNode[i][path][0];
				ChordOutput[i][1] = ChordNode[i][path][1];
				ChordOutput[i][2] = ChordNode[i][path][2];
				ChordOutput[i][3] = ChordNode[i][path][3];
			
				//pathの更新
				path = Integer.parseInt(ChordNode[i][path][5]);
			}
				
		}
		*/
		
		//TPSによる和声解析
		AnalyzeTPS.analyzeTPS();
		
		for(int i=0;i<AnalyzeTPS.ChordName.length;i++){
			System.out.println(AnalyzeTPS.ChordOutput[i][0]+" "+AnalyzeTPS.ChordOutput[i][1]+" "+AnalyzeTPS.ChordOutput[i][2]+" "+AnalyzeTPS.ChordOutput[i][3]);
		}
		System.out.println();
		
		
		
		
		//analyzeCCG
		int k1 = 0;
		int k2 = 0;
		int s;
		int g;
		
		
		//innerCCGに渡すコード進行の一部
		//String[][] C = new String[][4];
		
		outside:
		for(int i=0;i<AnalyzeTPS.ChordName.length;i++){
			
			//調の比較が最後まで行われたとき、つまりiがAnalyzeTPS.ChordName.length-1のとき
			if(i == AnalyzeTPS.ChordName.length-1){
				
				if(k1 == 0){
					//k1からAnalyzeTPS.ChordName.length-1までをCCGに
					s = k1;
					g = AnalyzeTPS.ChordName.length-1;
					CCG(s, g, LM, Lm);
					
					if(flag == true){
						//出力に格納
					}
					else{
						//エラーを返す
						System.out.println("error1");
						break outside;
					}
				}
				else{
					//k1-1からAnalyzeTPS.ChordName.length-1までをinnerCCGに
					s = k1-1;
					g = AnalyzeTPS.ChordName.length-1;
					CCG(s, g, LM, Lm);
					
					if(flag == true){
						//出力に格納
					}
					else{
						//k1からAnalyzeTPS.ChordName.length-1までをinnerCCGに
						s = k1;
						g = AnalyzeTPS.ChordName.length-1;
						CCG(s, g, LM, Lm);
						
						if(flag == true){
							//出力に格納
						}
						else{
							//エラーを返す
							System.out.println("error2");
							break outside;
						}	
					}
				}		
			}	
			//それ以外の時でiとi+1の間で転調が起こっているとき
			else if(!(AnalyzeTPS.ChordOutput[i][2].equals(AnalyzeTPS.ChordOutput[i+1][2]) && AnalyzeTPS.ChordOutput[i][3].equals(AnalyzeTPS.ChordOutput[i+1][3]))){
				
				//転調部分をk2に
				k2 = i+1;
					
				//k1が0のとき
				if(k1 == 0){
					//k1からk2までをinnerCCGに
					s = k1;
					g = k2;
					k1 = k2;
					CCG(s, g, LM, Lm);
						
					if(flag == true){
						//出力に格納
						
					}
					else{
						System.out.println("e3");
						//k1からk2-1までをinnerCCGに
						g--;
						CCG(s, g, LM, Lm);
							
						if(flag == true){
							//出力に格納
							
						}
						else{
							//エラーを返す
							System.out.println("error3");
							break outside;
						}	
					}	
				}
				//k1が0でない時
				else{
					
					//k1とk2が隣どうしでないときに限る
					if(!(k1+1==k2)){
						
						//k1-1からk2までをinnerCCGに
						s = k1-1;
						g = k2;
						k1 = k2;
						CCG(s, g, LM, Lm);
						
						if(flag == true){
							//出力に格納
						
						}
						else{
							System.out.println("e4.1");
							//k1-1からk2-1までをinnerCCGに
							g--;
							CCG(s, g, LM, Lm);
						
							if(flag == true){
								//出力に格納
							
							}
							else{
								System.out.println("e4.2");
								//k1からk2-1までをinnerCCGに
								s++;
								CCG(s, g, LM, Lm);
								
								if(flag == true){
									//出力に格納
								
								}
								else{
									//エラーを返す
									System.out.println("error4");
									break outside;
								}
							}	
						}
					}
				}		
			}
			
		}
		
		boolean displayFlag = true;
		boolean match = false;			
					
		//innerCCG
		
		
		//出力
		
		
		System.out.println("レイアウト案1");
		for(int k=0;k<FinalOutput[0].length;k++){
			if(!(FinalOutput[0][k][0] == null)){
				
				for(int i=0;i<FinalOutput.length;i++){
					System.out.println(FinalOutput[i][k][0]+" "+FinalOutput[i][k][1]+" "+FinalOutput[i][k][2]+" "+FinalOutput[i][k][3]+" "+FinalOutput[i][k][4]+" "+FinalOutput[i][k][5]+" "+FinalOutput[i][k][6]);
				}
				System.out.println();
			}	
		}
		
		System.out.println("レイアウト案2");
		for(int i=0;i<FinalOutput.length;i++){
			for(int k=0;k<FinalOutput[i].length;k++){
				if(!(FinalOutput[i][k][0] == null)){
					System.out.println(FinalOutput[i][k][0]+" "+FinalOutput[i][k][1]+" "+FinalOutput[i][k][2]+" "+FinalOutput[i][k][3]+" "+FinalOutput[i][k][4]+" "+FinalOutput[i][k][5]+" "+FinalOutput[i][k][6]);
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("レイアウト案3");
		for(int i=0;i<FinalOutput.length;i++){
			for(int k=0;k<FinalOutput[i].length;k++){
				for(int k3=0;k3<k;k3++){
					if(FinalOutput[i][k][0]==FinalOutput[i][k3][0]&&FinalOutput[i][k][1]==FinalOutput[i][k3][1]&&FinalOutput[i][k][4]==FinalOutput[i][k3][4]&&FinalOutput[i][k][5]==FinalOutput[i][k3][5]&&FinalOutput[i][k][6]==FinalOutput[i][k3][6]){
						displayFlag = false;
					}
				}
				
				if(!(FinalOutput[i][k][0] == null)&&displayFlag==true){
					System.out.println(FinalOutput[i][k][0]+" "+FinalOutput[i][k][1]+" "+FinalOutput[i][k][2]+" "+FinalOutput[i][k][3]+" "+FinalOutput[i][k][4]+" "+FinalOutput[i][k][5]+" "+FinalOutput[i][k][6]);
				}
				displayFlag=true;
				
			}
			System.out.println();
		}
		
		System.out.println("レイアウト案4");
		for(int i=0;i<FinalOutput.length;i++){
			System.out.println("["+AnalyzeTPS.ChordName[i][0]+" "+AnalyzeTPS.ChordName[i][1]+"]");
			for(int k=0;k<FinalOutput[i].length;k++){
				for(int k3=0;k3<k;k3++){
					if(FinalOutput[i][k][0]==FinalOutput[i][k3][0]&&FinalOutput[i][k][1]==FinalOutput[i][k3][1]&&FinalOutput[i][k][4]==FinalOutput[i][k3][4]&&FinalOutput[i][k][5]==FinalOutput[i][k3][5]&&FinalOutput[i][k][6]==FinalOutput[i][k3][6]){
						displayFlag = false;
					}
				}
				
				if(!(FinalOutput[i][k][0] == null)&&displayFlag==true){
					System.out.println(FinalOutput[i][k][0]+" "+FinalOutput[i][k][1]+" "+FinalOutput[i][k][5]+" "+FinalOutput[i][k][6]+" "+FinalOutput[i][k][4]);
				}
				displayFlag=true;
				
			}
			System.out.println();
		}
		
		System.out.println();
		//System.out.println("レイアウト案5");
		
		System.out.print("Chord progression [ ");
		for(int i=0;i<FinalOutput.length;i++){
			System.out.print(pitchClassDisplay(AnalyzeTPS.ChordName[i][0])+""+ chordTypeDisplay(AnalyzeTPS.ChordName[i][1])+" ");
		}
		System.out.print("]");
		System.out.println();
		System.out.println();
		
		for(int i=0;i<FinalOutput.length;i++){
			System.out.println("input:"+" "+pitchClassDisplay(AnalyzeTPS.ChordName[i][0])+""+ chordTypeDisplay(AnalyzeTPS.ChordName[i][1]));
			for(int k=0;k<FinalOutput[i].length;k++){
				for(int k3=0;k3<k;k3++){
					if(FinalOutput[i][k][0]==FinalOutput[i][k3][0]&&FinalOutput[i][k][1]==FinalOutput[i][k3][1]&&FinalOutput[i][k][4]==FinalOutput[i][k3][4]&&FinalOutput[i][k][5]==FinalOutput[i][k3][5]&&FinalOutput[i][k][6]==FinalOutput[i][k3][6]){
						displayFlag = false;
					}
				}
				
				if(!(FinalOutput[i][k][0] == null)&&displayFlag==true){
					System.out.println("output:"+" "+rootDisplay(FinalOutput[i][k][0])+""+chordTypeDisplay(FinalOutput[i][k][1])+" in "+pitchClassDisplay(FinalOutput[i][k][5])+""+modeDisplay(FinalOutput[i][k][6])+" "+FinalOutput[i][k][4]);
				}
				displayFlag=true;
				
			}
			System.out.println();
		}
		
		System.out.println();
		//System.out.println("レイアウト案6");
		System.out.print("input(Chord progression) [ ");
		for(int i=0;i<FinalOutput.length;i++){
			System.out.print(pitchClassDisplay(AnalyzeTPS.ChordName[i][0])+""+ chordTypeDisplay(AnalyzeTPS.ChordName[i][1])+" ");
		}
		System.out.print("]");
		System.out.println();
		System.out.println();
		for(int k=0;k<FinalOutput[0].length;k++){
			if(!(FinalOutput[0][k][0] == null)){
				//ここ
				for(int k3=0;k3<k;k3++){
					out:
					for(int i=0;i<FinalOutput.length;i++){
						//一致していたら
						if(FinalOutput[i][k][0]==FinalOutput[i][k3][0]&&FinalOutput[i][k][1]==FinalOutput[i][k3][1]&&FinalOutput[i][k][4]==FinalOutput[i][k3][4]&&FinalOutput[i][k][5]==FinalOutput[i][k3][5]&&FinalOutput[i][k][6]==FinalOutput[i][k3][6]){
							match = true;
						}
						else{
							match = false;
							break out;
						}
					}
				}
				//ダブっていなかったら表示
				if(match == false){
					for(int i=0;i<FinalOutput.length;i++){
						if(!(FinalOutput[i][k][0]==null)){
							System.out.println("output:"+" "+rootDisplay(FinalOutput[i][k][0])+""+chordTypeDisplay(FinalOutput[i][k][1])+" in "+pitchClassDisplay(FinalOutput[i][k][5])+""+modeDisplay(FinalOutput[i][k][6])+" "+FinalOutput[i][k][4]);
						}
					}
					System.out.println();
				}
				match = false;
			}	
		}
		
		
		
		
			
	}//mainMethod
	
	/////////////////////////////////////////////////////////////////////////////////////
	private static  void innerCCG(int s, int g, String[][] L){
		//ディグリーネームの配列を定義
		String Degree[][] = new String[g-s+1][4];
		//辞書からのアノテーションを定義
		String Annotation[][] = new String[Degree.length][5];
		//度数表記への変換
		Degree = degreeNameConversion(s,g).clone();
		
		
		flag = false;
		int i = 0;
		int j[] = new int[Degree.length];
		for(int i1=0;i1<Degree.length;i1++){
			j[i] = 0;
		}
		
		//繰り返しの操作
		outside:
		while(true){
			if(Comparison(i,j[i],Degree, L)){
				
				for(int i1=0; i1<5; i1++){
					Annotation[i][i1] = L[j[i]][i1];
				}
				
				if(i == Degree.length-1){
					//ruleCheckメソッドを実行
					ruleCheck(Annotation);
					//System.out.println(category);
					//Sの要素が一つである場合
					if(category.size()==2 && category.get(1).equals("")){
						//解析成功のフラグを返す
						flag = true;
						//FinalOutputに格納
						Output(s, g, Annotation, Degree[0][2], Degree[0][3]);
					}
					//カテゴリを全削除
					category.clear();
					
					//Annotation[i]の要素を削除
					for(int i1=0; i1<5; i1++){
						Annotation[i][i1] = null;
					}
					j[i]++;	
				}
				else{
					i++;
					j[i] = 0;
				}
					
			}
			else{
				j[i]++;
				if(j[i] == L.length){
					//Annotation[i]の要素を削除
					for(int i1=0; i1<5; i1++){
						Annotation[i][i1] = null;
					}
					j[i] = 0;
					i--;
					if(i == -1){
						//解析終了、一度もうまくいかなかったら解析成功のフラグは立たないまま
						break outside;
					}
					else{
						j[i]++;
					}
				}
						
			}
			
		}
		
		//カテゴリを全削除
		category.clear();
		
				
	}
	/////////////////////////////////////////////////////////////////////////////////
	//長調・短調のどちらの辞書を使うのか
	private static void CCG(int s, int g, String[][] LM, String[][] Lm){
		
		//長調なら
		if(AnalyzeTPS.ChordOutput[s][3] == "M"){
			innerCCG(s, g, LM);
		}
		//短調なら
		else{
			innerCCG(s, g, Lm);
		}
	}
	/////////////////////////////////////////////////////////////////////////////////
	
	//出力部
	private static void Output(int s, int g, String[][] Annotation, String Keynote, String mode){
		
		for(int i=s;i<g+1;i++){
			outside:
			for(int k=0;k<FinalOutput[i].length;k++){
				//もし空いていたら
				if(FinalOutput[i][k][0]==null){
					for(int j=0;j<5;j++){
						FinalOutput[i][k][j] = Annotation[i-s][j];
					}
					FinalOutput[i][k][5] = Keynote;
					FinalOutput[i][k][6] = mode;
					break outside;
				}
			}
		}
		
	}
	/////////////////////////////////////////////////////////////////////////////////
	
	//Degree[i]とLM[j]またはLm[j]を比較する
	private static boolean Comparison(int i, int j, String[][] Degree, String[][] L){
		
		if(Degree[i][0].equals(L[j][0])&&Degree[i][1].equals(L[j][1])){
			return true;	
		}
		else{
			return false;
		}	
	}
	/////////////////////////////////////////////////////////////////////////////////
	
	//ディグリーネームへの変換、両端の調をそろえる
	private static String[][] degreeNameConversion(int s, int g){
		String Degree[][] = new String[g-s+1][4];
		
		for(int i=0;i<Degree.length;i++){
			for(int j=0;j<4;j++){
				Degree[i][j] = AnalyzeTPS.ChordOutput[i+s][j];
			}
		}
		
		//端っこの調をそろえる
		if(!(Degree.length==1)){
			if(!(Degree[0][2].equals(Degree[1][2])&&Degree[0][3].equals(Degree[1][3]))){
				Degree[0][2] = Degree[1][2];
				Degree[0][3] = Degree[1][3];
			}
			if(!(Degree[g-s][2].equals(Degree[g-s-1][2])&&Degree[g-s][3].equals(Degree[g-s][3]))){
				Degree[g-s][2] = Degree[g-s-1][2];
				Degree[g-s][3] = Degree[g-s-1][3];
			}
			
		}
		
		//ディグリーネームへの変換
		for(int i=0;i<Degree.length;i++){
			
			if(Integer.parseInt(Degree[i][0]) >= Integer.parseInt(Degree[i][2])){
				Degree[i][0] = Integer.parseInt(Degree[i][0])-Integer.parseInt(Degree[i][2])+"";
			}
			else{
				Degree[i][0] = 12-(Integer.parseInt(Degree[i][2])-Integer.parseInt(Degree[i][0]))+"";
			}
		}
		
		return Degree;
	}
	/////////////////////////////////////////////////////////////////////////////////
	
	//規則の適用
	private static void ruleCheck(String[][] Annotation){
		
		//Annotationからカテゴリ列を追加
		for(int i=0;i<Annotation.length;i++){
			category.add(Annotation[i][2]);
			category.add(Annotation[i][3]);	
		}
		
		//ピボットコードによらない転調
		category.set(category.size()-1, "");
		
		boolean localflag = true;
		//適用規則が使えなくなるまでカテゴリを計算
		while(localflag){
			
			localflag = false;
			
			outside:
			for(int i=0;i<category.size()-1;i=i+2){
				
				//最後のカテゴリ
				if(i==category.size()-2){
					if(category.get(i)=="PD"){
						category.remove(i);
						category.remove(i);
						localflag = true;
					}
				}
				//それ以外
				else{
					//関数適用規則
					if(category.get(i+1)==category.get(i+2)&&category.get(i+3)==""){
						//カテゴリーを削除
						category.remove(i);
						category.remove(i);
						category.set(i,"T");
						localflag = true;
						break outside;
					}
					//関数合成規則
					if(category.get(i+1)==category.get(i+2)){
						//カテゴリーを削除
						category.remove(i+1);
						category.remove(i+1);
						localflag = true;
						break outside;
					}
					//&規則、deveplopment規則、RelatedかSDでなければ
					else if((category.get(i+1)==category.get(i+3))&&(category.get(i).equals("T")||category.get(i).equals("D")||category.get(i).equals("S")||category.get(i).equals("SM")) ){
						category.remove(i+2);
						category.remove(i+2);
						localflag = true;
						break outside;
					}
					//deveplopment規則、
					else if((category.get(i+1)=="")&&(category.get(i).equals("T"))){
						category.remove(i);
						category.remove(i);
						localflag = true;
						break outside;
					}
					
					//PDがきたら
					else if(category.get(i)=="PD"){
						category.remove(i);
						category.remove(i);
						localflag = true;
						break outside;
					}
				}
				
			}	
		}
		
	}
	/////////////////////////////////////////////////////////////////////////////////
	private static String rootDisplay(String root){
		if(root.equals("0")){
			root = "Ⅰ";
		}
		else if(root.equals("1")){
			root = "♭Ⅱ";
		}
		else if(root.equals("2")){
			root = "Ⅱ";
		}
		else if(root.equals("3")){
			root = "♭Ⅲ";
		}
		else if(root.equals("4")){
			root = "Ⅲ";
		}
		else if(root.equals("5")){
			root = "Ⅳ";
		}
		else if(root.equals("6")){
			root = "♭Ⅴ";
		}
		else if(root.equals("7")){
			root = "Ⅴ";
		}
		else if(root.equals("8")){
			root = "♭Ⅵ";
		}
		else if(root.equals("9")){
			root = "Ⅵ";
		}
		else if(root.equals("10")){
			root = "♭Ⅶ";
		}
		else if(root.equals("11")){
			root = "Ⅶ";
		}
		return root;
	}
	private static String chordTypeDisplay(String chordType){
		if(chordType.equals("M")){
			chordType = "";
		}
		else if(chordType.equals("M6")){
			chordType = "M6";
		}
		else if(chordType.equals("M7")){
			chordType = "M7";
		}
		else if(chordType.equals("Mm7")){
			chordType = "7";
		}
		else if(chordType.equals("m")){
			chordType = "m";
		}
		else if(chordType.equals("m6")){
			chordType = "m6";
		}
		else if(chordType.equals("m7")){
			chordType = "m7";
		}
		else if(chordType.equals("mM7")){
			chordType = "mM7";
		}
		else if(chordType.equals("mFlat5")){
			chordType = "m(♭5)";
		}
		else if(chordType.equals("mFlat57")){
			chordType = "m7(♭5)";
		}
		else if(chordType.equals("aug")){
			chordType = "aug";
		}
		else if(chordType.equals("aug7")){
			chordType = "aug7";
		}
		else if(chordType.equals("dim7")){
			chordType = "dim7";
		}
		return chordType;
	}
	private static String pitchClassDisplay(String pitchClass){
		if(pitchClass.equals("0")){
			pitchClass = "C";
		}
		else if(pitchClass.equals("1")){
			pitchClass = "D♭";
		}
		else if(pitchClass.equals("2")){
			pitchClass = "D";
		}
		else if(pitchClass.equals("3")){
			pitchClass = "E♭";
		}
		else if(pitchClass.equals("4")){
			pitchClass = "E";
		}
		else if(pitchClass.equals("5")){
			pitchClass = "F";
		}
		else if(pitchClass.equals("6")){
			pitchClass = "G♭";
		}
		else if(pitchClass.equals("7")){
			pitchClass = "G";
		}
		else if(pitchClass.equals("8")){
			pitchClass = "A♭";
		}
		else if(pitchClass.equals("9")){
			pitchClass = "A";
		}
		else if(pitchClass.equals("10")){
			pitchClass = "B♭";
		}
		else if(pitchClass.equals("11")){
			pitchClass = "B";
		}
		
		return pitchClass;
	}
	private static String modeDisplay(String mode){
		
		if(mode.equals("M")){
			mode = "Major";
		}
		else{
			mode = "Minor";
		}
		
		return mode;
	}
	
	
	
	
	//グローバル変数
	static boolean flag = false;//ひとつでも解析がうまくいったというフラグ
	static ArrayList category = new ArrayList();
	static String[][][] FinalOutput = new String[AnalyzeTPS.ChordOutput.length][100][7];//最終出力部、調の情報も入れる
	
	//辞書
	static final String LM[][] = {
		
		//Tonic
		{"0","M","T" ,"", "Tonic"}, 
		{"0","M6","T" ,"", "Tonic"}, 
		{"0","M7","T" ,"", "Tonic"}, 
		{"4","m","T" ,"", "Tonic"}, 
		{"4","m7","T" ,"", "Tonic"}, 
		{"9","m","T" ,"", "Tonic"}, 
		{"9","m7","T" ,"", "Tonic"}, 
		{"0","Mm7","T" ,"", "Tonic"}, 
		{"6","mFlat57","T" ,"", "Tonic"}, 
			// from Secondary Dominant
		{"4","m","4m" ,"", "Tonic"}, 
		{"4","m7","4m7" ,"", "Tonic"}, 
		{"9","m","9m" ,"", "Tonic"}, 
		{"9","m7","9m7" ,"", "Tonic"}, 
		
		
		//Sub Dominant
			//Sub Dominant to Tonic
		{"5","M","S","T","Sub Dominant"}, 
		{"5","M6","S","T","Sub Dominant"}, 
		{"5","M7","S","T","Sub Dominant"}, 
		{"2","m","S","T","Sub Dominant"}, 
		{"2","m7","S","T","Sub Dominant"}, 
		{"5","Mm7","S","T","Sub Dominant"}, 
		{"11","Mm7","S","T","Sub Dominant"}, 
		{"6","mFlat57","S","T","Sub Dominant"}, 
				// from Secondary Dominant
		{"5","M","5M","T","Sub Dominant"}, 
		{"5","M6","5M6","T","Sub Dominant"}, 
		{"5","M7","5M7","T","Sub Dominant"}, 
		{"2","m","2m","T","Sub Dominant"}, 
		{"2","m7","2m7","T","Sub Dominant"}, 
		
			//Sub Dominant to Dominant
		{"5","M","S","D","Sub Dominant"}, 
		{"5","M6","S","D","Sub Dominant"}, 
		{"5","M7","S","D","Sub Dominant"}, 
		{"2","m","S","D","Sub Dominant"}, 
		{"2","m7","S","D","Sub Dominant"}, 
		{"5","Mm7","S","D","Sub Dominant"}, 
		{"11","Mm7","S","D","Sub Dominant"}, 
		{"6","mFlat57","S","D","Sub Dominant"}, 
				// from Secondary Dominant
		{"5","M","5M","D","Sub Dominant"}, 
		{"5","M6","5M6","D","Sub Dominant"}, 
		{"5","M7","5M7","D","Sub Dominant"}, 
		{"2","m","2m","D","Sub Dominant"}, 
		{"2","m7","2m7","D","Sub Dominant"}, 
		
			//Sub Dominant to Sub Dominant Minor
		{"5","M","S","SM","Sub Dominant"}, 
		{"5","M6","S","SM","Sub Dominant"}, 
		{"5","M7","S","SM","Sub Dominant"}, 
		{"2","m","S","SM","Sub Dominant"}, 
		{"2","m7","S","SM","Sub Dominant"}, 
		{"5","Mm7","S","SM","Sub Dominant"}, 
		{"11","Mm7","S","SM","Sub Dominant"}, 
		{"6","mFlat57","S","SM","Sub Dominant"}, 
				// from Secondary Dominant
		{"5","M","5M","SM","Sub Dominant"}, 
		{"5","M6","5M6","SM","Sub Dominant"}, 
		{"5","M7","5M7","SM","Sub Dominant"}, 
		{"2","m","2m","SM","Sub Dominant"}, 
		{"2","m7","2m7","SM","Sub Dominant"}, 
		
		
		//Dominant
		{"7","M","D","T","Dominant"}, 
		{"7","Mm7","D","T","Dominant"}, 
		{"11","mFlat5","D","T","Dominant"}, 
		{"11","mFlat57","D","T","Dominant"}, 
		{"1","Mm7","D","T","Dominant"}, 
			//Dominant from Secondary Dominant
		{"7","M","7M","T","Dominant"}, 
		{"7","Mm7","7Mm7","T","Dominant"}, 
		{"1","Mm7","1Mm7","T","Dominant"}, 
		
		//Sub Dominant Minor
			//SubDominant Minor to Tonic 
		{"10","Mm7","SM","T","Sub Dominant Minor"}, 
		{"2","M7","SM","T","Sub Dominant Minor"}, 
		{"8","Mm7","SM","T","Sub Dominant Minor"},  
				//Modal Inter Change
		{"5","m","SM","T","Sub Dominant Minor"}, 
		{"5","m6","SM","T","Sub Dominant Minor"}, 
		{"5","m7","SM","T","Sub Dominant Minor"}, 
		{"5","mM7","SM","T","Sub Dominant Minor"},  
		{"2","mFlat5","SM","T","Sub Dominant Minor"},     
		{"2","mFlat57","SM","T","Sub Dominant Minor"}, 
		{"8","M","SM","T","Sub Dominant Minor"}, 
		{"8","M7","SM","T","Sub Dominant Minor"}, 
		{"10","M","SM","T","Sub Dominant Minor"}, 
		{"10","Mm7","SM","T","Sub Dominant Minor"}, 
		 	//SubDominant Minor to Dominant 
		{"10","Mm7","SM","D","Sub Dominant Minor"}, 
		{"2","M7","SM","D","Sub Dominant Minor"}, 
		{"8","Mm7","SM","D","Sub Dominant Minor"},  
				//Modal Inter Change
		{"5","m","SM","D","Sub Dominant Minor"}, 
		{"5","m6","SM","D","Sub Dominant Minor"}, 
		{"5","m7","SM","D","Sub Dominant Minor"}, 
		{"5","mM7","SM","D","Sub Dominant Minor"},  
		{"2","mFlat5","SM","D","Sub Dominant Minor"},     
		{"2","mFlat57","SM","D","Sub Dominant Minor"}, 
		{"8","M","SM","D","Sub Dominant Minor"}, 
		{"8","M7","SM","D","Sub Dominant Minor"}, 
		{"10","M","SM","D","Sub Dominant Minor"}, 
		{"10","Mm7","SM","D","Sub Dominant Minor"}, 
		       
		//Related Second
		{"2","m7","R","7M","Related Second 7th"}, 
		{"2","m7","R","7Mm7","Related Second 7th"}, 
		{"2","m7","R","1Mm7","Related Second 7th"}, 
		{"4","m7","R","9Mm7","Related Second 7th"}, 
		{"4","m7","R","3Mm7","Related Second 7th"}, 
		{"4","mFlat57","R","9Mm7","Related Second 7th"}, 
		{"4","mFlat57","R","3Mm7","Related Second 7th"}, 
		{"6","m7","R","11Mm7","Related Second 7th"}, 
		{"6","m7","R","5Mm7","Related Second 7th"}, 
		{"6","mFlat57","R","11Mm7","Related Second 7th"}, 
		{"6","mFlat57","R","5Mm7","Related Second 7th"}, 
		{"7","m7","R","0Mm7","Related Second 7th"}, 
		{"7","m7","R","6Mm7","Related Second 7th"}, 
		{"9","m7","R","2Mm7","Related Second 7th"}, 
		{"9","m7","R","8Mm7","Related Second 7th"}, 
		{"11","m7","R","4Mm7","Related Second 7th"}, 
		{"11","m7","R","10Mm7","Related Second 7th"}, 
		{"11","mFlat57","R","4Mm7","Related Second 7th"}, 
		{"11","mFlat57","R","10Mm7","Related Second 7th"},
		{"2","m7","2m7","7M","Related Second 7th"},//from Secondary Dominant
		{"2","m7","2m7","7Mm7","Related Second 7th"},//from Secondary Dominant
		{"2","m7","2m7","1Mm7","Related Second 7th"},//from Secondary Dominant
			//裏コード
		{"8","m7","R","7Mm","Related Second 7th"}, 
		{"8","m7","R","7Mm7","Related Second 7th"}, 
		{"8","m7","R","2Mm7","Related Second 7th"}, 
		{"10","m7","R","9Mm7","Related Second 7th"}, 
		{"10","m7","R","3Mm7","Related Second 7th"}, 
		{"10","mFlat57","R","9Mm7","Related Second 7th"}, 
		{"10","mFlat57","R","3Mm7","Related Second 7th"}, 
		{"0","m7","R","11Mm7","Related Second 7th"}, 
		{"0","m7","R","5Mm7","Related Second 7th"}, 
		{"0","mFlat57","R","11Mm7","Related Second 7th"}, 
		{"0","mFlat57","R","5Mm7","Related Second 7th"}, 
		{"1","m7","R","0Mm7","Related Second 7th"}, 
		{"1","m7","R","6Mm7","Related Second 7th"}, 
		{"3","m7","R","2Mm7","Related Second 7th"}, 
		{"3","m7","R","8Mm7","Related Second 7th"}, 
		{"5","m7","R","4Mm7","Related Second 7th"}, 
		{"5","m7","R","10Mm7","Related Second 7th"}, 
		{"5","mFlat57","R","4Mm7","Related Second 7th"}, 
		{"5","mFlat57","R","10Mm7","Related Second 7th"},
		{"8","m7","8m7","7M","Related Second 7th"},//from Secondary Dominant
		{"8","m7","8m7","7Mm7","Related Second 7th"},//from Secondary Dominant
		{"8","m7","8m7","1Mm7","Related Second 7th"},//from Secondary Dominant
		
		//Secondary Dominant
		/*
		{"0","Mm7","SD","5M","Secondary Dominant"}, 
		{"0","Mm7","SD","5M6","Secondary Dominant"}, 
		{"0","Mm7","SD","5M7","Secondary Dominant"}, 
		{"2","Mm7","SD","7M","Secondary Dominant"}, 
		{"2","Mm7","SD","7Mm7","Secondary Dominant"}, 
		{"4","Mm7","SD","9m","Secondary Dominant"}, 
		{"4","Mm7","SD","9m7","Secondary Dominant"}, 
		{"9","Mm7","SD","2m","Secondary Dominant"}, 
		{"9","Mm7","SD","2m7","Secondary Dominant"}, 
		{"11","Mm7","SD","4m","Secondary Dominant"}, 
		{"11","Mm7","SD","4m7","Secondary Dominant"}, 
			//裏コード
		{"6","Mm7","SD","5M","Secondary Dominant"}, 
		{"6","Mm7","SD","5M6","Secondary Dominant"}, 
		{"6","Mm7","SD","5M7","Secondary Dominant"}, 
		{"8","Mm7","SD","7M","Secondary Dominant"}, 
		{"8","Mm7","SD","7Mm7","Secondary Dominant"}, 
		{"10","Mm7","SD","9m","Secondary Dominant"}, 
		{"10","Mm7","SD","9m7","Secondary Dominant"}, 
		{"3","Mm7","SD","2m","Secondary Dominant"}, 
		{"3","Mm7","SD","2m7","Secondary Dominant"}, 
		{"4","Mm7","SD","4m","Secondary Dominant"}, 
		{"4","Mm7","SD","4m7","Secondary Dominant"}, 
		*/
		
		//Secondary Dominant from Related Second
		{"0","Mm7","0Mm7","5M","Secondary Dominant"}, 
		{"0","Mm7","0Mm7","5M6","Secondary Dominant"}, 
		{"0","Mm7","0Mm7","5M7","Secondary Dominant"}, 
		{"2","Mm7","2Mm7","7M","Secondary Dominant"}, 
		{"2","Mm7","2Mm7","7Mm7","Secondary Dominant"}, 
		{"4","Mm7","4Mm7","9m","Secondary Dominant"}, 
		{"4","Mm7","4Mm7","9m7","Secondary Dominant"}, 
		{"9","Mm7","9Mm7","2m","Secondary Dominant"}, 
		{"9","Mm7","9Mm7","2m7","Secondary Dominant"}, 
		{"11","Mm7","11Mm7","4m","Secondary Dominant"}, 
		{"11","Mm7","11Mm7","4m7","Secondary Dominant"}, 
			//裏コード
		{"6","Mm7","6Mm7","5M","Secondary Dominant"}, 
		{"6","Mm7","6Mm7","5M6","Secondary Dominant"}, 
		{"6","Mm7","6Mm7","5M7","Secondary Dominant"}, 
		{"8","Mm7","8Mm7","7M","Secondary Dominant"}, 
		{"8","Mm7","8Mm7","7Mm7","Secondary Dominant"}, 
		{"10","Mm7","10Mm7","9m","Secondary Dominant"}, 
		{"10","Mm7","10Mm7","9m7","Secondary Dominant"}, 
		{"3","Mm7","3Mm7","2m","Secondary Dominant"}, 
		{"3","Mm7","3Mm7","2m7","Secondary Dominant"}, 
		{"4","Mm7","4Mm7","4m","Secondary Dominant"}, 
		{"4","Mm7","4Mm7","4m7","Secondary Dominant"}, 
		
		//Passing Diminish
		{"1","dim7","PD" ,"", "Passing Diminish"}, 
		{"3","dim7","PD" ,"", "Passing Diminish"}, 
		{"6","dim7","PD" ,"", "Passing Diminish"}, 
		{"8","dim7","PD" ,"", "Passing Diminish"}, 
		{"10","dim7","PD" ,"", "Passing Diminish"},
		
	};
	
	static final String Lm[][] = {
		
		//Tonic
		{"0","m","T" ,"", "Tonic"},  
		{"0","m6","T" ,"", "Tonic"},  
		{"0","m7","T" ,"", "Tonic"},  
		{"0","mM7","T" ,"", "Tonic"},  
		{"3","M","T" ,"", "Tonic"},  
		{"3","M7","T" ,"", "Tonic"},  
		{"3","aug","T" ,"", "Tonic"},  
		{"3","augM7","T" ,"", "Tonic"},  
		{"9","mFlat5","T" ,"", "Tonic"},  
		{"9","mFlat57","T" ,"", "Tonic"},  
			// from Secondary Dominant
		{"3","M","3M" ,"", "Tonic"},  
		{"3","M7","3M7" ,"", "Tonic"},  
		
		
		//Sub Dominant
			//Sub Dominant to Tonic
		{"5","M","S","T","Sub Dominant"},  
		{"5","M6","S","T","Sub Dominant"},  
		{"5","Mm7","S","T","Sub Dominant"},  
		{"2","m","S","T","Sub Dominant"},  
		{"2","m7","S","T","Sub Dominant"},  
		{"11","Mm7","S","T","Sub Dominant"},  
				// from Secondary Dominant
		{"5","M","5M","T","Sub Dominant"},  
		{"5","M6","5M6","T","Sub Dominant"},  
		{"5","Mm7","5M7","T","Sub Dominant"},  
		{"2","m","2m","T","Sub Dominant"},  
		{"2","m7","2m7","T","Sub Dominant"},  
		
			//Sub Dominant to Dominant
		{"5","M","S","D","Sub Dominant"},  
		{"5","M6","S","D","Sub Dominant"},  
		{"5","Mm7","S","D","Sub Dominant"},  
		{"2","m","S","D","Sub Dominant"},  
		{"2","m7","S","D","Sub Dominant"},  
		{"11","Mm7","S","D","Sub Dominant"},  
				// from Secondary Dominant
		{"5","M","5M","D","Sub Dominant"},  
		{"5","M6","5M6","D","Sub Dominant"},  
		{"5","Mm7","5M7","D","Sub Dominant"},  
		{"2","m","2m","D","Sub Dominant"},  
		{"2","m7","2m7","D","Sub Dominant"},  
		
			//Sub Dominant to Sub DominantMinor
		{"5","M","S","SM","Sub Dominant"},  
		{"5","M6","S","SM","Sub Dominant"},  
		{"5","Mm7","S","SM","Sub Dominant"},  
		{"2","m","S","SM","Sub Dominant"},  
		{"2","m7","S","SM","Sub Dominant"},  
		{"11","Mm7","S","SM","Sub Dominant"},  
				// from Secondary Dominant
		{"5","M","5M","SM","Sub Dominant"},  
		{"5","M6","5M6","SM","Sub Dominant"},  
		{"5","Mm7","5M7","SM","Sub Dominant"},  
		{"2","m","2m","SM","Sub Dominant"},  
		{"2","m7","2m7","SM","Sub Dominant"},  
		
		
		//Dominant
		{"7","M","D","T","Dominant"},  
		{"7","Mm7","D","T","Dominant"},  
		{"7","m7","D","T","Dominant"},  
		{"11","dim7","D","T","Dominant"},  
		{"11","mFlat57","D","T","Dominant"},  
		{"1","Mm7","D","T","Dominant"},  
			//Dominantfrom Secondary Dominant
		{"7","M","7M","T","Dominant"},  
		{"7","Mm7","7Mm7","T","Dominant"},  
		{"7","m7","7m7","T","Dominant"},  
		{"1","Mm7","1Mm7","T","Dominant"},  
		
		
		//Sub Dominant Minor
			//Sub Dominant Minor to Tonic
		{"5","m","SM","T","Sub Dominant Minor"},  
		{"5","m6","SM","T","Sub Dominant Minor"},  
		{"5","m7","SM","T","Sub Dominant Minor"},  
		{"5","mM7","SM","T","Sub Dominant Minor"},   
		{"2","mFlat5","SM","T","Sub Dominant Minor"},      
		{"2","mFlat57","SM","T","Sub Dominant Minor"},  
		{"8","M","SM","T","Sub Dominant Minor"},  
		{"8","M7","SM","T","Sub Dominant Minor"},  
		{"10","M","SM","T","Sub Dominant Minor"},  
		{"10","Mm7","SM","T","Sub Dominant Minor"},  
		{"1","M7","SM","T","Sub Dominant Minor"},  
		{"8","Mm7","SM","T","Sub Dominant Minor"},  
				//from Secondary Dominant
		{"5","m","5m","T","Sub Dominant Minor"},  
		{"5","m6","5m6","T","Sub Dominant Minor"},  
		{"5","m7","5m7","T","Sub Dominant Minor"},  
		{"5","mM7","5M7","T","Sub Dominant Minor"},   
		{"8","M","8M","T","Sub Dominant Minor"},  
		{"8","M7","8M7","T","Sub Dominant Minor"},  
		{"10","M","10M","T","Sub Dominant Minor"},  
		{"10","Mm7","10Mm7","T","Sub Dominant Minor"},  
				
		
			//Sub Dominant Minor to Dominant
		{"5","m","SM","D","Sub Dominant Minor"},  
		{"5","m6","SM","D","Sub Dominant Minor"},  
		{"5","m7","SM","D","Sub Dominant Minor"},  
		{"5","mM7","SM","D","Sub Dominant Minor"},   
		{"2","mFlat5","SM","D","Sub Dominant Minor"},      
		{"2","mFlat57","SM","D","Sub Dominant Minor"},  
		{"8","M","SM","D","Sub Dominant Minor"},  
		{"8","M7","SM","D","Sub Dominant Minor"},  
		{"10","M","SM","D","Sub Dominant Minor"},  
		{"10","Mm7","SM","D","Sub Dominant Minor"},  
		{"1","M7","SM","D","Sub Dominant Minor"},  
		{"8","Mm7","SM","D","Sub Dominant Minor"},  
				//from Secondary Dominant
		{"5","m","5m","D","Sub Dominant Minor"},  
		{"5","m6","5m6","D","Sub Dominant Minor"},  
		{"5","m7","5m7","D","Sub Dominant Minor"},  
		{"5","mM7","5M7","D","Sub Dominant Minor"},   
		{"8","M","8M","D","Sub Dominant Minor"},  
		{"8","M7","8M7","D","Sub Dominant Minor"},  
		{"10","M","10M","D","Sub Dominant Minor"},  
		{"10","Mm7","10Mm7","D","Sub Dominant Minor"},  
				
		
		//Related Second
		{"2","m7","R","7M","Related Second 7th"},  
		{"2","m7","R","7Mm7","Related Second 7th"},  
		{"2","m7","R","1Mm7","Related Second 7th"},  
		{"2","mFlat57","R","7M","Related Second 7th"},  
		{"2","mFlat57","R","7Mm7","Related Second 7th"},  
		{"2","mFlat57","R","1Mm7","Related Second 7th"},  
		{"5","m7","R","10Mm7","Related Second 7th"},  
		{"5","m7","R","4Mm7","Related Second 7th"},  
		{"7","m7","R","0Mm7","Related Second 7th"},  
		{"7","m7","R","6Mm7","Related Second 7th"},  
		{"7","mFlat57","R","0Mm7","Related Second 7th"},  
		{"7","mFlat57","R","6Mm7","Related Second 7th"},  
		{"9","m7","R","2Mm7","Related Second 7th"},  
		{"9","m7","R","8Mm7","Related Second 7th"},  
		{"9","mFlat57","R","2Mm7","Related Second 7th"},  
		{"9","mFlat57","R","8Mm7","Related Second 7th"},  
		{"10","m7","R","3Mm7","Related Second 7th"},  
		{"10","m7","R","9Mm7","Related Second 7th"},  
		{"0","m7","R","5Mm7","Related Second 7th"},  
		{"0","m7","R","11Mm7","Related Second 7th"}, 
		{"2","m7","2m7","7M","Related Second 7th"},//from Secondary Dominant 
		{"2","m7","2m7","7Mm7","Related Second 7th"},//from Secondary Dominant  
		{"2","m7","2m7","1Mm7","Related Second 7th"},//from Secondary Dominant  
		{"2","mFlat57","2mFlat57","7M","Related Second 7th"},//from Secondary Dominant  
		{"2","mFlat57","2mFlat57","7Mm7","Related Second 7th"},//from Secondary Dominant   
		{"2","mFlat57","2mFlat57","1Mm7","Related Second 7th"},//from Secondary Dominant 
			//裏コード
		{"8","m7","R","7M","Related Second 7th"},  
		{"8","m7","R","7Mm7","Related Second 7th"},  
		{"8","m7","R","1Mm7","Related Second 7th"},  
		{"8","mFlat57","R","7M","Related Second 7th"},  
		{"8","mFlat57","R","7Mm7","Related Second 7th"},  
		{"8","mFlat57","R","1Mm7","Related Second 7th"},  
		{"11","m7","R","10Mm7","Related Second 7th"},  
		{"11","m7","R","4Mm7","Related Second 7th"},  
		{"1","m7","R","0Mm7","Related Second 7th"},  
		{"1","m7","R","6Mm7","Related Second 7th"},  
		{"1","mFlat57","R","0Mm7","Related Second 7th"},  
		{"1","mFlat57","R","6Mm7","Related Second 7th"},  
		{"3","m7","R","2Mm7","Related Second 7th"},  
		{"3","m7","R","8Mm7","Related Second 7th"},  
		{"3","mFlat57","R","2Mm7","Related Second 7th"},  
		{"3","mFlat57","R","8Mm7","Related Second 7th"},  
		{"4","m7","R","3Mm7","Related Second 7th"},  
		{"4","m7","R","9Mm7","Related Second 7th"},  
		{"6","m7","R","5Mm7","Related Second 7th"},  
		{"6","m7","R","11Mm7","Related Second 7th"},
		{"8","m7","8m7","7M","Related Second 7th"},//from Secondary Dominant 
		{"8","m7","8m7","7Mm7","Related Second 7th"},//from Secondary Dominant  
		{"8","m7","8m7","1Mm7","Related Second 7th"},//from Secondary Dominant  
		{"8","mFlat57","8mFlat57","7M","Related Second 7th"},//from Secondary Dominant  
		{"8","mFlat57","8mFlat57","7Mm7","Related Second 7th"},//from Secondary Dominant   
		{"8","mFlat57","8mFlat57","1Mm7","Related Second 7th"},//from Secondary Dominant 
		
		//Secondary Dominant
		/*
		{"0","Mm7","SD","5M","Secondary Dominant"},  
		{"0","Mm7","SD","5M6","Secondary Dominant"},  
		{"0","Mm7","SD","5Mm7","Secondary Dominant"},  
		{"0","Mm7","SD","5m","Secondary Dominant"},  
		{"0","Mm7","SD","5m6","Secondary Dominant"},  
		{"0","Mm7","SD","5m7","Secondary Dominant"},  
		{"0","Mm7","SD","5mM7","Secondary Dominant"},  
		{"2","Mm7","SD","7M","Secondary Dominant"},  
		{"2","Mm7","SD","7Mm7","Secondary Dominant"},  
		{"2","Mm7","SD","7m","Secondary Dominant"},  
		{"2","Mm7","SD","7m7","Secondary Dominant"},  
		{"3","Mm7","SD","8M","Secondary Dominant"},  
		{"3","Mm7","SD","8M7","Secondary Dominant"},  
		{"5","Mm7","SD","10M","Secondary Dominant"},  
		{"5","Mm7","SD","10Mm7","Secondary Dominant"},  
		{"9","Mm7","SD","2m","Secondary Dominant"},  
		{"9","Mm7","SD","2m7","Secondary Dominant"},  
		{"10","Mm7","SD","3M","Secondary Dominant"},  
		{"10","Mm7","SD","3M7","Secondary Dominant"},  
			//裏コード
		{"6","Mm7","SD","5M","Secondary Dominant"},  
		{"6","Mm7","SD","5M6","Secondary Dominant"},  
		{"6","Mm7","SD","5Mm7","Secondary Dominant"},  
		{"6","Mm7","SD","5m","Secondary Dominant"},  
		{"6","Mm7","SD","5m6","Secondary Dominant"},  
		{"6","Mm7","SD","5m7","Secondary Dominant"},  
		{"6","Mm7","SD","5mM7","Secondary Dominant"},  
		{"8","Mm7","SD","7M","Secondary Dominant"},  
		{"8","Mm7","SD","7Mm7","Secondary Dominant"},  
		{"8","Mm7","SD","7m","Secondary Dominant"},  
		{"8","Mm7","SD","7m7","Secondary Dominant"},  
		{"9","Mm7","SD","8M","Secondary Dominant"},  
		{"9","Mm7","SD","8M7","Secondary Dominant"},  
		{"11","Mm7","SD","10M","Secondary Dominant"},  
		{"11","Mm7","SD","10Mm7","Secondary Dominant"},  
		{"3","Mm7","SD","2m","Secondary Dominant"},  
		{"3","Mm7","SD","2m7","Secondary Dominant"},  
		{"4","Mm7","SD","3M","Secondary Dominant"},  
		{"4","Mm7","SD","3M7","Secondary Dominant"},  
		*/
		
		//Secondary Dominantfrom Related Second
		{"0","Mm7","SD","5M","Secondary Dominant"},  
		{"0","Mm7","SD","5M6","Secondary Dominant"},  
		{"0","Mm7","SD","5Mm7","Secondary Dominant"},  
		{"0","Mm7","SD","5m","Secondary Dominant"},  
		{"0","Mm7","SD","5m6","Secondary Dominant"},  
		{"0","Mm7","SD","5m7","Secondary Dominant"},  
		{"0","Mm7","SD","5mM7","Secondary Dominant"},  
		{"2","Mm7","SD","7M","Secondary Dominant"},  
		{"2","Mm7","SD","7Mm7","Secondary Dominant"},  
		{"2","Mm7","SD","7m","Secondary Dominant"},  
		{"2","Mm7","SD","7m7","Secondary Dominant"},  
		{"3","Mm7","SD","8M","Secondary Dominant"},  
		{"3","Mm7","SD","8M7","Secondary Dominant"},  
		{"5","Mm7","SD","10M","Secondary Dominant"},  
		{"5","Mm7","SD","10Mm7","Secondary Dominant"},  
		{"9","Mm7","SD","2m","Secondary Dominant"},  
		{"9","Mm7","SD","2m7","Secondary Dominant"},  
		{"10","Mm7","SD","3M","Secondary Dominant"},  
		{"10","Mm7","SD","3M7","Secondary Dominant"},  
			//裏コード
		{"6","Mm7","6Mm7","5M","Secondary Dominant"},  
		{"6","Mm7","6Mm7","5M6","Secondary Dominant"},  
		{"6","Mm7","6Mm7","5Mm7","Secondary Dominant"},  
		{"6","Mm7","6Mm7","5m","Secondary Dominant"},  
		{"6","Mm7","6Mm7","5m6","Secondary Dominant"},  
		{"6","Mm7","6Mm7","5m7","Secondary Dominant"},  
		{"6","Mm7","6Mm7","5mM7","Secondary Dominant"},  
		{"8","Mm7","8Mm7","7M","Secondary Dominant"},  
		{"8","Mm7","8Mm7","7Mm7","Secondary Dominant"},  
		{"8","Mm7","8Mm7","7m","Secondary Dominant"},  
		{"8","Mm7","8Mm7","7m7","Secondary Dominant"},  
		{"9","Mm7","9Mm7","8M","Secondary Dominant"},  
		{"9","Mm7","9Mm7","8M7","Secondary Dominant"},  
		{"11","Mm7","11Mm7","10M","Secondary Dominant"},  
		{"11","Mm7","11Mm7","10Mm7","Secondary Dominant"},  
		{"3","Mm7","3Mm7","2m","Secondary Dominant"},  
		{"3","Mm7","3Mm7","2m7","Secondary Dominant"},  
		{"4","Mm7","4Mm7","3M","Secondary Dominant"},  
		{"4","Mm7","4Mm7","3M7","Secondary Dominant"},  
		
		//Passing Diminish
		{"1","dim7","PD" ,"", "Passing Diminish"},  
		{"4","dim7","PD" ,"", "Passing Diminish"},  
		{"6","dim7","PD" ,"", "Passing Diminish"},  
		{"9","dim7","PD" ,"", "Passing Diminish"},  
		{"11","dim7","PD" ,"", "Passing Diminish"},  

		
		
	};
	
	

}
