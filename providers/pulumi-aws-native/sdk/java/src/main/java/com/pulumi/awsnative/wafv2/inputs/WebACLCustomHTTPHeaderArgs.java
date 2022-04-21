// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * HTTP header.
 * 
 */
public final class WebACLCustomHTTPHeaderArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebACLCustomHTTPHeaderArgs Empty = new WebACLCustomHTTPHeaderArgs();

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    @Import(name="value", required=true)
    private Output<String> value;

    public Output<String> value() {
        return this.value;
    }

    private WebACLCustomHTTPHeaderArgs() {}

    private WebACLCustomHTTPHeaderArgs(WebACLCustomHTTPHeaderArgs $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebACLCustomHTTPHeaderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebACLCustomHTTPHeaderArgs $;

        public Builder() {
            $ = new WebACLCustomHTTPHeaderArgs();
        }

        public Builder(WebACLCustomHTTPHeaderArgs defaults) {
            $ = new WebACLCustomHTTPHeaderArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public WebACLCustomHTTPHeaderArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
