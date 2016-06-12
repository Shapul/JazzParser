
class Find_diatonic {
	
	//TODO 長短併せて24キーつくる。もっといい方法はないのか
	static String[] find_diatonic(String newmain_key, String tone){
		
		String data[] = new String[2];
		
		//String型の場合はequalメソッドを使う！
		if(newmain_key.equals("CM")){
			System.out.println(tone);
			
			if(tone.equals("C")||tone.equals("CM7")){
				data[0] = "1";
				data[1] = "T";
			}
			else if(tone.equals("Dm")||tone.equals("Dm7")){
				data[0] = "2m7";
				data[1] = "S";
			}
			else if(tone.equals("Em")||tone.equals("Em7")){
				data[0] = "3m7";
				data[1] = "T";
			}
			else if(tone.equals("F")||tone.equals("FM7")){
				data[0] = "4";
				data[1] = "S";
			}
			else if(tone.equals("G")||tone.equals("G7")){
				data[0] = "5,7";
				data[1] = "D";
			}
			else if(tone.equals("Am")||tone.equals("Am7")){
				data[0] = "6m7";
				data[1] = "T";
			}
			else if(tone.equals("Bm(-5)")||tone.equals("Bm7(-5)")){
				data[0] = "7m7(-5)";
				data[1] = "D";
			}
		}
		
		else if(newmain_key.equals("D♭M")||newmain_key.equals("C#M")){
			if(tone.equals("D♭")||tone.equals("D♭M7")||tone.equals("C#")||tone.equals("C#M7")){
				data[0] = "1";
				data[1] = "T";
			}
			else if(tone.equals("E♭m")||tone.equals("E♭m7")||tone.equals("D#m")||tone.equals("D#m7")){
				data[0] = "2m7";
				data[1] = "S";
			}
			else if(tone.equals("Fm")||tone.equals("Fm7")){
				data[0] = "3m7";
				data[1] = "T";
			}
			else if(tone.equals("G♭")||tone.equals("G♭M7")||tone.equals("F#")||tone.equals("F#M7")){
				data[0] = "4";
				data[1] = "S";
			}
			else if(tone.equals("A♭")||tone.equals("A♭7")||tone.equals("G#")||tone.equals("G#7")){
				data[0] = "5,7";
				data[1] = "D";
			}
			else if(tone.equals("B♭m")||tone.equals("B♭m7")||tone.equals("A#m")||tone.equals("A#m7")){
				data[0] = "6m7";
				data[1] = "T";
			}
			else if(tone.equals("Cm(-5)")||tone.equals("Cm7(-5)")){
				data[0] = "7m7(-5)";
				data[1] = "D";
			}
		}
		
		else if(newmain_key.equals("DM")){
			if(tone.equals("D")||tone.equals("DM7")){
				data[0] = "1";
				data[1] = "T";
			}
			else if(tone.equals("Em")||tone.equals("Em7")){
				data[0] = "2m7";
				data[1] = "S";
			}
			else if(tone.equals("G♭m")||tone.equals("G♭m7")||tone.equals("F#m")||tone.equals("F#m7")){
				data[0] = "3m7";
				data[1] = "T";
			}
			else if(tone.equals("G")||tone.equals("GM7")){
				data[0] = "4";
				data[1] = "S";
			}
			else if(tone.equals("A")||tone.equals("A7")){
				data[0] = "5,7";
				data[1] = "D";
			}
			else if(tone.equals("Bm")||tone.equals("Bm7")){
				data[0] = "6m7";
				data[1] = "T";
			}
			else if(tone.equals("D♭m(-5)")||tone.equals("D♭m7(-5)")||tone.equals("C#m(-5)")||tone.equals("C#m7(-5)")){
				data[0] = "7m7(-5)";
				data[1] = "D";
			}
		}
		
		else if(newmain_key.equals("E♭M")||newmain_key.equals("D#M")){
			if(tone.equals("E♭")||tone.equals("E♭M7")||tone.equals("D#")||tone.equals("D#M7")){
				data[0] = "1";
				data[1] = "T";
			}
			else if(tone.equals("Fm")||tone.equals("Fm7")){
				data[0] = "2m7";
				data[1] = "S";
			}
			else if(tone.equals("Gm")||tone.equals("Gm7")){
				data[0] = "3m7";
				data[1] = "T";
			}
			else if(tone.equals("A♭")||tone.equals("A♭M7")||tone.equals("G#")||tone.equals("G#M7")){
				data[0] = "4";
				data[1] = "S";
			}
			else if(tone.equals("B♭")||tone.equals("B♭7")||tone.equals("A#")||tone.equals("A#7")){
				data[0] = "5,7";
				data[1] = "D";
			}
			else if(tone.equals("Cm")||tone.equals("Cm7")){
				data[0] = "6m7";
				data[1] = "T";
			}
			else if(tone.equals("Dm(-5)")||tone.equals("Dm7(-5)")){
				data[0] = "7m7(-5)";
				data[1] = "D";
			}
		}
		
		else if(newmain_key.equals("EM")){
			if(tone.equals("E")||tone.equals("EM7")){
				data[0] = "1";
				data[1] = "T";
			}
			else if(tone.equals("G♭m")||tone.equals("G♭m7")||tone.equals("F#m")||tone.equals("F#m7")){
				data[0] = "2m7";
				data[1] = "S";
			}
			else if(tone.equals("A♭m")||tone.equals("A♭m7")||tone.equals("G#m")||tone.equals("G#m7")){
				data[0] = "3m7";
				data[1] = "T";
			}
			else if(tone.equals("A")||tone.equals("AM7")){
				data[0] = "4";
				data[1] = "S";
			}
			else if(tone.equals("B")||tone.equals("B7")){
				data[0] = "5,7";
				data[1] = "D";
			}
			else if(tone.equals("D♭m")||tone.equals("D♭m7")||tone.equals("C#m")||tone.equals("C#m7")){
				data[0] = "6m7";
				data[1] = "T";
			}
			else if(tone.equals("E♭m(-5)")||tone.equals("E♭m7(-5)")||tone.equals("D#m(-5)")||tone.equals("D#m7(-5)")){
				data[0] = "7m7(-5)";
				data[1] = "D";
			}
		}
		
		else if(newmain_key.equals("FM")){
			if(tone.equals("F")||tone.equals("FM7")){
				data[0] = "1";
				data[1] = "T";
			}
			else if(tone.equals("Gm")||tone.equals("Gm7")){
				data[0] = "2m7";
				data[1] = "S";
			}
			else if(tone.equals("Am")||tone.equals("Am7")){
				data[0] = "3m7";
				data[1] = "T";
			}
			else if(tone.equals("B♭")||tone.equals("B♭M7")||tone.equals("A#")||tone.equals("A#M7")){
				data[0] = "4";
				data[1] = "S";
			}
			else if(tone.equals("C")||tone.equals("C7")){
				data[0] = "5,7";
				data[1] = "D";
			}
			else if(tone.equals("Dm")||tone.equals("Dm7")){
				data[0] = "6m7";
				data[1] = "T";
			}
			else if(tone.equals("Em(-5)")||tone.equals("Em7(-5)")){
				data[0] = "7m7(-5)";
				data[1] = "D";
			}
		}
		
		else if(newmain_key.equals("G♭M")||newmain_key.equals("F#M")){
			if(tone.equals("G♭")||tone.equals("G♭M7")||tone.equals("F#")||tone.equals("F#M7")){
				data[0] = "1";
				data[1] = "T";
			}
			else if(tone.equals("A♭m")||tone.equals("A♭m7")||tone.equals("G#m")||tone.equals("G#m7")){
				data[0] = "2m7";
				data[1] = "S";
			}
			else if(tone.equals("B♭m")||tone.equals("B♭m7")||tone.equals("A#m")||tone.equals("A#m7")){
				data[0] = "3m7";
				data[1] = "T";
			}
			else if(tone.equals("B")||tone.equals("BM7")){
				data[0] = "4";
				data[1] = "S";
			}
			else if(tone.equals("D♭")||tone.equals("D♭7")||tone.equals("C#")||tone.equals("C#7")){
				data[0] = "5,7";
				data[1] = "D";
			}
			else if(tone.equals("E♭m")||tone.equals("E♭m7")||tone.equals("D#m")||tone.equals("D#m7")){
				data[0] = "6m7";
				data[1] = "T";
			}
			else if(tone.equals("Fm(-5)")||tone.equals("Fm7(-5)")){
				data[0] = "7m7(-5)";
				data[1] = "D";
			}
		}
		
		else if(newmain_key.equals("GM")){
			System.out.println(tone);
			
			if(tone.equals("G")||tone.equals("GM7")){
				data[0] = "1";
				data[1] = "T";
			}
			else if(tone.equals("Am")||tone.equals("Am7")){
				data[0] = "2m7";
				data[1] = "S";
			}
			else if(tone.equals("Bm")||tone.equals("Bm7")){
				data[0] = "3m7";
				data[1] = "T";
			}
			else if(tone.equals("C")||tone.equals("CM7")){
				data[0] = "4";
				data[1] = "S";
			}
			else if(tone.equals("D")||tone.equals("D7")){
				data[0] = "5,7";
				data[1] = "D";
			}
			else if(tone.equals("Em")||tone.equals("Em7")){
				data[0] = "6m7";
				data[1] = "T";
			}
			else if(tone.equals("G♭m(-5)")||tone.equals("G♭m7(-5)")||tone.equals("F#m(-5)")||tone.equals("F#m7(-5)")){
				data[0] = "7m7(-5)";
				data[1] = "D";
			}
		}
		
		else if(newmain_key.equals("A♭M")||newmain_key.equals("G#M")){
			if(tone.equals("A♭")||tone.equals("A♭M7")||tone.equals("G#")||tone.equals("G#M7")){
				data[0] = "1";
				data[1] = "T";
			}
			else if(tone.equals("B♭m")||tone.equals("B♭m7")||tone.equals("A#m")||tone.equals("A#m7")){
				data[0] = "2m7";
				data[1] = "S";
			}
			else if(tone.equals("Cm")||tone.equals("Cm7")){
				data[0] = "3m7";
				data[1] = "T";
			}
			else if(tone.equals("D♭")||tone.equals("D♭M7")||tone.equals("C#")||tone.equals("C#M7")){
				data[0] = "4";
				data[1] = "S";
			}
			else if(tone.equals("E♭")||tone.equals("E♭7")||tone.equals("D#")||tone.equals("D#7")){
				data[0] = "5,7";
				data[1] = "D";
			}
			else if(tone.equals("Fm")||tone.equals("Fm7")){
				data[0] = "6m7";
				data[1] = "T";
			}
			else if(tone.equals("Gm(-5)")||tone.equals("Gm7(-5)")){
				data[0] = "7m7(-5)";
				data[1] = "D";
			}
		}
		
		else if(newmain_key.equals("AM")){
			if(tone.equals("A")||tone.equals("AM7")){
				data[0] = "1";
				data[1] = "T";
			}
			else if(tone.equals("Bm")||tone.equals("Bm7")){
				data[0] = "2m7";
				data[1] = "S";
			}
			else if(tone.equals("D♭m")||tone.equals("D♭m7")||tone.equals("C#m")||tone.equals("C#m7")){
				data[0] = "3m7";
				data[1] = "T";
			}
			else if(tone.equals("D")||tone.equals("DM7")){
				data[0] = "4";
				data[1] = "S";
			}
			else if(tone.equals("E")||tone.equals("E7")){
				data[0] = "5,7";
				data[1] = "D";
			}
			else if(tone.equals("G♭m")||tone.equals("G♭m7")||tone.equals("F#m")||tone.equals("F#m7")){
				data[0] = "6m7";
				data[1] = "T";
			}
			else if(tone.equals("A♭m(-5)")||tone.equals("A♭m7(-5)")||tone.equals("G#m(-5)")||tone.equals("G#m7(-5)")){
				data[0] = "7m7(-5)";
				data[1] = "D";
			}
		}
		
		else if(newmain_key.equals("B♭M")||newmain_key.equals("A#M")){
			if(tone.equals("B♭")||tone.equals("B♭M7")||tone.equals("A#")||tone.equals("A#M7")){
				data[0] = "1";
				data[1] = "T";
			}
			else if(tone.equals("Cm")||tone.equals("Cm7")){
				data[0] = "2m7";
				data[1] = "S";
			}
			else if(tone.equals("Dm")||tone.equals("Dm7")){
				data[0] = "3m7";
				data[1] = "T";
			}
			else if(tone.equals("E♭")||tone.equals("E♭M7")||tone.equals("D#")||tone.equals("D#M7")){
				data[0] = "4";
				data[1] = "S";
			}
			else if(tone.equals("F")||tone.equals("F7")){
				data[0] = "5,7";
				data[1] = "D";
			}
			else if(tone.equals("Gm")||tone.equals("Gm7")){
				data[0] = "6m7";
				data[1] = "T";
			}
			else if(tone.equals("Am(-5)")||tone.equals("Am7(-5)")){
				data[0] = "7m7(-5)";
				data[1] = "D";
			}
		}
		
		else if(newmain_key.equals("BM")){
			if(tone.equals("B")||tone.equals("BM7")){
				data[0] = "1";
				data[1] = "T";
			}
			else if(tone.equals("D♭m")||tone.equals("D♭m7")||tone.equals("C#m")||tone.equals("C#m7")){
				data[0] = "2m7";
				data[1] = "S";
			}
			else if(tone.equals("E♭m")||tone.equals("E♭m7")||tone.equals("D#m")||tone.equals("D#m7")){
				data[0] = "3m7";
				data[1] = "T";
			}
			else if(tone.equals("E")||tone.equals("EM7")){
				data[0] = "4";
				data[1] = "S";
			}
			else if(tone.equals("G♭")||tone.equals("G♭7")||tone.equals("F#")||tone.equals("F#7")){
				data[0] = "5,7";
				data[1] = "D";
			}
			else if(tone.equals("A♭m")||tone.equals("A♭m7")||tone.equals("G#m")||tone.equals("G#m7")){
				data[0] = "6m7";
				data[1] = "T";
			}
			else if(tone.equals("B♭m(-5)")||tone.equals("B♭m7(-5)")||tone.equals("A#m(-5)")||tone.equals("A#m7(-5)")){
				data[0] = "7m7(-5)";
				data[1] = "D";
			}
		}
		//ここまで長調
		//ここから短調
		else if(newmain_key.equals("Am")){
			System.out.println(tone);
			
			if(tone.equals("C")||tone.equals("CM7")){
				data[0] = "♭3";
				data[1] = "T";
			}
			else if(tone.equals("Dm")||tone.equals("Dm7")){
				data[0] = "4m";
				data[1] = "S";
			}
			else if(tone.equals("Em")||tone.equals("Em7")||tone.equals("E7")){
				data[0] = "5,7";
				data[1] = "D";
			}
			else if(tone.equals("F")||tone.equals("FM7")){
				data[0] = "♭6";
				data[1] = "S";
			}
			else if(tone.equals("G♭m(-5)")||tone.equals("G♭m7(-5)")||tone.equals("F#m(-5)")||tone.equals("F#m7(-5)")){
				data[0] = "6m7(-5)";
				data[1] = "T";
			}
			else if(tone.equals("G")||tone.equals("G7")){
				data[0] = "♭7,7";
				data[1] = "S";
			}
			else if(tone.equals("A♭dim")||tone.equals("G#dim")){
				data[0] = "7dim";
				data[1] = "D";
			}
			else if(tone.equals("Am")||tone.equals("Am7")){
				data[0] = "1m";
				data[1] = "T";
			}
			else if(tone.equals("Bm(-5)")||tone.equals("Bm7(-5)")){
				data[0] = "2m7(-5)";
				data[1] = "S";
			}
		}
		
		else if(newmain_key.equals("B♭m")||newmain_key.equals("A#m")){
			if(tone.equals("D♭")||tone.equals("D♭M7")||tone.equals("C#")||tone.equals("C#M7")){
				data[0] = "♭3";
				data[1] = "T";
			}
			else if(tone.equals("E♭m")||tone.equals("E♭m7")||tone.equals("D#m")||tone.equals("D#m7")){
				data[0] = "4m";
				data[1] = "S";
			}
			else if(tone.equals("Fm")||tone.equals("Fm7")||tone.equals("F7")){
				data[0] = "5,7";
				data[1] = "D";
			}
			else if(tone.equals("G♭")||tone.equals("G♭M7")||tone.equals("F#")||tone.equals("F#M7")){
				data[0] = "♭6";
				data[1] = "S";
			}
			else if(tone.equals("Gm(-5)")||tone.equals("Gm7(-5)")){
				data[0] = "6m7(-5)";
				data[1] = "T";
			}
			else if(tone.equals("A♭")||tone.equals("A♭7")||tone.equals("G#")||tone.equals("G#7")){
				data[0] = "♭7,7";
				data[1] = "S";
			}
			else if(tone.equals("Adim")){
				data[0] = "7dim";
				data[1] = "D";
			}
			else if(tone.equals("B♭m")||tone.equals("B♭m7")||tone.equals("A#m")||tone.equals("A#m7")){
				data[0] = "1m";
				data[1] = "T";
			}
			else if(tone.equals("Cm(-5)")||tone.equals("Cm7(-5)")){
				data[0] = "2m7(-5)";
				data[1] = "S";
			}
		}
		
		else if(newmain_key.equals("Bm")){
			if(tone.equals("D")||tone.equals("DM7")){
				data[0] = "♭3";
				data[1] = "T";
			}
			else if(tone.equals("Em")||tone.equals("Em7")){
				data[0] = "4m";
				data[1] = "S";
			}
			else if(tone.equals("G♭m")||tone.equals("G♭m7")||tone.equals("G♭7")||tone.equals("F#m")||tone.equals("F#m7")||tone.equals("F#7")){
				data[0] = "5,7";
				data[1] = "D";
			}
			else if(tone.equals("G")||tone.equals("GM7")){
				data[0] = "♭6";
				data[1] = "S";
			}
			else if(tone.equals("A♭m(-5)")||tone.equals("A♭m7(-5)")||tone.equals("G#m(-5)")||tone.equals("G#m7(-5)")){
				data[0] = "6m7(-5)";
				data[1] = "T";
			}
			else if(tone.equals("A")||tone.equals("A7")){
				data[0] = "♭7,7";
				data[1] = "S";
			}
			else if(tone.equals("B♭dim")||tone.equals("A#dim")){
				data[0] = "7dim";
				data[1] = "D";
			}
			else if(tone.equals("Bm")||tone.equals("Bm7")){
				data[0] = "1m";
				data[1] = "T";
			}
			else if(tone.equals("D♭m(-5)")||tone.equals("D♭m7(-5)")||tone.equals("C#m(-5)")||tone.equals("C#m7(-5)")){
				data[0] = "2m7(-5)";
				data[1] = "S";
			}
		}
		
		else if(newmain_key.equals("Cm")){
			if(tone.equals("E♭")||tone.equals("E♭M7")||tone.equals("D#")||tone.equals("D#M7")){
				data[0] = "♭3";
				data[1] = "T";
			}
			else if(tone.equals("Fm")||tone.equals("Fm7")){
				data[0] = "4m";
				data[1] = "S";
			}
			else if(tone.equals("Gm")||tone.equals("Gm7")||tone.equals("G7")){
				data[0] = "5,7";
				data[1] = "D";
			}
			else if(tone.equals("A♭")||tone.equals("A♭M7")||tone.equals("G#")||tone.equals("G#M7")){
				data[0] = "♭6";
				data[1] = "S";
			}
			else if(tone.equals("Am(-5)")||tone.equals("Am7(-5)")){
				data[0] = "6m7(-5)";
				data[1] = "T";
			}
			else if(tone.equals("B♭")||tone.equals("B♭7")||tone.equals("A#")||tone.equals("A#7")){
				data[0] = "♭7,7";
				data[1] = "S";
			}
			else if(tone.equals("Bdim")){
				data[0] = "7dim";
				data[1] = "D";
			}
			else if(tone.equals("Cm")||tone.equals("Cm7")){
				data[0] = "1m";
				data[1] = "T";
			}
			else if(tone.equals("Dm(-5)")||tone.equals("Dm7(-5)")){
				data[0] = "2m7(-5)";
				data[1] = "S";
			}
		}
		
		else if(newmain_key.equals("D♭m")||newmain_key.equals("C#m")){
			if(tone.equals("E")||tone.equals("EM7")){
				data[0] = "♭3";
				data[1] = "T";
			}
			else if(tone.equals("G♭m")||tone.equals("G♭m7")||tone.equals("F#m")||tone.equals("F#m7")){
				data[0] = "4m";
				data[1] = "S";
			}
			else if(tone.equals("A♭m")||tone.equals("A♭m7")||tone.equals("A♭7")||tone.equals("G#m")||tone.equals("G#m7")||tone.equals("G#7")){
				data[0] = "5,7";
				data[1] = "D";
			}
			else if(tone.equals("A")||tone.equals("AM7")){
				data[0] = "♭6";
				data[1] = "S";
			}
			else if(tone.equals("B♭m(-5)")||tone.equals("B♭m7(-5)")||tone.equals("A#m(-5)")||tone.equals("A#m7(-5)")){
				data[0] = "6m7(-5)";
				data[1] = "T";
			}
			else if(tone.equals("B")||tone.equals("B7")){
				data[0] = "♭7,7";
				data[1] = "S";
			}
			else if(tone.equals("Cdim")){
				data[0] = "7dim";
				data[1] = "D";
			}
			else if(tone.equals("D♭m")||tone.equals("D♭m7")||tone.equals("C#m")||tone.equals("C#m7")){
				data[0] = "1m";
				data[1] = "T";
			}
			else if(tone.equals("E♭m(-5)")||tone.equals("E♭m7(-5)")||tone.equals("D#m(-5)")||tone.equals("D#m7(-5)")){
				data[0] = "2m7(-5)";
				data[1] = "S";
			}
		}
		
		else if(newmain_key.equals("Dm")){
			if(tone.equals("F")||tone.equals("FM7")){
				data[0] = "♭3";
				data[1] = "T";
			}
			else if(tone.equals("Gm")||tone.equals("Gm7")){
				data[0] = "4m";
				data[1] = "S";
			}
			else if(tone.equals("Am")||tone.equals("Am7")||tone.equals("A7")){
				data[0] = "5,7";
				data[1] = "D";
			}
			else if(tone.equals("B♭")||tone.equals("B♭M7")||tone.equals("A#")||tone.equals("A#M7")){
				data[0] = "♭6";
				data[1] = "S";
			}
			else if(tone.equals("Bm(-5)")||tone.equals("Bm7(-5)")){
				data[0] = "6m7(-5)";
				data[1] = "T";
			}
			else if(tone.equals("C")||tone.equals("C7")){
				data[0] = "♭7,7";
				data[1] = "S";
			}
			else if(tone.equals("D♭dim")||tone.equals("C#dim")){
				data[0] = "7dim";
				data[1] = "D";
			}
			else if(tone.equals("Dm")||tone.equals("Dm7")){
				data[0] = "1m";
				data[1] = "T";
			}
			else if(tone.equals("Em(-5)")||tone.equals("Em7(-5)")){
				data[0] = "2m7(-5)";
				data[1] = "S";
			}
		}
		
		else if(newmain_key.equals("E♭m")||newmain_key.equals("D#m")){
			if(tone.equals("G♭")||tone.equals("G♭M7")||tone.equals("F#")||tone.equals("F#M7")){
				data[0] = "♭3";
				data[1] = "T";
			}
			else if(tone.equals("A♭m")||tone.equals("A♭m7")||tone.equals("G#m")||tone.equals("G#m7")){
				data[0] = "4m";
				data[1] = "S";
			}
			else if(tone.equals("B♭m")||tone.equals("B♭m7")||tone.equals("B♭7")||tone.equals("A#m")||tone.equals("A#m7")||tone.equals("A#7")){
				data[0] = "5,7";
				data[1] = "D";
			}
			else if(tone.equals("B")||tone.equals("BM7")){
				data[0] = "♭6";
				data[1] = "S";
			}
			else if(tone.equals("Cm(-5)")||tone.equals("Cm7(-5)")){
				data[0] = "6m7(-5)";
				data[1] = "T";
			}
			else if(tone.equals("D♭")||tone.equals("D♭7")||tone.equals("C#")||tone.equals("C#7")){
				data[0] = "♭7,7";
				data[1] = "S";
			}
			else if(tone.equals("Ddim")){
				data[0] = "7dim";
				data[1] = "D";
			}
			else if(tone.equals("E♭m")||tone.equals("E♭m7")||tone.equals("D#m")||tone.equals("D#m7")){
				data[0] = "1m";
				data[1] = "T";
			}
			else if(tone.equals("Fm(-5)")||tone.equals("Fm7(-5)")){
				data[0] = "2m7(-5)";
				data[1] = "S";
			}
		}
		
		else if(newmain_key.equals("Em")){
			if(tone.equals("G")||tone.equals("GM7")){
				data[0] = "♭3";
				data[1] = "T";
			}
			else if(tone.equals("Am")||tone.equals("Am7")){
				data[0] = "4m";
				data[1] = "S";
			}
			else if(tone.equals("Bm")||tone.equals("Bm7")||tone.equals("B7")){
				data[0] = "5,7";
				data[1] = "D";
			}
			else if(tone.equals("C")||tone.equals("CM7")){
				data[0] = "♭6";
				data[1] = "S";
			}
			else if(tone.equals("D♭m(-5)")||tone.equals("D♭m7(-5)")||tone.equals("C#m(-5)")||tone.equals("C#m7(-5)")){
				data[0] = "6m7(-5)";
				data[1] = "T";
			}
			else if(tone.equals("D")||tone.equals("D7")){
				data[0] = "♭7,7";
				data[1] = "S";
			}
			else if(tone.equals("E♭dim")||tone.equals("D#dim")){
				data[0] = "7dim";
				data[1] = "D";
			}
			else if(tone.equals("Em")||tone.equals("Em7")){
				data[0] = "1m";
				data[1] = "T";
			}
			else if(tone.equals("G♭m(-5)")||tone.equals("G♭m7(-5)")||tone.equals("F#m(-5)")||tone.equals("F#m7(-5)")){
				data[0] = "2m7(-5)";
				data[1] = "S";
			}
		}
		
		else if(newmain_key.equals("Fm")){
			if(tone.equals("A♭")||tone.equals("A♭M7")||tone.equals("G#")||tone.equals("G#M7")){
				data[0] = "♭3";
				data[1] = "T";
			}
			else if(tone.equals("B♭m")||tone.equals("B♭m7")||tone.equals("A#m")||tone.equals("A#m7")){
				data[0] = "4m";
				data[1] = "S";
			}
			else if(tone.equals("Cm")||tone.equals("Cm7")||tone.equals("C7")){
				data[0] = "5,7";
				data[1] = "D";
			}
			else if(tone.equals("D♭")||tone.equals("D♭M7")||tone.equals("C#")||tone.equals("C#M7")){
				data[0] = "♭6";
				data[1] = "S";
			}
			else if(tone.equals("Dm(-5)")||tone.equals("Dm7(-5)")){
				data[0] = "6m7(-5)";
				data[1] = "T";
			}
			else if(tone.equals("E♭")||tone.equals("E♭7")||tone.equals("D#")||tone.equals("D#7")){
				data[0] = "♭7,7";
				data[1] = "S";
			}
			else if(tone.equals("Edim")){
				data[0] = "7dim";
				data[1] = "D";
			}
			else if(tone.equals("Fm")||tone.equals("Fm7")){
				data[0] = "1m";
				data[1] = "T";
			}
			else if(tone.equals("Gm(-5)")||tone.equals("Gm7(-5)")){
				data[0] = "2m7(-5)";
				data[1] = "S";
			}
		}
		
		else if(newmain_key.equals("G♭m")||newmain_key.equals("F#m")){
			if(tone.equals("A")||tone.equals("AM7")){
				data[0] = "♭3";
				data[1] = "T";
			}
			else if(tone.equals("Bm")||tone.equals("Bm7")){
				data[0] = "4m";
				data[1] = "S";
			}
			else if(tone.equals("D♭m")||tone.equals("D♭m7")||tone.equals("D♭7")||tone.equals("C#m")||tone.equals("C#m7")||tone.equals("C#7")){
				data[0] = "5,7";
				data[1] = "D";
			}
			else if(tone.equals("D")||tone.equals("DM7")){
				data[0] = "♭6";
				data[1] = "S";
			}
			else if(tone.equals("E♭m(-5)")||tone.equals("E♭m7(-5)")||tone.equals("D#m(-5)")||tone.equals("D#m7(-5)")){
				data[0] = "6m7(-5)";
				data[1] = "T";
			}
			else if(tone.equals("E")||tone.equals("E7")){
				data[0] = "♭7,7";
				data[1] = "S";
			}
			else if(tone.equals("Fdim")){
				data[0] = "7dim";
				data[1] = "D";
			}
			else if(tone.equals("G♭m")||tone.equals("G♭m7")||tone.equals("F#m")||tone.equals("F#m7")){
				data[0] = "1m";
				data[1] = "T";
			}
			else if(tone.equals("A♭m(-5)")||tone.equals("A♭m7(-5)")||tone.equals("G#m(-5)")||tone.equals("G#m7(-5)")){
				data[0] = "2m7(-5)";
				data[1] = "S";
			}
		}
		
		else if(newmain_key.equals("Gm")){
			if(tone.equals("B♭")||tone.equals("B♭M7")||tone.equals("A#")||tone.equals("A#M7")){
				data[0] = "♭3";
				data[1] = "T";
			}
			else if(tone.equals("Cm")||tone.equals("Cm7")){
				data[0] = "4m";
				data[1] = "S";
			}
			else if(tone.equals("Dm")||tone.equals("Dm7")||tone.equals("D7")){
				data[0] = "5,7";
				data[1] = "D";
			}
			else if(tone.equals("E♭")||tone.equals("E♭M7")||tone.equals("D#")||tone.equals("D#M7")){
				data[0] = "♭6";
				data[1] = "S";
			}
			else if(tone.equals("Em(-5)")||tone.equals("Em7(-5)")){
				data[0] = "6m7(-5)";
				data[1] = "T";
			}
			else if(tone.equals("F")||tone.equals("F7")){
				data[0] = "♭7,7";
				data[1] = "S";
			}
			else if(tone.equals("G♭dim")||tone.equals("F#dim")){
				data[0] = "7dim";
				data[1] = "D";
			}
			else if(tone.equals("Gm")||tone.equals("Gm7")){
				data[0] = "1m";
				data[1] = "T";
			}
			else if(tone.equals("Am(-5)")||tone.equals("Am7(-5)")){
				data[0] = "2m7(-5)";
				data[1] = "S";
			}
		}
		
		else if(newmain_key.equals("A♭m")||newmain_key.equals("G#m")){
			if(tone.equals("B")||tone.equals("BM7")){
				data[0] = "♭3";
				data[1] = "T";
			}
			else if(tone.equals("D♭m")||tone.equals("D♭m7")||tone.equals("C#m")||tone.equals("C#m7")){
				data[0] = "4m";
				data[1] = "S";
			}
			else if(tone.equals("E♭m")||tone.equals("E♭m7")||tone.equals("E♭7")||tone.equals("D#m")||tone.equals("D#m7")||tone.equals("D#7")){
				data[0] = "5,7";
				data[1] = "D";
			}
			else if(tone.equals("E")||tone.equals("EM7")){
				data[0] = "♭6";
				data[1] = "S";
			}
			else if(tone.equals("Fm(-5)")||tone.equals("Fm7(-5)")){
				data[0] = "6m7(-5)";
				data[1] = "T";
			}
			else if(tone.equals("G♭")||tone.equals("G♭7")||tone.equals("F#")||tone.equals("F#7")){
				data[0] = "♭7,7";
				data[1] = "S";
			}
			else if(tone.equals("Gdim")){
				data[0] = "7dim";
				data[1] = "D";
			}
			else if(tone.equals("A♭m")||tone.equals("A♭m7")||tone.equals("G#m")||tone.equals("G#m7")){
				data[0] = "1m";
				data[1] = "T";
			}
			else if(tone.equals("B♭m(-5)")||tone.equals("B♭m7(-5)")||tone.equals("A#m(-5)")||tone.equals("A#m7(-5)")){
				data[0] = "2m7(-5)";
				data[1] = "S";
			}
		}
		else{
			data = null;
		}
		
		return data;
			
	}
	
}


