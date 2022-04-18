// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customerinsights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectorMappingFormatResponse {
    /**
     * The oData language.
     * 
     */
    private final @Nullable String acceptLanguage;
    /**
     * Character separating array elements.
     * 
     */
    private final @Nullable String arraySeparator;
    /**
     * The character that signifies a break between columns.
     * 
     */
    private final @Nullable String columnDelimiter;
    /**
     * The type mapping format.
     * 
     */
    private final String formatType;
    /**
     * Quote character, used to indicate enquoted fields.
     * 
     */
    private final @Nullable String quoteCharacter;
    /**
     * Escape character for quotes, can be the same as the quoteCharacter.
     * 
     */
    private final @Nullable String quoteEscapeCharacter;

    @CustomType.Constructor
    private ConnectorMappingFormatResponse(
        @CustomType.Parameter("acceptLanguage") @Nullable String acceptLanguage,
        @CustomType.Parameter("arraySeparator") @Nullable String arraySeparator,
        @CustomType.Parameter("columnDelimiter") @Nullable String columnDelimiter,
        @CustomType.Parameter("formatType") String formatType,
        @CustomType.Parameter("quoteCharacter") @Nullable String quoteCharacter,
        @CustomType.Parameter("quoteEscapeCharacter") @Nullable String quoteEscapeCharacter) {
        this.acceptLanguage = acceptLanguage;
        this.arraySeparator = arraySeparator;
        this.columnDelimiter = columnDelimiter;
        this.formatType = formatType;
        this.quoteCharacter = quoteCharacter;
        this.quoteEscapeCharacter = quoteEscapeCharacter;
    }

    /**
     * The oData language.
     * 
    */
    public Optional<String> acceptLanguage() {
        return Optional.ofNullable(this.acceptLanguage);
    }
    /**
     * Character separating array elements.
     * 
    */
    public Optional<String> arraySeparator() {
        return Optional.ofNullable(this.arraySeparator);
    }
    /**
     * The character that signifies a break between columns.
     * 
    */
    public Optional<String> columnDelimiter() {
        return Optional.ofNullable(this.columnDelimiter);
    }
    /**
     * The type mapping format.
     * 
    */
    public String formatType() {
        return this.formatType;
    }
    /**
     * Quote character, used to indicate enquoted fields.
     * 
    */
    public Optional<String> quoteCharacter() {
        return Optional.ofNullable(this.quoteCharacter);
    }
    /**
     * Escape character for quotes, can be the same as the quoteCharacter.
     * 
    */
    public Optional<String> quoteEscapeCharacter() {
        return Optional.ofNullable(this.quoteEscapeCharacter);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorMappingFormatResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String acceptLanguage;
        private @Nullable String arraySeparator;
        private @Nullable String columnDelimiter;
        private String formatType;
        private @Nullable String quoteCharacter;
        private @Nullable String quoteEscapeCharacter;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorMappingFormatResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceptLanguage = defaults.acceptLanguage;
    	      this.arraySeparator = defaults.arraySeparator;
    	      this.columnDelimiter = defaults.columnDelimiter;
    	      this.formatType = defaults.formatType;
    	      this.quoteCharacter = defaults.quoteCharacter;
    	      this.quoteEscapeCharacter = defaults.quoteEscapeCharacter;
        }

        public Builder acceptLanguage(@Nullable String acceptLanguage) {
            this.acceptLanguage = acceptLanguage;
            return this;
        }
        public Builder arraySeparator(@Nullable String arraySeparator) {
            this.arraySeparator = arraySeparator;
            return this;
        }
        public Builder columnDelimiter(@Nullable String columnDelimiter) {
            this.columnDelimiter = columnDelimiter;
            return this;
        }
        public Builder formatType(String formatType) {
            this.formatType = Objects.requireNonNull(formatType);
            return this;
        }
        public Builder quoteCharacter(@Nullable String quoteCharacter) {
            this.quoteCharacter = quoteCharacter;
            return this;
        }
        public Builder quoteEscapeCharacter(@Nullable String quoteEscapeCharacter) {
            this.quoteEscapeCharacter = quoteEscapeCharacter;
            return this;
        }        public ConnectorMappingFormatResponse build() {
            return new ConnectorMappingFormatResponse(acceptLanguage, arraySeparator, columnDelimiter, formatType, quoteCharacter, quoteEscapeCharacter);
        }
    }
}
