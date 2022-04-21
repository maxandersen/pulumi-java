// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.evidently.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFeatureArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFeatureArgs Empty = new GetFeatureArgs();

    @Import(name="arn", required=true)
    private String arn;

    public String arn() {
        return this.arn;
    }

    private GetFeatureArgs() {}

    private GetFeatureArgs(GetFeatureArgs $) {
        this.arn = $.arn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFeatureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFeatureArgs $;

        public Builder() {
            $ = new GetFeatureArgs();
        }

        public Builder(GetFeatureArgs defaults) {
            $ = new GetFeatureArgs(Objects.requireNonNull(defaults));
        }

        public Builder arn(String arn) {
            $.arn = arn;
            return this;
        }

        public GetFeatureArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
