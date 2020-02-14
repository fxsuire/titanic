package fr.fxsuire.com;

//import static java.util.Arrays.asList;
//import static tech.tablesaw.api.ColumnType.DOUBLE;
//import static tech.tablesaw.api.ColumnType.FLOAT;
//import static tech.tablesaw.api.ColumnType.INTEGER;
//import static tech.tablesaw.api.ColumnType.LOCAL_DATE;
//import static tech.tablesaw.api.ColumnType.LOCAL_DATE_TIME;
//import static tech.tablesaw.api.ColumnType.LOCAL_TIME;
//import static tech.tablesaw.api.ColumnType.SHORT;
//import static tech.tablesaw.api.ColumnType.SKIP;
//import static tech.tablesaw.api.ColumnType.STRING;
//import tech.tablesaw.api.ColumnType;
//import tech.tablesaw.api.DateColumn;
//import tech.tablesaw.api.DateTimeColumn;
//import tech.tablesaw.api.DoubleColumn;
//import tech.tablesaw.api.LongColumn;
//import tech.tablesaw.api.ShortColumn;
//import tech.tablesaw.api.Table;
//import tech.tablesaw.io.AddCellToColumnException;

import tech.tablesaw.api.*;
import tech.tablesaw.io.*;
import com.univocity.parsers.common.TextParsingException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.nio.file.Paths;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) {
		
		
		File tmpDir = new File("data/input.csv");
		boolean exists = tmpDir.exists();
		System.out.println(exists);
				
//		Table t = Table.read()
//				.file("data/input.csv");
		
//		CsvReadOptions.Builder builder = CsvReadOptions.builder("data/input.csv")
//					.separator('\t')										// table is tab-delimited
//					.header(true)											// no header
//					.dateFormat("yyyy.MM.dd");  				// the date format to use. 

//			CsvReadOptions options = builder.build();

//			Table t1 = Table.read().usingOptions(options);
		
		//double[] numbers = {1, 2, 3, 4};
		//DoubleColumn nc = DoubleColumn.create("nc", numbers);
		//System.out.println(nc.print());
		
		// System.out.println("ok");
        
	}
	
}