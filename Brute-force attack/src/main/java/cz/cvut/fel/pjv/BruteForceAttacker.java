package cz.cvut.fel.pjv;

public class BruteForceAttacker extends Thief {

     @Override
    public void breakPassword(int sizeOfPassword) {
        char[] abcda = getCharacters();
        char[] pas = new char[]{};

        if (sizeOfPassword == 0 || abcda.length == 0) {
            tryOpen(pas);
            return;
        }
        
        permutations(sizeOfPassword, "", abcda);
    }

    private boolean permutations(int length, String password, char[] characters){
            if (length == 0) {
//                System.out.println(password);
                return tryOpen(password.toCharArray());
            } else {
                for (char character : characters) {
                    String newPassword = password + character;
                    if (permutations(length - 1, newPassword, characters)) {
                        return true;
                    }
                }
            }
            return false;
        }
}
