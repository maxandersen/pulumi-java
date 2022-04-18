// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.azurenative.apimanagement.inputs.ParameterContractResponse;
import com.pulumi.azurenative.apimanagement.inputs.RepresentationContractResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Operation request details.
 * 
 */
public final class RequestContractResponse extends com.pulumi.resources.InvokeArgs {

    public static final RequestContractResponse Empty = new RequestContractResponse();

    /**
     * Operation request description.
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> description() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * Collection of operation request headers.
     * 
     */
    @Import(name="headers")
      private final @Nullable List<ParameterContractResponse> headers;

    public List<ParameterContractResponse> headers() {
        return this.headers == null ? List.of() : this.headers;
    }

    /**
     * Collection of operation request query parameters.
     * 
     */
    @Import(name="queryParameters")
      private final @Nullable List<ParameterContractResponse> queryParameters;

    public List<ParameterContractResponse> queryParameters() {
        return this.queryParameters == null ? List.of() : this.queryParameters;
    }

    /**
     * Collection of operation request representations.
     * 
     */
    @Import(name="representations")
      private final @Nullable List<RepresentationContractResponse> representations;

    public List<RepresentationContractResponse> representations() {
        return this.representations == null ? List.of() : this.representations;
    }

    public RequestContractResponse(
        @Nullable String description,
        @Nullable List<ParameterContractResponse> headers,
        @Nullable List<ParameterContractResponse> queryParameters,
        @Nullable List<RepresentationContractResponse> representations) {
        this.description = description;
        this.headers = headers;
        this.queryParameters = queryParameters;
        this.representations = representations;
    }

    private RequestContractResponse() {
        this.description = null;
        this.headers = List.of();
        this.queryParameters = List.of();
        this.representations = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RequestContractResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable List<ParameterContractResponse> headers;
        private @Nullable List<ParameterContractResponse> queryParameters;
        private @Nullable List<RepresentationContractResponse> representations;

        public Builder() {
    	      // Empty
        }

        public Builder(RequestContractResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.headers = defaults.headers;
    	      this.queryParameters = defaults.queryParameters;
    	      this.representations = defaults.representations;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder headers(@Nullable List<ParameterContractResponse> headers) {
            this.headers = headers;
            return this;
        }
        public Builder headers(ParameterContractResponse... headers) {
            return headers(List.of(headers));
        }
        public Builder queryParameters(@Nullable List<ParameterContractResponse> queryParameters) {
            this.queryParameters = queryParameters;
            return this;
        }
        public Builder queryParameters(ParameterContractResponse... queryParameters) {
            return queryParameters(List.of(queryParameters));
        }
        public Builder representations(@Nullable List<RepresentationContractResponse> representations) {
            this.representations = representations;
            return this;
        }
        public Builder representations(RepresentationContractResponse... representations) {
            return representations(List.of(representations));
        }        public RequestContractResponse build() {
            return new RequestContractResponse(description, headers, queryParameters, representations);
        }
    }
}
