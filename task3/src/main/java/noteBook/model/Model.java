package noteBook.model;

import noteBook.entities.Record;
import noteBook.exceptions.LoginNotUniqException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class Model {

    private Map<String, Record> recordMap = new HashMap<>();

    public Model() {
    }
    public Model(Map<String, Record> recordMap) {
        this.recordMap = recordMap;
    }

    public Record createRecord(Record record) throws LoginNotUniqException {
        if (recordMap.containsKey(record.getNickName()))
            throw new LoginNotUniqException("the record is not added. input login is alredy exists. try another one.");
        else {
            record.setDateCreated(new Date());
            record.setDateUpdated(new Date());
            return recordMap.put(record.getNickName(), record);
        }
    }

    public void printNoteBookRecords(){
        System.out.println(recordMap.toString());
    }

}
