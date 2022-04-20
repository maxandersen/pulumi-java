// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class CsvOptionsResponse extends com.pulumi.resources.InvokeArgs {

    public static final CsvOptionsResponse Empty = new CsvOptionsResponse();

    /**
     * [Optional] Indicates if BigQuery should accept rows that are missing trailing optional columns. If true, BigQuery treats missing trailing columns as null values. If false, records with missing trailing columns are treated as bad records, and if there are too many bad records, an invalid error is returned in the job result. The default value is false.
     * 
     */
    @Import(name="allowJaggedRows", required=true)
      private final Boolean allowJaggedRows;

    public Boolean allowJaggedRows() {
        return this.allowJaggedRows;
    }

    /**
     * [Optional] Indicates if BigQuery should allow quoted data sections that contain newline characters in a CSV file. The default value is false.
     * 
     */
    @Import(name="allowQuotedNewlines", required=true)
      private final Boolean allowQuotedNewlines;

    public Boolean allowQuotedNewlines() {
        return this.allowQuotedNewlines;
    }

    /**
     * [Optional] The character encoding of the data. The supported values are UTF-8 or ISO-8859-1. The default value is UTF-8. BigQuery decodes the data after the raw, binary data has been split using the values of the quote and fieldDelimiter properties.
     * 
     */
    @Import(name="encoding", required=true)
      private final String encoding;

    public String encoding() {
        return this.encoding;
    }

    /**
     * [Optional] The separator for fields in a CSV file. BigQuery converts the string to ISO-8859-1 encoding, and then uses the first byte of the encoded string to split the data in its raw, binary state. BigQuery also supports the escape sequence &#34;\t&#34; to specify a tab separator. The default value is a comma (&#39;,&#39;).
     * 
     */
    @Import(name="fieldDelimiter", required=true)
      private final String fieldDelimiter;

    public String fieldDelimiter() {
        return this.fieldDelimiter;
    }

    /**
     * [Optional] An custom string that will represent a NULL value in CSV import data.
     * 
     */
    @Import(name="nullMarker", required=true)
      private final String nullMarker;

    public String nullMarker() {
        return this.nullMarker;
    }

    /**
     * [Optional] The value that is used to quote data sections in a CSV file. BigQuery converts the string to ISO-8859-1 encoding, and then uses the first byte of the encoded string to split the data in its raw, binary state. The default value is a double-quote (&#39;&#34;&#39;). If your data does not contain quoted sections, set the property value to an empty string. If your data contains quoted newline characters, you must also set the allowQuotedNewlines property to true.
     * 
     */
    @Import(name="quote", required=true)
      private final String quote;

    public String quote() {
        return this.quote;
    }

    /**
     * [Optional] The number of rows at the top of a CSV file that BigQuery will skip when reading the data. The default value is 0. This property is useful if you have header rows in the file that should be skipped. When autodetect is on, the behavior is the following: * skipLeadingRows unspecified - Autodetect tries to detect headers in the first row. If they are not detected, the row is read as data. Otherwise data is read starting from the second row. * skipLeadingRows is 0 - Instructs autodetect that there are no headers and data should be read starting from the first row. * skipLeadingRows = N &gt; 0 - Autodetect skips N-1 rows and tries to detect headers in row N. If headers are not detected, row N is just skipped. Otherwise row N is used to extract column names for the detected schema.
     * 
     */
    @Import(name="skipLeadingRows", required=true)
      private final String skipLeadingRows;

    public String skipLeadingRows() {
        return this.skipLeadingRows;
    }

    public CsvOptionsResponse(
        Boolean allowJaggedRows,
        Boolean allowQuotedNewlines,
        String encoding,
        String fieldDelimiter,
        String nullMarker,
        String quote,
        String skipLeadingRows) {
        this.allowJaggedRows = Objects.requireNonNull(allowJaggedRows, "expected parameter 'allowJaggedRows' to be non-null");
        this.allowQuotedNewlines = Objects.requireNonNull(allowQuotedNewlines, "expected parameter 'allowQuotedNewlines' to be non-null");
        this.encoding = Objects.requireNonNull(encoding, "expected parameter 'encoding' to be non-null");
        this.fieldDelimiter = Objects.requireNonNull(fieldDelimiter, "expected parameter 'fieldDelimiter' to be non-null");
        this.nullMarker = Objects.requireNonNull(nullMarker, "expected parameter 'nullMarker' to be non-null");
        this.quote = Objects.requireNonNull(quote, "expected parameter 'quote' to be non-null");
        this.skipLeadingRows = Objects.requireNonNull(skipLeadingRows, "expected parameter 'skipLeadingRows' to be non-null");
    }

    private CsvOptionsResponse() {
        this.allowJaggedRows = null;
        this.allowQuotedNewlines = null;
        this.encoding = null;
        this.fieldDelimiter = null;
        this.nullMarker = null;
        this.quote = null;
        this.skipLeadingRows = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CsvOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowJaggedRows;
        private Boolean allowQuotedNewlines;
        private String encoding;
        private String fieldDelimiter;
        private String nullMarker;
        private String quote;
        private String skipLeadingRows;

        public Builder() {
    	      // Empty
        }

        public Builder(CsvOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowJaggedRows = defaults.allowJaggedRows;
    	      this.allowQuotedNewlines = defaults.allowQuotedNewlines;
    	      this.encoding = defaults.encoding;
    	      this.fieldDelimiter = defaults.fieldDelimiter;
    	      this.nullMarker = defaults.nullMarker;
    	      this.quote = defaults.quote;
    	      this.skipLeadingRows = defaults.skipLeadingRows;
        }

        public Builder allowJaggedRows(Boolean allowJaggedRows) {
            this.allowJaggedRows = Objects.requireNonNull(allowJaggedRows);
            return this;
        }
        public Builder allowQuotedNewlines(Boolean allowQuotedNewlines) {
            this.allowQuotedNewlines = Objects.requireNonNull(allowQuotedNewlines);
            return this;
        }
        public Builder encoding(String encoding) {
            this.encoding = Objects.requireNonNull(encoding);
            return this;
        }
        public Builder fieldDelimiter(String fieldDelimiter) {
            this.fieldDelimiter = Objects.requireNonNull(fieldDelimiter);
            return this;
        }
        public Builder nullMarker(String nullMarker) {
            this.nullMarker = Objects.requireNonNull(nullMarker);
            return this;
        }
        public Builder quote(String quote) {
            this.quote = Objects.requireNonNull(quote);
            return this;
        }
        public Builder skipLeadingRows(String skipLeadingRows) {
            this.skipLeadingRows = Objects.requireNonNull(skipLeadingRows);
            return this;
        }        public CsvOptionsResponse build() {
            return new CsvOptionsResponse(allowJaggedRows, allowQuotedNewlines, encoding, fieldDelimiter, nullMarker, quote, skipLeadingRows);
        }
    }
}
