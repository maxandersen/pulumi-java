// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customerinsights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Connector mapping property format.
 * 
 */
public final class ConnectorMappingFormatResponse extends com.pulumi.resources.InvokeArgs {

    public static final ConnectorMappingFormatResponse Empty = new ConnectorMappingFormatResponse();

    /**
     * The oData language.
     * 
     */
    @Import(name="acceptLanguage")
      private final @Nullable String acceptLanguage;

    public Optional<String> acceptLanguage() {
        return this.acceptLanguage == null ? Optional.empty() : Optional.ofNullable(this.acceptLanguage);
    }

    /**
     * Character separating array elements.
     * 
     */
    @Import(name="arraySeparator")
      private final @Nullable String arraySeparator;

    public Optional<String> arraySeparator() {
        return this.arraySeparator == null ? Optional.empty() : Optional.ofNullable(this.arraySeparator);
    }

    /**
     * The character that signifies a break between columns.
     * 
     */
    @Import(name="columnDelimiter")
      private final @Nullable String columnDelimiter;

    public Optional<String> columnDelimiter() {
        return this.columnDelimiter == null ? Optional.empty() : Optional.ofNullable(this.columnDelimiter);
    }

    /**
     * The type mapping format.
     * 
     */
    @Import(name="formatType", required=true)
      private final String formatType;

    public String formatType() {
        return this.formatType;
    }

    /**
     * Quote character, used to indicate enquoted fields.
     * 
     */
    @Import(name="quoteCharacter")
      private final @Nullable String quoteCharacter;

    public Optional<String> quoteCharacter() {
        return this.quoteCharacter == null ? Optional.empty() : Optional.ofNullable(this.quoteCharacter);
    }

    /**
     * Escape character for quotes, can be the same as the quoteCharacter.
     * 
     */
    @Import(name="quoteEscapeCharacter")
      private final @Nullable String quoteEscapeCharacter;

    public Optional<String> quoteEscapeCharacter() {
        return this.quoteEscapeCharacter == null ? Optional.empty() : Optional.ofNullable(this.quoteEscapeCharacter);
    }

    public ConnectorMappingFormatResponse(
        @Nullable String acceptLanguage,
        @Nullable String arraySeparator,
        @Nullable String columnDelimiter,
        String formatType,
        @Nullable String quoteCharacter,
        @Nullable String quoteEscapeCharacter) {
        this.acceptLanguage = acceptLanguage;
        this.arraySeparator = arraySeparator;
        this.columnDelimiter = columnDelimiter;
        this.formatType = Objects.requireNonNull(formatType, "expected parameter 'formatType' to be non-null");
        this.quoteCharacter = quoteCharacter;
        this.quoteEscapeCharacter = quoteEscapeCharacter;
    }

    private ConnectorMappingFormatResponse() {
        this.acceptLanguage = null;
        this.arraySeparator = null;
        this.columnDelimiter = null;
        this.formatType = null;
        this.quoteCharacter = null;
        this.quoteEscapeCharacter = null;
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
