package com.quinnox.libraryapplication.dao;

import java.util.List;

import com.quinnox.libraryapplication.dto.BookInfo;
import com.quinnox.libraryapplication.dto.LibraryHistory;
import com.quinnox.libraryapplication.dto.LibraryUsers;
import com.quinnox.libraryapplication.dto.RequestInfo;

public interface LibraryDAO {

	boolean register(LibraryUsers user);

	boolean adminAuthentication(String emailId, String password);

	boolean userAuthentication(String emailId, String password);

	boolean addBook(BookInfo book);

	boolean deleteBook(int isbn);

	BookInfo updateBook(BookInfo book);
	
	List<BookInfo> showBooks();

	List<LibraryUsers> showUsers();
	
	LibraryUsers getUser(String emailId);

	List<BookInfo> searchBook(BookInfo bookInfo);

	List<RequestInfo> showRequests();

	boolean isBookIssued(int requestId);

	boolean isBookReceived(int requestId);

	boolean bookRequest(int userId, int bookId);

	boolean bookReturn(int userId, int bookId);
	
	boolean changePassword(int userId, String oldPassword, String newPassword);
	
	List<RequestInfo> getRequestedBooks();
	
	List<RequestInfo> userTakenBooks(int userId);
	
	List<RequestInfo> getReturnedBooks();
	
	boolean addToHistory(LibraryHistory history);
	
	List<LibraryHistory> getLibHistory();
	
	List<LibraryHistory> getUserHistory(int userId);
	

}

