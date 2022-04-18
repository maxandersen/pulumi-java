// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearning.inputs;

import com.pulumi.azurenative.machinelearning.inputs.ModuleAssetParameterResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Nested parameter definition.
 * 
 */
public final class ModeValueInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final ModeValueInfoResponse Empty = new ModeValueInfoResponse();

    /**
     * The interface string name for the nested parameter.
     * 
     */
    @Import(name="interfaceString")
      private final @Nullable String interfaceString;

    public Optional<String> interfaceString() {
        return this.interfaceString == null ? Optional.empty() : Optional.ofNullable(this.interfaceString);
    }

    /**
     * The definition of the parameter.
     * 
     */
    @Import(name="parameters")
      private final @Nullable List<ModuleAssetParameterResponse> parameters;

    public List<ModuleAssetParameterResponse> parameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }

    public ModeValueInfoResponse(
        @Nullable String interfaceString,
        @Nullable List<ModuleAssetParameterResponse> parameters) {
        this.interfaceString = interfaceString;
        this.parameters = parameters;
    }

    private ModeValueInfoResponse() {
        this.interfaceString = null;
        this.parameters = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModeValueInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String interfaceString;
        private @Nullable List<ModuleAssetParameterResponse> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(ModeValueInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interfaceString = defaults.interfaceString;
    	      this.parameters = defaults.parameters;
        }

        public Builder interfaceString(@Nullable String interfaceString) {
            this.interfaceString = interfaceString;
            return this;
        }
        public Builder parameters(@Nullable List<ModuleAssetParameterResponse> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(ModuleAssetParameterResponse... parameters) {
            return parameters(List.of(parameters));
        }        public ModeValueInfoResponse build() {
            return new ModeValueInfoResponse(interfaceString, parameters);
        }
    }
}
