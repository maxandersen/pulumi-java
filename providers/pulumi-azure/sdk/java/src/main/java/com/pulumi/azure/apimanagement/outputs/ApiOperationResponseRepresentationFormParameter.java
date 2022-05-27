// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApiOperationResponseRepresentationFormParameter {
    /**
     * @return The default value for this Form Parameter.
     * 
     */
    private final @Nullable String defaultValue;
    /**
     * @return A description of this Form Parameter.
     * 
     */
    private final @Nullable String description;
    /**
     * @return The Name of this Form Parameter.
     * 
     */
    private final String name;
    /**
     * @return Is this Form Parameter Required?
     * 
     */
    private final Boolean required;
    /**
     * @return The Type of this Form Parameter, such as a `string`.
     * 
     */
    private final String type;
    /**
     * @return One or more acceptable values for this Form Parameter.
     * 
     */
    private final @Nullable List<String> values;

    @CustomType.Constructor
    private ApiOperationResponseRepresentationFormParameter(
        @CustomType.Parameter("defaultValue") @Nullable String defaultValue,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("required") Boolean required,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("values") @Nullable List<String> values) {
        this.defaultValue = defaultValue;
        this.description = description;
        this.name = name;
        this.required = required;
        this.type = type;
        this.values = values;
    }

    /**
     * @return The default value for this Form Parameter.
     * 
     */
    public Optional<String> defaultValue() {
        return Optional.ofNullable(this.defaultValue);
    }
    /**
     * @return A description of this Form Parameter.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The Name of this Form Parameter.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Is this Form Parameter Required?
     * 
     */
    public Boolean required() {
        return this.required;
    }
    /**
     * @return The Type of this Form Parameter, such as a `string`.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return One or more acceptable values for this Form Parameter.
     * 
     */
    public List<String> values() {
        return this.values == null ? List.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiOperationResponseRepresentationFormParameter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String defaultValue;
        private @Nullable String description;
        private String name;
        private Boolean required;
        private String type;
        private @Nullable List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiOperationResponseRepresentationFormParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultValue = defaults.defaultValue;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.required = defaults.required;
    	      this.type = defaults.type;
    	      this.values = defaults.values;
        }

        public Builder defaultValue(@Nullable String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder required(Boolean required) {
            this.required = Objects.requireNonNull(required);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder values(@Nullable List<String> values) {
            this.values = values;
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public ApiOperationResponseRepresentationFormParameter build() {
            return new ApiOperationResponseRepresentationFormParameter(defaultValue, description, name, required, type, values);
        }
    }
}
