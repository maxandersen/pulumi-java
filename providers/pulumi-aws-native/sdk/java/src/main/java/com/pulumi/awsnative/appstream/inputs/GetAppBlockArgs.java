// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appstream.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAppBlockArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAppBlockArgs Empty = new GetAppBlockArgs();

    @Import(name="arn", required=true)
    private String arn;

    public String arn() {
        return this.arn;
    }

    private GetAppBlockArgs() {}

    private GetAppBlockArgs(GetAppBlockArgs $) {
        this.arn = $.arn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppBlockArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppBlockArgs $;

        public Builder() {
            $ = new GetAppBlockArgs();
        }

        public Builder(GetAppBlockArgs defaults) {
            $ = new GetAppBlockArgs(Objects.requireNonNull(defaults));
        }

        public Builder arn(String arn) {
            $.arn = arn;
            return this;
        }

        public GetAppBlockArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
