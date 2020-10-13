package ControllerBc;


import main.LibraryBookService;
import model.LibraryBook;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RequestMapping({"/LibraryBooks"});


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

@RestController
public class LibraryBookController {


    @Autowired
    private LibraryBookService libraryBookService;

    //@RequestMapping("/LibraryBooks")
    @GetMapping  ("/v1/LibraryBooks")

    public List<LibraryBook> getAllLibraryBooks() {
        return libraryBookService.getAllLibraryBooks();
    }


//@RequestMapping("/LibraryBooks/{indexNumber}")
    @GetMapping  ("/v1/LibraryBooks/{indexNumber}")
    public LibraryBook getLibraryBook(@PathVariable String indexNumber)
    {
        return libraryBookService.getLibraryBook(indexNumber);
   }

//@RequestMapping(method = RequestMethod.POST, value = "/libraryBooks")
@PostMapping  ("/LibraryBooks")
public void addLibraryBook(@RequestBody LibraryBook libraryBook)
{
  libraryBookService.addLibraryBook(libraryBook);
}


//@RequestMapping(method = RequestMethod.PUT, value = "/libraryBooks/{indexNumber}")
@PutMapping ("/LibraryBooks/{indexNumber}")
public void updateLibraryBook(@RequestBody LibraryBook libraryBook, @PathVariable String indexNumber)
{
libraryBookService.updateLibraryBook(libraryBook, indexNumber);
}

    //@RequestMapping(method = RequestMethod.DELETE, value = "/libraryBooks/{indexNumber}")
    @DeleteMapping ("/LibraryBooks/{indexNumber}")
    public void deleteLibraryBook(@RequestBody LibraryBook libraryBook, @PathVariable String indexNumber)
    {
        libraryBookService.deleteLibraryBook(libraryBook, indexNumber);
    }

}




