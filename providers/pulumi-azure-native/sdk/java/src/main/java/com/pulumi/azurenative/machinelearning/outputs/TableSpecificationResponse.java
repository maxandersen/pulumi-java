// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearning.outputs;

import com.pulumi.azurenative.machinelearning.outputs.ColumnSpecificationResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TableSpecificationResponse {
    /**
     * Swagger schema description.
     * 
     */
    private final @Nullable String description;
    /**
     * The format, if &#39;type&#39; is not &#39;object&#39;
     * 
     */
    private final @Nullable String format;
    /**
     * The set of columns within the data table.
     * 
     */
    private final @Nullable Map<String,ColumnSpecificationResponse> properties;
    /**
     * Swagger schema title.
     * 
     */
    private final @Nullable String title;
    /**
     * The type of the entity described in swagger.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private TableSpecificationResponse(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("format") @Nullable String format,
        @CustomType.Parameter("properties") @Nullable Map<String,ColumnSpecificationResponse> properties,
        @CustomType.Parameter("title") @Nullable String title,
        @CustomType.Parameter("type") String type) {
        this.description = description;
        this.format = format;
        this.properties = properties;
        this.title = title;
        this.type = type;
    }

    /**
     * Swagger schema description.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The format, if &#39;type&#39; is not &#39;object&#39;
     * 
    */
    public Optional<String> format() {
        return Optional.ofNullable(this.format);
    }
    /**
     * The set of columns within the data table.
     * 
    */
    public Map<String,ColumnSpecificationResponse> properties() {
        return this.properties == null ? Map.of() : this.properties;
    }
    /**
     * Swagger schema title.
     * 
    */
    public Optional<String> title() {
        return Optional.ofNullable(this.title);
    }
    /**
     * The type of the entity described in swagger.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableSpecificationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable String format;
        private @Nullable Map<String,ColumnSpecificationResponse> properties;
        private @Nullable String title;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(TableSpecificationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.format = defaults.format;
    	      this.properties = defaults.properties;
    	      this.title = defaults.title;
    	      this.type = defaults.type;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder format(@Nullable String format) {
            this.format = format;
            return this;
        }
        public Builder properties(@Nullable Map<String,ColumnSpecificationResponse> properties) {
            this.properties = properties;
            return this;
        }
        public Builder title(@Nullable String title) {
            this.title = title;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public TableSpecificationResponse build() {
            return new TableSpecificationResponse(description, format, properties, title, type);
        }
    }
}
