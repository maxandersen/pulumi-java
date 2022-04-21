// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Represents the pairing of REST resource path and the actions (verbs) allowed on the resource path.
 * 
 */
public final class GoogleCloudApigeeV1OperationResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudApigeeV1OperationResponse Empty = new GoogleCloudApigeeV1OperationResponse();

    /**
     * methods refers to the REST verbs as in https://www.w3.org/Protocols/rfc2616/rfc2616-sec9.html. When none specified, all verb types are allowed.
     * 
     */
    @Import(name="methods", required=true)
    private List<String> methods;

    public List<String> methods() {
        return this.methods;
    }

    /**
     * REST resource path associated with the API proxy or remote service.
     * 
     */
    @Import(name="resource", required=true)
    private String resource;

    public String resource() {
        return this.resource;
    }

    private GoogleCloudApigeeV1OperationResponse() {}

    private GoogleCloudApigeeV1OperationResponse(GoogleCloudApigeeV1OperationResponse $) {
        this.methods = $.methods;
        this.resource = $.resource;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudApigeeV1OperationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudApigeeV1OperationResponse $;

        public Builder() {
            $ = new GoogleCloudApigeeV1OperationResponse();
        }

        public Builder(GoogleCloudApigeeV1OperationResponse defaults) {
            $ = new GoogleCloudApigeeV1OperationResponse(Objects.requireNonNull(defaults));
        }

        public Builder methods(List<String> methods) {
            $.methods = methods;
            return this;
        }

        public Builder methods(String... methods) {
            return methods(List.of(methods));
        }

        public Builder resource(String resource) {
            $.resource = resource;
            return this;
        }

        public GoogleCloudApigeeV1OperationResponse build() {
            $.methods = Objects.requireNonNull($.methods, "expected parameter 'methods' to be non-null");
            $.resource = Objects.requireNonNull($.resource, "expected parameter 'resource' to be non-null");
            return $;
        }
    }

}
