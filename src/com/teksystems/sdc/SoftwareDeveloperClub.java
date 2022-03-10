package com.teksystems.sdc;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SoftwareDeveloperClub {

    private List<ClubMember> members;

    public SoftwareDeveloperClub(String filename) throws FileNotFoundException {
        File file = new File(filename);
        FileReader fr = new FileReader(file);
        members = new ArrayList<ClubMember>();
        try(BufferedReader br = new BufferedReader(fr)) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String [] memberRec = line.split("\\*\\*", 5);
                ClubMember cm = new ClubMember(memberRec[0],memberRec[1],memberRec[2],memberRec[3]);
                members.add(cm);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        members.forEach(cm->sb.append(cm.toString()));
        return sb.toString();
    }

    public String displayMembers(){
        return members.stream().map(ClubMember::toString).collect(Collectors.joining());
    }

    public void add(ClubMember member){
        members.add(member);
    }

    public void add(String name, String city, String state, String language){
        members.add(new ClubMember(name, city, state, language));
    }

    public int size() {
        return members.size();
    }

    public List<ClubMember> getMembers() {
        return this.members;
    }

    public int remove(int index) {
        members.remove(index);
        return index;
    }


}
