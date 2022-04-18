// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.accesscontextmanager_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.accesscontextmanager_v1.outputs.ApiOperationResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class IngressToResponse {
    /**
     * A list of ApiOperations allowed to be performed by the sources specified in corresponding IngressFrom in this ServicePerimeter.
     * 
     */
    private final List<ApiOperationResponse> operations;
    /**
     * A list of resources, currently only projects in the form `projects/`, protected by this ServicePerimeter that are allowed to be accessed by sources defined in the corresponding IngressFrom. If a single `*` is specified, then access to all resources inside the perimeter are allowed.
     * 
     */
    private final List<String> resources;

    @CustomType.Constructor
    private IngressToResponse(
        @CustomType.Parameter("operations") List<ApiOperationResponse> operations,
        @CustomType.Parameter("resources") List<String> resources) {
        this.operations = operations;
        this.resources = resources;
    }

    /**
     * A list of ApiOperations allowed to be performed by the sources specified in corresponding IngressFrom in this ServicePerimeter.
     * 
    */
    public List<ApiOperationResponse> operations() {
        return this.operations;
    }
    /**
     * A list of resources, currently only projects in the form `projects/`, protected by this ServicePerimeter that are allowed to be accessed by sources defined in the corresponding IngressFrom. If a single `*` is specified, then access to all resources inside the perimeter are allowed.
     * 
    */
    public List<String> resources() {
        return this.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngressToResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ApiOperationResponse> operations;
        private List<String> resources;

        public Builder() {
    	      // Empty
        }

        public Builder(IngressToResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operations = defaults.operations;
    	      this.resources = defaults.resources;
        }

        public Builder operations(List<ApiOperationResponse> operations) {
            this.operations = Objects.requireNonNull(operations);
            return this;
        }
        public Builder operations(ApiOperationResponse... operations) {
            return operations(List.of(operations));
        }
        public Builder resources(List<String> resources) {
            this.resources = Objects.requireNonNull(resources);
            return this;
        }
        public Builder resources(String... resources) {
            return resources(List.of(resources));
        }        public IngressToResponse build() {
            return new IngressToResponse(operations, resources);
        }
    }
}
