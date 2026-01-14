package net.productionready.journalApp.controller;


import net.productionready.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {
    private Map<Long, JournalEntry> JournalEntries = new HashMap<>();
   @GetMapping
    public List<JournalEntry>getAll(){
            return new ArrayList<>(JournalEntries.values());
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry){
       JournalEntries.put(myEntry.getId(), myEntry);
       return true;

    }
    @GetMapping("id/{myId}")
    public JournalEntry getJournalEntryId(@PathVariable Long myId){
       return JournalEntries.get(myId);
    }
    @DeleteMapping("id/{myId}")
    public JournalEntry deleteEntry(@PathVariable Long myId){
       return JournalEntries.remove(myId);
    }
@PutMapping("/id/{id}")
    public JournalEntry updateEntry(@PathVariable Long id, @RequestBody JournalEntry myEntry){
        return JournalEntries.put(id,myEntry);
    }
}
