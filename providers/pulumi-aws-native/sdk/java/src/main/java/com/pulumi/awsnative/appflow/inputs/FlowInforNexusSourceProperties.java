// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appflow.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class FlowInforNexusSourceProperties extends com.pulumi.resources.InvokeArgs {

    public static final FlowInforNexusSourceProperties Empty = new FlowInforNexusSourceProperties();

    @Import(name="object", required=true)
      private final String object;

    public String object() {
        return this.object;
    }

    public FlowInforNexusSourceProperties(String object) {
        this.object = Objects.requireNonNull(object, "expected parameter 'object' to be non-null");
    }

    private FlowInforNexusSourceProperties() {
        this.object = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowInforNexusSourceProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String object;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowInforNexusSourceProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.object = defaults.object;
        }

        public Builder object(String object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }        public FlowInforNexusSourceProperties build() {
            return new FlowInforNexusSourceProperties(object);
        }
    }
}
