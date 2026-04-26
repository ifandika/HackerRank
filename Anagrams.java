/**
 * Ketentuan
 * - Diberikan string a & b
 * - Jika kedua string bernilai sama(no case-sensitive).
 * - Hasil boolean, jika benar maka true dan sebaliknya
 * 
 * 
 * Contoh
 * - Input
 * 		x = anagram
 * 		y = margana
 * - Output
 * 		true(is anamgrams)
 * - Penjelasan
 * 		Explanation 0
 * 		Character	Frequency: anagram
 * 		A or a			3		3
 * 		G or g			1		1
 * 		N or n			1		1
 * 		M or m			1		1
 * 		R or r			1		1
 * 		The two strings contain all the same letters in the same frequencies, so we print "Anagrams".
 * 
 * 
 * Solusi
 * A. Dengan membandingkan semua karakter kedua string dari depan/belakang.
 * B. Dengan mengguanakn stuktur data hashmap untuk simpan nilai.
 * ===
 * A. 
 * B. 
 * - Cek jika string null
 * - Array untuk simpan jumlah nilai dari masing2 kata
 * - 
 */
public class Anagrams {

	public static void main(String[] args) {
		String a = "madam",
			   b = "amadm";

		System.out.println(isAnagram(a, b));
	}

    /**
     * - Cek jika kedua string tidak null, dan panjang keduanya sama
     * - Ubah keduanya ke string kecil
     * - variabel countA(String a) dan countB(String b) untuk jumlah kata yg sama
     * - Perulangan dari string a, ambil perkata lalu bandingkan dgn string a dan b, jika sama maka count(A/B) ditambah.
     * - Cek jika kedua count tidak sama maka return false
     * - Jika hingga akhir perulangan kedua count sama maka return true
     */
	static boolean isAnagram(String a, String b) {
        // Complete the function
        if(!a.isEmpty() && !b.isEmpty() && a.length() == b.length()) {
            String lowerA = a.toLowerCase(),
                   lowerB = b.toLowerCase();
            int countA = 0, 
                countB = 0,
                aLength = a.length();

            for(int indx = 0; indx < aLength; indx++) {
                char temp = lowerA.charAt(indx);
                for(int indx2 = 0; indx2 < aLength; indx2++) {
                    if(lowerA.charAt(indx2) == temp) {
                        countA++;
                    }
                    if(lowerB.charAt(indx2) == temp) {
                        countB++;
                    }
                }
                if(countA != countB) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}