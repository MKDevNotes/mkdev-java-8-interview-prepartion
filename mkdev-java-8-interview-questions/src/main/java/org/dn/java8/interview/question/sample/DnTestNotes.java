package org.dn.java8.interview.question.sample;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/***
 * @author Muthukumar Thangavinayagam.
 * Created on 07-07-2023
 * How to convert a List of objects into a Map by considering duplicated keys and store them in sorted order?
 ***/

public class DnTestNotes {
    public static void main(String[] args) {
        List<Notes> noteLst = new ArrayList<>();
        noteLst.add(new Notes(1, "note1", 11));
        noteLst.add(new Notes(2, "note2", 22));
        noteLst.add(new Notes(3, "note3", 33));
        noteLst.add(new Notes(4, "note4", 44));
        noteLst.add(new Notes(5, "note5", 55));

        //Duplicate Entry
        noteLst.add(new Notes(6, "note4", 66));

        Map<String, Integer> notesRecords = noteLst.stream()
                .sorted(Comparator
                        .comparingInt(Notes::getTagId)
                        .reversed()) // sorting is based on TagId 55,44,33,22,11
                .collect(Collectors.toMap
                        (Notes::getTagName, Notes::getTagId,
                                (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        System.out.println(notesRecords);

    }
}

class Notes{
  public Integer sno;
  public String tagName;
  public Integer tagId;

    public Notes(Integer sno, String tagName, Integer tagId) {
        this.sno = sno;
        this.tagName = tagName;
        this.tagId = tagId;
    }

    public Integer getSno() {
        return sno;
    }

    public void setSno(Integer sno) {
        this.sno = sno;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }
}
