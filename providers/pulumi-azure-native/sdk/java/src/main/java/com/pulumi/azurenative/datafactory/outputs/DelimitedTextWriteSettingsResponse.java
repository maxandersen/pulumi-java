// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DelimitedTextWriteSettingsResponse {
    /**
     * The file extension used to create the files. Type: string (or Expression with resultType string).
     * 
     */
    private final Object fileExtension;
    /**
     * Specifies the file name pattern <fileNamePrefix>_<fileIndex>.<fileExtension> when copy from non-file based store without partitionOptions. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object fileNamePrefix;
    /**
     * Limit the written file's row count to be smaller than or equal to the specified count. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object maxRowsPerFile;
    /**
     * Indicates whether string values should always be enclosed with quotes. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object quoteAllText;
    /**
     * The write setting type.
     * Expected value is 'DelimitedTextWriteSettings'.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private DelimitedTextWriteSettingsResponse(
        @CustomType.Parameter("fileExtension") Object fileExtension,
        @CustomType.Parameter("fileNamePrefix") @Nullable Object fileNamePrefix,
        @CustomType.Parameter("maxRowsPerFile") @Nullable Object maxRowsPerFile,
        @CustomType.Parameter("quoteAllText") @Nullable Object quoteAllText,
        @CustomType.Parameter("type") String type) {
        this.fileExtension = fileExtension;
        this.fileNamePrefix = fileNamePrefix;
        this.maxRowsPerFile = maxRowsPerFile;
        this.quoteAllText = quoteAllText;
        this.type = type;
    }

    /**
     * The file extension used to create the files. Type: string (or Expression with resultType string).
     * 
    */
    public Object fileExtension() {
        return this.fileExtension;
    }
    /**
     * Specifies the file name pattern <fileNamePrefix>_<fileIndex>.<fileExtension> when copy from non-file based store without partitionOptions. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> fileNamePrefix() {
        return Optional.ofNullable(this.fileNamePrefix);
    }
    /**
     * Limit the written file's row count to be smaller than or equal to the specified count. Type: integer (or Expression with resultType integer).
     * 
    */
    public Optional<Object> maxRowsPerFile() {
        return Optional.ofNullable(this.maxRowsPerFile);
    }
    /**
     * Indicates whether string values should always be enclosed with quotes. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> quoteAllText() {
        return Optional.ofNullable(this.quoteAllText);
    }
    /**
     * The write setting type.
     * Expected value is 'DelimitedTextWriteSettings'.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DelimitedTextWriteSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Object fileExtension;
        private @Nullable Object fileNamePrefix;
        private @Nullable Object maxRowsPerFile;
        private @Nullable Object quoteAllText;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(DelimitedTextWriteSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileExtension = defaults.fileExtension;
    	      this.fileNamePrefix = defaults.fileNamePrefix;
    	      this.maxRowsPerFile = defaults.maxRowsPerFile;
    	      this.quoteAllText = defaults.quoteAllText;
    	      this.type = defaults.type;
        }

        public Builder fileExtension(Object fileExtension) {
            this.fileExtension = Objects.requireNonNull(fileExtension);
            return this;
        }
        public Builder fileNamePrefix(@Nullable Object fileNamePrefix) {
            this.fileNamePrefix = fileNamePrefix;
            return this;
        }
        public Builder maxRowsPerFile(@Nullable Object maxRowsPerFile) {
            this.maxRowsPerFile = maxRowsPerFile;
            return this;
        }
        public Builder quoteAllText(@Nullable Object quoteAllText) {
            this.quoteAllText = quoteAllText;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public DelimitedTextWriteSettingsResponse build() {
            return new DelimitedTextWriteSettingsResponse(fileExtension, fileNamePrefix, maxRowsPerFile, quoteAllText, type);
        }
    }
}
