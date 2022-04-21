// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.inputs;

import com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyCustomHeadersConfigItemGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResponseHeadersPolicyCustomHeadersConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResponseHeadersPolicyCustomHeadersConfigGetArgs Empty = new ResponseHeadersPolicyCustomHeadersConfigGetArgs();

    @Import(name="items")
    private @Nullable Output<List<ResponseHeadersPolicyCustomHeadersConfigItemGetArgs>> items;

    public Optional<Output<List<ResponseHeadersPolicyCustomHeadersConfigItemGetArgs>>> items() {
        return Optional.ofNullable(this.items);
    }

    private ResponseHeadersPolicyCustomHeadersConfigGetArgs() {}

    private ResponseHeadersPolicyCustomHeadersConfigGetArgs(ResponseHeadersPolicyCustomHeadersConfigGetArgs $) {
        this.items = $.items;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResponseHeadersPolicyCustomHeadersConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResponseHeadersPolicyCustomHeadersConfigGetArgs $;

        public Builder() {
            $ = new ResponseHeadersPolicyCustomHeadersConfigGetArgs();
        }

        public Builder(ResponseHeadersPolicyCustomHeadersConfigGetArgs defaults) {
            $ = new ResponseHeadersPolicyCustomHeadersConfigGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder items(@Nullable Output<List<ResponseHeadersPolicyCustomHeadersConfigItemGetArgs>> items) {
            $.items = items;
            return this;
        }

        public Builder items(List<ResponseHeadersPolicyCustomHeadersConfigItemGetArgs> items) {
            return items(Output.of(items));
        }

        public Builder items(ResponseHeadersPolicyCustomHeadersConfigItemGetArgs... items) {
            return items(List.of(items));
        }

        public ResponseHeadersPolicyCustomHeadersConfigGetArgs build() {
            return $;
        }
    }

}
