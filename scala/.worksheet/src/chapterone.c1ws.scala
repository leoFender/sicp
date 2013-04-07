package chapterone

object c1ws {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(55); 
	
	val eps = 0.00001;System.out.println("""eps  : Double = """ + $show(eps ));$skip(37); ;
	def sqr(x: Double): Double = x * x;System.out.println("""sqr: (x: Double)Double""");$skip(53); ;
	def abs (x: Double): Double = if (x < 0) -x else x;System.out.println("""abs: (x: Double)Double""");$skip(220); ;
	//
	//1.3, I'm kind'a scared now))) it's 1.3, after all...
	//
	def sumOfSquares (a: Double, b: Double, c: Double): Double =
		if (a > b)
			sqr(a) + sqr(if (b > c) b else c)
		else
			sqr(b) + sqr(if (a > c) a else c);System.out.println("""sumOfSquares: (a: Double, b: Double, c: Double)Double""");$skip(27); val res$0 = 
			
	sumOfSquares(0, 0, 1);System.out.println("""res0: Double = """ + $show(res$0));$skip(25); val res$1 = 
	sumOfSquares(-3, 0, -2);System.out.println("""res1: Double = """ + $show(res$1));$skip(25); val res$2 = 
	sumOfSquares(10, 10, 1);System.out.println("""res2: Double = """ + $show(res$2));$skip(465); 

	//
	//1.7
	//
	def sqrt(x: Double) = {
		
		def isGoodEnough(guess: Double, guess_prev: Double) =
      if (abs(guess) < eps) true
      else abs(guess_prev - guess) / guess_prev < eps

    def improve(guess: Double) =
      (guess + x / guess) / 2

    def sqrtIter(guess: Double, guess_prev: Double): Double =
      if (isGoodEnough(guess, guess_prev)) guess
      else sqrtIter(improve(guess), guess)

		if (x < 0) printf("no way ") else sqrtIter(1.0, 0.1)
	};System.out.println("""sqrt: (x: Double)AnyVal""");$skip(12); val res$3 = 
	
	sqrt (0);System.out.println("""res3: AnyVal = """ + $show(res$3));$skip(17); val res$4 = 
	sqrt(100000000);System.out.println("""res4: AnyVal = """ + $show(res$4));$skip(11); val res$5 = 
	sqrt(-10);System.out.println("""res5: AnyVal = """ + $show(res$5));$skip(470); 
	
	//
	//1.8
	//
	def cbrt(x: Double) = {
	
		def isGoodEnough(guess: Double, guess_prev: Double) =
      if (abs(guess) < eps) true
      else abs(guess_prev - guess) / guess_prev < eps

    def improve(guess: Double) =
      (abs(x) / sqr(guess) + 2 * guess) / 3

    def sqrtIter(guess: Double, guess_prev: Double): Double =
      if (isGoodEnough(guess, guess_prev)) guess
      else sqrtIter(improve(guess), guess)

		(if (x < 0) -1 else 1) * sqrtIter(1.0, 0.1)
	};System.out.println("""cbrt: (x: Double)Double""");$skip(12); val res$6 = 
	
	cbrt(27);System.out.println("""res6: Double = """ + $show(res$6));$skip(9); val res$7 = 
	cbrt(0);System.out.println("""res7: Double = """ + $show(res$7));$skip(11); val res$8 = 
	cbrt(-27);System.out.println("""res8: Double = """ + $show(res$8));$skip(13); val res$9 = 
	cbrt(1e-17);System.out.println("""res9: Double = """ + $show(res$9));$skip(17); val res$10 = 
	cbrt(793849147);System.out.println("""res10: Double = """ + $show(res$10))}
}
