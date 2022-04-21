// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafregional.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class XssMatchSetXssMatchTupleFieldToMatchGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final XssMatchSetXssMatchTupleFieldToMatchGetArgs Empty = new XssMatchSetXssMatchTupleFieldToMatchGetArgs();

    /**
     * When the value of `type` is `HEADER`, enter the name of the header that you want the WAF to search, for example, `User-Agent` or `Referer`. If the value of `type` is any other value, omit `data`.
     * 
     */
    @Import(name="data")
    private @Nullable Output<String> data;

    public Optional<Output<String>> data() {
        return Optional.ofNullable(this.data);
    }

    /**
     * The part of the web request that you want AWS WAF to search for a specified stringE.g., `HEADER` or `METHOD`
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private XssMatchSetXssMatchTupleFieldToMatchGetArgs() {}

    private XssMatchSetXssMatchTupleFieldToMatchGetArgs(XssMatchSetXssMatchTupleFieldToMatchGetArgs $) {
        this.data = $.data;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(XssMatchSetXssMatchTupleFieldToMatchGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private XssMatchSetXssMatchTupleFieldToMatchGetArgs $;

        public Builder() {
            $ = new XssMatchSetXssMatchTupleFieldToMatchGetArgs();
        }

        public Builder(XssMatchSetXssMatchTupleFieldToMatchGetArgs defaults) {
            $ = new XssMatchSetXssMatchTupleFieldToMatchGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder data(@Nullable Output<String> data) {
            $.data = data;
            return this;
        }

        public Builder data(String data) {
            return data(Output.of(data));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public XssMatchSetXssMatchTupleFieldToMatchGetArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
