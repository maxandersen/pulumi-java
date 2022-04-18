// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automation.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DscConfigurationParameterResponse {
    /**
     * Gets or sets the default value of parameter.
     * 
     */
    private final @Nullable String defaultValue;
    /**
     * Gets or sets a Boolean value to indicate whether the parameter is mandatory or not.
     * 
     */
    private final @Nullable Boolean isMandatory;
    /**
     * Get or sets the position of the parameter.
     * 
     */
    private final @Nullable Integer position;
    /**
     * Gets or sets the type of the parameter.
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private DscConfigurationParameterResponse(
        @CustomType.Parameter("defaultValue") @Nullable String defaultValue,
        @CustomType.Parameter("isMandatory") @Nullable Boolean isMandatory,
        @CustomType.Parameter("position") @Nullable Integer position,
        @CustomType.Parameter("type") @Nullable String type) {
        this.defaultValue = defaultValue;
        this.isMandatory = isMandatory;
        this.position = position;
        this.type = type;
    }

    /**
     * Gets or sets the default value of parameter.
     * 
    */
    public Optional<String> defaultValue() {
        return Optional.ofNullable(this.defaultValue);
    }
    /**
     * Gets or sets a Boolean value to indicate whether the parameter is mandatory or not.
     * 
    */
    public Optional<Boolean> isMandatory() {
        return Optional.ofNullable(this.isMandatory);
    }
    /**
     * Get or sets the position of the parameter.
     * 
    */
    public Optional<Integer> position() {
        return Optional.ofNullable(this.position);
    }
    /**
     * Gets or sets the type of the parameter.
     * 
    */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DscConfigurationParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String defaultValue;
        private @Nullable Boolean isMandatory;
        private @Nullable Integer position;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(DscConfigurationParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultValue = defaults.defaultValue;
    	      this.isMandatory = defaults.isMandatory;
    	      this.position = defaults.position;
    	      this.type = defaults.type;
        }

        public Builder defaultValue(@Nullable String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public Builder isMandatory(@Nullable Boolean isMandatory) {
            this.isMandatory = isMandatory;
            return this;
        }
        public Builder position(@Nullable Integer position) {
            this.position = position;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public DscConfigurationParameterResponse build() {
            return new DscConfigurationParameterResponse(defaultValue, isMandatory, position, type);
        }
    }
}
