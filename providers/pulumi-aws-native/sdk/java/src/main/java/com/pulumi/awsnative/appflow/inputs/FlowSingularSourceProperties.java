// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appflow.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class FlowSingularSourceProperties extends com.pulumi.resources.InvokeArgs {

    public static final FlowSingularSourceProperties Empty = new FlowSingularSourceProperties();

    @Import(name="object", required=true)
    private String object;

    public String object() {
        return this.object;
    }

    private FlowSingularSourceProperties() {}

    private FlowSingularSourceProperties(FlowSingularSourceProperties $) {
        this.object = $.object;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlowSingularSourceProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlowSingularSourceProperties $;

        public Builder() {
            $ = new FlowSingularSourceProperties();
        }

        public Builder(FlowSingularSourceProperties defaults) {
            $ = new FlowSingularSourceProperties(Objects.requireNonNull(defaults));
        }

        public Builder object(String object) {
            $.object = object;
            return this;
        }

        public FlowSingularSourceProperties build() {
            $.object = Objects.requireNonNull($.object, "expected parameter 'object' to be non-null");
            return $;
        }
    }

}
