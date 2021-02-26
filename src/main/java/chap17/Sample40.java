package chap17;

import java.util.Arrays;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Sample40 {

	public static void main(String[] args) {
		
		List<ScoreDate> scores = Arrays.asList(
			new ScoreDate("빵형", 61, 31, 31, null), 
			new ScoreDate("타노스", 62, 72, 82, null),
			new ScoreDate("상도", 94, 44, 41, null)
		);
		
		scores.stream().map(
			x-> {
				if(x.getKor() < 40 || x.getEng() < 40 || x.getMat() < 40) {
					x.setMsg("과락입니다.");
				} else if((x.getKor() + x.getEng() + x.getMat()) / 3 < 60) {
					x.setMsg("불합격입니다.");
				} else {
					x.setMsg("합격입니다.");					
				}
				return x;
			}
		)
		.forEach(System.out::println);
	}
}

@Data
@AllArgsConstructor
class ScoreDate {
	private final String name;
	private final int kor;
	private final int eng;
	private final int mat;
	private String msg;
}