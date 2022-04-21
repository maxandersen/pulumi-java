// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class WebACLLabelArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebACLLabelArgs Empty = new WebACLLabelArgs();

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    private WebACLLabelArgs() {}

    private WebACLLabelArgs(WebACLLabelArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebACLLabelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebACLLabelArgs $;

        public Builder() {
            $ = new WebACLLabelArgs();
        }

        public Builder(WebACLLabelArgs defaults) {
            $ = new WebACLLabelArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public WebACLLabelArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
