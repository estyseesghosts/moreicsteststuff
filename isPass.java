public static boolean isPass (char c) {
	switch (c) {
		case 'A', 'a', 'B', 'b', 'C', 'c', 'D', 'd': return true;
		default: break;
	}
	return false;
}

public static boolean isPass (int g) {
	return g>=50;
}