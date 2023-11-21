
package cgvData;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Cgvdata {

	public static void crawl() throws IOException {
		File Data = new File("C:\\Users\\변성원\\Desktop\\전국영화관_cgv.txt");   
		//파일 사용하기 위해 저장 위치 설정
		BufferedReader data_br = new BufferedReader (new FileReader(Data));		
		//BufferedReader 클래스 사용해서 k15_f읽기							
		String data_readtxt;																																 		
		//문장형 변수 선언
		if ((data_readtxt = data_br.readLine()) == null) {									//내용이 null이면
			System.out.printf("빈파일입니다");										   	  		//빈파일입니다 출력 후 return				
			return;											
		}	
		String [] data_field_name = data_readtxt.split("\t");				
		
		
		
		double K15_lat = 37.3860521;           												 //분당 융기원의 위도
		double K15_lng = 127.1214038;														 //분당 융기원의 경도
		double K15_min = Double.MAX_VALUE;													 //변수를 최대값으로 지정
		double K15_max = Double.MIN_VALUE;													 //변수를 최소값으로 지정
		String K15_short_dist = null;														 //가장 가까운 곳의 변수 초기화
		String K15_long_dist = null;														 //가장 먼 곳의 변수 초기화
		
		
		
		//첫번째줄의 항목을 출력하기 위해 한줄 먼저 읽음

		int K15_LineCnt = 0;																 //반복하는 횟수 0으로 초기화								 		
		while((data_readtxt = data_br.readLine()) != null) {									 //내용이 null이 아니면 계속 반복
			String [] K15_field = data_readtxt.split("\t");									 //K15_readtxt를 tab으로 나눠 배열에		
			if (K15_field[2].isEmpty() || K15_field[3].isEmpty()) {							 //K15_field의 2번째와 3번째가 비어이있으면 
				continue;																	 //continue로 돌아감
			}
			
			System.out.printf("**[%d번쨰 항목]**************************\n", K15_LineCnt);	 		//반복 횟수를 항목으로 넣어 출력
			System.out.printf(" %s : %s\n", data_field_name[6], K15_field[6]);					//K15_field[6]안 지번주소를 출력					  
			System.out.printf(" %s : %s\n", data_field_name[3], K15_field[3]);					//K15_field[12]인 위도를 출력
			System.out.printf(" %s : %s\n", data_field_name[2], K15_field[2]);					//K15_field[13]인 경도를 출력
		
			double K15_dist = Math.sqrt( Math.pow(Double.parseDouble(K15_field[3]) - K15_lat,2) //피타고라스의 정리를 이용해 거리계산
								+ Math.pow(Double.parseDouble(K15_field[2]) - K15_lng,2));		
			System.out.printf("현재지점과의 거리 : %f\n", K15_dist);									
			System.out.println("************************************");							
			
			K15_LineCnt++;																		//반복할 때마다 1씩 증가
			for (int K15_i=0; K15_i < data_readtxt.length(); K15_i++) {							//K15_i가 K15_readtxt만큼 반복하면서
				if(K15_min > K15_dist) {														//K15_dist(현재거리)가 K15_min값보다 작으면
					K15_min = K15_dist;															//K15_min에 K15_dist(현재거리)를 저장
					if(K15_min == K15_dist) {													//K15_min값과 K15_dist(현재거리)가 같으면
						K15_short_dist = K15_field[7];											//K15_short_dist(가장 가까운 곳)에 해당 도로명주소를 넣음
						
					}
				} else if (K15_max < K15_dist) {												//K15_dist(현재거리)가 K15_max값보다 크면
					K15_max = K15_dist;															//K15_max에 K15_dist(현재거리)를 저장
					if(K15_max == K15_dist) {													//K15_max값과 K15_dist(현재거리)가 같으면
						K15_long_dist = K15_field[7];											//K15_long_dist(가장 먼 곳)에 해당 도로명주소를 넣음
									
				}
			}		
			}
		}
//			System.out.printf("가장 가까운 곳 : %s", K15_short_dist);								
			//가장 가까운 곳 출력
//			System.out.printf(", 거리차이 : %f\n", K15_min);										
			//해당 장소와의 거리 차이 출력  
//			System.out.printf("가장 먼 곳 : %s", K15_long_dist);									
			//가장 먼 곳 출력
//			System.out.printf(", 거리차이 : %f\n", K15_max);										
			//해당 장소와의 거리 차이 출력  

		K15_br.close();																			//다읽었으면 BufferedReader 닫음
		/* return K15_short_dist; */
	}
	

	
	
	
	
}
