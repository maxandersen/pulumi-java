// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.inputs.UrlSigningParamIdentifierResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the parameters for the Url Signing action.
 * 
 */
public final class UrlSigningActionParametersResponse extends io.pulumi.resources.InvokeArgs {

    public static final UrlSigningActionParametersResponse Empty = new UrlSigningActionParametersResponse();

    /**
     * Algorithm to use for URL signing
     * 
     */
    @Import(name="algorithm")
      private final @Nullable String algorithm;

    public Optional<String> algorithm() {
        return this.algorithm == null ? Optional.empty() : Optional.ofNullable(this.algorithm);
    }

    @Import(name="odataType", required=true)
      private final String odataType;

    public String odataType() {
        return this.odataType;
    }

    /**
     * Defines which query string parameters in the url to be considered for expires, key id etc.
     * 
     */
    @Import(name="parameterNameOverride")
      private final @Nullable List<UrlSigningParamIdentifierResponse> parameterNameOverride;

    public List<UrlSigningParamIdentifierResponse> parameterNameOverride() {
        return this.parameterNameOverride == null ? List.of() : this.parameterNameOverride;
    }

    public UrlSigningActionParametersResponse(
        @Nullable String algorithm,
        String odataType,
        @Nullable List<UrlSigningParamIdentifierResponse> parameterNameOverride) {
        this.algorithm = algorithm;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.parameterNameOverride = parameterNameOverride;
    }

    private UrlSigningActionParametersResponse() {
        this.algorithm = null;
        this.odataType = null;
        this.parameterNameOverride = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UrlSigningActionParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String algorithm;
        private String odataType;
        private @Nullable List<UrlSigningParamIdentifierResponse> parameterNameOverride;

        public Builder() {
    	      // Empty
        }

        public Builder(UrlSigningActionParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.odataType = defaults.odataType;
    	      this.parameterNameOverride = defaults.parameterNameOverride;
        }

        public Builder algorithm(@Nullable String algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder parameterNameOverride(@Nullable List<UrlSigningParamIdentifierResponse> parameterNameOverride) {
            this.parameterNameOverride = parameterNameOverride;
            return this;
        }
        public Builder parameterNameOverride(UrlSigningParamIdentifierResponse... parameterNameOverride) {
            return parameterNameOverride(List.of(parameterNameOverride));
        }        public UrlSigningActionParametersResponse build() {
            return new UrlSigningActionParametersResponse(algorithm, odataType, parameterNameOverride);
        }
    }
}
