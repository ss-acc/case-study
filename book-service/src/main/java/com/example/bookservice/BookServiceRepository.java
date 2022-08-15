package com.example.bookservice;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

	public interface BookServiceRepository extends JpaRepository<BookService, String> {
	
		  @Override
		  java.util.List<BookService> findAll();
		
//		  BookService findByBookid(String bookid);
		  
     	  @Query
		  (value = "SELECT BOOKID,AUTHOR,AVAILABLECOPIES,BOOKNAME,TOTALCOPIES FROM BOOKS WHERE BOOKID = ?1 AND AVAILABLECOPIES > 0", nativeQuery = true)
		  BookService findByBookid(String bookid);
		  
		  /*@Modifying
		  @Query(value = "UPDATE BOOK_SERVICE bs set bs.AVAILABLECOPIES = AVAILABLECOPIES-1 WHERE bs.BOOKID = ?1 AND bs.AVAILABLECOPIES > 0", nativeQuery = true)
		  void updateByBookid(String bookid);*/
		  
		  
		  
		
	}
	//	BookService findByBookname(String bookname);
		
	//	BookService findAll();
		
		
	 //   public List<Bookservice> getAllBooks() {
	 //       return petrepository.findAll();
	
	
	/* public Bookservice getAllBooks() {
	 return BookService findAll();
	}*/

	