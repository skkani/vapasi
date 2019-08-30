import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ProteinTranslator {


    List<String> translate(String rnaSequence) {
        Map<String, String> protein_collection = new HashMap<String, String>();
        List<String> inputlist = new ArrayList<String>();
        List<String> outputlist = new ArrayList<String>();
        int startindex = 0;
        int endindex = 0;
        for (int i = 0; i < rnaSequence.length();i = i+3)
        {
            startindex = i;
            endindex = i+3;
            inputlist.add(rnaSequence.substring(startindex,endindex));
        }


        // Adding mappings to HashMap
        protein_collection.put("AUG", "Methionine");
        protein_collection.put("UUU", "Phenylalanine");
        protein_collection.put("UUC", "Phenylalanine");
        protein_collection.put("UUA", "Leucine");
        protein_collection.put("UUG", "Leucine");
        protein_collection.put("UUC", "Phenylalanine");
        protein_collection.put("UAA", "STOP");
        protein_collection.put("UAG", "STOP");
        protein_collection.put("UGA", "STOP");
        protein_collection.put("UCU", "Serine");
        protein_collection.put("UCC", "Serine");
        protein_collection.put("UCA", "Serine");
        protein_collection.put("UCG", "Serine");
        protein_collection.put("UAU", "Tyrosine");
        protein_collection.put("UAC", "Tyrosine");
        protein_collection.put("UGU", "Cysteine");
        protein_collection.put("UGC", "Cysteine");
        protein_collection.put("UGG", "Tryptophan");


        String stop = "STOP";
        for (int i =0; i < inputlist.size();i++) {
                if (protein_collection.containsKey(inputlist.get(i)) && !stop.equals(protein_collection.get(inputlist.get(i)))) {
                    outputlist.add(protein_collection.get(inputlist.get(i)));
                }
        }
        return outputlist;// Printing the HashMap


    }
}