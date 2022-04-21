// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.synthetics.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCanaryArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCanaryArgs Empty = new GetCanaryArgs();

    /**
     * Name of the canary.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    private GetCanaryArgs() {}

    private GetCanaryArgs(GetCanaryArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCanaryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCanaryArgs $;

        public Builder() {
            $ = new GetCanaryArgs();
        }

        public Builder(GetCanaryArgs defaults) {
            $ = new GetCanaryArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetCanaryArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
