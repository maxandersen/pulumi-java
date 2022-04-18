// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A wrapper for an ARM resource id
 * 
 */
public final class ArmIdWrapperResponse extends com.pulumi.resources.InvokeArgs {

    public static final ArmIdWrapperResponse Empty = new ArmIdWrapperResponse();

    @Import(name="id", required=true)
      private final String id;

    public String id() {
        return this.id;
    }

    public ArmIdWrapperResponse(String id) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
    }

    private ArmIdWrapperResponse() {
        this.id = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ArmIdWrapperResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(ArmIdWrapperResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }        public ArmIdWrapperResponse build() {
            return new ArmIdWrapperResponse(id);
        }
    }
}
