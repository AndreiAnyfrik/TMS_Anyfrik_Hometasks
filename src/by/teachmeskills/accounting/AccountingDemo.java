package by.teachmeskills.accounting;

import by.teachmeskills.exception.AbcException;
import by.teachmeskills.exception.Exception1a1b;
import by.teachmeskills.exception.Exception555;

import javax.print.Doc;

public class AccountingDemo {
    public static void main(String[] args) {
        Document document = new Document("31254323asd");
        Register register = new Register();
        try {
            register.saveDocument(document);
        } catch (AbcException e) {
            System.out.println("Document number doesn't contain \"abc\"");
        } catch (Exception1a1b e) {
            System.out.println("Document number doesn't ended \"1a1b\"");
        } catch (Exception555 e) {
            System.out.println("Document number doesn't started \"555\"");
        }
    }
}
