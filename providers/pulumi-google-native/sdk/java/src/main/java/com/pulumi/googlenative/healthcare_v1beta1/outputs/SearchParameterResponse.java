// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SearchParameterResponse {
    /**
     * @return The canonical url of the search parameter resource.
     * 
     */
    private final String canonicalUrl;
    /**
     * @return The versioned name of the search parameter resource. The format is projects/{project-id}/locations/{location}/datasets/{dataset-id}/fhirStores/{fhirStore-id}/fhir/SearchParameter/{resource-id}/_history/{version-id} For fhir stores with disable_resource_versioning=true, the format is projects/{project-id}/locations/{location}/datasets/{dataset-id}/fhirStores/{fhirStore-id}/fhir/SearchParameter/{resource-id}/
     * 
     */
    private final String parameter;

    @CustomType.Constructor
    private SearchParameterResponse(
        @CustomType.Parameter("canonicalUrl") String canonicalUrl,
        @CustomType.Parameter("parameter") String parameter) {
        this.canonicalUrl = canonicalUrl;
        this.parameter = parameter;
    }

    /**
     * @return The canonical url of the search parameter resource.
     * 
     */
    public String canonicalUrl() {
        return this.canonicalUrl;
    }
    /**
     * @return The versioned name of the search parameter resource. The format is projects/{project-id}/locations/{location}/datasets/{dataset-id}/fhirStores/{fhirStore-id}/fhir/SearchParameter/{resource-id}/_history/{version-id} For fhir stores with disable_resource_versioning=true, the format is projects/{project-id}/locations/{location}/datasets/{dataset-id}/fhirStores/{fhirStore-id}/fhir/SearchParameter/{resource-id}/
     * 
     */
    public String parameter() {
        return this.parameter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SearchParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String canonicalUrl;
        private String parameter;

        public Builder() {
    	      // Empty
        }

        public Builder(SearchParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.canonicalUrl = defaults.canonicalUrl;
    	      this.parameter = defaults.parameter;
        }

        public Builder canonicalUrl(String canonicalUrl) {
            this.canonicalUrl = Objects.requireNonNull(canonicalUrl);
            return this;
        }
        public Builder parameter(String parameter) {
            this.parameter = Objects.requireNonNull(parameter);
            return this;
        }        public SearchParameterResponse build() {
            return new SearchParameterResponse(canonicalUrl, parameter);
        }
    }
}
