// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.athena.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetWorkGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWorkGroupArgs Empty = new GetWorkGroupArgs();

    /**
     * The workGroup name.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    private GetWorkGroupArgs() {}

    private GetWorkGroupArgs(GetWorkGroupArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWorkGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWorkGroupArgs $;

        public Builder() {
            $ = new GetWorkGroupArgs();
        }

        public Builder(GetWorkGroupArgs defaults) {
            $ = new GetWorkGroupArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetWorkGroupArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
