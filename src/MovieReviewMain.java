public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview[] movieReview = new MovieReview[2];

        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "인셉션";
        movieReview1.review = "인생은 무한 루프";
        movieReview[0] = movieReview1;

        MovieReview movieReview2 = new MovieReview();
        movieReview2.title = "어바웃 타임";
        movieReview2.review = "인생 시간 영화!";
        movieReview[1] = movieReview2;

//        for (MovieReview m : movieReview) {
//            System.out.println("영화 제목 : " + m.title + ", " + "리뷰 : " + m.review);
//        }

        for (int i = 0; i < movieReview.length; i++) {
            MovieReview m = movieReview[i];
            System.out.println("영화 제목 : " + m.title + ", " + "리뷰 : " + m.review);
        }
    }
}
