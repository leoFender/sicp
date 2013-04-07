package chapterone

object c1ws {
	
	val eps = 0.00001;                        //> eps  : Double = 1.0E-5
	def sqr(x: Double): Double = x * x;       //> sqr: (x: Double)Double
	def abs (x: Double): Double = if (x < 0) -x else x;
                                                  //> abs: (x: Double)Double
	//
	//1.3, I'm kind'a scared now))) it's 1.3, after all...
	//
	def sumOfSquares (a: Double, b: Double, c: Double): Double =
		if (a > b)
			sqr(a) + sqr(if (b > c) b else c)
		else
			sqr(b) + sqr(if (a > c) a else c)
                                                  //> sumOfSquares: (a: Double, b: Double, c: Double)Double
			
	sumOfSquares(0, 0, 1)                     //> res0: Double = 1.0
	sumOfSquares(-3, 0, -2)                   //> res1: Double = 4.0
	sumOfSquares(10, 10, 1)                   //> res2: Double = 200.0

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
	}                                         //> sqrt: (x: Double)AnyVal
	
	sqrt (0)                                  //> res3: AnyVal = 7.62939453125E-6
	sqrt(100000000)                           //> res4: AnyVal = 10000.000000082462
	sqrt(-10)                                 //> no way res5: AnyVal = ()
	
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
	}                                         //> cbrt: (x: Double)Double
	
	cbrt(27)                                  //> res6: Double = 3.0000000000000977
	cbrt(0)                                   //> res7: Double = 7.822642576269847E-6
	cbrt(-27)                                 //> res8: Double = -3.0000000000000977
	cbrt(1e-17)                               //> res9: Double = 7.856976819935529E-6
	cbrt(793849147)                           //> res10: Double = 925.9324989245429
	
	//
	//1.11
	//
	def someFunctionRec(x: Double): Double =
		if (x < 3) x
		else someFunctionRec(x-1) + someFunctionRec(x-2) + someFunctionRec(x-3)
                                                  //> someFunctionRec: (x: Double)Double
		
	def someFunctionIter(n: Double) = {
		
		def fI(x: Double, x1: Double, x2: Double, x3: Double): Double =
			if (x	== n) x1 + x2 + x3
			else fI (x+1, x1 + x2 + x3, x1, x2)
			
		if (n < 3) n else fI (3, 2, 1, 0)
	}                                         //> someFunctionIter: (n: Double)Double
	
	someFunctionRec(2)                        //> res11: Double = 2.0
	someFunctionRec(5)                        //> res12: Double = 11.0
	someFunctionIter(2)                       //> res13: Double = 2.0
	someFunctionIter(5)                       //> res14: Double = 11.0
	
}