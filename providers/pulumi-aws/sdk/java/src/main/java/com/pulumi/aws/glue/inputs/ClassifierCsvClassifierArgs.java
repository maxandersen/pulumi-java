// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClassifierCsvClassifierArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClassifierCsvClassifierArgs Empty = new ClassifierCsvClassifierArgs();

    /**
     * Enables the processing of files that contain only one column.
     * 
     */
    @Import(name="allowSingleColumn")
    private @Nullable Output<Boolean> allowSingleColumn;

    public Optional<Output<Boolean>> allowSingleColumn() {
        return Optional.ofNullable(this.allowSingleColumn);
    }

    /**
     * Indicates whether the CSV file contains a header. This can be one of &#34;ABSENT&#34;, &#34;PRESENT&#34;, or &#34;UNKNOWN&#34;.
     * 
     */
    @Import(name="containsHeader")
    private @Nullable Output<String> containsHeader;

    public Optional<Output<String>> containsHeader() {
        return Optional.ofNullable(this.containsHeader);
    }

    /**
     * The delimiter used in the Csv to separate columns.
     * 
     */
    @Import(name="delimiter")
    private @Nullable Output<String> delimiter;

    public Optional<Output<String>> delimiter() {
        return Optional.ofNullable(this.delimiter);
    }

    /**
     * Specifies whether to trim column values.
     * 
     */
    @Import(name="disableValueTrimming")
    private @Nullable Output<Boolean> disableValueTrimming;

    public Optional<Output<Boolean>> disableValueTrimming() {
        return Optional.ofNullable(this.disableValueTrimming);
    }

    /**
     * A list of strings representing column names.
     * 
     */
    @Import(name="headers")
    private @Nullable Output<List<String>> headers;

    public Optional<Output<List<String>>> headers() {
        return Optional.ofNullable(this.headers);
    }

    /**
     * A custom symbol to denote what combines content into a single column value. It must be different from the column delimiter.
     * 
     */
    @Import(name="quoteSymbol")
    private @Nullable Output<String> quoteSymbol;

    public Optional<Output<String>> quoteSymbol() {
        return Optional.ofNullable(this.quoteSymbol);
    }

    private ClassifierCsvClassifierArgs() {}

    private ClassifierCsvClassifierArgs(ClassifierCsvClassifierArgs $) {
        this.allowSingleColumn = $.allowSingleColumn;
        this.containsHeader = $.containsHeader;
        this.delimiter = $.delimiter;
        this.disableValueTrimming = $.disableValueTrimming;
        this.headers = $.headers;
        this.quoteSymbol = $.quoteSymbol;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClassifierCsvClassifierArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClassifierCsvClassifierArgs $;

        public Builder() {
            $ = new ClassifierCsvClassifierArgs();
        }

        public Builder(ClassifierCsvClassifierArgs defaults) {
            $ = new ClassifierCsvClassifierArgs(Objects.requireNonNull(defaults));
        }

        public Builder allowSingleColumn(@Nullable Output<Boolean> allowSingleColumn) {
            $.allowSingleColumn = allowSingleColumn;
            return this;
        }

        public Builder allowSingleColumn(Boolean allowSingleColumn) {
            return allowSingleColumn(Output.of(allowSingleColumn));
        }

        public Builder containsHeader(@Nullable Output<String> containsHeader) {
            $.containsHeader = containsHeader;
            return this;
        }

        public Builder containsHeader(String containsHeader) {
            return containsHeader(Output.of(containsHeader));
        }

        public Builder delimiter(@Nullable Output<String> delimiter) {
            $.delimiter = delimiter;
            return this;
        }

        public Builder delimiter(String delimiter) {
            return delimiter(Output.of(delimiter));
        }

        public Builder disableValueTrimming(@Nullable Output<Boolean> disableValueTrimming) {
            $.disableValueTrimming = disableValueTrimming;
            return this;
        }

        public Builder disableValueTrimming(Boolean disableValueTrimming) {
            return disableValueTrimming(Output.of(disableValueTrimming));
        }

        public Builder headers(@Nullable Output<List<String>> headers) {
            $.headers = headers;
            return this;
        }

        public Builder headers(List<String> headers) {
            return headers(Output.of(headers));
        }

        public Builder headers(String... headers) {
            return headers(List.of(headers));
        }

        public Builder quoteSymbol(@Nullable Output<String> quoteSymbol) {
            $.quoteSymbol = quoteSymbol;
            return this;
        }

        public Builder quoteSymbol(String quoteSymbol) {
            return quoteSymbol(Output.of(quoteSymbol));
        }

        public ClassifierCsvClassifierArgs build() {
            return $;
        }
    }

}
