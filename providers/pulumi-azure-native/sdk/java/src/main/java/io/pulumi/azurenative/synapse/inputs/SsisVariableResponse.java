// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Ssis variable.
 * 
 */
public final class SsisVariableResponse extends io.pulumi.resources.InvokeArgs {

    public static final SsisVariableResponse Empty = new SsisVariableResponse();

    /**
     * Variable type.
     * 
     */
    @Import(name="dataType")
      private final @Nullable String dataType;

    public Optional<String> dataType() {
        return this.dataType == null ? Optional.empty() : Optional.ofNullable(this.dataType);
    }

    /**
     * Variable description.
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> description() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * Variable id.
     * 
     */
    @Import(name="id")
      private final @Nullable Double id;

    public Optional<Double> id() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * Variable name.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Whether variable is sensitive.
     * 
     */
    @Import(name="sensitive")
      private final @Nullable Boolean sensitive;

    public Optional<Boolean> sensitive() {
        return this.sensitive == null ? Optional.empty() : Optional.ofNullable(this.sensitive);
    }

    /**
     * Variable sensitive value.
     * 
     */
    @Import(name="sensitiveValue")
      private final @Nullable String sensitiveValue;

    public Optional<String> sensitiveValue() {
        return this.sensitiveValue == null ? Optional.empty() : Optional.ofNullable(this.sensitiveValue);
    }

    /**
     * Variable value.
     * 
     */
    @Import(name="value")
      private final @Nullable String value;

    public Optional<String> value() {
        return this.value == null ? Optional.empty() : Optional.ofNullable(this.value);
    }

    public SsisVariableResponse(
        @Nullable String dataType,
        @Nullable String description,
        @Nullable Double id,
        @Nullable String name,
        @Nullable Boolean sensitive,
        @Nullable String sensitiveValue,
        @Nullable String value) {
        this.dataType = dataType;
        this.description = description;
        this.id = id;
        this.name = name;
        this.sensitive = sensitive;
        this.sensitiveValue = sensitiveValue;
        this.value = value;
    }

    private SsisVariableResponse() {
        this.dataType = null;
        this.description = null;
        this.id = null;
        this.name = null;
        this.sensitive = null;
        this.sensitiveValue = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SsisVariableResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dataType;
        private @Nullable String description;
        private @Nullable Double id;
        private @Nullable String name;
        private @Nullable Boolean sensitive;
        private @Nullable String sensitiveValue;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(SsisVariableResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataType = defaults.dataType;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.sensitive = defaults.sensitive;
    	      this.sensitiveValue = defaults.sensitiveValue;
    	      this.value = defaults.value;
        }

        public Builder dataType(@Nullable String dataType) {
            this.dataType = dataType;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder id(@Nullable Double id) {
            this.id = id;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder sensitive(@Nullable Boolean sensitive) {
            this.sensitive = sensitive;
            return this;
        }
        public Builder sensitiveValue(@Nullable String sensitiveValue) {
            this.sensitiveValue = sensitiveValue;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }        public SsisVariableResponse build() {
            return new SsisVariableResponse(dataType, description, id, name, sensitive, sensitiveValue, value);
        }
    }
}
