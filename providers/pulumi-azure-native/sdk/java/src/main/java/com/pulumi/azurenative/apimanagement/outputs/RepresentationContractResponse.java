// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.outputs;

import com.pulumi.azurenative.apimanagement.outputs.ParameterContractResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RepresentationContractResponse {
    /**
     * Specifies a registered or custom content type for this representation, e.g. application/xml.
     * 
     */
    private final String contentType;
    /**
     * Collection of form parameters. Required if &#39;contentType&#39; value is either &#39;application/x-www-form-urlencoded&#39; or &#39;multipart/form-data&#39;..
     * 
     */
    private final @Nullable List<ParameterContractResponse> formParameters;
    /**
     * An example of the representation.
     * 
     */
    private final @Nullable String sample;
    /**
     * Schema identifier. Applicable only if &#39;contentType&#39; value is neither &#39;application/x-www-form-urlencoded&#39; nor &#39;multipart/form-data&#39;.
     * 
     */
    private final @Nullable String schemaId;
    /**
     * Type name defined by the schema. Applicable only if &#39;contentType&#39; value is neither &#39;application/x-www-form-urlencoded&#39; nor &#39;multipart/form-data&#39;.
     * 
     */
    private final @Nullable String typeName;

    @CustomType.Constructor
    private RepresentationContractResponse(
        @CustomType.Parameter("contentType") String contentType,
        @CustomType.Parameter("formParameters") @Nullable List<ParameterContractResponse> formParameters,
        @CustomType.Parameter("sample") @Nullable String sample,
        @CustomType.Parameter("schemaId") @Nullable String schemaId,
        @CustomType.Parameter("typeName") @Nullable String typeName) {
        this.contentType = contentType;
        this.formParameters = formParameters;
        this.sample = sample;
        this.schemaId = schemaId;
        this.typeName = typeName;
    }

    /**
     * Specifies a registered or custom content type for this representation, e.g. application/xml.
     * 
    */
    public String contentType() {
        return this.contentType;
    }
    /**
     * Collection of form parameters. Required if &#39;contentType&#39; value is either &#39;application/x-www-form-urlencoded&#39; or &#39;multipart/form-data&#39;..
     * 
    */
    public List<ParameterContractResponse> formParameters() {
        return this.formParameters == null ? List.of() : this.formParameters;
    }
    /**
     * An example of the representation.
     * 
    */
    public Optional<String> sample() {
        return Optional.ofNullable(this.sample);
    }
    /**
     * Schema identifier. Applicable only if &#39;contentType&#39; value is neither &#39;application/x-www-form-urlencoded&#39; nor &#39;multipart/form-data&#39;.
     * 
    */
    public Optional<String> schemaId() {
        return Optional.ofNullable(this.schemaId);
    }
    /**
     * Type name defined by the schema. Applicable only if &#39;contentType&#39; value is neither &#39;application/x-www-form-urlencoded&#39; nor &#39;multipart/form-data&#39;.
     * 
    */
    public Optional<String> typeName() {
        return Optional.ofNullable(this.typeName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepresentationContractResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String contentType;
        private @Nullable List<ParameterContractResponse> formParameters;
        private @Nullable String sample;
        private @Nullable String schemaId;
        private @Nullable String typeName;

        public Builder() {
    	      // Empty
        }

        public Builder(RepresentationContractResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentType = defaults.contentType;
    	      this.formParameters = defaults.formParameters;
    	      this.sample = defaults.sample;
    	      this.schemaId = defaults.schemaId;
    	      this.typeName = defaults.typeName;
        }

        public Builder contentType(String contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }
        public Builder formParameters(@Nullable List<ParameterContractResponse> formParameters) {
            this.formParameters = formParameters;
            return this;
        }
        public Builder formParameters(ParameterContractResponse... formParameters) {
            return formParameters(List.of(formParameters));
        }
        public Builder sample(@Nullable String sample) {
            this.sample = sample;
            return this;
        }
        public Builder schemaId(@Nullable String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public Builder typeName(@Nullable String typeName) {
            this.typeName = typeName;
            return this;
        }        public RepresentationContractResponse build() {
            return new RepresentationContractResponse(contentType, formParameters, sample, schemaId, typeName);
        }
    }
}
