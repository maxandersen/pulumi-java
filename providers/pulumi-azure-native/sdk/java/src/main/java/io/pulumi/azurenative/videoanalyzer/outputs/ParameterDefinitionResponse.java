// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ParameterDefinitionResponse {
    /**
     * Name of the parameter declared in the pipeline topology.
     * 
     */
    private final String name;
    /**
     * Parameter value to be applied on this specific pipeline.
     * 
     */
    private final @Nullable String value;

    @CustomType.Constructor
    private ParameterDefinitionResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("value") @Nullable String value) {
        this.name = name;
        this.value = value;
    }

    /**
     * Name of the parameter declared in the pipeline topology.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Parameter value to be applied on this specific pipeline.
     * 
    */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParameterDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ParameterDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }        public ParameterDefinitionResponse build() {
            return new ParameterDefinitionResponse(name, value);
        }
    }
}
