// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.ResourceArgs;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The data stored in text format.
 * 
 */
public final class TextFormatArgs extends ResourceArgs {

    public static final TextFormatArgs Empty = new TextFormatArgs();

    /**
     * The column delimiter. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="columnDelimiter")
    private @Nullable Output<Object> columnDelimiter;

    /**
     * @return The column delimiter. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> columnDelimiter() {
        return Optional.ofNullable(this.columnDelimiter);
    }

    /**
     * Deserializer. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="deserializer")
    private @Nullable Output<Object> deserializer;

    /**
     * @return Deserializer. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> deserializer() {
        return Optional.ofNullable(this.deserializer);
    }

    /**
     * The code page name of the preferred encoding. If miss, the default value is ΓÇ£utf-8ΓÇ¥, unless BOM denotes another Unicode encoding. Refer to the ΓÇ£NameΓÇ¥ column of the table in the following link to set supported values: https://msdn.microsoft.com/library/system.text.encoding.aspx. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="encodingName")
    private @Nullable Output<Object> encodingName;

    /**
     * @return The code page name of the preferred encoding. If miss, the default value is ΓÇ£utf-8ΓÇ¥, unless BOM denotes another Unicode encoding. Refer to the ΓÇ£NameΓÇ¥ column of the table in the following link to set supported values: https://msdn.microsoft.com/library/system.text.encoding.aspx. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> encodingName() {
        return Optional.ofNullable(this.encodingName);
    }

    /**
     * The escape character. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="escapeChar")
    private @Nullable Output<Object> escapeChar;

    /**
     * @return The escape character. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> escapeChar() {
        return Optional.ofNullable(this.escapeChar);
    }

    /**
     * When used as input, treat the first row of data as headers. When used as output,write the headers into the output as the first row of data. The default value is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="firstRowAsHeader")
    private @Nullable Output<Object> firstRowAsHeader;

    /**
     * @return When used as input, treat the first row of data as headers. When used as output,write the headers into the output as the first row of data. The default value is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    public Optional<Output<Object>> firstRowAsHeader() {
        return Optional.ofNullable(this.firstRowAsHeader);
    }

    /**
     * The null value string. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="nullValue")
    private @Nullable Output<Object> nullValue;

    /**
     * @return The null value string. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> nullValue() {
        return Optional.ofNullable(this.nullValue);
    }

    /**
     * The quote character. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="quoteChar")
    private @Nullable Output<Object> quoteChar;

    /**
     * @return The quote character. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> quoteChar() {
        return Optional.ofNullable(this.quoteChar);
    }

    /**
     * The row delimiter. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="rowDelimiter")
    private @Nullable Output<Object> rowDelimiter;

    /**
     * @return The row delimiter. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> rowDelimiter() {
        return Optional.ofNullable(this.rowDelimiter);
    }

    /**
     * Serializer. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="serializer")
    private @Nullable Output<Object> serializer;

    /**
     * @return Serializer. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> serializer() {
        return Optional.ofNullable(this.serializer);
    }

    /**
     * The number of lines/rows to be skipped when parsing text files. The default value is 0. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="skipLineCount")
    private @Nullable Output<Object> skipLineCount;

    /**
     * @return The number of lines/rows to be skipped when parsing text files. The default value is 0. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Output<Object>> skipLineCount() {
        return Optional.ofNullable(this.skipLineCount);
    }

    /**
     * Treat empty column values in the text file as null. The default value is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="treatEmptyAsNull")
    private @Nullable Output<Object> treatEmptyAsNull;

    /**
     * @return Treat empty column values in the text file as null. The default value is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    public Optional<Output<Object>> treatEmptyAsNull() {
        return Optional.ofNullable(this.treatEmptyAsNull);
    }

    /**
     * Type of dataset storage format.
     * Expected value is &#39;TextFormat&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of dataset storage format.
     * Expected value is &#39;TextFormat&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private TextFormatArgs() {}

    private TextFormatArgs(TextFormatArgs $) {
        this.columnDelimiter = $.columnDelimiter;
        this.deserializer = $.deserializer;
        this.encodingName = $.encodingName;
        this.escapeChar = $.escapeChar;
        this.firstRowAsHeader = $.firstRowAsHeader;
        this.nullValue = $.nullValue;
        this.quoteChar = $.quoteChar;
        this.rowDelimiter = $.rowDelimiter;
        this.serializer = $.serializer;
        this.skipLineCount = $.skipLineCount;
        this.treatEmptyAsNull = $.treatEmptyAsNull;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TextFormatArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TextFormatArgs $;

        public Builder() {
            $ = new TextFormatArgs();
        }

        public Builder(TextFormatArgs defaults) {
            $ = new TextFormatArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param columnDelimiter The column delimiter. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder columnDelimiter(@Nullable Output<Object> columnDelimiter) {
            $.columnDelimiter = columnDelimiter;
            return this;
        }

        /**
         * @param columnDelimiter The column delimiter. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder columnDelimiter(Object columnDelimiter) {
            return columnDelimiter(Output.of(columnDelimiter));
        }

        /**
         * @param deserializer Deserializer. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder deserializer(@Nullable Output<Object> deserializer) {
            $.deserializer = deserializer;
            return this;
        }

        /**
         * @param deserializer Deserializer. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder deserializer(Object deserializer) {
            return deserializer(Output.of(deserializer));
        }

        /**
         * @param encodingName The code page name of the preferred encoding. If miss, the default value is ΓÇ£utf-8ΓÇ¥, unless BOM denotes another Unicode encoding. Refer to the ΓÇ£NameΓÇ¥ column of the table in the following link to set supported values: https://msdn.microsoft.com/library/system.text.encoding.aspx. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder encodingName(@Nullable Output<Object> encodingName) {
            $.encodingName = encodingName;
            return this;
        }

        /**
         * @param encodingName The code page name of the preferred encoding. If miss, the default value is ΓÇ£utf-8ΓÇ¥, unless BOM denotes another Unicode encoding. Refer to the ΓÇ£NameΓÇ¥ column of the table in the following link to set supported values: https://msdn.microsoft.com/library/system.text.encoding.aspx. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder encodingName(Object encodingName) {
            return encodingName(Output.of(encodingName));
        }

        /**
         * @param escapeChar The escape character. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder escapeChar(@Nullable Output<Object> escapeChar) {
            $.escapeChar = escapeChar;
            return this;
        }

        /**
         * @param escapeChar The escape character. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder escapeChar(Object escapeChar) {
            return escapeChar(Output.of(escapeChar));
        }

        /**
         * @param firstRowAsHeader When used as input, treat the first row of data as headers. When used as output,write the headers into the output as the first row of data. The default value is false. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder firstRowAsHeader(@Nullable Output<Object> firstRowAsHeader) {
            $.firstRowAsHeader = firstRowAsHeader;
            return this;
        }

        /**
         * @param firstRowAsHeader When used as input, treat the first row of data as headers. When used as output,write the headers into the output as the first row of data. The default value is false. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder firstRowAsHeader(Object firstRowAsHeader) {
            return firstRowAsHeader(Output.of(firstRowAsHeader));
        }

        /**
         * @param nullValue The null value string. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder nullValue(@Nullable Output<Object> nullValue) {
            $.nullValue = nullValue;
            return this;
        }

        /**
         * @param nullValue The null value string. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder nullValue(Object nullValue) {
            return nullValue(Output.of(nullValue));
        }

        /**
         * @param quoteChar The quote character. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder quoteChar(@Nullable Output<Object> quoteChar) {
            $.quoteChar = quoteChar;
            return this;
        }

        /**
         * @param quoteChar The quote character. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder quoteChar(Object quoteChar) {
            return quoteChar(Output.of(quoteChar));
        }

        /**
         * @param rowDelimiter The row delimiter. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder rowDelimiter(@Nullable Output<Object> rowDelimiter) {
            $.rowDelimiter = rowDelimiter;
            return this;
        }

        /**
         * @param rowDelimiter The row delimiter. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder rowDelimiter(Object rowDelimiter) {
            return rowDelimiter(Output.of(rowDelimiter));
        }

        /**
         * @param serializer Serializer. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder serializer(@Nullable Output<Object> serializer) {
            $.serializer = serializer;
            return this;
        }

        /**
         * @param serializer Serializer. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder serializer(Object serializer) {
            return serializer(Output.of(serializer));
        }

        /**
         * @param skipLineCount The number of lines/rows to be skipped when parsing text files. The default value is 0. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder skipLineCount(@Nullable Output<Object> skipLineCount) {
            $.skipLineCount = skipLineCount;
            return this;
        }

        /**
         * @param skipLineCount The number of lines/rows to be skipped when parsing text files. The default value is 0. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder skipLineCount(Object skipLineCount) {
            return skipLineCount(Output.of(skipLineCount));
        }

        /**
         * @param treatEmptyAsNull Treat empty column values in the text file as null. The default value is true. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder treatEmptyAsNull(@Nullable Output<Object> treatEmptyAsNull) {
            $.treatEmptyAsNull = treatEmptyAsNull;
            return this;
        }

        /**
         * @param treatEmptyAsNull Treat empty column values in the text file as null. The default value is true. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder treatEmptyAsNull(Object treatEmptyAsNull) {
            return treatEmptyAsNull(Output.of(treatEmptyAsNull));
        }

        /**
         * @param type Type of dataset storage format.
         * Expected value is &#39;TextFormat&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of dataset storage format.
         * Expected value is &#39;TextFormat&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public TextFormatArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
