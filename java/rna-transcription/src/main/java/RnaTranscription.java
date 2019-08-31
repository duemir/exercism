public class RnaTranscription {
    public static String ofDna(String dna) {
        return dna.chars()
                .map(c -> {
                    switch (c) {
                        case 'C': return 'G';
                        case 'G': return 'C';
                        case 'T': return 'A';
                        case 'A': return 'U';
                        default: throw new IllegalArgumentException("Unrecognized DNA nucleotide: " + ((char) c));
                    }
                })
                .collect(StringBuilder::new, (rna, nt) -> rna.append((char) nt), StringBuilder::append)
                .toString();
    }
}
