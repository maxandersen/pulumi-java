// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkmanagement_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Details of the final state &#34;drop&#34; and associated resource.
 * 
 */
public final class DropInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final DropInfoResponse Empty = new DropInfoResponse();

    /**
     * Cause that the packet is dropped.
     * 
     */
    @Import(name="cause", required=true)
      private final String cause;

    public String cause() {
        return this.cause;
    }

    /**
     * URI of the resource that caused the drop.
     * 
     */
    @Import(name="resourceUri", required=true)
      private final String resourceUri;

    public String resourceUri() {
        return this.resourceUri;
    }

    public DropInfoResponse(
        String cause,
        String resourceUri) {
        this.cause = Objects.requireNonNull(cause, "expected parameter 'cause' to be non-null");
        this.resourceUri = Objects.requireNonNull(resourceUri, "expected parameter 'resourceUri' to be non-null");
    }

    private DropInfoResponse() {
        this.cause = null;
        this.resourceUri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DropInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cause;
        private String resourceUri;

        public Builder() {
    	      // Empty
        }

        public Builder(DropInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cause = defaults.cause;
    	      this.resourceUri = defaults.resourceUri;
        }

        public Builder cause(String cause) {
            this.cause = Objects.requireNonNull(cause);
            return this;
        }
        public Builder resourceUri(String resourceUri) {
            this.resourceUri = Objects.requireNonNull(resourceUri);
            return this;
        }        public DropInfoResponse build() {
            return new DropInfoResponse(cause, resourceUri);
        }
    }
}
