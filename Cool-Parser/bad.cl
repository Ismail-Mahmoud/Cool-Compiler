class Main inherits IO {
	main() : Object {
			{
					out_string("Enter number of numbers to multiply\n");
					out_int(prod(in_int()));
					out_string("\n");
			}
	}

    These are valid tokens but cause parsing error

	prod(i : Int) : Int
		let y : Int <- 1 in {
				while (not (i = 0) ) loop {
						out_string("Enter Number: ");
						y <- y * in_int();
						i <- i - 1;
						abc; is; abc;
				}
				pool;
				y;
		}
	};

	int x = 7;

};