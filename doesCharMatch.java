do
.
.
while (doesCharMatch(c));

public static boolean doesCharMatch (char c) {
	switch (c) {
		case '!', '?', ':', ';', '.', ',': return true;
		default: break;
	}
	return false;
}