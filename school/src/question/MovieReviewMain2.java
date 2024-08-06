package question;

public class MovieReviewMain2 {
	public static void main(String[] args) {
		MovieReview[] movieReview = new MovieReview[2];
		
		MovieReview inception = new MovieReview();
		inception.title = "인셉션";
		inception.review = "인생은 무한루프";
		movieReview[1] = inception;
		
		MovieReview aboutTime = new MovieReview();
		aboutTime.title = "어바웃타임";
		aboutTime.review = "인생 시간 여행";
		movieReview[1] = aboutTime;
		
		for(MovieReview review : movieReview) {
			//향상된 for문 사용 무브 리부라는 배열에 있는 MovieReview 객체 순회
			System.out.println("영화제목: "+ review.title + ", 리뷰: " + review.review);
		}
		//이 코드는 movieReview 라는 리스트에 있는 영화 리뷰를 순환함
	}

}
